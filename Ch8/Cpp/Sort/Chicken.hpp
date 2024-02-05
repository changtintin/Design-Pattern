#ifndef CHICKEN_HPP
#define CHICKEN_HPP

#include<iostream>
using namespace std;

#include "Comparable.hpp"
#include <iostream>
using namespace std;

class Chicken : public Comparable<Chicken> {
public:
    string name;
    bool male;
    int height;

public:
    Chicken(bool maleOrNot, string name, int val);
    bool compareTo(Chicken otherChicken) override;
    void displayVal() override;
};

Chicken::Chicken(bool maleOrNot, string name, int val){
    this -> male = maleOrNot;
    this -> name = name;
    this -> height = val;
}

bool Chicken::compareTo(Chicken otherChicken){
    return (this -> height <= otherChicken.height);
}

void Chicken::displayVal(){
    cout << height;
}

#endif