#include<iostream>
using namespace std;

class Magician{
    protected:
        string prototype;

    public: 
        Magician(){
            prototype = "dark magician";
        }

    public:    
        virtual void DarkBurningMagic() = 0;

        string getType(){
            return prototype;
        }
};

class Archer{
    public:
        string prototype;
    
    public:
        Archer(){
            prototype = "Quincy";
        }

    public:
        virtual void HeiligPfeil() = 0;
        string getType(){
            return prototype;
        }
};

class ArcherPlayer: Archer{
    public:
        void HeiligPfeil(){
            cout << "ハイリッヒ・プファイル" << endl;
        }
};

class DarkMagician: Magician{
    public:
        void DarkBurningMagic(){
            cout << "ブラック・バーニング・マジック" << endl;
        }
};

class LevelUpPlayer: DarkMagician, ArcherPlayer{
    public:
       
        void newAttack(){
            HeiligPfeil();
            DarkBurningMagic();
        }        
};

int main(){
    LevelUpPlayer ting;
    ting.newAttack();
}