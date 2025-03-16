class Memory {
    private int kapasitasGB;
    private int kecepatanMHz;

    public Memory() {
    }

    public Memory(int kapasitasGB, int kecepatanMHz) {
        this.kapasitasGB = kapasitasGB;
        this.kecepatanMHz = kecepatanMHz;
    }

    public void setKapasitasGB(int kapasitasGB) {
        this.kapasitasGB = kapasitasGB;
    }

    public void setKecepatanMHz(int kecepatanMHz) {
        this.kecepatanMHz = kecepatanMHz;
    }

    public int getKapasitasGB() {
        return this.kapasitasGB;
    }

    public int getKecepatanMHz() {
        return this.kecepatanMHz;
    }
}
