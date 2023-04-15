package GUI;
import javax.swing.JFrame;
public class GUI1 extends JFrame{
    public GUI1(){
        super("VEntana usando herencia"); //Coloca Nombre a la ventana
        setSize(370,450);//Establece el tamaño de la ventana
        setLocationRelativeTo(null);//La ventana se posiciona al centro de la pantalla
        
        //Establece el boton para cerrar la aplicacion
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);//Establece el tamaño de la ventana
        setVisible(true);//Visible o no
    }
   
}
