package TDA;
public class Alumno {
    private String numCtrl;
    private String nomAlum;
    private byte semAlum;
    private byte edadAlum;
    public Alumno(){
        
    }
    
    public Alumno(String nomAlum,String numCtrl, byte semAlum, byte edadAlum) {
        this.numCtrl = numCtrl;
        this.nomAlum = nomAlum;
        this.semAlum = semAlum;
        this.edadAlum = edadAlum;
    }

    public String getNumCtrl() {
        return numCtrl;
    }

    public void setNumCtrl(String numCtrl) {
        this.numCtrl = numCtrl;
    }

    public String getNomAlum() {
        return nomAlum;
    }

    public void setNomAlum(String nomAlum) {
        this.nomAlum = nomAlum;
    }

    public byte getSemAlum() {
        return semAlum;
    }

    public void setSemAlum(byte semAlum) {
        this.semAlum = semAlum;
    }

    public byte getEdadAlum() {
        return edadAlum;
    }

    public void setEdadAlum(byte edadAlum) {
        this.edadAlum = edadAlum;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numCtrl=" + numCtrl + ", nomAlum=" + nomAlum + ", semAlum=" + semAlum + ", edadAlum=" + edadAlum + '}';
    }
    
    
    
}
