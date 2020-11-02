package proyecto.colecciones.en.java;

import java.util.List;

public class Asignatura {
    private Profesor profesorAsignado;
    private String nombre;
    private String area;
    private int semestre;
    private int clave;
    private List<String> clavesGrupos;
    
    public Asignatura(String nombre, String area, int semestre, int clave){
        setNombre(nombre);
        setArea(area);
        setSemestre(semestre);
        setClave(clave);
    }
    
    public int getClave() {
        return clave;
    }
    
    public void setClave(int clave) {
        this.clave = clave;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getArea() {
        return area;
    }
    
    public void setArea(String area) {
        this.area = area;
    }
    
    public Profesor getProfesorAsignado() {
        return profesorAsignado;
    }
    
    public void setProfesorAsignado(Profesor profesorAsignado) {
        this.profesorAsignado = profesorAsignado;
    }
    
    public int getSemestre() {
        return semestre;
    }
    
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    public List<String> getClavesGrupos() {
        return clavesGrupos;
    }
    
    public void addClaveGrupo(String clavesGrupos) {
        this.clavesGrupos.add(clavesGrupos);
    }
       
    public void printAsignatura(){
        System.out.println("\tNombre de la asignatura: "+getNombre());
        System.out.println("\tArea: "+getArea());
        System.out.println("\tSemestre: "+getSemestre());
        System.out.println("\tClave: "+getClave());
    }
    
    
    
    
}
