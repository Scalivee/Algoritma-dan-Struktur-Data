package Praktikum07;

public class DataDosen {
    Dosen[] dataDosen = new Dosen[10];
    int idx = 0;

    public void tambah(Dosen dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    public void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    public void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan secara ASC (termuda ke tertua).");
    }

    public void sortingDSC() {
        for (int i = 1; i < idx; i++) {
            Dosen temp = dataDosen[i];
            int j = i - 1;
            while (j >= 0 && dataDosen[j].usia < temp.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j--;
            }
            dataDosen[j + 1] = temp;
        }
        System.out.println("Data berhasil diurutkan secara DSC (tertua ke termuda).");
    }

    public void pencarianDataSequential(String nama) {
        boolean ditemukan = false;
        int jumlahHasil = 0;
        
        System.out.println("\nHasil pencarian untuk nama: " + nama);
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                dataDosen[i].tampil();
                ditemukan = true;
                jumlahHasil++;
            }
        }
        if (!ditemukan) {
            System.out.println("Dosen dengan nama '" + nama + "' tidak ditemukan.");
        } else if (jumlahHasil > 1) {
            System.out.println("⚠️ Peringatan: Ditemukan lebih dari satu hasil dengan nama yang sama.");
        }
    }

    public void pencarianDataBinary(int usia) {
        sortingASC(); 
        int low = 0, high = idx - 1, mid;
        boolean ditemukan = false;
        int jumlahHasil = 0;

        System.out.println("\nHasil pencarian untuk usia: " + usia);
        while (low <= high) {
            mid = (low + high) / 2;

            if (dataDosen[mid].usia == usia) {
                int left = mid, right = mid;

                while (left >= 0 && dataDosen[left].usia == usia) {
                    dataDosen[left].tampil();
                    ditemukan = true;
                    jumlahHasil++;
                    left--;
                }

                while (right < idx && dataDosen[right].usia == usia) {
                    if (right != mid) {
                        dataDosen[right].tampil();
                        jumlahHasil++;
                    }
                    ditemukan = true;
                    right++;
                }

                break;
            } else if (dataDosen[mid].usia < usia) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!ditemukan) {
            System.out.println("Dosen dengan usia '" + usia + "' tidak ditemukan.");
        } else if (jumlahHasil > 1) {
            System.out.println("⚠️ Peringatan: Ditemukan lebih dari satu hasil dengan usia yang sama.");
        }
    }
}
