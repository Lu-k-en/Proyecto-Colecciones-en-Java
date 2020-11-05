package proyecto.colecciones.en.java;
import java.util.List;
import java.util.LinkedList;


/**
 * Clase Asignatura,  modela una asignatura escolar. Cuenta con los atributos:
 *  
 *  |> nombre: nombre de la asignatura 
 *  |> area: area de la asignatura
 *  |> semestre: semestre al que corresponde la asignatura
 *  |> clavesGrupos: Lista que contiene las claves de los alumnos que pertenecen al grupo
 * 
 * @author Nuñez Quintana, Luis Axel
 * @author Martinez Olmos, Osiris
 * @author Rosales López, Luis André
 */

public class Asignatura {
    private String nombre;
    private String area;
    private int semestre;
    private List<String> clavesGrupos;
    
    
    /**
     * Método constructor, incializa los atributos del objeto según los parámetros proporcionados.
     * No hace asignación directa, llama a los setters. 
     * 
     * @param nombre el nombre de la asignatura
     * @param area el área al que pertenece la asignatura (DCB, DIE, etc).
     * @param semestre el semestre al que corresponde la asignatura [1-10]
     */
    
    public Asignatura(String nombre, String area, int semestre){
        setNombre(nombre);
        setArea(area);
        setSemestre(semestre);
        clavesGrupos = new LinkedList<>();
    }
    
    
    /**
     * Método getter del atributo nombre
     * @return Un String correspondiente al nombre de la asignatura
     */
    public String getNombre() {
        return nombre;
    }
    
    
    /**
     * Método setter del atributo nombre. Valida que la longitud del nombre sea correcta,
     * @param nombre String correspondiente al nombre que se le desea dar a la asignatura.
     */
    public void setNombre(String nombre) {
        if (nombre.length() > 1 && nombre.length() < 20) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre debe tener al menos 2 caracteres y menos de 20");
            this.nombre = null;
        }
    }
    
    /**
     * Método getter del atributo area
     * @return Un string correspondiente al área de la asignatura
     */
    public String getArea() {
        return area;
    }
    
    /**
     * Método setter del atributo area. Valida que la longitud del nombre del area sea
     * correcta, así como el formado del mismo. Si no es una sentencia válida asigna el valor por defecto null
     *
     * @param area String correspondiente al area académica a la que pertenece la asignatura
     */
    
    public void setArea(String area) {
        if (area.length() > 2 && area.length() < 5 && area.charAt(0) == 'D') {
            this.area = area;
        } else {
            System.out.println("El area debe de comenzar con la letra D y tener entre 2 y 5 caracteres");
            this.area = null;
        }
    }
    

   /**
    * Método getter del atributo semestre
    * @return un entero correspondiente al semestre al que pertenece la asignatura
    */  
    public int getSemestre() {
        return semestre;
    }
    
    /**
     * Método setter del atributo semestre. Valida que el parámetro se encuentre dentro del rango 
     * [1 - 10] y en caso contrario asigna el valor por defecto 0.
     * @param semestre semestre al que pertenece la asignatura.
     */
    
    public void setSemestre(int semestre) {
        if(semestre < 10 && semestre > 0){
            this.semestre = semestre;
        }else{
            this.semestre = 0;
            System.out.println("El semestre debe de ser un número entre 1 y 10");
        }
    }
    
    /**
     * Método getter del atributo clavesGrupos. 
     * @return una lista de Strings que contiene las claves de los grupos en los que se imparten esta asignatura
     */
    public List<String> getClavesGrupos() {
        return clavesGrupos;
    }
    
   /**
     * Método para agregar grupos a la lista clavesGrupos. 
     * @param claveGrupo String con la clave del grupo a agregar en la lista
     */

    public void addClaveGrupo(String claveGrupo) {
        clavesGrupos.add(claveGrupo);
    }
     
  
    /**
     * Método que imprime los atributos de la clase Asignatura con unn formato pre-establecido
     */
     
    public void printAsignatura(){
        System.out.println("\tNombre de la asignatura: "+getNombre());
        System.out.println("\tArea: "+getArea());
        System.out.println("\tSemestre: "+getSemestre());
    }
    
    
    
    
}