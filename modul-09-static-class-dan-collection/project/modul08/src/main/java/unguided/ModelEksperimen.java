/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided;

/**
 *
 * @author user
 */
public class ModelEksperimen implements Comparable<ModelEksperimen> {
    private String nama;
    private double akurasi;
    private int waktuTraining;
    
    private static int jumlahEksperimen = 0;

    public ModelEksperimen(String nama, double akurasi, int waktuTraining) {
        this.nama = nama;
        this.akurasi = akurasi;
        this.waktuTraining = waktuTraining;
        jumlahEksperimen++;
    }

    public String getNama() {
        return nama;
    }

    public double getAkurasi() {
        return akurasi;
    }

    public int getWaktuTraining() {
        return waktuTraining;
    }

    public static int getJumlahEksperimen() {
        return jumlahEksperimen;
    }

    @Override
    public int compareTo(ModelEksperimen o) {
        return Double.compare(o.akurasi, this.akurasi);
    }

    @Override
    public String toString() {
        return "Model=" + nama + ", akurasi=" + akurasi + ", waktu=" + waktuTraining + " detik";
    }
}

