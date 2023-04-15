package EntradaSalida;
import TDA.Alumno;
import java.util.ArrayList;
public class ListaAlumno{ 
      ArrayList <Alumno> lista;
   public ListaAlumno(){
     lista = new <Alumno> ArrayList ();
   }
   public void añadirAlumno(Alumno p){
   lista.add(p);
   }
   public void eliminarAlumno (int i){
   lista.remove(i);
   }
   public boolean EliminarLista (){
   return lista.removeAll(lista);
   }
    
}


