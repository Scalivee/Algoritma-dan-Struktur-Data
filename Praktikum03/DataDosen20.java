package Praktikum03;

public class DataDosen20 {

    public static void dataSemuaDosen(Dosen20[] arrayOfDosen) {
        System.out.println("\n=== Data Semua Dosen ===");
        for (int i = 0; i < arrayOfDosen.length; i++) {
            arrayOfDosen[i].tampilkanData(i);
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen20[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen20 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("\n=== Jumlah Dosen Berdasarkan Jenis Kelamin ===");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen20[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen20 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) { 
                totalUsiaPria += dosen.usia;
                countPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                countWanita++;
            }
        }

        double rataPria = (countPria > 0) ? (double) totalUsiaPria / countPria : 0;
        double rataWanita = (countWanita > 0) ? (double) totalUsiaWanita / countWanita : 0;

        System.out.println("\n=== Rata-Rata Usia Dosen ===");
        System.out.println("Pria   : " + rataPria);
        System.out.println("Wanita : " + rataWanita);
    }

    public static void infoDosenPalingTua(Dosen20[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen20 dosenTertua = arrayOfDosen[0];

        for (Dosen20 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTertua.usia) {
                dosenTertua = dosen;
            }
        }

        System.out.println("\n=== Dosen Paling Tua ===");
        dosenTertua.tampilkanData(0);
    }

    public static void infoDosenPalingMuda(Dosen20[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen20 dosenTermuda = arrayOfDosen[0];

        for (Dosen20 dosen : arrayOfDosen) {
            if (dosen.usia < dosenTermuda.usia) {
                dosenTermuda = dosen;
            }
        }

        System.out.println("\n=== Dosen Paling Muda ===");
        dosenTermuda.tampilkanData(0);
    }
}
