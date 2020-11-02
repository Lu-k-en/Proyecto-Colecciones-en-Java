package proyecto.colecciones.en.java;

import java.util.HashSet;
import java.util.Set;
import java.util.Calendar;

public class Grupo {
    private Set<Long> numCuenta = new HashSet<>();
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
    
    public boolean addAlumno(Alumno alumno){
        if(numCuenta.contains(alumno.getNumeroCuenta())){
            System.out.println("Este alumno ya esta registrado en este grupo");
            return false;
        }else{
            numCuenta.add(alumno.getNumeroCuenta());
            return true;
        }
    }
    
}
