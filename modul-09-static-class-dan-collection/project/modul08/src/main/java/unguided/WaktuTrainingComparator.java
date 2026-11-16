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

class WaktuTrainingComparator implements Comparator<ModelEksperimen> {
    @Override
    public int compare(ModelEksperimen m1, ModelEksperimen m2) {
        return Integer.compare(m1.getWaktuTraining(), m2.getWaktuTraining());
    }
}
