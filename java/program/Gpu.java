class Gpu extends Komponen {
    private String gddr;
    private String bandwidth;
    private Memory memory;

    public Gpu() {
        memory = new Memory();
    }

    public Gpu(String gddr, String bandwidth, int kapasitasGB, int kecepatanMHz, String merk, String nama) {
        super(merk, nama);
        memory = new Memory(kapasitasGB, kecepatanMHz);
        this.gddr = gddr;
        this.bandwidth = bandwidth;
    }

    public void setGddr(String gddr) {
        this.gddr = gddr;
    }

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getGddr() {
        return this.gddr;
    }

    public String getBandwidth() {
        return this.bandwidth;
    }

    // Memory methods
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
