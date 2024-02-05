#ifndef DUCK_HPP
#define DUCK_HPP

#include "Comparable.hpp"
#include <iostream>
using namespace std;

class Duck : public Comparable<Duck> {
public:
    string name;
    int weight;
public:
    Duck(string name, int val);
    bool compareTo(Duck other) override;
    void displayVal() override;
};

Duck::Duck(string name, int val){
    this -> name = name;
    this -> weight = val;
}

bool Duck::compareTo(Duck other){
    return (this -> weight <= other.weight);
}

void Duck::displayVal(){
    cout << weight;
}

#endif