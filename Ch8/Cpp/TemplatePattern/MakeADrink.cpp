#include <iostream>
#include "Coffee.hpp"
#include "Tea.hpp"
#include "MilkTea.hpp"
using namespace std;

int main(){
    Coffee latte;
    latte.prepareRecipe();

    cout << endl;

    Tea signatureTea;
    signatureTea.prepareRecipe();

    MilkTea milkTea;
    milkTea.prepareRecipe();
}