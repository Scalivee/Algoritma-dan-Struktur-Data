import java.util.Scanner;

public class Plat {
    public static void main(String[] args) {
        String[] KODE = {"A", "B", "D", "E", "F", "G", "H", "L", "N", "T"};

        String[][] KOTA = {
            {"Banten"},          
            {"Jakarta"},         
            {"Bandung"},         
            {"Cirebon"},         
            {"Bogor"},           
            {"Pekalongan"},      
            {"Semarang"},        
            {"Surabaya"},        
            {"Malang"},          
            {"Tegal"}            
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor (A-T): ");
        String inputKode = scanner.next().toUpperCase(); 

        boolean ditemukan = false;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i].equals(inputKode)) {
                System.out.println("Kota: " + KOTA[i][0]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan!");
        }

        scanner.close();
    }
}
