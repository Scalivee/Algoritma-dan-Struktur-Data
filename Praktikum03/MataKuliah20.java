package Praktikum03;

import java.util.Scanner;

public class MataKuliah20 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah20(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

     public void tambahData() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Kode Mata Kuliah: ");
        this.kode = sc.nextLine();

        System.out.print("Masukkan Nama Mata Kuliah: ");
        this.nama = sc.nextLine();

        System.out.print("Masukkan SKS: ");
        this.sks = Integer.parseInt(sc.nextLine());

        System.out.print("Masukkan Jumlah Jam: ");
        this.jumlahJam = Integer.parseInt(sc.nextLine());

        System.out.println("Data berhasil ditambahkan!\n");

    }

    public void tampilInformasi() {
        System.out.println("Kode Mata Kuliah  : " + kode);
        System.out.println("Nama Mata Kuliah  : " + nama);
        System.out.println("SKS              : " + sks);
        System.out.println("Jumlah Jam       : " + jumlahJam);
        System.out.println("--------------------------------");
    }

    

}
