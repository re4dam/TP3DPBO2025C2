#include "Cpu.cpp"
#include "Fan.cpp"
#include "Gpu.cpp"
#include "Harddrive.cpp"
#include "Komputer.cpp"
#include "Powersupply.cpp"
#include "Ram.cpp"
#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie();

    Cpu cpu(32, 5.6, "Adam", "Smart i12");
    Ram ram("DDR5.2", 25600, 16, "Corsair", "Vengeance");
    Harddrive ssd(65536, 14460, 13560, "NVMe", "Samsung", "ULTRA-1");
    vector<Fan> fanList = {
        {4800, "NF-P48 Redux", "Noctua"},
        {4800, "Pure Wings 8", "be quiet!"},
        {4800, "LL480 RGB", "Corsair"}};

    Komputer komputer("Server Adam", cpu, {ram, Ram("DDR5.2", 25600, 32, "Sussex", "Heaven")}, fanList, ssd, Gpu("GDDR8", "1025GB/s", 8, 3600, "NVIDIA", "5100"), Powersupply(2500, "Seasonic", "Locked GX999"));
    komputer.addRam(Ram("DDR5.3", 25600, 48, "Dixxies", "Congregation"));
    komputer.addFan(Fan(4800, "Wings of Heaven", "God Itself"));

    cout << "Informasi Komputer:" << endl;
    cout << "Nama      : " << komputer.getNama() << endl;
    cout << "CPU:" << endl;
    cout << "Merk       : " << komputer.getCpu().getMerk() << endl;
    cout << "Nama       : " << komputer.getCpu().getNama() << endl;
    cout << "Cores      : " << komputer.getCpu().getJumlahCore() << endl;
    cout << "Kecepatan  : ~" << komputer.getCpu().getKecepatanGHz() << " GHz" << endl;
    cout << "+=======================================+" << endl;

    cout << "GPU:" << endl;
    cout << "Merk       : " << komputer.getGpu().getMerk() << endl;
    cout << "Nama       : " << komputer.getGpu().getNama() << endl;
    cout << "Kapasitas  : " << komputer.getGpu().getKapasitasGB() << " GB" << endl;
    cout << "Kecepatan  : " << komputer.getGpu().getKecepatanMHz() << " MHz" << endl;
    cout << "Bandwidth  : " << komputer.getGpu().getBandwidth() << endl;
    cout << "+=======================================+" << endl;
    cout << "Harddrive : " << endl;
    cout << "Merk               : " << komputer.getHarddrive().getMerk() << endl;
    cout << "Nama               : " << komputer.getHarddrive().getNama() << endl;
    cout << "Kapasitas          : " << komputer.getHarddrive().getKapasitasGB() << " GB" << endl;
    cout << "Interface          : " << komputer.getHarddrive().getInterface() << endl;
    cout << "Kecepatan Read     : " << komputer.getHarddrive().getKecepatanBacaMBps() << " MBps" << endl;
    cout << "Kecepatan Tulis    : " << komputer.getHarddrive().getKecepatanTulisMBps() << " MBps" << endl;
    cout << "+=======================================+" << endl;
    cout << "Powersupply: " << endl;
    cout << "Merk   : " << komputer.getPowersupply().getMerk() << endl;
    cout << "Nama   : " << komputer.getPowersupply().getNama() << endl;
    cout << "Watt   : " << komputer.getPowersupply().getWatt() << " W" << endl;

    cout << "+=======================================+" << endl;
    cout << "Ram: " << endl;
    int i = 1;
    for (Ram &ram : komputer.getRamList()) {
        cout << "Slot " << i << endl;
        cout << "Merk       : " << ram.getMerk() << endl;
        cout << "Nama       : " << ram.getNama() << endl;
        cout << "Kapasitas  : " << ram.getKapasitasGB() << " GB" << endl;
        cout << "DDR        : " << ram.getDdr() << endl;
        cout << "Clockspeed : " << ram.getKecepatanMHz() << " MHz" << endl;
        i += 1;
    }

    cout << "+=======================================+" << endl;
    cout << "Fan: " << endl;
    i = 1;
    for (Fan &fan : komputer.getFanList()) {
        cout << "Slot: " << i << endl;
        cout << "Merk       : " << fan.getMerk() << endl;
        cout << "Nama       : " << fan.getNama() << endl;
        cout << "Kecepatan  : " << fan.getKecepatan() << " RPM" << endl;
        cout << "Status     : (" << fan.getStatus() << ")" << endl;
        i += 1;
    }
    cout << "+=======================================+" << endl;

    komputer.TurnSwitchFan();
    cout << "Turning the Fans Switch" << endl;
    cout << "Fan: " << endl;
    i = 1;
    for (Fan &fan : komputer.getFanList()) {
        cout << "Slot: " << i << endl;
        cout << "Merk       : " << fan.getMerk() << endl;
        cout << "Nama       : " << fan.getNama() << endl;
        cout << "Kecepatan  : " << fan.getKecepatan() << " RPM" << endl;
        cout << "Status     : (" << fan.getStatus() << ")" << endl;
        i += 1;
    }
    cout << "+=======================================+" << endl;

    return 0;
}
