package Praktikum09;

public class Surat20 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; 
    int durasi; 

    public Surat20(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void displaySurat() {
        System.out.println("ID Surat: " + idSurat);
        System.out.println("Nama Mahasiswa: " + namaMahasiswa);
        System.out.println("Kelas: " + kelas);
        System.out.println("Jenis Izin: " + (jenisIzin == 'S' ? "Sakit" : "Izin Keperluan"));
        System.out.println("Durasi: " + durasi + " hari");
    }
}