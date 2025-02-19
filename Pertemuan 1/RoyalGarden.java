public class RoyalGarden {
    public static void main(String[] args) {
        int hargaAglonema = 75000;
        int hargaKeladi = 50000;
        int hargaAlocasia = 60000;
        int hargaMawar = 10000;

        int[][] stok = {
            {10, 5, 15, 7},  
            {6, 11, 9, 12},  
            {2, 10, 10, 5},  
            {5, 7, 12, 9}    
        };

        tampilkanPendapatan(stok, hargaAglonema, hargaKeladi, hargaAlocasia, hargaMawar);

        tampilkanStokRoyalGarden4(stok);
    }

    public static void tampilkanPendapatan(int[][] stok, int hargaAglonema, int hargaKeladi, int hargaAlocasia, int hargaMawar) {
        System.out.println("Pendapatan tiap cabang jika semua bunga habis terjual:");
        for (int i = 0; i < stok.length; i++) {
            int pendapatan = (stok[i][0] * hargaAglonema) +
                             (stok[i][1] * hargaKeladi) +
                             (stok[i][2] * hargaAlocasia) +
                             (stok[i][3] * hargaMawar);
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + pendapatan);
        }
    }

    public static void tampilkanStokRoyalGarden4(int[][] stok) {
        int index = 3;

        stok[index][0] -= 1; 
        stok[index][1] -= 2; 
        stok[index][2] -= 0; 
        stok[index][3] -= 5; 

        for (int j = 0; j < stok[index].length; j++) {
            if (stok[index][j] < 0) stok[index][j] = 0;
        }

        System.out.println("\nStok RoyalGarden 4 setelah pengurangan bunga yang mati:");
        System.out.println("Aglonema: " + stok[index][0]);
        System.out.println("Keladi: " + stok[index][1]);
        System.out.println("Alocasia: " + stok[index][2]);
        System.out.println("Mawar: " + stok[index][3]);
    }
}
