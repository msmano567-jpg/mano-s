#include <iostream>
#include <thread>
#include <chrono>

using namespace std;

void startMachine() {
    cout << "Machine Started..." << endl;
}

void stopMachine() {
    cout << "Machine Stopped." << endl;
}

void runConveyor() {
    cout << "Conveyor Running..." << endl;
    this_thread::sleep_for(chrono::seconds(2));
}

void activateCutter() {
    cout << "Cutter Activated..." << endl;
    this_thread::sleep_for(chrono::seconds(2));
    cout << "Cutting Complete." << endl;
}

int main() {
    startMachine();

    runConveyor();
    activateCutter();

    stopMachine();

    return 0;
}
