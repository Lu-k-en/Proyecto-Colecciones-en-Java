package proyecto.colecciones.en.java;

import java.util.LinkedList;
import java.util.List;

/**
 * Esta clase modela al objeto Profesor, cuenta con los atributos: 
 * > gradoAcademico: Grado académico del Profesor. Ejemplo: MI, Ing, Doc, etc.
 * > nombre: Nombre del Profesor
 * > correo: Correo Electrónico del Profesor
 * > claveGrupos: Lista de las claves de los grupos a lo que da clase el Profesor
 * 
 * @author Nuñez Quintana, Luis Axel
 * @author Martínez Olmos, Osiris
 * @author Rosales Lopez, Luis André
 *
 */
public class Profesor {
    private String gradoAcademico;
    private String nombre;
    private String correo; 
    private List<String> claveGrupos;

    /**
     * Método constructor, inicializa el atributo nombre, gradoAcademico y correo. No hace asignación directa, llama a los métodos setters.
     * 
     * @param nombre Nombre del Profesor
     * @param gradoAcademico Grado académico del Profesor
     * @param correo Correo electrónico del Profesor
     */
    public Profesor(String nombre, String gradoAcademico, String correo){
        setNombre(nombre);
        setGradoAcademico(gradoAcademico);
        setCorreo(correo);
        claveGrupos = new LinkedList<>();
    }
    
    /**
     * Método que imprime el nombre, grado académico y correo del Profesor. 
     */
    public void imprimeProfesor(){
        System.out.println("\tNombre del Profesor: "+nombre);
        System.out.println("\tGrado Académico: "+gradoAcademico);
        System.out.println("\tCorreo de contacto: "+correo);
    }
    
    /**
     * Método que devuelve el grado académico del Profesor
     * @return gradoAcademico Cadema que es el grado académico del profesor
     */
    public String getGradoAcademico() {
        return gradoAcademico;
    }
    
    /**
     * Método que inicializa el grado académico si este tiene más 1 caracter y menos de 4 caracteres
     * @param gradoAcademico Cadena que es el Grado Académico
     */
    public void setGradoAcademico(String gradoAcademico) {
        if(gradoAcademico.length() > 1 && gradoAcademico.length() < 4){
            this.gradoAcademico = gradoAcademico;
        }else{
            System.out.println("El grado académico debe de contener de 2 a 3 letras Ej. MI, I, DR");
            this.gradoAcademico = null;
        }    
    }
    
     /**
     * Método que devuelve al atributo nombre.
     * 
     * 
     * @return nombre Cadena que es el nombre del Profesor
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Método que inicializa el atributo nombre si este cuenta con más de 2 caracteres y menos de 50 caracteres.
     * 
     * @param nombre Cadena que es el nombre del Profesor
     */
    public void setNombre(String nombre){
        if(nombre.length() > 2 && nombre.length() < 50){
            this.nombre = nombre;
        }else{
            System.out.println("El nombre debe tener al menos 3 caracteres y menos de 50");
            this.nombre = null;
        }            
    }
    
    /**
     * Método que devuelve al atributo correo.
     * 
     * 
     * @return nombre Cadena que es el correo del Profesor
     */
    public String getCorreo() {
        return correo;
    }
    
    /**
     * Método que inicializa el atributo correo si este contiene al caracter '@'.
     * 
     * @param correo Cadena que es el correo del Profesor
     */
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
   
     /**
     * Método que imprime las claves de los grupos a los que da clase el Profesor, si es que los hay.
     */
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
    
    /**
     * Método que agrega una clave de Grupo a la lista de claves de grupo que imparte el profesor
     * @param ClaveGrupo Cadena que es la clave del grupo
     */
    public void addClaveGrupo(String ClaveGrupo) {
        this.claveGrupos.add(ClaveGrupo);
    }
    
}
