from Komponen import Komponen


class Fan(Komponen):
    def __init__(self, kecepatan=0, nama="", merk=""):
        Komponen.__init__(self, merk, nama)
        self.kecepatan = kecepatan
        self.status = "off"

    def set_kecepatan(self, kecepatan):
        self.kecepatan = kecepatan

    def turn_on(self):
        self.status = "on"

    def turn_off(self):
        self.status = "off"

    def get_kecepatan(self):
        return self.kecepatan

    def get_status(self):
        return self.status
