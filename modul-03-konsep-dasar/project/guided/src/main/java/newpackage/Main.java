/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author user
 */
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Data suhu mentah selama 7 hari
        double[] suhuHarian = {
            30.4, 24.3, 26.8, -1.0, 31.4, 30.8, 32.9
        };

        // Membuat object PengolahSuhu
        PengolahSuhu pengolah = new PengolahSuhu(suhuHarian);

        // Menampilkan data awal
        System.out.println("=== Data Suhu Awal ===");
        pengolah.tampilkanData();

        // Mencari index data yang kosong
        int indexKosong = pengolah.cariIndexKosong();

        System.out.println();
        System.out.println(
                "Index hari kosong (dimulai dari 0): " + indexKosong
        );

        // Mengisi data yang kosong
        pengolah.isiDataKosong();

        // Menampilkan data setelah pengisian
        System.out.println();
        System.out.println("=== Data Suhu Setelah Pengisian ===");
        pengolah.tampilkanData();

        // Menghitung dan menampilkan rata-rata
        double rataRata = pengolah.hitungRataRata();

        System.out.printf(java.util.Locale.US, "%nRata-rata : %.2f\u00B0C%n", rataRata);

        // Menampilkan kembali array yang ada di main
        System.out.println();
        System.out.println(
                "Isi array suhuHarian di main setelah isiDataKosong() dijalankan:"
        );
        System.out.println(Arrays.toString(suhuHarian));
        System.out.println("(ikut berubah: constructor menyimpan referensi array yang sama)");
        /*
         * Array suhuHarian di main ikut berubah karena array merupakan
         * tipe data reference.
         *
         * Saat object PengolahSuhu dibuat, constructor tidak membuat
         * array baru, tetapi menyimpan referensi ke array suhuHarian
         * yang sama di main melalui:
         *
         * this.suhuHarian = suhuHarian;
         *
         * Oleh karena itu, ketika isiDataKosong() mengubah isi array
         * melalui object PengolahSuhu, perubahan tersebut juga terlihat
         * pada variabel suhuHarian yang berada di main.
         */
    }
}
