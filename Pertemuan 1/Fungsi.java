public class Fungsi {
    public static void main(String[] args) {
        int hargaAglonema = 75000;
        int hargaKeladi = 50000;
        int hargaAlocasia = 60000;
        int hargaMawar = 10000;

        int[][] stok = {
            {10, 5, 15, 7},  // RoyalGarden 1
            {6, 11, 9, 12},  // RoyalGarden 2
            {2, 10, 10, 5},  // RoyalGarden 3
            {5, 7, 12, 9}    // RoyalGarden 4
        };

        System.out.println("Pendapatan tiap cabang jika semua bunga habis terjual:");
        for (int i = 0; i < stok.length; i++) {
            int pendapatan = (stok[i][0] * hargaAglonema) +
                             (stok[i][1] * hargaKeladi) +
                             (stok[i][2] * hargaAlocasia) +
                             (stok[i][3] * hargaMawar);
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + pendapatan);
        }

        int totalAglonema = 0, totalKeladi = 0, totalAlocasia = 0, totalMawar = 0;
        for (int i = 0; i < stok.length; i++) {
            totalAglonema += stok[i][0];
            totalKeladi += stok[i][1];
            totalAlocasia += stok[i][2];
            totalMawar += stok[i][3];
        }

        System.out.println("\nTotal stok bunga di semua cabang:");
        System.out.println("Aglonema: " + totalAglonema);
        System.out.println("Keladi: " + totalKeladi);
        System.out.println("Alocasia: " + totalAlocasia);
        System.out.println("Mawar: " + totalMawar);

        System.out.println("\nStok setelah pengurangan bunga yang mati:");
        for (int i = 0; i < stok.length; i++) {
            stok[i][0] -= 1; 
            stok[i][1] -= 2; 
            stok[i][2] -= 0; 
            stok[i][3] -= 5; 

            for (int j = 0; j < stok[i].length; j++) {
                if (stok[i][j] < 0) stok[i][j] = 0;
            }

            System.out.println("RoyalGarden " + (i + 1) + " -> Aglonema: " + stok[i][0] +
                               ", Keladi: " + stok[i][1] + ", Alocasia: " + stok[i][2] +
                               ", Mawar: " + stok[i][3]);
        }
    }
}
