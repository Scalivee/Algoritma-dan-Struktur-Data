package Minggu05; 

public class MahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();

        System.out.println("=== Daftar Mahasiswa ===");
        mhs.tampilkanData(); 

        System.out.println("Nilai UTS Tertinggi: " + mhs.findMaxUTS(mhs.nilaiUTS, 0, mhs.nilaiUTS.length - 1));
        System.out.println("Nilai UTS Terendah: " + mhs.findMinUTS(mhs.nilaiUTS, 0, mhs.nilaiUTS.length - 1));
        System.out.println("Rata-rata Nilai UAS: " + mhs.calculateAverageUAS(mhs.nilaiUAS));
    }
}
