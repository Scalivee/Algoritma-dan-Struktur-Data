public class DosenMain20 {
    public static void main(String[] args) {
        Dosen20 dosen1 = new Dosen20();
        dosen1.idDosen = "D001";
        dosen1.nama = "Dr. Budi Santoso";
        dosen1.setStatusAktif(true);
        dosen1.tahunBergabung = 2010;
        dosen1.ubahKeahlian("Kecerdasan Buatan");
        dosen1.tampilInformasi();
        System.out.println("Masa kerja Dosen 1: " + dosen1.hitungMasaKerja(2024) + " tahun\n");

        Dosen20 dosen2 = new Dosen20("D002", "Prof. Siti Aminah", true, 2015, "Sistem Informasi");
        dosen2.setStatusAktif(false);
        dosen2.ubahKeahlian("Manajemen Data");
        dosen2.tampilInformasi();
        System.out.println("Masa kerja Dosen 2: " + dosen2.hitungMasaKerja(2024) + " tahun\n");
    }
}
