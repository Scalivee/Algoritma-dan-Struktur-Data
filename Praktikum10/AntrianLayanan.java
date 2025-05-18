package Praktikum10;

public class AntrianLayanan {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan(int max) {
        this.max = max;
        data = new Mahasiswa[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

     public void lihatTerdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkan();
        }
     }

     public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return;
        } 
        System.out.println("Daftar Mahasiswa dalam antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for ( int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkan();
        }
     }

     public int getJumlahAntrian() {
        return size;
     }

     public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
     }

     public void tambahAntrian(Mahasiswa mhs) {
        if (IsFull()) {
            System.out.println("Antrian sudah penuh");
            return;
        } 
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian");
        
     }

     public Mahasiswa layaniMahasiswa() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
            return null;
        } 
        Mahasiswa mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
     }
     
     public void lihatAkhir() {
    if (IsEmpty()) {
        System.out.println("Antrian kosong");
    } else {
        System.out.print("Mahasiswa terakhir dalam antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        data[rear].tampilkan();
    }
}

}

