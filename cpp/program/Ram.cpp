#pragma once
#include "Komponen.cpp"
#include "Memory.cpp"
#include <iostream>
#include <string>

using namespace std;

class Ram : public Komponen, public Memory {
  private:
    string ddr;

  public:
    Ram() {}

    Ram(string ddr, int kecepatanMHz, int kapasitasGB, string merk, string nama)
        : Komponen(merk, nama), Memory(kapasitasGB, kecepatanMHz) {
        this->ddr = ddr;
    }

    void setDdr(string ddr) {
        this->ddr = ddr;
    }

    string getDdr() {
        return this->ddr;
    }

    ~Ram() {
    }
};
