public class MahasiswaMain20 {
    public static void main(String[] args) {
        Mahasiswa20 mhs1 = new Mahasiswa20();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa20 mhs2 = new Mahasiswa20("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa20 mhsAdit = new Mahasiswa20("Aditya Satria", "244109540", 3.69, "SIB 1D");
        mhsAdit.updateIpk(3.79);
        mhsAdit.tampilkanInformasi();
    }
}
