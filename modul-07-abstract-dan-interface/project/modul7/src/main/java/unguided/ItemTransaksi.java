/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided;

/**
 *
 * @author user
 */
public interface ItemTransaksi {
    double getNominalBayar();
    String getNamaTransaksi();

    // Default method (Java 8+) untuk mencetak rincian transaksi
    default void cetakRincianItem() {
        System.out.println("- " + getNamaTransaksi() + " | Total: Rp" + getNominalBayar());
    }

    // Static method (Java 8+) untuk pencatatan log sistem
    static void catatLogKasir(String pesan) {
        System.out.println("[LOG SISTEM KASIR] " + pesan);
    }
}

