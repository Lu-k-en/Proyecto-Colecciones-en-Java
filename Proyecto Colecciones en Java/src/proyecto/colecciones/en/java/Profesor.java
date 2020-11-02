package proyecto.colecciones.en.java;

import java.util.LinkedList;
import java.util.List;

public class Profesor {
    private String gradoAcademico;
    private String nombre;
    private String correo;
    
    // private int gruposInscritos = 0; // Podemos saber el número de grupos inscritos según el tamaño de la lista clavesGrupos
    
    private List<String> claveGrupos = new LinkedList<>();

    
    public Profesor(String nombre, String gradoAcademico, String correo){
        setNombre(nombre);
        setGradoAcademico(gradoAcademico);
        setCorreo(correo);
        
    }
   
    // Modificar para agregar a la lista 

    
    public void imprimeProfesor(){
        System.out.println("\tNombre del Profesor: "+nombre);
        System.out.println("\tGrado Académico: "+gradoAcademico);
        System.out.println("\tCorreo de contacto: "+correo);
    }
    
    
    // Modificar para imprimir las claves de la lista
  
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
Desarrollo_Axel
        if(correo.contains("@")){
            this.correo = correo;
        }else{
            System.out.println("El correo debe tener un @");
            this.correo = null;
        }
    }
    
    public static int getNumProfesores(){
        return numProfesores;
    }
    
    public String[] getClaveGrupos() {
        return claveGrupos;
    }
    
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

        this.correo = correo;

    }
    
}
