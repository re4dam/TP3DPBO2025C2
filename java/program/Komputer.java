import java.util.ArrayList;
import java.util.List;

public class Komputer {
    private String nama;
    private Cpu cpu;
    private List<Ram> ramList;
    private List<Fan> fanList;
    private Harddrive harddrive;
    private Gpu gpu;
    private Powersupply powersupply;

    public Komputer() {
        this.ramList = new ArrayList<>();
        this.fanList = new ArrayList<>();
    }

    public Komputer(String nama, Cpu cpu, List<Ram> ramList, List<Fan> fanList,
            Harddrive harddrive, Gpu gpu, Powersupply powersupply) {
        this.nama = nama;
        this.cpu = cpu;
        this.ramList = ramList;
        this.fanList = fanList;
        this.harddrive = harddrive;
        this.gpu = gpu;
        this.powersupply = powersupply;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setRam(List<Ram> ramList) {
        this.ramList = ramList;
    }

    public void setFan(List<Fan> fanList) {
        this.fanList = fanList;
    }

    public void setHarddrive(Harddrive harddrive) {
        this.harddrive = harddrive;
    }

    public void addRam(Ram ram) {
        this.ramList.add(ram);
    }

    public void addFan(Fan fan) {
        this.fanList.add(fan);
    }

    public void setGpu(Gpu gpu) {
        this.gpu = gpu;
    }

    public void setPowersupply(Powersupply powersupply) {
        this.powersupply = powersupply;
    }

    public String getNama() {
        return this.nama;
    }

    public Cpu getCpu() {
        return this.cpu;
    }

    public List<Ram> getRamList() {
        return this.ramList;
    }

    public List<Fan> getFanList() {
        return this.fanList;
    }

    public Harddrive getHarddrive() {
        return this.harddrive;
    }

    public Gpu getGpu() {
        return this.gpu;
    }

    public Powersupply getPowersupply() {
        return this.powersupply;
    }

    public void TurnSwitchFan() {
        for (Fan fan : this.fanList) {
            if (fan.getStatus().equals("off")) {
                fan.TurnOn();
            } else {
                fan.TurnOff();
            }
        }
    }
}
