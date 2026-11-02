/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guided2;

/**
 *
 * @author user
 */
public class Invoice implements Payable {
    private String partName;
    private int quantity;
    private double pricePerItem;

    // three-argument constructor
    public Invoice(String partName, int quantity, double pricePerItem) {
        this.partName = partName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartName() {
        return partName;
    }

    // Mengimplementasikan kontrak method dari interface Payable
    //Hitung tagihan
    @Override
    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }
}

