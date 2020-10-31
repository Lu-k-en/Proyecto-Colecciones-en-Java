import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String gradoAcademico;
    private String Nombre;
    private String Correo;
    private List<String> asignaturasQueImparte;
    private static int numProfesores=0;
    
    public Profesor(String Nombre, String gradoAcademico, String Correo){
        numProfesores++;
        setNombre(Nombre);
        setGradoAcademico(gradoAcademico);
        setCorreo(Correo);
    }
    
    public String getGradoAcademico() {
        return gradoAcademico;
    }
    
    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }
    
    public String getNombre() {
        return Nombre;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String getCorreo() {
        return Correo;
    }
    
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    public static int getNumProfesores(){
        return numProfesores;
    }
    
    public List<String> getAsignaturasQueImparte() {
        return asignaturasQueImparte;
    }
    
    public void setAsignaturasQueImparte(List<String> asignaturasQueImparte) {
        this.asignaturasQueImparte = asignaturasQueImparte;
    }
    
    public void imprimeProfesor(){
        System.out.println("Nombre del Profesor: "+Nombre);
        System.out.println("Grado Académico: "+gradoAcademico);
        System.out.println("Correo de contacto: "+Correo);
        
        if(asignaturasQueImparte == null || asignaturasQueImparte.size() == 0){  
            System.out.println("No imparte ninguna asignatura");
        
        } else { 
            System.out.println("Asignaturas que imparte: ");
            for (String i: asignaturasQueImparte) {
                System.out.println(" - "+i);
            }
        }
    }
    
}
