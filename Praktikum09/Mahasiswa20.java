package Praktikum09;

public class Mahasiswa20 {
    String nim;
    String nama;
    String kelas;
    int nilai;


public Mahasiswa20(String nama, String nim, String kelas) {
    this.nama = nama;
    this.nim = nim;
    this.kelas = kelas;
    nilai = -1;
}

void tugasDinilai(int nilai) {
    this.nilai = nilai;
}

}
