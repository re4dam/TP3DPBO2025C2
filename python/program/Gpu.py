from Komponen import Komponen
from Memory import Memory


class Gpu(Komponen, Memory):
    def __init__(self, gddr, bandwidth, kapasitasGB, kecepatanMHz, merk, nama):
        Komponen.__init__(self, merk, nama)
        Memory.__init__(self, kapasitasGB, kecepatanMHz)
        self.gddr = gddr
        self.bandwidth = bandwidth

    def set_gddr(self, gddr):
        self.gddr = gddr

    def set_bandwidth(self, bandwidth):
        self.bandwidth = bandwidth

    def get_gddr(self):
        return self.gddr

    def get_bandwidth(self):
        return self.bandwidth
