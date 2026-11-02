/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guided2;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        // Polimorfisme: Array bertipe interface Payable
        Payable[] items = new Payable[2];

        // 1. Objek Invoice (partName, quantity, pricePerItem)
        items[0] = new Invoice("Monitor LED", 2, 1500000);

        // 2. Objek SalariedEmployee (name, weeklySalary)
        items[1] = new SalariedEmployee("Raymundus Ariel Abas", 5000000);

        for (Payable item : items) {
                        // Pemanggilan polimorfis method getPaymentAmount() dari interface Payable
            System.out.println("Jumlah yang perlu dibayar: Rp" + item.getPaymentAmount());
        }
    }
}

