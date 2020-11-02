package proyecto.colecciones.en.java;

public class Profesor {
    private String gradoAcademico;
    private String nombre;
    private String correo;
    private int gruposInscritos = 0;
    private String[] claveGrupos = new String[5];
    private static int numProfesores=0;
    
    public Profesor(String nombre, String gradoAcademico, String correo){
        numProfesores++;
        setNombre(nombre);
        setGradoAcademico(gradoAcademico);
        setCorreo(correo);
    }
    
    public int getGruposInscritos(){
        return gruposInscritos;
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
    
    public void addClaveGrupo(String ClaveGrupo){
        this.claveGrupos[gruposInscritos] = ClaveGrupo;
        gruposInscritos++;
    }
    
}
