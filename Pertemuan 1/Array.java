import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] mataKuliah = {
            "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
            "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", 
            "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = {2, 3, 3, 3, 2, 3, 2, 2}; 
        double[] nilaiAngka = new double[mataKuliah.length];
        double[] bobotNilai = new double[mataKuliah.length];

        double totalBobot = 0;
        int totalSKS = 0;

        System.out.println("========== Program Menghitung IP Semester ==========");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = scanner.nextDouble();

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                bobotNilai[i] = 4.0;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                bobotNilai[i] = 3.0;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                bobotNilai[i] = 2.0;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                bobotNilai[i] = 1.0;
            } else {
                bobotNilai[i] = 0.0;
            }

            totalBobot += bobotNilai[i] * sks[i];
            totalSKS += sks[i];
        }

        double ipSemester = totalBobot / totalSKS;

        System.out.println("\n========== Hasil Konversi Nilai ==========");
        System.out.printf("%-45s %-10s %-10s %-10s\n", "Mata Kuliah", "Nilai", "Huruf", "Bobot");

        for (int i = 0; i < mataKuliah.length; i++) {
            String nilaiHuruf;
            if (bobotNilai[i] == 4.0) {
                nilaiHuruf = "A";
            } else if (bobotNilai[i] == 3.5) {
                nilaiHuruf = "B+";
            } else if (bobotNilai[i] == 3.0) {
                nilaiHuruf = "B";
            } else if (bobotNilai[i] == 2.5) {
                nilaiHuruf = "C+";
            } else if (bobotNilai[i] == 2.0) {
                nilaiHuruf = "C";
            } else if (bobotNilai[i] == 1.0) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            System.out.printf("%-45s %-10.2f %-10s %-10.2f\n",
                    mataKuliah[i], nilaiAngka[i], nilaiHuruf, bobotNilai[i]);
        }

        System.out.println("=========================================");
        System.out.printf("IP Semester: %.2f\n", ipSemester);
        scanner.close();
    }
}
