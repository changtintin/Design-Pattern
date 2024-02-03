#ifndef MILKTEA_HPP
#define MILKTEA_HPP

#include "Beverage.hpp"
#include <iostream>
using namespace std;

class MilkTea: public Beverage{
    public:       
        void brewIngredients();        
        void addCondiment();
        bool customerNeedsCondiment();
};

void MilkTea::brewIngredients(){
    cout << "Blend the tea and milk" << endl;
}

void MilkTea::addCondiment(){}

bool MilkTea::customerNeedsCondiment(){    
    return false;
}

#endif