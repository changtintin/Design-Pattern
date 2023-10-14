#include <iostream>
using namespace std;

// European plug interface
class EuropeanPlug {
    public:
        virtual void plugInEuropeanSocket() = 0;
};

// European charger for your smartphone
class EuropeanCharger : public EuropeanPlug {
    public:
        void plugInEuropeanSocket() override {
            cout << "Charging your smartphone with a European plug." << endl;
        }
};

// US socket interface
class USSocket {
    public:
        virtual void plugInUSSocket() = 0;
};

// Adapter to make European plug work with US socket
class PlugAdapter : public USSocket {
    private:
        EuropeanPlug* europeanPlug;

    public:
        PlugAdapter(EuropeanPlug* plug) : europeanPlug(plug) {}

        void plugInUSSocket() override {
            cout << "Using an adapter to plug your European charger into a US socket." << endl;
            europeanPlug -> plugInEuropeanSocket(); // Delegate to the European charger
        }
};

int main() {
    EuropeanPlug* europeanCharger = new EuropeanCharger();
    USSocket* adapter = new PlugAdapter(europeanCharger);

    // Now, you can plug your European charger into a US socket using the adapter.
    adapter -> plugInUSSocket();
}
