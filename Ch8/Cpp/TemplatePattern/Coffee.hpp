#ifndef COFFEE_HPP
#define COFFEE_HPP

#include "Beverage.hpp"
#include <iostream>
using namespace std;

class Coffee: public Beverage{
    public:              
        void brewIngredients();      
        void addCondiment();
        bool customerNeedsCondiment();
};

void Coffee::brewIngredients(){
    cout << "Brew the coffee grinds" << endl;
}

void Coffee::addCondiment(){
    cout << "Add sugar and some milk" << endl; 
}

bool Coffee::customerNeedsCondiment(){
    cout << "Would you like some milk or sugar? (y/n)" << endl;
    string ans;
    cin >> ans;
    if(ans == "y"){
        return true;
    }
    return false;
}
#endif