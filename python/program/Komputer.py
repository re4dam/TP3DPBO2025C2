from Cpu import Cpu
from Fan import Fan
from Gpu import Gpu
from Harddrive import Harddrive
from Powersupply import Powersupply
from Ram import Ram


class Komputer:
    def __init__(
        self,
        nama="",
        cpu=None,
        ram_list=None,
        fan_list=None,
        harddrive=None,
        gpu=None,
        powersupply=None,
    ):
        self.nama = nama
        self.cpu = cpu if cpu is not None else Cpu()
        self.ram_list = ram_list if ram_list is not None else []
        self.fan_list = fan_list if fan_list is not None else []
        self.harddrive = harddrive if harddrive is not None else Harddrive()
        self.gpu = gpu if gpu is not None else Gpu()
        self.powersupply = powersupply if powersupply is not None else Powersupply()

    def set_nama(self, nama):
        self.nama = nama

    def set_cpu(self, cpu):
        self.cpu = cpu

    def set_ram(self, ram_list):
        self.ram_list = ram_list

    def set_fan(self, fan_list):
        self.fan_list = fan_list

    def set_harddrive(self, harddrive):
        self.harddrive = harddrive

    def add_ram(self, ram):
        self.ram_list.append(ram)

    def add_fan(self, fan):
        self.fan_list.append(fan)

    def set_gpu(self, gpu):
        self.gpu = gpu

    def set_powersupply(self, powersupply):
        self.powersupply = powersupply

    def get_nama(self):
        return self.nama

    def get_cpu(self):
        return self.cpu

    def get_ram_list(self):
        return self.ram_list

    def get_fan_list(self):
        return self.fan_list

    def get_harddrive(self):
        return self.harddrive

    def get_gpu(self):
        return self.gpu

    def get_powersupply(self):
        return self.powersupply

    def turn_switch_fan(self):
        for fan in self.fan_list:
            if fan.get_status() == "off":
                fan.turn_on()
            else:
                fan.turn_off()
