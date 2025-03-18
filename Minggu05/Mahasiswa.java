package Minggu05; 

public class Mahasiswa {
    String[] nama = {"Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Gina", "Hadi"};
    String[] nim = {"220101001", "220101002", "220101003", "220101004", "220101005", "220101006", "220101007", "220101008"};
    int[] tahunMasuk = {2022, 2022, 2021, 2021, 2023, 2020, 2023, 2020};
    int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
    int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};

    void tampilkanData() {
        System.out.printf("%-10s %-12s %-10s %-10s %-10s\n", "Nama", "NIM", "Tahun Masuk", "Nilai UTS", "Nilai UAS");
        for (int i = 0; i < nama.length; i++) {
            System.out.printf("%-10s %-12s %-10d %-10d %-10d\n", nama[i], nim[i], tahunMasuk[i], nilaiUTS[i], nilaiUAS[i]);
        }
        System.out.println();
    }

    int findMaxUTS(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }
        int mid = (left + right) / 2;
        int maxLeft = findMaxUTS(arr, left, mid);
        int maxRight = findMaxUTS(arr, mid + 1, right);
        return Math.max(maxLeft, maxRight);
    }

    int findMinUTS(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }
        int mid = (left + right) / 2;
        int minLeft = findMinUTS(arr, left, mid);
        int minRight = findMinUTS(arr, mid + 1, right);
        return Math.min(minLeft, minRight);
    }

    double calculateAverageUAS(int[] arr) {
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return (double) total / arr.length;
    }
}
