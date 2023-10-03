package com.metodosnumericos.view;

import javax.swing.JFrame;
import org.jfree.chart.*;
import org.jfree.data.xy.*;

public class FunctionGraphExample {
    public static void main(String[] args) {
        // Crea una serie de datos.
        XYSeries series = new XYSeries("f(x) = x^2");
        for (double x = -10; x <= 10; x += 0.1) {
            series.add(x, x * x);
        }

        // Crea una colección de series de datos.
        XYSeriesCollection collection = new XYSeriesCollection();
        collection.addSeries(series);

        // Crea un gráfico.
        JFreeChart chart = ChartFactory.createXYLineChart("f(x) = x^2", "x", "y", collection);

        // Crea un panel para el gráfico.
        ChartPanel panel = new ChartPanel(chart);

        // Muestra el gráfico.
        JFrame frame = new JFrame("f(x) = x^2");
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
