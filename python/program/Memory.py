class Memory:
    __kapasitasGB = 0
    __kecepatanMHz = 0

    def __init__(self, kapasitasGB, kecepatanMHz):
        self.__kapasitasGB = kapasitasGB
        self.__kecepatanMHz = kecepatanMHz

    def set_kapasitasGB(self, kapasitasGB):
        self.__kapasitasGB = kapasitasGB

    def set_kecepatanMHz(self, kecepatanMHz):
        self.__kecepatanMHz = kecepatanMHz

    def get_kapasitasGB(self):
        return self.__kapasitasGB

    def get_kecepatanMHz(self):
        return self.__kecepatanMHz
