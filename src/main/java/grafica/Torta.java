package grafica;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import est.NotaSet;

public class Torta {

    NotaSet datos;

    public void fijarDatos(NotaSet datos) {
        this.datos = datos;
    }

    public PieDataset crearDataSet() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Ganan", new Integer(datos.getGanan()));
        dataset.setValue("Habilitan", new Integer(datos.getHabilitan()));
        dataset.setValue("Pierden", new Integer(datos.getPieden()));
        return dataset;
    }

    public JFreeChart crearTorta(PieDataset dataset) {
        JFreeChart chart = ChartFactory.createPieChart3D("Rendimiento", // chart title
                dataset, // data
                true, // include legend
                true, false);
        return chart;
    }

}
