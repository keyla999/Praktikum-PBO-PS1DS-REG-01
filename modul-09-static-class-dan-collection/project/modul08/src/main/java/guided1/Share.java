/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guided1;

/**
 *
 * @author user
 */
public class Share {

    private int privateInt;
    private static int staticInt;

    public Share(int pr, int si) {
        this.privateInt = pr;
        Share.staticInt = si; // Direkomendasikan akses via nama class
    }

    @Override
    public String toString() {
        return privateInt + " " + staticInt;
    }
}

