#pragma once
#include "Komponen.cpp"
#include <iostream>
#include <string>

class Powersupply : public Komponen {
  private:
    int watt;

  public:
    Powersupply() {}

    Powersupply(int watt, string merk, string nama)
        : Komponen(merk, nama) {
        this->watt = watt;
    }

    void setWatt(int watt) {
        this->watt = watt;
    }

    int getWatt() {
        return this->watt;
    }

    ~Powersupply() {}
};
