package Praktikum12;
import java.util.Scanner;

public class DLLMain20 {

    public static Mahasiswa20 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan.nextDouble();
        scan.nextLine(); 
        return new Mahasiswa20(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        DoubleLinkedList20 list = new DoubleLinkedList20();
        Scanner scan = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Tambahkan data setelah");
            System.out.println("8. Tambah pada indeks tertentu");//jawaban tugas nomer 1
            System.out.println("9. Hapus setelah NIM tertentu");// jawaban tugas nomer 2
            System.out.println("10. Hapus berdasarkan indeks");// jawaban tugas nomer 3
            System.out.println("11. Tampilkan data pertama");// jawaban tugas nomer 4
            System.out.println("12. Tampilkan data terakhir");// jawaban tugas nomer 4
            System.out.println("13. Tampilkan data berdasarkan indeks");// jawaban tugas nomer 4
            System.out.println("14. Tampilkan jumlah data");//jawaban tugas nomer 5
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1: {
                    Mahasiswa20 mhs = inputMahasiswa(scan);
                        list.addFirst(mhs);
                    }
                    break;
                case 2: {
                    Mahasiswa20 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                    }
                    break;
                case 3: list.removeFirst(); break;
                case 4: list.removeLast(); break;
                case 5: list.print(); break;
                case 6: {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node20 found = list.search(nim);
                    if (found != null) {
                    System.out.println("Data ditemukan:");
                    found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                }
                break;
                case 7: {
                    System.out.print("Masukkan NIM sebelum data baru yang diinputkan: ");
                    String keyNim = scan.nextLine();
                    Mahasiswa20 mhs = inputMahasiswa(scan);
                    list.insertAfter(keyNim, mhs);
                    break;
                }
                case 8: 
                    System.out.print("Masukkan indeks: ");
                    int index = scan.nextInt();
                    scan.nextLine(); 
                    Mahasiswa20 mhsIndex = inputMahasiswa(scan);
                    list.add(index, mhsIndex);
                    break;
                case 9: 
                    System.out.print("Masukkan NIM untuk menghapus setelahnya: ");
                    String nimHapus = scan.nextLine();
                    list.removeAfter(nimHapus);
                    break;
                case 10:
                    System.out.print("Masukkan indeks yang ingin dihapus: ");
                    int indexHapus = scan.nextInt();
                    scan.nextLine();
                    list.remove(indexHapus);
                    break;
                case 11:
                    list.getFirst();
                    break;
                case 12:
                    list.getLast();
                    break;
                case 13:
                    System.out.print("Masukkan indeks yang ingin ditampilkan: ");
                    int indexTampil = scan.nextInt();
                    scan.nextLine();
                    list.getIndex(indexTampil);
                    break;
                case 14:
                    System.out.println("Jumlah data: " + list.getSize());
                    break;
                case 0: System.out.println("Keluar dari program.");
                break;
                default: System.out.println("Pilihan tidak valid!");
                    break;
            }

        }
         while (pilihan != 0); {
                scan.close();
            }
    }

}
