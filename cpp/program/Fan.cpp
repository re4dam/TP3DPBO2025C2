#include "Komponen.cpp"
#pragma once
#include <string>

class Fan : public Komponen {
  private:
    int kecepatan;
    string status;

  public:
    Fan() {
        this->status = "off";
    }

    Fan(int kecepatan, string nama, string merk)
        : Komponen(merk, nama) {
        this->kecepatan = kecepatan;
        this->status = "off";
    }

    void setKecepatan(int kecepatan) {
        this->kecepatan = kecepatan;
    }

    void TurnOn() {
        this->status = "on";
    }

    void TurnOff() {
        this->status = "off";
    }

    int getKecepatan() {
        return this->kecepatan;
    }

    string getStatus() {
        return this->status;
    }

    ~Fan() {}
};
