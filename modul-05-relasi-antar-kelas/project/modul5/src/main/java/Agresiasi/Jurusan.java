/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agresiasi;

/**
 *
 * @author user
 */
public class Jurusan {
    private String KodeJurusan;
    private String NamaJurusan;
    private Mahasiswa[] Daftar = new Mahasiswa[10];
    private int JmlMhs = 0;

    public Jurusan(String kode, String nama) {
        this.KodeJurusan = kode;
        this.NamaJurusan = nama;
    }

    public void AddMahasiswa(Mahasiswa m) {
        if (this.JmlMhs < this.Daftar.length) {
            this.Daftar[this.JmlMhs] = m;
            this.JmlMhs++;
        }
    }

    public void DisplayMahasiswa() {
        System.out.println("Kode Jurusan : " + this.KodeJurusan);
        System.out.println("Nama Jurusan : " + this.NamaJurusan);
        System.out.println("Daftar Mahasiswa :");

        for (int i = 0; i < this.JmlMhs; i++) {
            System.out.println(
                this.Daftar[i].GetNIM() + " "
                + this.Daftar[i].GetNama()
            );
        }
    }
}
