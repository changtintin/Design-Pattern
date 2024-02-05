#ifndef SORT_HPP
#define SORT_HPP

#include<iostream>
using namespace std;

template<class T>
class Sort{
    public: 
        T *ary;
        int size;
    public:        
        void showAry();
        void setAry(T *ary, int size);
        void merge(int l, int r);
        void mergeSort(int l, int r);
};

template<class T> void Sort<T>::setAry(T *ary, int size){
    this -> size = size;
    this -> ary = ary;
}

template<class T> void Sort<T>::showAry(){
    for(int i = 0; i < size; i++){
        cout << ary[i].name << ": ";
        ary[i].displayVal();
        if(i != size - 1){
            cout << ", ";
        }
    }
    cout << endl;
}

template<class T> void Sort<T>::merge(int l, int r) {
    int m = (l + r) / 2;
    int i = l;
    int j = m + 1;
    while (i <= m && j <= r) {
        //ary[i] <= ary[j]
        if (ary[i].compareTo(ary[j])){
            i++;
        } else {
            T key = ary[j];
            for (int k = j; k > i; k--) {
                ary[k] = ary[k - 1];
            }
            ary[i] = key;
            j++;
            m++;
        }
    }
}

template<class T>void Sort<T>::mergeSort(int l, int r){
    int m = (r + l) / 2;
    if(m > l){
        mergeSort(l, m);
        mergeSort(m + 1, r);
    }    
    merge(l, r);
}

#endif