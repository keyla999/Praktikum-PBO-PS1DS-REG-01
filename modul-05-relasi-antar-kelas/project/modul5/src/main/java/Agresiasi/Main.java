/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agresiasi;

import Agresiasi.Mahasiswa;
import Agresiasi.Jurusan;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("103132400017", "Keyla Azzahra");
        Mahasiswa m2 = new Mahasiswa("103132430021", "Raymundus Ariel Abas");

        Jurusan j = new Jurusan("SD01", "Sains Data");

        j.AddMahasiswa(m1);
        j.AddMahasiswa(m2);

        j.DisplayMahasiswa();
    }
}

