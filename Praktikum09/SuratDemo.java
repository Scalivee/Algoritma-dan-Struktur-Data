package Praktikum09;

import java.util.Scanner;

public class SuratDemo {
    public static void main(String[] args) {
        StackSurat20 stackSurat = new StackSurat20(5);
        Scanner scan = new Scanner(System.in);
        
        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin berdasarkan Nama");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMahasiswa = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenisIzin = scan.nextLine().charAt(0);
                    System.out.print("Durasi Izin (hari): ");
                    int durasi = scan.nextInt();
                    stackSurat.push(new Surat20(idSurat, namaMahasiswa, kelas, jenisIzin, durasi));
                    break;

                case 2:
                    stackSurat.pop();
                    break;

                case 3:
                    Surat20 lihatTerakhir = stackSurat.peek();
                    if (lihatTerakhir != null) {
                        System.out.println("Surat izin terakhir:");
                        lihatTerakhir.displaySurat();
                    }
                    break;

                case 4:
                    System.out.print("Masukkan Nama Mahasiswa yang dicari: ");
                    String cariNama = scan.nextLine();
                    stackSurat.searchSurat(cariNama);
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);

        scan.close();
    }
}