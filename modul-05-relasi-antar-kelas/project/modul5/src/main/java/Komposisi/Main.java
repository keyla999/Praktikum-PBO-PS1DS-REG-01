/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Komposisi;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Nama: Keyla Azzahra");
        System.out.println("NIM: 103132400017");

        Komputer komputer = new Komputer(
            "Intel Core i5",
            1600,
            "Lenovo ThinkPad T490",
            "Lenovo",
            "Wireless"
        );

        komputer.displaySpecKomputer();
    }
}
