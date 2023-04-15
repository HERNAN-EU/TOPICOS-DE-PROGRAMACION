package Gui;
import java.awt.event.ActionEvent;
import EntradaSalida.ListaAlumno;
import TDA.Alumno;
import java.awt.Container;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
public class GUI extends JFrame implements ActionListener {
    private JTextField textfield1, textfield2, textfield3, textfield4, campoTotal;
    private JLabel label1, label2, label3, label4, total;
    private JButton boton1, boton2, boton3;
    private Container contenedor;
    private ListaAlumno listaAlum;
    private JList listaNom;
    private DefaultListModel modelo;
    private JScrollPane scrollLista;
    private Alumno alum;

    
    public GUI() {
        super("Captura Datos");
        listaAlum = new ListaAlumno();
        inicio();
        setLayout(null);
        setSize(400, 450);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
     public void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        //Componentes para nombre
        label1 = new JLabel("Nombre");
        label1.setBounds(10, 10, 100, 30);
        contenedor.add(label1);

        textfield1 = new JTextField();
        textfield1.setBounds(130, 10, 150, 30);
        contenedor.add(textfield1);

        //Componentes para edad
        label2 = new JLabel("Edad");
        label2.setBounds(10, 50, 100, 30);
        contenedor.add(label2);

        textfield2 = new JTextField();
        textfield2.setBounds(130, 50, 150, 30);
        contenedor.add(textfield2);

        //Componentes para numero de control
        label3 = new JLabel("Numero De Control");
        label3.setBounds(10, 90, 120, 30);
        contenedor.add(label3);

        textfield3 = new JTextField();
        textfield3.setBounds(130, 90, 150, 30);
        contenedor.add(textfield3);

        //Componentes para semestre
        label4 = new JLabel("Semestre");
        label4.setBounds(10, 130, 100, 30);
        contenedor.add(label4);

        textfield4 = new JTextField();
        textfield4.setBounds(130, 130, 150, 30);
        contenedor.add(textfield4);

        //Componentes para total
        total = new JLabel("No. Registro");
        total.setBounds(20, 286, 135, 23);
        contenedor.add(total);

//        campoTotal = new JTextField();
//        campoTotal.setBounds(20, 315, 135, 23);
//        contenedor.add(campoTotal);

        //Boton Añadir
        boton1 = new JButton("Añadir");
        boton1.setBounds(10, 351, 82, 23);
        contenedor.add(boton1);

        boton1.addActionListener(this);
        setVisible(true);

        //Boton Eliminar
        boton2 = new JButton("Eliminar");
        boton2.setBounds(100, 350, 80, 23);
        contenedor.add(boton2);

        boton2.addActionListener(this);
        setVisible(true);

        //Boton Eliminar todos
        boton3 = new JButton("Eliminar Todo");
        boton3.setBounds(190, 350, 120, 23);
        contenedor.add(boton3);

        boton3.addActionListener(this);
        setVisible(true);

        //Lista Grafica de los alumnos
        listaNom = new JList();
        listaNom.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        modelo = new DefaultListModel();

        //Crea una barra de desplazamiento vertical
        scrollLista = new JScrollPane();
        scrollLista.setBounds(10, 180, 280, 100);

        //Enlaza la barra de desplazamiento vertical a la lista
        scrollLista.setViewportView(listaNom);
        contenedor.add(scrollLista);
    }
@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            añadirAlumno();
            System.out.println("Alumno Añadido");
        } else if (e.getSource() == boton2) {
            eliminarAlumno(listaNom.getSelectedIndex());
            System.out.println("Alumno Eliminado");
        } else if (e.getSource() == boton3) {
            eliminarTodo();
            System.out.println("Alumnos Eliminados");
        }
    }
    private void añadirAlumno() {
        alum = new Alumno(textfield1.getText(),textfield3.getText(), Byte.parseByte(textfield2.getText()),Byte.parseByte(textfield4.getText()));
        listaAlum.añadirAlumno(alum);
        String cad = textfield1.getText() + " " + textfield2.getText() + " " +
                textfield3.getText() + " " + textfield4.getText();
        modelo.addElement(cad);
        listaNom.setModel(modelo);
        int x = modelo.getSize();
        total.setText("Numero de Registro " + x);
        textfield1.setText("");
        textfield2.setText("");
        textfield3.setText("");  
        textfield4.setText("");
    }

    private void eliminarAlumno(int indice) {
        if (indice >= 0) {
            modelo.removeElementAt(indice);
            listaAlum.eliminarAlumno(indice);
            int x = modelo.getSize();
            total.setText("Numero de Registro " + x);
        } else {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar Un elemento");
        }
    }

    private void eliminarTodo() {
        listaAlum.EliminarLista();
        modelo.clear();
        int x = modelo.getSize();
        total.setText("Numero de Registro " + x);
        listaNom = new JList();
        listaNom.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }
}
