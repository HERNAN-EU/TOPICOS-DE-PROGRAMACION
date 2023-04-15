
package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GUI8 extends JFrame implements ActionListener{
    private JTextField textfield1;
    private JLabel label;
    private JButton boton;
    
    
    public GUI8(){
    super("Gui8:Activacion Oyente");
    setLayout(null);
    setSize(300,150);
    setResizable(false);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    label = new JLabel("Nombre");
    label.setBounds(10,10,100,30);    
    add(label);
    
    textfield1 =new JTextField();
    textfield1.setBounds(80,10,150,30);
    add(textfield1);
    
    boton=new JButton("Saludar");
    boton.setBounds(10,80,100,30);
    add(boton);
    boton.addActionListener(this);
    setVisible(true);
}
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==boton){
            JOptionPane.showMessageDialog(null,"Hoola "+ textfield1.getText()+" Como estas");
        }
    }
    
}
