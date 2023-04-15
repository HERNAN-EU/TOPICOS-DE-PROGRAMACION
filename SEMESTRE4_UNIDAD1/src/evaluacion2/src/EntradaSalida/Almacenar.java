package EntradaSalida;
import TDA.Alumno;

public class Almacenar {
    private Alumno arAlum[];
    private byte i;
    
    //Deternima el tamañp del vector
    public Almacenar(int tam){
        arAlum=new Alumno[tam];
        i=-1;
    }
    
    //Verificacion de si esta vacio
    public boolean arrayVacio(){
        return (i==-1);
    }
    
    //Asignacion de datos a los atributos de la clase
    private Alumno creaAlumno(){
        Alumno aux=new Alumno();
        aux.setNumCtrl(Tools.validarNumControl());
        aux.setNomAlum(Tools.validaName());
        aux.setSemAlum(Tools.validaSemestre());
        aux.setEdadAlum(Tools.validaEdad());
        return aux;
    }
    //Metodo de ordenamiento mediante .compareTo que evalua 2 cadenas de texto retornando un int
    public void ordenar() {
    	Alumno aux= new Alumno();
    	int k=0;
    	for(k=0; k<=i; k++) {
    		for(int j=k+1;j<=i;j++) {
    			if(arAlum[k].getNumCtrl().compareTo(arAlum[j].getNumCtrl())>0) {//dependiendo el simbolo se acomoda menor a mayor
    	    		aux=arAlum[k];
    	    		arAlum[k]=arAlum[j];
    	    		arAlum[j]=aux;
    	    	}
    		}
    	}
    }
    
    //Agrega objetos al vector 
    public void agregarObjeto(){
        if (i< arAlum.length){
            arAlum[++i] = creaAlumno();
            //i++;
        }else{
            System.out.println("Array lleno");
        }
    }
    
    //toString Concatena los objetos en una cadena de caracteres
    public void verObjetos(){
        byte j;
        String cad =" ";
        for (j=0; j<=i; j++){
            cad += arAlum[j].toString()+"\n";
        }
        System.out.println("Datos en el array:\n"+cad);
    }
}
