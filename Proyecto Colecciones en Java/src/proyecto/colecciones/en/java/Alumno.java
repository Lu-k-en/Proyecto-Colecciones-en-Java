package proyecto.colecciones.en.java;

public class Alumno {
    private String nombre;
    private int gruposInscritos = 0;
    private String[] clavesGrupos = new String[3];
    private static int numAlumnos = 0;
    
    public Alumno (String nombre){
        numAlumnos++;
        setNombre(nombre);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        if(nombre.length() > 2 && nombre.length() < 50){
            this.nombre = nombre;
        }else{
            System.out.println("El nombre debe tener al menos 3 caracteres y menos de 50");
            this.nombre = null;
        }            
    }
   
    public String[] getClavesGrupos() {
        return clavesGrupos;
    }
    
    public void setClavesGrupos(String claveGrupo1, String claveGrupo2, String claveGrupo3) { 
        this.clavesGrupos[0] = claveGrupo1;
        this.clavesGrupos[1] = claveGrupo2;
        this.clavesGrupos[2] = claveGrupo3;
    }
    
    public void imprimeAlumno(){
        System.out.println("\tNombre del Alumno: "+getNombre());
    }
    
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
    
    public void addClaveGrupo(String claveGrupo){
        this.clavesGrupos[gruposInscritos] = claveGrupo;
        gruposInscritos++;
    }
}
