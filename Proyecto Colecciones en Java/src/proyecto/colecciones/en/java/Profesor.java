package proyecto.colecciones.en.java;

import java.util.LinkedList;
import java.util.List;

public class Profesor {
    private String gradoAcademico;
    private String nombre;
    private String correo;
    
    // private int gruposInscritos = 0; // Podemos saber el número de grupos inscritos según el tamaño de la lista clavesGrupos
    
    private List<String[]> claveGrupos = new LinkedList<>();

    
    public Profesor(String nombre, String gradoAcademico, String correo){
        setNombre(nombre);
        setGradoAcademico(gradoAcademico);
        setCorreo(correo);
        
    }
   
    // Modificar para agregar a la lista 
    public void setClaveGrupos(String claveGrupo1, String claveGrupo2, String claveGrupo3, String claveGrupo4, String claveGrupo5) {
        this.claveGrupos[0] = claveGrupo1;
        this.claveGrupos[1] = claveGrupo2;
        this.claveGrupos[2] = claveGrupo3;
        this.claveGrupos[3] = claveGrupo4;
        this.claveGrupos[4] = claveGrupo5;
    }
    
    public void imprimeProfesor(){
        System.out.println("\tNombre del Profesor: "+nombre);
        System.out.println("\tGrado Académico: "+gradoAcademico);
        System.out.println("\tCorreo de contacto: "+correo);
    }
    
    
    // Modificar para imprimir las claves de la lista
    public void imprimeClaveGrupos(){
        if(claveGrupos == null || claveGrupos.length == 0){  
            System.out.println("No imparte ninguna asignatura");
        
        } else { 
            System.out.println("Las Claves de las Asignaturas que imparte: ");
            for (String i: claveGrupos) {
                System.out.println(" - "+i);
            }
        }
    }
    
    //Modificar para agregar a lista, recibe un long numCuenta
    public void addClaveGrupo(String ClaveGrupo){
        this.claveGrupos[gruposInscritos] = ClaveGrupo;
        gruposInscritos++;
    }
           
    public String getGradoAcademico() {
        return gradoAcademico;
    }
    
    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getCorreo() {
        return correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    
    }
    
}
