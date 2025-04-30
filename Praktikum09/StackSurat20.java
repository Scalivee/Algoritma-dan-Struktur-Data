package Praktikum09;

public class StackSurat20 {
    Surat20[] stack;
    int top;
    int size;

    public StackSurat20(int size) {
        this.size = size;
        stack = new Surat20[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat20 surat) {
        if (!isFull()) {
            stack[++top] = surat;
            System.out.println("Surat berhasil diterima dari " + surat.namaMahasiswa);
        } else {
            System.out.println("Stack penuh! Tidak bisa menerima surat lagi.");
        }
    }

    public Surat20 pop() {
        if (!isEmpty()) {
            System.out.println("Memproses surat izin dari " + stack[top].namaMahasiswa);
            return stack[top--];
        } else {
            System.out.println("Tidak ada surat yang perlu diproses.");
            return null;
        }
    }

    public Surat20 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Tidak ada surat izin yang masuk.");
            return null;
        }
    }

    public void searchSurat(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan dari " + nama);
                stack[i].displaySurat();
                return;
            }
        }
        System.out.println("Surat dengan nama " + nama + " tidak ditemukan.");
    }
}