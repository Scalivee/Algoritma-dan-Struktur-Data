import java.util.Scanner;

public class Jadwal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] namaMK = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data untuk mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMK[i] = sc.nextLine();
            System.out.print("SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = sc.nextLine();
        }

        int pilihan;
        do {
            System.out.println("\n=== MENU JADWAL KULIAH ===");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.println("\n=== SELURUH JADWAL KULIAH ===");
                    tampilkanJadwal(namaMK, sks, semester, hariKuliah);
                    break;

                case 2:
                    System.out.print("\nMasukkan hari kuliah yang ingin ditampilkan: ");
                    String hariCari = sc.nextLine();
                    System.out.println("\n=== JADWAL KULIAH HARI " + hariCari.toUpperCase() + " ===");
                    boolean adaHari = false;
                    for (int i = 0; i < n; i++) {
                        if (hariKuliah[i].equalsIgnoreCase(hariCari)) {
                            System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i]);
                            adaHari = true;
                        }
                    }
                    if (!adaHari) {
                        System.out.println("Tidak ada mata kuliah di hari tersebut.");
                    }
                    break;

                case 3:
                    System.out.print("\nMasukkan semester yang ingin ditampilkan: ");
                    int semesterCari = sc.nextInt();
                    System.out.println("\n=== JADWAL KULIAH SEMESTER " + semesterCari + " ===");
                    boolean adaSemester = false;
                    for (int i = 0; i < n; i++) {
                        if (semester[i] == semesterCari) {
                            System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Hari: " + hariKuliah[i]);
                            adaSemester = true;
                        }
                    }
                    if (!adaSemester) {
                        System.out.println("Tidak ada mata kuliah di semester tersebut.");
                    }
                    break;


                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);

        sc.close();
    }

    public static void tampilkanJadwal(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.println("-------------------------------------------------");
        System.out.printf("%-25s %-5s %-10s %-10s\n", "Nama Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < namaMK.length; i++) {
            System.out.printf("%-25s %-5d %-10d %-10s\n", namaMK[i], sks[i], semester[i], hariKuliah[i]);
        }
    }
}
