package proyecto.colecciones.en.java;

public class Alumno {
    private String nombre;
    private int gruposInscritos = 0;
    private String[] clavesGrupos;
    
    public Alumno (String nombre){
        setNombre(nombre);
        clavesGrupos = new String[3];
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