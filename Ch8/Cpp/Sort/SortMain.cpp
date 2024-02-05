#include "Duck.hpp"
#include "Chicken.hpp"
#include "Sort.hpp"

#include <iostream>
using namespace std;
int main(){
    Duck a("Alice", 24);
    Duck b("Bob", 29);
    Duck c("Tray", 14);
    Duck d("Louis", 37);

    Duck duckAry[] = {a, b, c, d};
    int size = sizeof(duckAry) / sizeof(Duck);
    Sort<Duck> algo;
    algo.setAry(duckAry, size);
    algo.mergeSort(0, size - 1);
    algo.showAry();

    Chicken e(0, "Elisa", 54);
    Chicken f(1, "Felix", 41);
    Chicken g(0, "Gaby", 94);
    Chicken h(1, "Harry", 62);
    Chicken i(0, "Iris", 49);
    Chicken chickenAry[] = {e, f, g, h, i};
    int chickenSize = sizeof(chickenAry) / sizeof(Chicken);
    Sort<Chicken> chickSort;
    chickSort.setAry(chickenAry, chickenSize);
    chickSort.mergeSort(0, chickenSize - 1);
    chickSort.showAry();
}