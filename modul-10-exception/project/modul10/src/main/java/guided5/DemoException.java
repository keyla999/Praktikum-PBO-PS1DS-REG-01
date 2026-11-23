/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guided5;

/**
 *
 * @author user
 */
public class DemoException {

    public static void main(String args[]) {

        Coba c = new Coba();
        try {
            c.tampil();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Program Selesai");
    }
}

