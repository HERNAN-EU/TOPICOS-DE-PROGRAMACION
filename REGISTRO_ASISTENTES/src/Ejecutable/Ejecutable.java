package Ejecutable;
import EntradaSAlida.Almacenar;
import TDA.Asistentes;
import javax.swing.JOptionPane;
public class Ejecutable {
    public static void menu(){
        Asistentes aux;
        Almacenar obj =new Almacenar();
        int auxc=0;
        String cadena_menu="\n1.-AgregarAsistente \n 2.-Ver estadisticas "
                + "\n 3.-Salir";
        do{
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la opcion deseada:"+cadena_menu));
        switch(opcion){
            case 1:
                    aux      = new Asistentes();
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del asistente: ");
                    String Sexo = JOptionPane.showInputDialog("Ingrese el sexo del asistente: ");
                    Byte edad = Byte.parseByte(JOptionPane.showInputDialog("Ingrese la edad del asistente: "));
                    String EstadoC = JOptionPane.showInputDialog("Ingrese el Estado Civil del asistente: ");
                    //Validacion de variables
                    aux.setNombre(nombre);
                    aux.setEdad(edad);
                    aux.setEstadoC(EstadoC);
                    aux.setSexo(Sexo);
                    //Añadimos con el metodo de la clase del ArrayList
                    obj.añadirAsistente(aux);
                 break;
            case 2:
                System.out.println("\n*-----ESTADISTICAS-----*\n");
                System.out.println("Numero de asistentes agregados:");
                obj.ContadorAsistentes();
                System.out.println("La cantidad de personas mayores de edad son:\n"+obj.MayoresDeEdad());
                System.out.println("La cantidad de personas menores de edad son:\n"+obj.MenoresDeEdad());
                System.out.println("Asistentes agregados:");
                obj.VerAsistentes();
                System.out.println("\n*-----Estado civil-----*\n");
                obj.EstadoCivil();
                System.out.println("*---------SEXOS--------*");
                obj.CSexos();
                System.out.println("*-------PORCENTAJES--------*");
                obj.PorcentajesHYM();
                break;
            case 3:
                auxc=1;
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcion No Valida");
        }
        }while(auxc<=0);
    }
    public static void main(String[] args) {
       menu();
    }
}
