#ifndef TEA_HPP
#define TEA_HPP

#include "Beverage.hpp"
#include <iostream>
using namespace std;

class Tea: public Beverage{
    public:       
        void brewIngredients();        
        void addCondiment();
        bool customerNeedsCondiment();
};

void Tea::brewIngredients() {
    cout << "Steep the tea bag" << endl;
}

void Tea::addCondiment() {
    cout << "Add sugar and some milk" << endl; 
}

bool Tea::customerNeedsCondiment(){
    cout << "Would you like some lemon? (y/n)" << endl;
    string ans;
    cin >> ans;
    if(ans == "y"){
        return true;
    }
    return false;
}

#endif