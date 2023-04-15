package EntradaSalida;

import TDA.Asistentes;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Almacenar {

    ArrayList<Asistentes> lista;

    public Almacenar() {
        lista = new <Asistentes>ArrayList();
    }

    public void añadir(Asistentes p) {
        lista.add(p);
    }

    public void eliminar(int pos) {
        lista.remove(pos);
    }

    public void eliminarTodo() {
        lista.removeAll(lista);
    }

    public void mostrarTodo() {
        String cad = "";
        for (int i = 0; i <= lista.size() - 1; i++) {
            cad += "" + lista.get(i);
        }
        JOptionPane.showMessageDialog(null, cad);
    }

    public int nAsistentes() {
        return lista.size();
    }

    public int nAsisMayores() {
        int contador = 0;
        for (int i = 0; i <= lista.size() - 1; i++) {
            if (lista.get(i).getEdad() >= 18) {
                contador++;
            }
        }
        return contador;
    }

    public int nAsisMenores() {
        int contador = 0;
        for (int i = 0; i <= lista.size() - 1; i++) {
            if (lista.get(i).getEdad() <= 17) {
                contador++;
            }
        }
        return contador;
    }

    public int nAsisHombres() {
        int contador = 0;
        for (int i = 0; i <= lista.size() - 1; i++) {
            if (lista.get(i).getSexo() == "Masculino") {
                contador++;
            }
        }
        return contador;
    }

    public int nAsisMujeres() {
        int contador = 0;
        for (int i = 0; i <= lista.size() - 1; i++) {
            if (lista.get(i).getSexo() == "Femenino") {
                contador++;
            }
        }
        return contador;
    }

    public int nAsisSolteros() {
        int contador = 0;
        for (int i = 0; i <= lista.size() - 1; i++) {
            if (lista.get(i).getEstadoC().equalsIgnoreCase("Soltero")) {
                contador++;
            }
        }
        return contador;
    }

    public int nAsisCasados() {
        int contador = 0;
        for (int i = 0; i <= lista.size() - 1; i++) {
            if (lista.get(i).getEstadoC().equalsIgnoreCase("Casado")) {
                contador++;
            }
        }
        return contador;
    }

    public int nAsisViudos() {
        int contador = 0;
        for (int i = 0; i <= lista.size() - 1; i++) {
            if (lista.get(i).getEstadoC().equalsIgnoreCase("Viudo")) {
                contador++;
            }
        }
        return contador;
    }

    public int nAsisDivorciados() {
        int contador = 0;
        for (int i = 0; i <= lista.size() - 1; i++) {
            if (lista.get(i).getEstadoC().equalsIgnoreCase("Divorciado")) {
                contador++;
            }
        }
        return contador;
    }

    public float porcentajeH() {
        return ((nAsisHombres() / (float) nAsistentes()) * 100);
    }

    public float porcentajeM() {
        return (float) ((nAsisMujeres() / (float) nAsistentes()) * 100);
    }
}