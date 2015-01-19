/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kata4;

/**
 *
 * @author Estefania
 */
public class ConsoleHistogramViewer<T> implements HistogramViewer<T> {

    @Override
    public void show(Histogram<T> histogram) {
        for (T item : histogram.keySet()) {
            System.out.println(item + " " + histogram.get(item));
        }
    }
    
}
