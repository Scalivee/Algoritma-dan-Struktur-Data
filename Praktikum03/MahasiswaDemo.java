package Praktikum03;

import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa20[] arrayofMahasiswa20 = new Mahasiswa20[3];
        String dummy;
        
        for (int i = 0; i < 3; i++ ) {
            arrayofMahasiswa20[i] = new Mahasiswa20();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM     :");
            arrayofMahasiswa20[i].nim = sc.nextLine();
            System.out.print("Nama    :");
            arrayofMahasiswa20[i].nama = sc.nextLine();
            System.out.print("Kelas   :"); 
            arrayofMahasiswa20[i].kelas = sc.nextLine();
            System.out.print("Ipk     :");
            dummy = sc.nextLine();
            arrayofMahasiswa20[i].ipk = Float.parseFloat(dummy);
            System.out.println("-------------------------------");

        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-"  + (i + 1));
            arrayofMahasiswa20[i].tampilkanInformasi();

        }
        
        sc.close();
        
        
    }
}
