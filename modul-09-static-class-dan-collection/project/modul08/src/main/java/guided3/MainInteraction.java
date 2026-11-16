/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guided3;

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainInteraction { // Sesuaikan dengan nama file Java kamu (misal: MainIntertation jika filenya itu)
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(200);
        list.add("Hello");
        list.add(235);
        list.add("Donny");

        // 1. Normal loop
        System.out.println("Normal loop");
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            System.out.println(o);
        }

        // 2. Loop using for-element
        System.out.println("for-element loop");
        for (Object o : list) {
            System.out.println(o);
        }

        // 3. Loop using iterator
        System.out.println("loop using iterator");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Object o = itr.next();
            System.out.println(o);
        }

        // 4. Loop using lambda Expression
        System.out.println("loop using lambda expression");
        list.forEach(o -> System.out.println(o));

        // 5. Loop using reference
        System.out.println("loop using reference");
        list.forEach(System.out::println);
    }
}
