class Powersupply extends Komponen {
    private int watt;

    public Powersupply() {
    }

    public Powersupply(int watt, String merk, String nama) {
        super(merk, nama);
        this.watt = watt;
    }

    public void setWatt(int watt) {
        this.watt = watt;
    }

    public int getWatt() {
        return this.watt;
    }
}
