class Ram extends Komponen {
    private String ddr;
    private Memory memory;

    public Ram() {
        memory = new Memory();
    }

    public Ram(String ddr, int kecepatanMHz, int kapasitasGB, String merk, String nama) {
        super(merk, nama);
        this.memory = new Memory(kapasitasGB, kecepatanMHz);
        this.ddr = ddr;
    }

    public void setDdr(String ddr) {
        this.ddr = ddr;
    }

    public String getDdr() {
        return this.ddr;
    }

    // Delegating Memory methods
    public void setKapasitasGB(int kapasitasGB) {
        this.memory.setKapasitasGB(kapasitasGB);
    }

    public void setKecepatanMHz(int kecepatanMHz) {
        this.memory.setKecepatanMHz(kecepatanMHz);
    }

    public int getKapasitasGB() {
        return this.memory.getKapasitasGB();
    }

    public int getKecepatanMHz() {
        return this.memory.getKecepatanMHz();
    }
}
