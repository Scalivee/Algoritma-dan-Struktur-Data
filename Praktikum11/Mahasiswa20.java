package Praktikum11;

public class Mahasiswa20 {
    String nim;
    String nama;
    String kelas;
    double ipk;
    Mahasiswa20 data;
    Mahasiswa20 next;

    public Mahasiswa20( String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilkanInformasi() {
        System.out.printf("%-10s %-15s %-5s %-4.2f\n", nama, nim, kelas, ipk);
    }

}
