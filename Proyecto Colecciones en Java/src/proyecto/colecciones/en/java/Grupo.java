package proyecto.colecciones.en.java;

import java.util.HashSet;
import java.util.Set;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.Iterator;



public class Grupo {
    private Set<Long> alumnosInscritos = new HashSet<>();
    private Asignatura asignatura;
    private String clave;
    private Calendar[] horario;
    Profesor profesor;
    
    
    
    
    public Grupo(Asignatura asignatura, String clave, Calendar[] horario, Profesor profesor){
        setAsignatura(asignatura);
        setProfesor(profesor);
        setHorario(horario);
        setClave(clave);
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
    
    public void setHorario(Calendar[] horario){
        this.horario = horario;
    }
    
    public Calendar[] getHorario(){
        return horario;
    }
    
    public void setClave(String clave){
        this.clave = clave;
    }
    
    public String getClave(){
        return clave;
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
    
    public void imprimirListaGrupo(Hashtable<Long,Alumno> alumnos){  
        
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
}
