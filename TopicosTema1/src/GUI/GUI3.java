package GUI;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI3 extends JFrame{
    private Container panel;
    private JButton miboton;
    public GUI3(){
        super("Ventana");
        miboton=new JButton("");
        panel=getContentPane();
        panel.add(miboton);
        setSize(200,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        
        
    }
}
