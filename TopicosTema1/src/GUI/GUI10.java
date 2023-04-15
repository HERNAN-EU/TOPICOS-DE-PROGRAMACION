package Gui;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI10 extends JFrame implements ActionListener {
    private JTextField textfield1,textfield2,textfield3, textfield4;
    private JLabel label1, label2,label3,label4 ;
    private JButton boton1, boton2, boton3;

    public GUI10() {
        super("Captura Datos");
        setLayout(null);
        setSize(300, 350);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label1 = new JLabel("Nombre");
        label1.setBounds(10, 10, 100, 30);
        add(label1);

        label2 = new JLabel("Edad");
        label2.setBounds(10, 50, 100, 30);
        add(label2);
        
        label3 = new JLabel("Semestre");
        label3.setBounds(10, 90, 100, 30);
        add(label3);
        
        label4 = new JLabel("Numero de control");
        label4.setBounds(10, 130, 100, 30);
        add(label4);
        
        textfield1 = new JTextField();
        textfield1.setBounds(80, 10, 150, 30);
        add(textfield1);

        textfield2 = new JTextField();
        textfield2.setBounds(80, 50, 150, 30);
        add(textfield2);
        
        textfield3 = new JTextField();
        textfield3.setBounds(80, 90, 150, 30);
        add(textfield3);
        
        textfield4 = new JTextField();
        textfield4.setBounds(80,130, 150, 30);
        add(textfield4);
        
        boton1 = new JButton("Añadir");
        boton1.setBounds(10, 180, 80, 30);
        add(boton1);

        setVisible(true);
        
        boton2 = new JButton("Eliminar");
        boton2.setBounds(100, 180, 80, 30);
        add(boton2);

        setVisible(true);
        
        boton3 = new JButton("Mensaje");
        boton3.setBounds(190, 180, 90, 30);
        add(boton3);

        boton3.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton3) {
            System.out.println("Nombre: "+textfield1.getText());
          
        }
    }
}
