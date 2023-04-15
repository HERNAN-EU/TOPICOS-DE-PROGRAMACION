package Principal;
import EntradaSalida.Almacenar;
import javax.swing.JOptionPane;
public class tesAlumno {
    public static void menuAlumno(){
        Almacenar obj= new Almacenar(15);
        byte op=0;
        do{
            op= Byte.parseByte(JOptionPane.showInputDialog(null, "1) Agregar Objeto\n"
                    + "2) Ver datos\n"
                    + "3) Ordenar\n"
                    + "4)salir\n"));
            switch(op){
                case 1: 
                    obj.agregarObjeto();
                    break;
                case 2: 
                    if(obj.arrayVacio()){
                        System.out.println("array vacio");
                    }else{
                        obj.verObjetos();
                    }
                break;
                case 3:
			obj.ordenar();
                        break;
		case 4:
		        System.out.println("ADIOS");
		        break;
		default:
		System.out.println("Error opcion no definida");
	}
		
              
        }while ((byte)op !=4);
    }
    public static void main(String[] args) {
        menuAlumno();
    }
}
