package GUI;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class GUI7 extends JFrame{
    public GUI7(){
        super("VEntana con herencia");
        setLayout(new BorderLayout(5,10));
        add(new JButton("1"),BorderLayout.EAST);
        add(new JButton("2"),BorderLayout.SOUTH);
        add(new JButton("3"),BorderLayout.WEST);
        add(new JButton("4"),BorderLayout.NORTH);
        add(new JButton("5"),BorderLayout.CENTER);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
