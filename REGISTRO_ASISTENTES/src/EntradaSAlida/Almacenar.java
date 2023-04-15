package EntradaSAlida;

import TDA.Asistentes;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Almacenar {

    ArrayList<Asistentes> lista;

    public Almacenar() {
        lista = new <Asistentes> ArrayList();
    }
    //Metodo para añadir objetos
    public void añadirAsistente(Asistentes p) {
        try {
            lista.add(p);
            System.out.println("Asistente Agregado Exitosamente");
        } catch (Error e) {
            System.out.println("Error dado en : " + e);
        }
    }
    //Metodo de Seleccion del Estado Civil
    public void EstadoCivil(){
        byte j,CSolteros=0,CCasados=0,CViudos=0,CDivorciados=0;
        for (j = 0; j < lista.size(); j++) {
            if (lista.get(j).getEstadoC().equalsIgnoreCase("SOLTERO")) {
                CSolteros++;
            }
            if (lista.get(j).getEstadoC().equalsIgnoreCase("CASADO")) {
                CCasados++;
            }
            if (lista.get(j).getEstadoC().equalsIgnoreCase("DIVORCIADO")) {
                CDivorciados++;
            }
            if (lista.get(j).getEstadoC().equalsIgnoreCase("VIUDOS")) {
                CViudos++;
            }
        }
        System.out.println("CASADOS: "+CCasados+"\n");
        System.out.println("SOLTEROS: "+CSolteros+"\n");
        System.out.println("VIUDOS: "+CViudos+"\n");
        System.out.println("DIVORCIADOS: "+CDivorciados+"\n");
    }
    
    //Metodo Para calcular el Porcentaje de Homnres y de Mujeres
    public void PorcentajesHYM(){
        byte j,CMasculinos=0,CFemeninos=0;
    for (j = 0; j <lista.size(); j++) {
            if (lista.get(j).getSexo().equalsIgnoreCase("MASCULINO")) {
                CMasculinos++;
            }
            if (lista.get(j).getSexo().equalsIgnoreCase("FEMENINO")) {
            CFemeninos++;
            }
    }
    int total;
    total=CMasculinos+CFemeninos;
        System.out.println("Porcentaje de Hombres: "+(CMasculinos*100)/total+"%\n");
                System.out.println("Porcentaje de Mujeres: "+(CFemeninos*100)/total+"%\n");

    }
    //Metodo para calcular la cantidad de Hombres y de Mujeres
    public void CSexos(){
        byte j,CMasculinos=0,CFemeninos=0;
    for (j = 0; j < lista.size(); j++) {
            if (lista.get(j).getSexo().equalsIgnoreCase("MASCULINO")) {
                CMasculinos++;
            }
            if (lista.get(j).getSexo().equalsIgnoreCase("FEMENINO")) {
                CFemeninos++;
            }
            
    }
        System.out.println("Mujeres: "+CFemeninos+"\n");
         System.out.println("Masculinos: "+CMasculinos+"\n");
    }
    //Metodo para calcular la cantidad de asistemtes
    public void ContadorAsistentes(){
        System.out.println(lista.size());
    }
   
    //Metodo de visualizacion de datos del Array Lists

    public void VerAsistentes() {
        byte j;
        for (j = 0; j < lista.size(); j++) {
            System.out.print(lista.get(j).toString()+"\n");
        }
    }
    //Metodo para eliminar un asistente Unico

    public void EliminarAsistente(int i) {
        lista.remove(i);
    }
    //Metodo para verificar la cantidad de elementos en el ArrayList

    public Boolean EvaluacionContenidoArrayList() {
        if (lista.size() < 1) {
            return true;
        }
        return false;
    }
    //Metodo para Eliminar el contenido del Array list

    public boolean EliminarTodo() {
        return lista.removeAll(lista);
    }
    //Metodo para evaluar personas mayores de edad

    public int MayoresDeEdad() {
        byte contador = 0;
        for (byte j = 0; j <= lista.size() - 1; j++) {
            if (lista.get(j).getEdad() >= 18) {
                contador++;
            }
        }
        return contador;
    }

    public int MenoresDeEdad() {
        byte contador = 0;
        for (byte j = 0; j <= lista.size() - 1; j++) {
            if (lista.get(j).getEdad() <= 17) {
                contador++;
            }
        }
        return contador;
    }
}
