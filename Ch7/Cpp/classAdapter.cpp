#include <iostream>
using namespace std;

class Duck{
    protected:
        string name;
    public:        
        void showName(){
            cout << name << endl;
        }

        virtual void fly() = 0;
        virtual void quack() = 0;
};

class MallardDuck: public Duck{
    public:    
        MallardDuck(string name){
            this -> name = name; 
        }

        void fly(){
            cout << "I'm flying." << endl;
        }

        void quack(){
            cout << "Quack quack quack" << endl;
        }
};

class Turkey {
    public:
        string name;
        void showName(){
            cout << name << endl;
        }
        virtual void gobble() = 0;
        virtual void fly() = 0;
};

class WildTurkey : public Turkey{   
    public: 
        WildTurkey(string name){
            this -> name = name;
        }
        void fly(){
            cout << "I'm flying a short distance" << endl;
        }

        void gobble(){
            cout << "Gobble gobble" << endl;
        }
};

class TurkeyAdapter: public Duck {
    public: 
        WildTurkey turkey;
    public:
        TurkeyAdapter(WildTurkey turkey){
            this->turkey = turkey;
        }
        void fly(){
            turkey.fly();
        }
        void quack(){
            turkey.gobble();
        }
};
void testDuck(TurkeyAdapter duck){
    duck.fly();
    duck.quack();
}
int main(){
    MallardDuck dukkie("Vex") ;
    WildTurkey turkey("Lary");
    TurkeyAdapter duckey(turkey);

    testDuck(duckey);
}