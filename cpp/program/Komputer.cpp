#pragma once
#include "Cpu.cpp"
#include "Fan.cpp"
#include "Gpu.cpp"
#include "Harddrive.cpp"
#include "Powersupply.cpp"
#include "Ram.cpp"
#include <iostream>
#include <string>
#include <vector>

using namespace std;

class Komputer {
  private:
    string nama;
    Cpu cpu;
    vector<Ram> ramList;
    vector<Fan> fanList;
    Harddrive harddrive;
    Gpu gpu;
    Powersupply powersupply;

  public:
    Komputer() {
    }

    Komputer(string nama, Cpu cpu, vector<Ram> ramList, vector<Fan> fanList, Harddrive harddrive, Gpu gpu, Powersupply powersupply) {
        this->nama = nama;
        this->cpu = cpu;
        this->ramList = ramList;
        this->fanList = fanList;
        this->harddrive = harddrive;
        this->gpu = gpu;
        this->powersupply = powersupply;
    }

    void setNama(string nama) {
        this->nama = nama;
    }

    void setCpu(Cpu cpu) {
        this->cpu = cpu;
    }

    void setRam(vector<Ram> ramList) {
        this->ramList = ramList;
    }

    void setFan(vector<Fan> fanList) {
        this->fanList = fanList;
    }

    void setHarddrive(Harddrive harddrive) {
        this->harddrive = harddrive;
    }

    void addRam(Ram ram) {
        this->ramList.push_back(ram);
    }

    void addFan(Fan fan) {
        this->fanList.push_back(fan);
    }

    void setGpu(Gpu gpu) {
        this->gpu = gpu;
    }

    void setPowersupply(Powersupply powersupply) {
        this->powersupply = powersupply;
    }

    string getNama() {
        return this->nama;
    }

    Cpu getCpu() {
        return this->cpu;
    }

    vector<Ram> getRamList() // return vector
    {
        return this->ramList;
    }

    vector<Fan> getFanList() // return vector
    {
        return this->fanList;
    }

    Harddrive getHarddrive() {
        return this->harddrive;
    }

    Gpu getGpu() {
        return this->gpu;
    }

    Powersupply getPowersupply() {
        return this->powersupply;
    }

    void TurnSwitchFan() {
        for (Fan &fan : this->fanList) {
            if (fan.getStatus() == "off") {
                fan.TurnOn();
            } else {
                fan.TurnOff();
            }
        }
    }

    ~Komputer() {
    }
};
