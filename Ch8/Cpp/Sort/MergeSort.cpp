#include <iostream>
using namespace std;
void swap(int l, int r, int *ary){
    int tmp = ary[l - 1];
    for(int i = l; i <= r; i++){
        (ary + i) = &ary[i + 1];
    }
    *(ary + l - 1) = tmp;
}

void sort(int l, int r, int *ary){
    int mid = (l + r) / 2;
    if(mid > l){
        cout << "r: " << ary[r] << endl;
        cout << "mid: " << ary[mid] << endl;
        cout << "l: " << ary[l] << endl;
        sort(l, mid, ary);
        sort(mid + 1, r, ary);
    }
    else{
        r = (r + l) / 2 + 1;
        while(r >= l && r < 6){
            if(ary[l] > ary[r]){
                swap(r, l, ary);
                cout << "swap" << endl;
                l++;
            }
            r++;
        }
    }
}
int main(){
    int ary[] = {22, 46, 7, 74, 200, 56};
    int size = sizeof(ary) / sizeof(int);
    sort(0, size - 1, ary);
    for(int i = 0; i < size; i++){
        cout << ary[i] << " ";
    }
}