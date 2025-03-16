from Komponen import Komponen


class Powersupply(Komponen):
    def __init__(self, watt=0, merk="", nama=""):
        Komponen.__init__(self, merk, nama)
        self.watt = watt

    def set_watt(self, watt):
        self.watt = watt

    def get_watt(self):
        return self.watt
