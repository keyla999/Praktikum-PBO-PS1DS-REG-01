/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package guided2;

import guided1.*;

/**
 *
 * @author user
 */
public abstract class Employee implements Payable {
    private String name;
    
    // three-argument constructor
    public Employee( String name )
    {
        this.name = name;
    } 
    
    public String getName()
    {
        return name;
    } 
    
    // Setiap pegawai pasti punya gaji, tapi rumusnya beda-beda
    public abstract double earnings(); 
    
    // Saat ada penagihan, silahkan langsung ke metode kalkulasi gaji (earnings)
    @Override
    public double getPaymentAmount() {
        return earnings();
    }
}
