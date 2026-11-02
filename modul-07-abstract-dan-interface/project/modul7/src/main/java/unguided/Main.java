/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        // 1. Uji Proteksi Abstraksi (Baris di bawah ini akan menyebabkan error jika di-uncomment)
        // TiketBioskop tiket = new TiketBioskop("Interstellar", 40000, 2);

        // 2. Buka Kasir lewat Static Method pada Interface
        ItemTransaksi.catatLogKasir("Membuka transaksi baru untuk Pelanggan #042.");

        // 3. Buat Objek Transaksi
        TiketReguler tiketReg = new TiketReguler("Interstellar", 40000.0, 2, 3);
        TiketVIP tiketVIP = new TiketVIP("Dune: Part Two", 60000.0, 2, 25000.0);
        PaketSnack snack = new PaketSnack("Combo Popcorn Caramel + 2 Soda", 1, 55000.0);

        // 4. Array Polimorfik Heterogen (Mematuhi aturan koleksi statis)
        ItemTransaksi[] daftarTransaksi = new ItemTransaksi[] {
            tiketReg,
            tiketVIP,
            snack
        };

        // 5. Pemrosesan Dinamis
        System.out.println("=== DAFTAR TRANSAKSI BIOSKOP ===");
        double grandTotal = 0;
        for (ItemTransaksi item : daftarTransaksi) {
            item.cetakRincianItem();
            grandTotal += item.getNominalBayar();
        }

        // 6. Tutup Kasir
        System.out.println("-------------------------------------------------------------");
        System.out.println("TOTAL TRANSAKSI : Rp" + grandTotal);
        System.out.println("=============================================================");
        ItemTransaksi.catatLogKasir("Transaksi #042 selesai diproses.");
    }
}

