package Praktikum10;

public class AntrianKRS {
    Mahasiswa20[] antrian;
    int front, rear, size, max;
    int sudahKRS;

    public AntrianKRS(int max) {
        this.max = max;
        this.antrian = new Mahasiswa20[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.sudahKRS = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void tambahAntrian(Mahasiswa20 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh.");
            return;
        }
        rear = (rear + 1) % max;
        antrian[rear] = mhs;
        size++;
        System.out.println("Mahasiswa " + mhs.nama + " berhasil masuk ke antrian.");
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Minimal 2 mahasiswa untuk proses KRS.");
            return;
        }

        for (int i = 0; i < 2; i++) {
            Mahasiswa20 mhs = antrian[front];
            front = (front + 1) % max;
            size--;
            sudahKRS++;
            System.out.print("Memproses KRS: ");
            mhs.tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % max;
            antrian[idx].tampilkanData();
        }
    }

    public void duaTerdepan() {
        if (size < 2) {
            System.out.println("Kurang dari 2 mahasiswa dalam antrian.");
        } else {
            System.out.println("2 Mahasiswa Terdepan:");
            for (int i = 0; i < 2; i++) {
                int idx = (front + i) % max;
                antrian[idx].tampilkanData();
            }
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir:");
            antrian[rear].tampilkanData();
        }
    }

    public int jumlahDalamAntrian() {
        return size;
    }

    public int jumlahSudahKRS() {
        return sudahKRS;
    }

    public int belumKRS(int jumlahDPA) {
        return (jumlahDPA * 30) - sudahKRS;
    }
}
