#pragma once
#include "Komponen.cpp"
#include <iostream>

using namespace std;

class Harddrive : public Komponen {
  private:
    int kapasitasGB;
    int kecepatanBacaMBps;
    int kecepatanTulisMBps;
    string interface;

  public:
    Harddrive() {
    }

    Harddrive(int kapasitasGB, int kecepatanBacaMBps, int kecepatanTulisMBps, string interface, string merk, string nama)
        : Komponen(merk, nama) {
        this->kapasitasGB = kapasitasGB;
        this->kecepatanBacaMBps = kecepatanBacaMBps;
        this->kecepatanTulisMBps = kecepatanTulisMBps;
        this->interface = interface;
    }

    void setKapasitasGB(int kapasitasGB) {
        this->kapasitasGB = kapasitasGB;
    }

    void setKecepatanBacaMBps(int kecepatanBacaMBps) {
        this->kecepatanBacaMBps = kecepatanBacaMBps;
    }

    void setKecepatanTulisMBps(int kecepatanTulisMBps) {
        this->kecepatanTulisMBps = kecepatanTulisMBps;
    }

    void setInterface(string interface) {
        this->interface = interface;
    }

    int getKapasitasGB() {
        return this->kapasitasGB;
    }

    int getKecepatanBacaMBps() {
        return this->kecepatanBacaMBps;
    }

    int getKecepatanTulisMBps() {
        return this->kecepatanTulisMBps;
    }

    string getInterface() {
        return this->interface;
    }

    ~Harddrive() {}
};
