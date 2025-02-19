public class Dosen20 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen20() {

    }

    public Dosen20(String id, String nm, boolean stts, int tb, String bk) {
       idDosen = id;
       nama = nm;
       statusAktif = stts;
       tahunBergabung = tb;
       bidangKeahlian = bk;
    }

    public void tampilInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama            : " + nama);
        System.out.println("Status Aktif    : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println();
    }

    public void setStatusAktif(boolean status) {
        statusAktif = status;
        System.out.println("Status dosen berhasil diubah menjadi " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    public int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("Bidang keahlian berhasil diubah menjadi: " + bidangKeahlian);
    }


}
