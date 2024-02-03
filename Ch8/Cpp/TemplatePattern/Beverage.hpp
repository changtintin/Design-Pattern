#ifndef BEVERAGE_HPP
#define BEVERAGE_HPP

#include <iostream>
using namespace std;

class Beverage{
    public:
        void prepareRecipe();        
        void boilWater(); 
        void pourInCup();
        
    public:
        virtual void brewIngredients() = 0;
        virtual void addCondiment() = 0;
        virtual bool customerNeedsCondiment() = 0;
};

void Beverage::boilWater(){
    cout << "Boil the water" << endl;
}

void Beverage::pourInCup(){
    cout << "Pour it into the cup" << endl;
}


void Beverage::prepareRecipe(){
    cout << "Recipe:" << endl;
    boilWater();
    brewIngredients();
    pourInCup();
    if(customerNeedsCondiment()){
        addCondiment();
    }    
}

#endif
