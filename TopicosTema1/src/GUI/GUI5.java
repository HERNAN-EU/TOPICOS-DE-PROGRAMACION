
package GUI;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI5 extends JFrame{
     public GUI5(){
        super("Ventana/Herencia");
        getContentPane().setLayout(new FlowLayout());
        JButton boton = new JButton("Boton");
        JLabel etiqueta = new JLabel("Dato");
        JTextField textfield = new JTextField();
        JCheckBox checkbox = new JCheckBox();
        
        //Añadiendo componentes a la ventana
        getContentPane().add(boton);
        getContentPane().add(etiqueta);
        getContentPane().add(textfield);
        getContentPane().add(checkbox);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
