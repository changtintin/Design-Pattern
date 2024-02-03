#include<iostream>
using namespace std;
void swap(int a, int b){
    int *tmp = &a;    
    // *a = &b;
}
int main(){
    int a = 3;
    int b = 5;
    int *c = &a;
    int *d = &b;
    *c = 100;
    cout << a << endl;
    // c = &b;
    // d = &a;
    //  cout << "&a = " << &a << endl;
    // cout << "&b = " << &b << endl;
    //  cout << "c = " << c << endl;
    // cout << "d = " << d << endl;
    // cout << "&c = " << &c << endl;
    // cout << "&d = " << &d << endl;
    // cout << "c = " << *c << endl;
    // cout << "d = " << *d << endl;
   
}