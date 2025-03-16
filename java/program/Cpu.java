class Cpu extends Komponen {
    private int jumlahCore;
    private double kecepatanGHz;

    public Cpu() {
    }

    public Cpu(int jumlahCore, double kecepatanGHz, String merk, String nama) {
        super(merk, nama);
        this.jumlahCore = jumlahCore;
        this.kecepatanGHz = kecepatanGHz;
    }

    public void setJumlahCore(int jumlahCore) {
        this.jumlahCore = jumlahCore;
    }

    public void setKecepatanGHz(float kecepatanGHz) {
        this.kecepatanGHz = kecepatanGHz;
    }

    public int getJumlahCore() {
        return this.jumlahCore;
    }

    public double getKecepatanGHz() {
        return this.kecepatanGHz;
    }
}
