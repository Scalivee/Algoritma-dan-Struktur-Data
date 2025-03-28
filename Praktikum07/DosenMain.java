package Praktikum07;

import java.util.Scanner;

public class DosenMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen data = new DataDosen();
        int pilihan;

        do {
            System.out.println("\n===== MENU DATA DOSEN =====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Usia Termuda -> Tertua)");
            System.out.println("4. Sorting DSC (Usia Tertua -> Termuda)");
            System.out.println("5. Cari Dosen Berdasarkan Nama");
            System.out.println("6. Cari Dosen Berdasarkan Usia");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Dosen: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan Nama Dosen: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L = Laki-laki, P = Perempuan): ");
                    char jk = sc.next().charAt(0);
                    System.out.print("Masukkan Usia Dosen: ");
                    int usia = sc.nextInt();

                    boolean jenisKelamin = (jk == 'L' || jk == 'l');

                    Dosen dsn = new Dosen(kode, nama, jenisKelamin, usia);
                    data.tambah(dsn);
                    System.out.println("Data dosen berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n===== DATA DOSEN =====");
                    data.tampil();
                    break;

                case 3:
                    data.sortingASC();
                    System.out.println("\n===== DATA DOSEN SETELAH SORTING ASC =====");
                    data.tampil();
                    break;

                case 4:
                    data.sortingDSC();
                    System.out.println("\n===== DATA DOSEN SETELAH SORTING DSC =====");
                    data.tampil();
                    break;

                case 5:
                    System.out.print("\nMasukkan Nama Dosen yang Dicari: ");
                    String cariNama = sc.nextLine();
                    data.pencarianDataSequential(cariNama);
                    break;

                case 6:
                    System.out.print("\nMasukkan Usia Dosen yang Dicari: ");
                    int cariUsia = sc.nextInt();
                    data.pencarianDataBinary(cariUsia);
                    break;

                case 7:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 7);

        sc.close();
    }
}
