package proyecto.colecciones.en.java;

/**
 * Clase Alumno, modela al objeto alumno. 
 * 
 * Cuenta con los atributos: 
 * 
 * |> nombre: nombre del alumno
 * |> gruposInscritos: contador del número de grupos inscritos
 * |> clavesGrupos: arreglo con las claves de los grupos inscritos
 *
 * @author Nuñez Quintana, Luis Axel
 * @author Martínez Olmos, Osiris
 * @author Rosales Lopez, Luis André
 *
 */
public class Alumno {
    private String nombre;
    private int gruposInscritos = 0;
    private String[] clavesGrupos;
    
    /**
     * Método constructor, inicializa el atributo nombre. No hace asignación directa, llama al método setNombre. 
     * @param nombre Cadena que es nombre del Alumno
     */
    public Alumno (String nombre){
        setNombre(nombre);
        clavesGrupos = new String[3];
    }
    
    /**
     * Método getter del atributo nombre.
     * @return nombre Cadena que es el nombre del Alumno
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Método que inicializa el atributo nombre si este cuenta con más de 2 caracteres y menos de 50 caracteres.
     * @param nombre Cadena que es el nombre del Alumno
     */
    public void setNombre(String nombre) {
        if(nombre.length() > 2 && nombre.length() < 50){
            this.nombre = nombre;
        }else{
            System.out.println("El nombre debe tener al menos 3 caracteres y menos de 50");
            this.nombre = null;
        }            
    }
    
    /**
     * Método que devuelve el arreglo de las claves de los grupos inscritos por el Alumno
     * @return clavesGrupos Arreglo de cadenas que contiene los claves de los grupos inscritos
     */
    public String[] getClavesGrupos() {
        return clavesGrupos;
    }
    
    /**
     * Método que imprime el nombre del Alumno en un formato pre-establecido.
     */

    public void imprimeAlumno(){
        System.out.println("\tNombre del Alumno: "+getNombre());
    }
    
    /**
     * Método que imprime las claves de los grupos a los que está incrito el Alumno, si está inscrito en alguno.
     */
    public void imprimeClavesGrupos(){
        if(clavesGrupos == null || clavesGrupos.length == 0){  
            System.out.println("No está inscrito a ninguna asignatura");
        } else { 
            System.out.println("Las Claves de las Asignaturas a las que está inscrito: ");
            for (String i: clavesGrupos) {
                System.out.println(" - "+i);
            }
        }
    }
    
    /**
     * Método que agrega una clave de grupo al arreglo de claves de grupos a los que está inscrito el Alumno
     * @param claveGrupo Cadena que es la clave del grupo
     */
    public void addClaveGrupo(String claveGrupo){
        this.clavesGrupos[gruposInscritos] = claveGrupo;
        gruposInscritos++;
    }
    
    /**
     * Método que regresa la cantidad de grupos inscritos del alumno
     */
    public int getGruposInscritos(){
        return gruposInscritos;
    }
    
    
}