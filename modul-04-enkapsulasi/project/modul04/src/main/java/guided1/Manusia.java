/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guided1;

/**
 *
 * @author user
 */
public class Manusia {
    //definisi atribut
    private String nama;
    private int umur;
    
    //4.2
    public Manusia(){};
    public Manusia(String nama){
        this.nama = nama;
        
        //mahasiswa objManusia = new Manusia("Jhon", ();
    }
    public Manusia(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }
    
    //definisi Method
    public void setNama(String a) {
        nama = a;
    }

    public String getNama() {
        return nama;
    }

    public void setUmur(int a) {
        umur = a;
    }

    public int getUmur() {
        return umur;
    }
}
