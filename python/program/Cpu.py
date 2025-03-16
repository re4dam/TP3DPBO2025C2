from Komponen import Komponen


class Cpu(Komponen):
    def __init__(self, jumlah_core=0, kecepatan_GHz=0.0, merk="", nama=""):
        Komponen.__init__(self, merk, nama)
        self.jumlah_core = jumlah_core
        self.kecepatan_GHz = kecepatan_GHz

    def set_jumlah_core(self, jumlah_core):
        self.jumlah_core = jumlah_core

    def set_kecepatan_GHz(self, kecepatan_GHz):
        self.kecepatan_GHz = kecepatan_GHz

    def get_jumlah_core(self):
        return self.jumlah_core

    def get_kecepatan_GHz(self):
        return self.kecepatan_GHz
