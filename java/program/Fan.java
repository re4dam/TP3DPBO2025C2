class Fan extends Komponen {
    private int kecepatan;
    private String status;

    public Fan() {
        this.status = "off";
    }

    public Fan(int kecepatan, String merk, String nama) {
        super(merk, nama);
        this.kecepatan = kecepatan;
        this.status = "off";
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void TurnOn() {
        this.status = "on";
    }

    public void TurnOff() {
        this.status = "off";
    }

    public int getKecepatan() {
        return this.kecepatan;
    }

    public String getStatus() {
        return this.status;
    }
}
