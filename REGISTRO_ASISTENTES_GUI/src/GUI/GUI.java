package Gui;
import EntradaSalida.Almacenar;
import EntradaSalida.Graficas;
import TDA.Asistentes;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class GUI extends JFrame implements ActionListener {

    private JTextField textfield1, textfield2;
    private JLabel label1, label2, label3, label4, total, totalH, totalM, totalMayor, totalMenor, todo;
    private JButton boton1, boton2, boton3, boton4, boton5, boton6;
    private Container contenedor;
    private JCheckBox check1, check2;
    private JRadioButton rbtn1, rbtn2, rbtn3, rbtn4;
    private ButtonGroup grupoRBtn;

    private Almacenar lista;
    private JList listaNom;
    private DefaultListModel modelo;
    private JScrollPane scrollLista;
    private Asistentes asis;
    private Graficas graf;

    public GUI() {
        super("Captura Datos");
        lista = new Almacenar();
        inicio();
        setLayout(null);
        setSize(400, 560);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        //Componentes para nombre
        label1 = new JLabel("Nombre");
        label1.setBounds(60, 10, 100, 30);
        contenedor.add(label1);

        textfield1 = new JTextField();
        textfield1.setBounds(150, 10, 150, 30);
        contenedor.add(textfield1);

        //Componentes para edad
        label2 = new JLabel("Edad");
        label2.setBounds(60, 50, 100, 30);
        contenedor.add(label2);

        textfield2 = new JTextField();
        textfield2.setBounds(150, 50, 150, 30);
        contenedor.add(textfield2);

        //Componentes para sexo
        label3 = new JLabel("Sexo");
        label3.setBounds(60, 110, 120, 20);
        contenedor.add(label3);

        //check
        check1 = new JCheckBox("Masculino");
        check1.setBounds(150, 90, 100, 20);
        check1.addActionListener(this);
        add(check1);

        check2 = new JCheckBox("Femenino");
        check2.setBounds(150, 130, 90, 20);
        check2.addActionListener(this);
        add(check2);

        label4 = new JLabel("Estado Civil");
        label4.setBounds(60, 170, 120, 20);
        contenedor.add(label4);

        rbtn1 = new JRadioButton("Soltero");
        rbtn1.setBounds(60, 200, 70, 20);
        add(rbtn1);

        rbtn2 = new JRadioButton("Casado");
        rbtn2.setBounds(130, 200, 70, 20);
        add(rbtn2);

        rbtn3 = new JRadioButton("Divorciado");
        rbtn3.setBounds(200, 200, 90, 20);
        add(rbtn3);

        rbtn4 = new JRadioButton("Viudo");
        rbtn4.setBounds(290, 200, 60, 20);
        add(rbtn4);

        //Grupo para radio botones
        grupoRBtn = new ButtonGroup();
        grupoRBtn.add(rbtn1);
        grupoRBtn.add(rbtn2);
        grupoRBtn.add(rbtn3);
        grupoRBtn.add(rbtn4);

        //Lista Grafica de los asistentes
        listaNom = new JList();
        listaNom.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        modelo = new DefaultListModel();

        //Crea una barra de desplazamiento vertical
        scrollLista = new JScrollPane();
        scrollLista.setBounds(60, 230, 280, 100);

        //Enlaza la barra de desplazamiento vertical a la lista
        scrollLista.setViewportView(listaNom);
        contenedor.add(scrollLista);

        //Componentes para total
        total = new JLabel("Numero de Registro: " + modelo.getSize());
        total.setBounds(60, 330, 135, 23);
        contenedor.add(total);

        //Datos
        totalH = new JLabel("Total De Hombres: " + lista.nAsisHombres());
        totalH.setBounds(60, 350, 135, 23);
        contenedor.add(totalH);

        totalM = new JLabel("Total De Mujeres: " + lista.nAsisMujeres());
        totalM.setBounds(220, 350, 135, 23);
        contenedor.add(totalM);

        totalMayor = new JLabel("Total De Mayores: " + lista.nAsisMayores());
        totalMayor.setBounds(60, 370, 135, 23);
        contenedor.add(totalMayor);

        totalMenor = new JLabel("Total De Menores: " + lista.nAsisMenores());
        totalMenor.setBounds(220, 370, 135, 23);
        contenedor.add(totalMenor);

        //Boton Añadir
        boton1 = new JButton("Añadir");
        boton1.setBounds(40, 400, 82, 20);
        contenedor.add(boton1);

        boton1.addActionListener(this);
        setVisible(true);

        //Boton Eliminar
        boton2 = new JButton("Eliminar");
        boton2.setBounds(140, 400, 80, 20);
        contenedor.add(boton2);

        boton2.addActionListener(this);
        setVisible(true);

        //Boton Eliminar todos
        boton3 = new JButton("Eliminar Todo");
        boton3.setBounds(240, 400, 120, 20);
        contenedor.add(boton3);

        boton3.addActionListener(this);
        setVisible(true);

        //Boton Grafico Sexos
        boton4 = new JButton("Graficas De Sexos");
        boton4.setBounds(40, 440, 140, 20);
        contenedor.add(boton4);

        boton4.addActionListener(this);
        setVisible(true);

        //Boton grafica estado civil
        boton5 = new JButton("Graficas Estado Civil");
        boton5.setBounds(210, 440, 150, 20);
        contenedor.add(boton5);

        boton5.addActionListener(this);
        setVisible(true);
        
        //Boton Grafica Mayores y Menores
        boton6 = new JButton("Graficas Mayores y Menores");
        boton6.setBounds(100, 480, 200, 20);
        contenedor.add(boton6);

        boton6.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            añadirAsistente();
            System.out.println("Alumno Añadido");
        } else if (e.getSource() == boton2) {
            eliminarAsistente(listaNom.getSelectedIndex());
            System.out.println("Alumno Eliminado");
        } else if (e.getSource() == boton3) {
            eliminarTodo();
            System.out.println("Alumnos Eliminados");
        } else if (e.getSource() == boton4) {
            graf = new Graficas();
            graf.graficaBarra(graf.crearDatosSexo((byte) lista.nAsisHombres(), (byte) lista.nAsisMujeres()));
        } else if (e.getSource() == boton5) {
            graf = new Graficas();
            graf.graficaBarras3D(graf.crearDatosEstC((byte) lista.nAsisSolteros(), (byte) lista.nAsisCasados(), (byte) lista.nAsisDivorciados(), (byte) lista.nAsisViudos()));
        } else if (e.getSource() == boton6) {
            graf = new Graficas();
            graf.graficaBarra(graf.crearDatosMayorMenor((byte) lista.nAsisMayores(), (byte) lista.nAsisMenores()));
        }
        if (e.getSource() == check1) {
            check2.setSelected(false);
        }
        if (e.getSource() == check2) {
            check1.setSelected(false);
        }
    }

    private void añadirAsistente() {
        asis = new Asistentes(textfield1.getText(),validarSexo(), Byte.parseByte(textfield2.getText()),validarEstadoC());
        lista.añadir(asis);
        String cad = textfield1.getText() + " " + textfield2.getText() + " " + validarSexo() + " " + validarEstadoC();
        modelo.addElement(cad);
        listaNom.setModel(modelo);
        actualizarDatos();
        textfield1.setText("");
        textfield2.setText("");
    }

    private void eliminarAsistente(int indice) {
        if (indice >= 0) {
            modelo.remove(indice);
            lista.eliminar(indice);
            actualizarDatos();
        } else {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar Un elemento");
        }
    }

    private void eliminarTodo() {
        lista.eliminarTodo();
        modelo.clear();
        actualizarDatos();
    }

    public String validarSexo() {
        String datos = "";
        if (check1.isSelected()) {
            datos = "Masculino";
        }
        if (check2.isSelected()) {
            datos = "Femenino";
        }
        return datos;
    }

    public String validarEstadoC() {
        String estado = "";
        if (rbtn1.isSelected()) {
            estado = "Soltero";
        }
        if (rbtn2.isSelected()) {
            estado = "Casado";
        }
        if (rbtn3.isSelected()) {
            estado = "Divorciado";
        }
        if (rbtn4.isSelected()) {
            estado = "Viudo";
        }
        return estado;
    }

    public void actualizarDatos() {
        total.setText("Numero de Registro: " + modelo.getSize());
        totalH.setText("Total De Hombres: " + lista.nAsisHombres());
        totalM.setText("Total De Mujeres: " + lista.nAsisMujeres());
        totalMayor.setText("Total De Mayores: " + lista.nAsisMayores());
        totalMenor.setText("Total De Menores: " + lista.nAsisMenores());

        check1.setSelected(false);
        check2.setSelected(false);

        grupoRBtn.clearSelection();
    }
}