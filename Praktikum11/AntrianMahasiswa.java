package Praktikum11;

public class AntrianMahasiswa {
    Node front, rear;
    int size = 0;
    int MAX = 10;

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == MAX;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh. Tidak bisa menambahkan.");
        } else {
            Node baru = new Node(mhs);
            if (isEmpty()) {
                front = rear = baru;
            } else {
                rear.next = baru;
                rear = baru;
            }
            size++;
            System.out.println("Mahasiswa ditambahkan ke antrian.");
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Memanggil antrian:");
            front.data.tampilkan();
            front = front.next;
            size--;
        }
    }

    public void tampilkanDepan() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan:");
            front.data.tampilkan();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void tampilkanBelakang() {
        if (!isEmpty()) {
            System.out.println("Antrian terakhir:");
            rear.data.tampilkan();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void tampilkanJumlah() {
        System.out.println("Jumlah mahasiswa yang masih mengantre: " + size);
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Daftar Antrian Mahasiswa:");
        Node current = front;
        while (current != null) {
            current.data.tampilkan();
            current = current.next;
        }
    }
}

