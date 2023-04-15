package EntradaSalida;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class Graficas {

    public CategoryDataset crearDatosSexo(byte nAsisM, byte nAsisH) {
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        datos.setValue(nAsisM, "Masculino", "Masculino");
        datos.setValue(nAsisH, "Femenino", "Femenino");
        
        return datos;
    }
    
    public CategoryDataset crearDatosMayorMenor(byte nAsisMayores, byte nAsisMenores) {
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        datos.setValue(nAsisMayores, "Mayores", "Mayores");
        datos.setValue(nAsisMenores, "Menores", "Menores");
        
        return datos;
    }
    
    public CategoryDataset crearDatosEstC(byte nAsisSolteros, byte nAsisCasados, byte nAsisDivorciados, byte nAsisViudos) {
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        datos.setValue(nAsisSolteros, "Solteros", "Solteros");
        datos.setValue(nAsisCasados, "Casados", "Casados");
        datos.setValue(nAsisDivorciados, "Divorciados", "Divorciados");
        datos.setValue(nAsisViudos, "Viudos", "Viudos");
        
        return datos;
    }

    public void panel(JFreeChart grafica) {
        ChartPanel panel = new ChartPanel(grafica);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(500, 300));

        JFrame ventana = new JFrame("Grafica");
        ventana.setVisible(true);
        ventana.setSize(500, 500);
        ventana.add(panel);
    }

    public void grabaFileJPG(JFreeChart grafica, String nombre) {
        try {
            ChartUtilities.saveChartAsJPEG(new File("C:\\Users\\REYNALDO\\Desktop\\topicos\\" + nombre), grafica, 800, 500);
        } catch (IOException e) {
            System.err.println("Error Creando Grafico");
        }
    }

    public void graficaBarra(CategoryDataset datos) {
        JFreeChart grafico;
        grafico = ChartFactory.createBarChart("Asistentes", "Cantidad", "Asistentes", datos, PlotOrientation.VERTICAL, true, true, false);
        //grabaFileJPG(grafico, "graficaBarras.jpg");
        panel(grafico);
    }

    public void graficaBarras3D(CategoryDataset datos) {
        JFreeChart grafico;
        grafico = ChartFactory.createBarChart3D("Asistentes", "Cantidad", "Asistentes", datos, PlotOrientation.VERTICAL, true, true, false);
        //grabaFileJPG(grafico, "graficaBarras3D.jpg");
        panel(grafico);
    }
}