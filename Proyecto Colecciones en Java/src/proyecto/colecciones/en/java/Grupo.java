package proyecto.colecciones.en.java;

import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;


/**
 * Clase Grupo,  modela al objeto grupo escolar.
 * 
 * Cuenta con los siguientes atributos:
 * 
 * |> alumnosInscritos: Set que aloja el número de cuenta de los alumnos inscritos
 * |> asignatura: de tipo Asignatura, corresponde a la asignatura ligada al grupo
 * |> clave: identificador único
 * |> profesor: de tipo Profesor, corresponde al profesor ligado al grupo
 * 
 * @author Nuñez Quintana, Luis Axel
 * @author Martínez Olmos, Osiris
 * @author Rosales Lopez, Luis André
 */

public class Grupo {
    private Set<Long> alumnosInscritos;
    private Asignatura asignatura;
    private String clave;
    Profesor profesor;
    
    
    /**
     * Método constructor, inicializa los atributos del objeto según los parámetros proporcionados. 
     * No hace asignación directa, llama a los setters. Inicializa el set del atributo alumnosInscritos
     * 
     * @param asignatura la asignatura que se desea ligar al grupo
     * @param clave la clave del grupo (identificador único)
     * @param profesor el profesor que se desea ligar al grupo
     */
    public Grupo(Asignatura asignatura, String clave, Profesor profesor){

        setAsignatura(asignatura);
        setProfesor(profesor);
        setClave(clave);
        alumnosInscritos = new HashSet<>();
    }
    
    /**
     * Método setter del atributo asignatura. No se realizan validaciones ya que se
     * asume que el objeto proporcionado es saludable en terminos de su composición y su inicialización
     * 
     * @param asignatura objeto de tipo Asignatura correspondiente a la asignatura que se desea ligar al grupo
     */
    public void setAsignatura(Asignatura asignatura){
        this.asignatura = asignatura;
    }
    
    /**
     * Método getter del atributo asignatura
     * @return un objeto de tipo asignatura correspondiente a la asignatura ligada al grupo
     */
    public Asignatura getAsignatura(){
        return asignatura;
    }
    /**
     * Método setter del atributo profesor. No se realizan validaciones ya que se
     * asume que el objeto proporcionado es saludable en terminos de su composición y su inicialización
     * 
     * @param profesor objeto de tipo Profesor correspondiente al profesor que se desea ligar al grupo
     */
    public void setProfesor(Profesor profesor){
        this.profesor = profesor;
    }
    
    
    /**
     * Método getter del atributo profesor
     * @return un objeto de tipo asignatura correspondiente al profesor ligado al grupo
     */
    public Profesor getProfesor(){
        return profesor;
    }
    /**
     * Método setter del atributo clave. 
     * @param clave 
     */
    public void setClave(String clave){
        this.clave = clave;
    }
    
     /**
     * Método getter del atributo clave
     * @return Un string correspondiente a la clave (identificador único) del grupo
     */
    public String getClave(){
        return clave;
    }
    
    /**
     * Método getter del atributo alumnosInscritos
     * @return un set de tipo de dato long correspondiente a la lista de alumnos inscritos
     */
    public Set<Long> getAlumnos(){
        return alumnosInscritos;
    }
    
    /**
     * Método que agrega un alumno al set alumnosInscritos (equivalente a inscribirlo en el grupo)
     * @param numCuenta número de cuenta del alumno a inscribir
     * @return verdadero o falso reflejando si fue o no posible inscribir al alumno en el grupo
     */
    public boolean addAlumno(long numCuenta){
        if(alumnosInscritos.contains(numCuenta)){
            System.out.println("Este alumno ya esta registrado en este grupo");
            return false;
        }else{
            alumnosInscritos.add(numCuenta);
            return true;
        }
    }
    
    
    /**
     * Método que imprime la lista de alumnos inscritos en el grupo, en un formato pre-establecido.
     * Se auxilia del hashmap general de alumnos para suministrar los detalles de cada uno de los alumnos inscritos
     * 
     * @param alumnos Hashmap de los alumnos disponibles en el sistema.
     */
    public void imprimirListaGrupo(HashMap<Long,Alumno> alumnos){  
        
        System.out.println("** Esta es la lista de alumnos inscritos: ");
        
        if (alumnosInscritos.isEmpty()) {
            System.out.println("No hay ningún alumno inscrito");
        }else{
            
            Iterator<Long> alumnosIterable = alumnosInscritos.iterator();
            
            for (int i = 0; i < alumnosInscritos.size(); i++) {
                long numCuentaSiguiente = alumnosIterable.next();
                System.out.println("\t" + (i+1) + ") " + alumnos.get(numCuentaSiguiente).getNombre());
            }

        }
    }
    
    /**
     * Método que imprime los detalles específicos del grupo (su clave, profesor asignado, asignatura ligada) en un formato
     * pre-establecido
     */
    public void printGrupo(){  
        
        System.out.println("\tClave: " + clave);
        System.out.println("\tProfesor: ");
        profesor.imprimeProfesor();
        System.out.println("\tAsignatura: ");
        asignatura.printAsignatura();  
        
    }
}
