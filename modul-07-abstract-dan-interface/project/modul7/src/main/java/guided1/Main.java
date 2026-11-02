/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guided1;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        // Polimorfisme: referensi abstract class Employee, objek SalariedEmployee
        SalariedEmployee salaried = new SalariedEmployee("Keyla Azzahra", 5000000.00);

        System.out.println("Nama: " + salaried.getName());
        System.out.println("Gaji: Rp " + salaried.earnings());
    }
}
