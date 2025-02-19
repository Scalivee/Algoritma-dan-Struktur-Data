import java.util.Scanner;

public class Perulangan {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();

        int n;
        if (nim.length() >= 2) {
            n = Integer.parseInt(nim.substring(nim.length() - 2));
        } else {
            System.out.println("NIM tidak valid!");
            return;
        }

        if (n < 10) {
            n += 10;
        }

        System.out.println("Nilai N = " + n);
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue; 
            }

            if (i % 2 == 1) {
                System.out.print("* "); 
            } else {
                System.out.print(i + " "); 
            }
        }

        sc.close();
    }
}
