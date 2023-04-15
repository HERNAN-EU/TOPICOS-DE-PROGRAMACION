package TDA;
public class Asistentes {
  private String Nombre;
private String Sexo;
private byte Edad;
private String EstadoC;
    public Asistentes(String Nombre, String Sexo, byte Edad, String EstadoC) {
        this.Nombre = Nombre;
        this.Sexo = Sexo;
        this.Edad = Edad;
        this.EstadoC = EstadoC;
    }
    public Asistentes() {
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public byte getEdad() {
        return Edad;
    }

    public void setEdad(byte Edad) {
        this.Edad = Edad;
    }

    public String getEstadoC() {
        return EstadoC;
    }

    public void setEstadoC(String EstadoC) {
        this.EstadoC = EstadoC;
    }
    @Override
    public String toString() {
        return "Nombre:" + Nombre + ", \nSexo:" + Sexo + ", \nEdad=" + Edad + ", \nEstado Civil=" + EstadoC;
    }
}
