import java.util.ArrayList;
import java.util.List;

public class Asignatura {
    private Profesor profesorAsignado;
    private String Nombre;
    private String Area;
    private int Semestre;
    private List<String> clavesGrupos;
    
    public Asignatura(String Nombre, String Area, int Semestre){
        setNombre(Nombre);
        setArea(Area);
        setSemestre(Semestre);
    }
    
    public String getNombre() {
        return Nombre;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String getArea() {
        return Area;
    }
    
    public void setArea(String Area) {
        this.Area = Area;
    }
    
    public Profesor getProfesorAsignado() {
        return profesorAsignado;
    }
    
    public void setProfesorAsignado(Profesor profesorAsignado) {
        this.profesorAsignado = profesorAsignado;
    }
    
    public int getSemestre() {
        return Semestre;
    }
    
    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }
    
    public List<String> getClavesGrupos() {
        return clavesGrupos;
    }
    
    public void setClavesGrupos(List<String> clavesGrupos) {
        this.clavesGrupos = clavesGrupos;
    }
       
}
