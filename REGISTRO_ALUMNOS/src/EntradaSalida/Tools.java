package EntradaSalida;
import javax.swing.JOptionPane;
public class Tools {
    //Metodos de lectura
    public static String validaName(){
        String cad;
        Boolean band;
        do {
            cad=JOptionPane.showInputDialog(null,"Ingrese el Nombre del Alumno: ",JOptionPane.QUESTION_MESSAGE);
            band=(cad!=null&&cad.matches("([a-z A-Z]|\\s)+"));
            if(band) return cad;
            else JOptionPane.showMessageDialog(null,cad+"Contiene caracteres no validos, favor de reingresar la informacion");
        } while (!band);
        return cad;
    }
    //validacion del numero de control
    public static String validarNumControl(){
        String cad;
        Boolean band;
        do {
            cad=JOptionPane.showInputDialog(null,"Lectura Numero de Control: ",JOptionPane.QUESTION_MESSAGE);
            cad=cad.trim();
            band=(cad!=null&&cad.matches("[0-9]{8}|\\s"));
            if(band) 
                return cad;
            else JOptionPane.showMessageDialog(null,cad+" Contiene caracteres no validos, favor de reingresar la informacion");
        } while (!band);
        return cad;
    }
    
    //VALIDACION DE EDAD
    public static byte validaSemestre(){
        String Valores[]={"1","2","3","4","5","6","7","8","9","10","11","12"};
        //Retorno del semestre
        return(byte)(JOptionPane.showOptionDialog(null, "Selecciona", "Semestre",JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_CANCEL_OPTION, null, Valores, Valores[0])+1);
    }
    
    //Validacion de la Edad
    public static Byte validaEdad(){
        byte cad;
        do {
             cad=Byte.parseByte(JOptionPane.showInputDialog(null,"Ingrese la edad: ",JOptionPane.QUESTION_MESSAGE));
            if (cad>=17 && cad<=60) 
                return cad;
            else JOptionPane.showMessageDialog(null,cad+" Contiene caracteres no validos, favor de reingresar la informacion");
        } while (cad>=17 && cad>=60);
        return cad;
    }
}
