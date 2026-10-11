/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author user
 */
import Model.Dataset;
import Laporan.LaporanDataset;
public class Main {

    public static void main(String[] args) {

        // Objek 1: constructor tanpa parameter
        Dataset dataset1 = new Dataset();

        dataset1.setNama("Titanic");
        dataset1.setJumlahBaris(891);
        dataset1.setJumlahKolom(12);
        dataset1.setJumlahMissing(866);

        // Objek 2: constructor dengan parameter nama
        Dataset dataset2 = new Dataset("Wine Quality");

        // Objek 3: constructor lengkap
        Dataset dataset3 = new Dataset(
                "Iris", 150, 5, 0
        );

        // Menyimpan objek dalam array
        Dataset[] daftarDataset = {
            dataset1, dataset2, dataset3
        };

        // Mencetak laporan menggunakan perulangan
        LaporanDataset laporan = new LaporanDataset();

        for (Dataset dataset : daftarDataset) {
            laporan.cetak(dataset);
        }

        // Menampilkan jumlah seluruh objek
        System.out.println(
                "Total dataset dibuat : "
                + Dataset.getTotalDataset()
        );
    }
}
