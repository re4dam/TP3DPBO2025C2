#pragma once
#include <iostream>

class Memory {
  private:
    int kapasitasGB;
    int kecepatanMHz;

  public:
    Memory() {}
    Memory(int kapasitasGB, int kecepatanMHz) {
        this->kapasitasGB = kapasitasGB;
        this->kecepatanMHz = kecepatanMHz;
    }

    void setKapasitasGB(int kapasitasGB) {
        this->kapasitasGB = kapasitasGB;
    }

    void setKecepatanMHz(int kecepatanMHz) {
        this->kecepatanMHz = kecepatanMHz;
    }

    int getKapasitasGB() {
        return this->kapasitasGB;
    }

    int getKecepatanMHz() {
        return this->kecepatanMHz;
    }

    ~Memory() {}
};
