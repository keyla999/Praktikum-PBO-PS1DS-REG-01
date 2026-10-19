/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agresiasi;

/**
 *
 * @author user
 */
public class Mahasiswa {
    private String NIM;
    private String Nama;

    public Mahasiswa(String no, String nm) {
        this.NIM = no;
        this.Nama = nm;
    }

    public String GetNIM() {
        return this.NIM;
    }

    public String GetNama() {
        return this.Nama;
    }
}
