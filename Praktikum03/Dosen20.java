package Praktikum03;
public class Dosen20 {
    String kode;
    String nama;
    boolean jenisKelamin; 
    int usia;

    public Dosen20(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void tampilkanData(int i) {
        System.out.println("Data Dosen ke-" + (i + 1));
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + usia);
        System.out.println("---------------------------------");
    }
}
