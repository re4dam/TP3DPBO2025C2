from Komponen import Komponen


class Harddrive(Komponen):
    __kapasitasGB = 0
    __kecepatan_baca_MBps = 0
    __kecepatan_tulis_MBps = 0
    __interface = ""

    def __init__(
        self,
        kapasitasGB,
        kecepatan_baca_MBps,
        kecepatan_tulis_MBps,
        interface,
        merk,
        nama,
    ):
        Komponen.__init__(self, merk, nama)
        self.__kapasitasGB = kapasitasGB
        self.__kecepatan_baca_MBps = kecepatan_baca_MBps
        self.__kecepatan_tulis_MBps = kecepatan_tulis_MBps
        self.__interface = interface

    def set_kapasitas_GB(self, kapasitas_GB):
        self.__kapasitasGB = kapasitas_GB

    def set_kecepatan_baca_mbps(self, kecepatan_baca_MBps):
        self.__kecepatan_baca_MBps = kecepatan_baca_MBps

    def set_kecepatan_tulis_mbps(self, kecepatan_tulis_MBps):
        self.__kecepatan_tulis_MBps = kecepatan_tulis_MBps

    def set_interface(self, interface):
        self.__interface = interface

    def get_kapasitas_GB(self):
        return self.__kapasitasGB

    def get_kecepatan_baca_mbps(self):
        return self.__kecepatan_baca_MBps

    def get_kecepatan_tulis_mbps(self):
        return self.__kecepatan_tulis_MBps

    def get_interface(self):
        return self.__interface
