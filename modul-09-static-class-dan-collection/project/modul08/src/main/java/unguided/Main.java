/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided;

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ModelEksperimen> daftarModel = new ArrayList<>();
        daftarModel.add(new ModelEksperimen("Logistic Regression", 0.82, 12));
        daftarModel.add(new ModelEksperimen("Random Forest", 0.91, 45));
        daftarModel.add(new ModelEksperimen("SVM", 0.87, 60));
        daftarModel.add(new ModelEksperimen("KNN", 0.79, 5));
        daftarModel.add(new ModelEksperimen("Decision Tree", 0.84, 8));

        System.out.println("Jumlah eksperimen: " + ModelEksperimen.getJumlahEksperimen());
        System.out.println();

        System.out.println("Sorted by akurasi");
        Collections.sort(daftarModel);
        for (ModelEksperimen m : daftarModel) {
            System.out.println(m);
        }
        System.out.println();

        System.out.println("Sorted by waktu training");
        daftarModel.sort(new WaktuTrainingComparator());
        for (ModelEksperimen m : daftarModel) {
            System.out.println(m);
        }
        System.out.println();

        System.out.println("Model dengan akurasi minimal 0.85");
        daftarModel.stream()
                .filter(m -> m.getAkurasi() >= 0.85)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Pencarian model KNN");
        ModelEksperimen hasilCari = daftarModel.stream()
                .filter(m -> m.getNama().equalsIgnoreCase("KNN"))
                .findFirst()
                .orElse(null);
        System.out.println(hasilCari);
    }
}
