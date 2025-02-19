import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = scanner.nextDouble();

        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = scanner.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        double uts = scanner.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double uas = scanner.nextDouble();

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai tidak valid!");
        } else {
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);

            String nilaiHuruf = "E"; 
            if (nilaiAkhir > 80 && nilaiAkhir <= 100) nilaiHuruf = "A";
            else if (nilaiAkhir > 73) nilaiHuruf = "B+";
            else if (nilaiAkhir > 65) nilaiHuruf = "B";
            else if (nilaiAkhir > 60) nilaiHuruf = "C+";
            else if (nilaiAkhir > 50) nilaiHuruf = "C";
            else if (nilaiAkhir > 39) nilaiHuruf = "D";

            String status = "TIDAK LULUS";
            if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") ||
                nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
                status = "LULUS";
            }
        

        System.out.println("==============================");
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("==============================");
        System.out.println("Status : " + status);

        
    }
}
}