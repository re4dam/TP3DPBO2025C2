from Cpu import Cpu
from Fan import Fan
from Gpu import Gpu
from Harddrive import Harddrive
from Komputer import Komputer
from Powersupply import Powersupply
from Ram import Ram


# Create components
cpu = Cpu(32, 5.6, "Adam", "Smart i12")
ram = Ram("DDR5.2", 25600, 16, "Corsair", "Vengeance")
ssd = Harddrive(65536, 14460, 13560, "NVMe", "Samsung", "ULTRA-1")
fan_list = [
    Fan(4800, "NF-P48 Redux", "Noctua"),
    Fan(4800, "Pure Wings 8", "be quiet!"),
    Fan(4800, "LL480 RGB", "Corsair"),
]

# Create computer with components
komputer = Komputer(
    "Server Adam",
    cpu,
    [ram, Ram("DDR5.2", 25600, 32, "Sussex", "Heaven")],
    fan_list,
    ssd,
    Gpu("GDDR8", "1025GB/s", 8, 3600, "NVIDIA", "5100"),
    Powersupply(2500, "Seasonic", "Locked GX999"),
)

# Add additional components
komputer.add_ram(Ram("DDR5.3", 25600, 48, "Dixxies", "Congregation"))
komputer.add_fan(Fan(4800, "Wings of Heaven", "God Itself"))

# Display computer information
print("Informasi Komputer:")
print(f"Nama      : {komputer.get_nama()}")
print("CPU:")
print(f"Merk       : {komputer.get_cpu().get_merk()}")
print(f"Nama       : {komputer.get_cpu().get_nama()}")
print(f"Cores      : {komputer.get_cpu().get_jumlah_core()}")
print(f"Kecepatan  : ~{komputer.get_cpu().get_kecepatan_GHz()} GHz")
print("+=======================================+")

print("GPU:")
print(f"Merk       : {komputer.get_gpu().get_merk()}")
print(f"Nama       : {komputer.get_gpu().get_nama()}")
print(f"Kapasitas  : {komputer.get_gpu().get_kapasitasGB()} GB")
print(f"Kecepatan  : {komputer.get_gpu().get_kecepatanMHz()} MHz")
print(f"Bandwidth  : {komputer.get_gpu().get_bandwidth()}")
print("+=======================================+")
print("Harddrive : ")
print(f"Merk               : {komputer.get_harddrive().get_merk()}")
print(f"Nama               : {komputer.get_harddrive().get_nama()}")
print(f"Kapasitas          : {komputer.get_harddrive().get_kapasitas_GB()} GB")
print(f"Interface          : {komputer.get_harddrive().get_interface()}")
print(f"Kecepatan Read     : {komputer.get_harddrive().get_kecepatan_baca_mbps()} MBps")
print(
    f"Kecepatan Tulis    : {komputer.get_harddrive().get_kecepatan_tulis_mbps()} MBps"
)
print("+=======================================+")
print("Powersupply: ")
print(f"Merk    : {komputer.get_powersupply().get_merk()}")
print(f"Nama    : {komputer.get_powersupply().get_nama()}")
print(f"Watt    : {komputer.get_powersupply().get_watt()} W")
print("+=======================================+")

print("Ram: ")
i = 1
for ram in komputer.get_ram_list():
    print(f"Slot {i}")
    print(f"Merk       : {ram.get_merk()}")
    print(f"Nama       : {ram.get_nama()}")
    print(f"Kapasitas  : {ram.get_kapasitasGB()} GB")
    print(f"DDR        : {ram.get_ddr()}")
    print(f"Clockspeed : {ram.get_kecepatanMHz()} MHz")
    i += 1

print("+=======================================+")
print("Fan: ")
i = 1
for fan in komputer.get_fan_list():
    print(f"Slot: {i}")
    print(f"Merk       : {fan.get_merk()}")
    print(f"Nama       : {fan.get_nama()}")
    print(f"Kecepatan  : {fan.get_kecepatan()} RPM")
    print(f"Status     : ({fan.get_status()})")
    i += 1

print("+=======================================+")

# Turn on the fans and display the updated status
komputer.turn_switch_fan()
print("Turning the Fans Switch")
print("Fan: ")
i = 1
for fan in komputer.get_fan_list():
    print(f"Slot: {i}")
    print(f"Merk       : {fan.get_merk()}")
    print(f"Nama       : {fan.get_nama()}")
    print(f"Kecepatan  : {fan.get_kecepatan()} RPM")
    print(f"Status     : ({fan.get_status()})")
    i += 1
print("+=======================================+")
