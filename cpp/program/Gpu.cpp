#pragma once
#include "Komponen.cpp"
#include "Memory.cpp"
#include <iostream>
#include <string>

class Gpu : public Komponen, public Memory {
  private:
    string gddr;
    string bandwidth;

  public:
    Gpu() {}
    Gpu(string gddr, string bandwidth, int kapasitasGB, int kecepatanMHz, string merk, string nama)
        : Komponen(merk, nama), Memory(kapasitasGB, kecepatanMHz) {
        this->gddr = gddr;
        this->bandwidth = bandwidth;
    }

    void setGddr(string gddr) {
        this->gddr = gddr;
    }

    void setBandwidth(string bandwidth) {
        this->bandwidth = bandwidth;
    }

    string getGddr() {
        return this->gddr;
    }

    string getBandwidth() {
        return this->bandwidth;
    }
};
