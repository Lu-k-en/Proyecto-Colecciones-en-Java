package proyecto.colecciones.en.java;

import java.util.List;
import java.util.LinkedList;

public class Asignatura {
    private String nombre;
    private String area;
    private int semestre;
    private List<String> clavesGrupos;
    
    public Asignatura(String nombre, String area, int semestre){
        setNombre(nombre);
        setArea(area);
        setSemestre(semestre);
        clavesGrupos = new LinkedList<>();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        if (nombre.length() > 1 && nombre.length() < 20) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre debe tener al menos 2 caracteres y menos de 20");
            this.nombre = null;
        }
    }
    
    public String getArea() {
        return area;
    }
    
    public void setArea(String area) {
        if (area.length() > 2 && area.length() < 5 && area.charAt(0) == 'D') {
            this.area = area;
        } else {
            System.out.println("El area debe de comenzar con la letra D y tener entre 2 y 5 caracteres");
            this.area = null;
        }
    }
    
    public int getSemestre() {
        return semestre;
    }
    
    public void setSemestre(int semestre) {
        if(semestre < 10 && semestre > 0){
            this.semestre = semestre;
        }else{
            this.semestre = 0;
            System.out.println("El semestre debe de ser un número entre 1 y 10");
        }
    }
    
    public List<String> getClavesGrupos() {
        return clavesGrupos;
    }
    
    public void addClaveGrupo(String claveGrupo) {
        clavesGrupos.add(claveGrupo);
    }
       
    public void printAsignatura(){
        System.out.println("\tNombre de la asignatura: "+getNombre());
        System.out.println("\tArea: "+getArea());
        System.out.println("\tSemestre: "+getSemestre());
    }
    
    
    
    
}