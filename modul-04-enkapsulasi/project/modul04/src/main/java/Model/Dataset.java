/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author user
 */
public class Dataset {

    private String nama;
    private int jumlahBaris;
    private int jumlahKolom;
    private int jumlahMissing;

    public static final double BATAS_MISSING = 5.0;
    private static int totalDataset = 0;

    private boolean barisSudahDiisi;
    private boolean kolomSudahDiisi;
    private boolean missingSudahDiisi;

    // Constructor tanpa parameter
    public Dataset() {
        totalDataset++;
    }

    // Constructor dengan parameter nama
    public Dataset(String nama) {
        this.nama = nama;
        totalDataset++;
    }

    // Constructor lengkap
    public Dataset(String nama, int jumlahBaris,
            int jumlahKolom, int jumlahMissing) {
        this.nama = nama;
        this.jumlahBaris = jumlahBaris;
        this.jumlahKolom = jumlahKolom;
        this.jumlahMissing = jumlahMissing;

        barisSudahDiisi = true;
        kolomSudahDiisi = true;
        missingSudahDiisi = true;

        totalDataset++;
    }

    // Getter dan setter nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan setter jumlah baris
    public int getJumlahBaris() {
        return jumlahBaris;
    }

    public void setJumlahBaris(int jumlahBaris) {
        if (!barisSudahDiisi) {
            this.jumlahBaris = jumlahBaris;
            barisSudahDiisi = true;
        }
    }

    // Getter dan setter jumlah kolom
    public int getJumlahKolom() {
        return jumlahKolom;
    }

    public void setJumlahKolom(int jumlahKolom) {
        if (!kolomSudahDiisi) {
            this.jumlahKolom = jumlahKolom;
            kolomSudahDiisi = true;
        }
    }

    // Getter dan setter jumlah missing
    public int getJumlahMissing() {
        return jumlahMissing;
    }

    public void setJumlahMissing(int jumlahMissing) {
        if (!missingSudahDiisi) {
            this.jumlahMissing = jumlahMissing;
            missingSudahDiisi = true;
        }
    }

    // Menghitung persentase missing
    public double getPersentaseMissing() {
        long totalSel = (long) jumlahBaris * jumlahKolom;

        if (totalSel == 0) {
            return 0;
        }

        return (double) jumlahMissing / totalSel * 100;
    }

    // Memeriksa kondisi dataset
    public boolean perluDibersihkan() {
        return getPersentaseMissing() > BATAS_MISSING;
    }

    // Mengambil total objek tanpa membuat objek baru
    public static int getTotalDataset() {
        return totalDataset;
    }
}
