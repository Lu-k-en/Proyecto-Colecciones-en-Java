package proyecto.colecciones.en.java;

import java.util.LinkedList;
import java.util.List;

public class Profesor {
    private String gradoAcademico;
    private String nombre;
    private String correo; 
    private List<String> claveGrupos;

    
    public Profesor(String nombre, String gradoAcademico, String correo){
        setNombre(nombre);
        setGradoAcademico(gradoAcademico);
        setCorreo(correo);
        claveGrupos = new LinkedList<>();
    }
    
    public void imprimeProfesor(){
        System.out.println("\tNombre del Profesor: "+nombre);
        System.out.println("\tGrado Académico: "+gradoAcademico);
        System.out.println("\tCorreo de contacto: "+correo);
    }
      
    public String getGradoAcademico() {
        return gradoAcademico;
    }
    
    public void setGradoAcademico(String gradoAcademico) {
        if(gradoAcademico.length() > 1 && gradoAcademico.length() < 4){
            this.gradoAcademico = gradoAcademico;
        }else{
            System.out.println("El grado académico debe de contener de 2 a 3 letras Ej. MI, I, DR");
            this.gradoAcademico = null;
        }    
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre){
        if(nombre.length() > 2 && nombre.length() < 50){
            this.nombre = nombre;
        }else{
            System.out.println("El nombre debe tener al menos 3 caracteres y menos de 50");
            this.nombre = null;
        }            
    }
    
    public String getCorreo() {
        return correo;
    }
    
    public void setCorreo(String correo) {
        if(correo.contains("@")){
            this.correo = correo;
        }else{
            System.out.println("El correo debe tener un @");
            this.correo = null;
        }
    }
    
    public List<String> getClavesGrupos() {
        return claveGrupos;
    }
   
    public void imprimeClaveGrupos() {
        if (claveGrupos == null || claveGrupos.size() == 0) {
            System.out.println("No imparte ninguna asignatura");

        } else {
            System.out.println("Las Claves de las Asignaturas que imparte: ");
            for (String i : claveGrupos) {
                System.out.println(" - " + i);
            }
        }
    }
    
    //Modificar para agregar a lista, recibe un long numCuenta
    public void addClaveGrupo(String ClaveGrupo) {
        this.claveGrupos.add(ClaveGrupo);
    }
    
}
