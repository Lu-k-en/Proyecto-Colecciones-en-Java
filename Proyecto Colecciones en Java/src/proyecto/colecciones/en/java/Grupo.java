package proyecto.colecciones.en.java;

import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class Grupo {
    private Set<Long> alumnosInscritos;
    private Asignatura asignatura;
    private String clave;
    Profesor profesor;
    
    public Grupo(Asignatura asignatura, String clave, Profesor profesor){
        setAsignatura(asignatura);
        setProfesor(profesor);
        setClave(clave);
        alumnosInscritos = new HashSet<>();
    }
    
    public void setAsignatura(Asignatura asignatura){
        this.asignatura = asignatura;
    }
    
    public Asignatura getAsignatura(){
        return asignatura;
    }
    
    public void setProfesor(Profesor profesor){
        this.profesor = profesor;
    }
    
    public Profesor getProfesor(){
        return profesor;
    }
    
    public void setClave(String clave){
        this.clave = clave;
    }
    
    public String getClave(){
        return clave;
    }
    
    public Set<Long> getAlumnos(){
        return alumnosInscritos;
    }
    
    public boolean addAlumno(long numCuenta){
        if(alumnosInscritos.contains(numCuenta)){
            System.out.println("Este alumno ya esta registrado en este grupo");
            return false;
        }else{
            alumnosInscritos.add(numCuenta);
            return true;
        }
    }
    
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
    
    public void printGrupo(){  
        
        System.out.println("\tClave : " + clave);
        System.out.println("\tProfesor ");
        profesor.imprimeProfesor();
        System.out.println("\tAsignatura ");
        asignatura.printAsignatura();  
        
    }
}
