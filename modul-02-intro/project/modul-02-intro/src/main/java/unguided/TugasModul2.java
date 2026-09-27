/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided;

/**
 *
 * @author user
 */
public class TugasModul2 {
    public static void main(String[] args) {

        final double KKM = 75.0;

        String[] nama = {"Andi", "Budi", "Citra"};

        double[][] nilai = {
            {80.0, 85.0},
            {70.0, 65.0},
            {90.0, 90.0}
        };

        System.out.println("REKAP NILAI PRAKTIKUM");
        System.out.println("KKM: " + KKM);
        System.out.println();

        for (int i = 0; i < nama.length; i++) {

            double rataRata = (nilai[i][0] + nilai[i][1]) / 2;

            String status;

            if (rataRata >= KKM) {
                status = "LULUS";
            } else {
                status = "REMEDIAL";
            }

            System.out.println("Mahasiswa " + (i + 1) + ": " + nama[i]);
            System.out.println("Nilai Modul 1 : " + nilai[i][0]);
            System.out.println("Nilai Modul 2 : " + nilai[i][1]);
            System.out.println("Rata-rata     : " + rataRata);
            System.out.println("Status        : " + status);
            System.out.println();
        }
    }
}
