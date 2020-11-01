package proyecto.colecciones.en.java;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String gradoAcademico;
    private String Nombre;
    private String Correo;
    private long NumCuentaProfesor;
    private int gruposInscritos = 5;
    private String[] ClaveGrupos = new String[gruposInscritos];
    private static int numProfesores=0;
    
    public Profesor(String Nombre, String gradoAcademico, String Correo){
        numProfesores++;
        setNombre(Nombre);
        setGradoAcademico(gradoAcademico);
        setCorreo(Correo);
    }
    
    public int getGruposInscritos(){
        return gruposInscritos;
    }
    
    public long getNumCuentaProfesor(){
        return NumCuentaProfesor;
    }
    
    public void setNumCuentaProfesor(long NumCuentaProfesor){
        this.NumCuentaProfesor=NumCuentaProfesor;
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
    
    public String[] getClaveGrupos() {
        return ClaveGrupos;
    }
    
    public void setClaveGrupos(String ClaveGrupo1, String ClaveGrupo2, String ClaveGrupo3, String ClaveGrupo4, String ClaveGrupo5) {
        this.ClaveGrupos[0] = ClaveGrupo1;
        this.ClaveGrupos[1] = ClaveGrupo2;
        this.ClaveGrupos[2] = ClaveGrupo3;
        this.ClaveGrupos[3] = ClaveGrupo4;
        this.ClaveGrupos[4] = ClaveGrupo5;
    }
    
    public void imprimeProfesor(){
        System.out.println("Nombre del Profesor: "+Nombre);
        System.out.println("Grado Académico: "+gradoAcademico);
        System.out.println("Correo de contacto: "+Correo);
    }
    
    public void imprimeClaveGrupos(){
        if(ClaveGrupos == null || ClaveGrupos.length == 0){  
            System.out.println("No imparte ninguna asignatura");
        
        } else { 
            System.out.println("Las Claves de las Asignaturas que imparte: ");
            for (String i: ClaveGrupos) {
                System.out.println(" - "+i);
            }
        }
    }
    
}
