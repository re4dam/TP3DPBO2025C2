import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cpu cpu = new Cpu(32, 5.6, "Adam", "Smart i12");
        Ram ram = new Ram("DDR5.2", 25600, 16, "Corsair", "Vengeance");
        Harddrive ssd = new Harddrive(65536, 14460, 13560, "NVMe", "Samsung", "ULTRA-1");

        List<Fan> fanList = Arrays.asList(
                new Fan(4800, "NF-P48 Redux", "Noctua"),
                new Fan(4800, "Pure Wings 8", "be quiet!"),
                new Fan(4800, "LL480 RGB", "Corsair"));

        List<Ram> initialRamList = new ArrayList<>();
        initialRamList.add(ram);
        initialRamList.add(new Ram("DDR5.2", 25600, 32, "Sussex", "Heaven"));

        Komputer komputer = new Komputer(
                "Server Adam",
                cpu,
                initialRamList,
                new ArrayList<>(fanList),
                ssd,
                new Gpu("GDDR8", "1025GB/s", 8, 3600, "NVIDIA", "5100"),
                new Powersupply(2500, "Seasonic", "Locked GX999"));

        komputer.addRam(new Ram("DDR5.3", 25600, 48, "Dixxies", "Congregation"));
        komputer.addFan(new Fan(4800, "Wings of Heaven", "God Itself"));

        System.out.println("Informasi Komputer:");
        System.out.println("Nama      : " + komputer.getNama());
        System.out.println("CPU:");
        System.out.println("Merk       : " + komputer.getCpu().getMerk());
        System.out.println("Nama       : " + komputer.getCpu().getNama());
        System.out.println("Cores      : " + komputer.getCpu().getJumlahCore());
        System.out.println("Kecepatan  : ~" + komputer.getCpu().getKecepatanGHz() + " GHz");
        System.out.println("+=======================================+");

        System.out.println("GPU:");
        System.out.println("Merk       : " + komputer.getGpu().getMerk());
        System.out.println("Nama       : " + komputer.getGpu().getNama());
        System.out.println("Kapasitas  : " + komputer.getGpu().getKapasitasGB() + " GB");
        System.out.println("Kecepatan  : " + komputer.getGpu().getKecepatanMHz() + " MHz");
        System.out.println("Bandwidth  : " + komputer.getGpu().getBandwidth());
        System.out.println("+=======================================+");
        System.out.println("Harddrive : ");
        System.out.println("Merk               : " + komputer.getHarddrive().getMerk());
        System.out.println("Nama               : " + komputer.getHarddrive().getNama());
        System.out.println("Kapasitas          : " + komputer.getHarddrive().getKapasitasGB() + " GB");
        System.out.println("Interface          : " + komputer.getHarddrive().getInterfaceHarddrive());
        System.out.println("Kecepatan Read     : " + komputer.getHarddrive().getKecepatanBacaMBps() + " MBps");
        System.out.println("Kecepatan Tulis    : " + komputer.getHarddrive().getKecepatanTulisMBps() + " MBps");
        System.out.println("+=======================================+");
        System.out.println("Powersupply : ");
        System.out.println("Merk    : " + komputer.getPowersupply().getMerk());
        System.out.println("Nama    : " + komputer.getPowersupply().getNama());
        System.out.println("Watt    : " + komputer.getPowersupply().getWatt() + " W");
        System.out.println("+=======================================+");

        System.out.println("Ram: ");
        int i = 1;
        for (Ram r : komputer.getRamList()) {
            System.out.println("Slot " + i);
            System.out.println("Merk       : " + r.getMerk());
            System.out.println("Nama       : " + r.getNama());
            System.out.println("Kapasitas  : " + r.getKapasitasGB() + " GB");
            System.out.println("DDR        : " + r.getDdr());
            System.out.println("Clockspeed : " + r.getKecepatanMHz() + " MHz");
            i += 1;
        }

        System.out.println("+=======================================+");
        System.out.println("Fan: ");
        i = 1;
        for (Fan fan : komputer.getFanList()) {
            System.out.println("Slot: " + i);
            System.out.println("Merk       : " + fan.getMerk());
            System.out.println("Nama       : " + fan.getNama());
            System.out.println("Kecepatan  : " + fan.getKecepatan() + " RPM");
            System.out.println("Status     : (" + fan.getStatus() + ")");
            i += 1;
        }

        System.out.println("+=======================================+");

        komputer.TurnSwitchFan();
        System.out.println("Turning the Fans Switch");
        System.out.println("Fan: ");
        i = 1;
        for (Fan fan : komputer.getFanList()) {
            System.out.println("Slot: " + i);
            System.out.println("Merk       : " + fan.getMerk());
            System.out.println("Nama       : " + fan.getNama());
            System.out.println("Kecepatan  : " + fan.getKecepatan() + " RPM");
            System.out.println("Status     : (" + fan.getStatus() + ")");
            i += 1;
        }
        System.out.println("+=======================================+");
    }
}
