/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guided6;

/**
 *
 * @author user
 */
public class DemoFinally {
    public static void main(String[] args) {
        int x = 3;
        int[] arr = {10,11,12};

        try {
            System.out.println(arr[x]);
            System.out.println("Tidak ada Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Ada exception");
        } finally {
            System.out.println("Program Selesai");
        }
    }
}

