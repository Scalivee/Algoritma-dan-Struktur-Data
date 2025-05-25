package Praktikum11;

public class SLLMain20 {
    public static void main(String[] args) {
        Mahasiswa20 mhs1 = new Mahasiswa20("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa20 mhs2 = new Mahasiswa20("23212201", "Bimon", "2B", 3.8);
        Mahasiswa20 mhs3 = new Mahasiswa20("22212202", "Cintia", "3C", 3.5);
        Mahasiswa20 mhs4 = new Mahasiswa20("21212203", "Dirga", "4D", 3.6);

        SingleLinkedList20 sll = new SingleLinkedList20();
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("Data index 1 : ");
        sll.getData(1);

        System.out.println("Data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();

        sll.removeAt(0);
        sll.print();
       
        
    }
}
