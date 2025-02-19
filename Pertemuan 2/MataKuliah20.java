public class MataKuliah20 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam; 

    public MataKuliah20() {

    }

    public MataKuliah20(String km, String nm, int sks, int jj) {
        kodeMk = km;
        nama = nm;
        this.sks = sks;
        jumlahJam = jj;
    }

    public void tampilInformasi() {
        System.out.println("Kode MK   : " + kodeMk);
        System.out.println("Nama      : " + nama);
        System.out.println("SKS       : " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println();
    }

    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + sks);
    }

    public void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam berhasil ditambahkan. Total jam sekarang: " + jumlahJam);
    }

    public void kurangiJam(int jam) {
        if (jam > jumlahJam) {
            System.out.println("Pengurangan tidak dapat dilakukan! Jam yang tersedia kurang.");
        } else {
            jumlahJam -= jam;
            System.out.println("Jumlah jam berhasil dikurangi. Total jam sekarang: " + jumlahJam);
        }
    }

}
