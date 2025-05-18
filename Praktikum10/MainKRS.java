package Praktikum10;

import java.util.Scanner;

public class MainKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int jumlahDPA = 3;
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian KRS Mahasiswa ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Proses KRS (2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Terdepan");
            System.out.println("5. Tampilkan Mahasiswa Terakhir");
            System.out.println("6. Jumlah Dalam Antrian");
            System.out.println("7. Jumlah Sudah KRS");
            System.out.println("8. Jumlah Belum KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa20 mhs = new Mahasiswa20(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.duaTerdepan();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    System.out.println("Jumlah dalam antrian: " + antrian.jumlahDalamAntrian());
                    break;
                case 7:
                    System.out.println("Jumlah sudah melakukan KRS: " + antrian.jumlahSudahKRS());
                    break;
                case 8:
                    System.out.println("Jumlah belum KRS: " + antrian.belumKRS(jumlahDPA));
                    break;
                case 9:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}

