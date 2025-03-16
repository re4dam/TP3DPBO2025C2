from Komponen import Komponen
from Memory import Memory


class Ram(Komponen, Memory):
    __ddr = ""

    def __init__(self, ddr, kapasitasGB, kecepatanMHz, merk, nama):
        Komponen.__init__(self, merk, nama)
        Memory.__init__(self, kapasitasGB, kecepatanMHz)
        self.__ddr = ddr

    def set_ddr(self, ddr):
        self.__ddr = ddr

    def get_ddr(self):
        return self.__ddr
