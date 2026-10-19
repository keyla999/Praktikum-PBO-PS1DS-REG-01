/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asosiasi;

/**
 *
 * @author user
 */
public class Dosen {

    private String kodeDosen;
    private String namaDosen;
//Setter

    public void setKodeDosen(String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }
//Getter

    public String getKodeDosen() {
        return this.kodeDosen;
    }

    public String getNamaDosen() {
        return this.namaDosen;
    }

    public void giveScore(Mahasiswa s, int nilai) {
        // ini asosiasi, method milik class Student dipanggil di class
// tp objek Student tidak menjadi atribut dr class Lecture
s.setNilai(nilai);
    }

    public int getScore(Mahasiswa s) {
        // ini asosiasi, method milik class Student dipanggil di class
// tp objek Student tidak menjadi atribut dr class Lecture
return s.getNilai();
    }

    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        m.setNim("103132400017");
        m.setNama("Key");
        Dosen d = new Dosen();
        d.giveScore(m, 100);
        System.out.println("NIM :" + m.getNim());
        System.out.println("Nama :" + m.getNama());
        System.out.println("Nilai :" + d.getScore(m));
    }
}

