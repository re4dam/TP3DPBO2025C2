class Harddrive extends Komponen {
    private int kapasitasGB;
    private int kecepatanBacaMBps;
    private int kecepatanTulisMBps;
    private String interfaceHarddrive;

    public Harddrive() {
    }

    public Harddrive(int kapasitasGB, int kecepatanBacaMBps, int kecepatanTulisMBps, String interfaceHarddrive,
            String merk, String nama) {
        super(merk, nama);
        this.kapasitasGB = kapasitasGB;
        this.kecepatanBacaMBps = kecepatanBacaMBps;
        this.kecepatanTulisMBps = kecepatanTulisMBps;
        this.interfaceHarddrive = interfaceHarddrive;
    }

    public void setKapasitasGB(int kapasitasGB) {
        this.kapasitasGB = kapasitasGB;
    }

    public void setKecepatanBacaMBps(int kecepatanBacaMBps) {
        this.kecepatanBacaMBps = kecepatanBacaMBps;
    }

    public void setKecepatanTulisMBps(int kecepatanTulisMBps) {
        this.kecepatanTulisMBps = kecepatanTulisMBps;
    }

    public void setInterfaceHarddrive(String interfaceHarddrive) {
        this.interfaceHarddrive = interfaceHarddrive;
    }

    public int getKapasitasGB() {
        return this.kapasitasGB;
    }

    public int getKecepatanBacaMBps() {
        return this.kecepatanBacaMBps;
    }

    public int getKecepatanTulisMBps() {
        return this.kecepatanTulisMBps;
    }

    public String getInterfaceHarddrive() {
        return this.interfaceHarddrive;
    }

}
