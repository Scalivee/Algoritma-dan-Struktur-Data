package Praktikum03;

import java.util.Scanner;

public class MataKuliahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = sc.nextInt();
        sc.nextLine();
        MataKuliah20[] arrayofMataKuliah20 = new MataKuliah20[jumlahMK];
        //String kode, nama, dummy;
        //int sks, jumlahJam;

        for(int i = 0; i < jumlahMK; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayofMataKuliah20[i] = new MataKuliah20("", "", 0, 0); 
            arrayofMataKuliah20[i].tambahData();
            

           // arrayofMataKuliah20[i] = new MataKuliah20(kode, nama, sks, jumlahJam);

        }

        for(int i = 0; i < jumlahMK; i++) {
            System.out.println("Data Mahasiswa ke-"  + (i + 1));
            arrayofMataKuliah20[i].tampilInformasi();
        }

        
        sc.close();
    }
}
