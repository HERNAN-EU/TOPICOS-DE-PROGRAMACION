package GUI;
import javax.swing.JFrame;
public class GUI2 {
     public  GUI2(){
    JFrame frame = new JFrame("Ventana sin herencia");
    //Configurar Componentes y añadirlos al panel del frame
    frame.setSize(370,470);
    frame.setLocationRelativeTo(null);
    frame.setResizable(true);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
