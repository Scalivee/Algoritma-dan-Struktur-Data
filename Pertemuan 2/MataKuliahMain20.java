public class MataKuliahMain20 {
    public static void main(String[] args) {
        MataKuliah20 mk1 = new MataKuliah20();
        mk1.kodeMk = "IF101";
        mk1.nama = "Pemrograman Java";
        mk1.ubahSKS(3);
        mk1.tambahJam(4);
        mk1.kurangiJam(2);
        mk1.tampilInformasi();

        MataKuliah20 mk2 = new MataKuliah20("IF102", "Struktur Data", 4, 6);
        mk2.ubahSKS(5);
        mk2.tambahJam(3);
        mk2.kurangiJam(2);
        mk2.tampilInformasi();

    }
}
