package proyecto.colecciones.en.java;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Scanner;

public class ProyectoColeccionesEnJava { 
    
    public static void main(String[] args) {
        
        //Hashtable key = #cuenta, value = alumno || clave, asignatura
        HashMap<Long,Alumno> alumnos = new HashMap<>();
        HashMap<Long,Profesor> profesores = new HashMap<>();
        HashMap<Integer,Asignatura> asignaturas = new HashMap<>();
        
        //Hashtable<Integer, Asignatura> asignaturas = new Hashtable<>();
        //Set<Long> numerosCuenta = new HashSet<>();
        
        //List<Asignatura> asignaturas = new LinkedList<>();
        //Set<Integer> clavesAsignaturas = new HashSet<>();
        
        HashMap<String, Grupo> grupos = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        
        int op;
        String nombre;
        int clave;
        int opAux;
        int opAux2;
        //
        do{
            System.out.println("###  Menu Principal  ###");
            System.out.println("\t1.Crear alumno");
            System.out.println("\t2.Crear profesor");
            System.out.println("\t3.Crear asignatura");
            System.out.println("\t4.Crear Grupo");
            System.out.println("\t5.Mostrar Alumnos");
            System.out.println("\t6.Mostrar Profesores");
            System.out.println("\t7.Mostrar Asignaturas");
            System.out.println("\t8.Mostrar Grupos");
            System.out.println("\t99.Salir");

            op = sc.nextInt();
            
            switch(op){
               
                case 1->{
                    
                   
                    System.out.println("Ingrese el número de cuenta del alumno");
                    long numCuenta = sc.nextLong(); 
                    if (alumnos.containsKey(numCuenta)){
                        System.out.println("Ya existe este alumno");
                    }else{
                        System.out.println("Ingrese el nombre del alumno");
                        nombre = sc.next();
                        alumnos.put(numCuenta, new Alumno(nombre));
                    }
                }
                case 2->{
                    System.out.println("Ingrese el número de cuenta del profesor");
                    long numCuenta = sc.nextLong();
                    if (profesores.containsKey(numCuenta)){
                        System.out.println("Ya existe este profesor");
                    }else{
                        System.out.println("Ingrese el nombre del profesor");
                        nombre = sc.next(); // Porque no usar nextLine()?
                        
                        System.out.println("Ingrese el grado académico del profesor");
                        String gradoProfesor = sc.next();
                        
                        System.out.println("Ingrese el correo del profesor");
                        String correo = sc.next();     
                        profesores.put(numCuenta, new Profesor(nombre, gradoProfesor, correo));
                    
                    }
                }
                case 3 -> {
                    System.out.println("Ingrese la clave de la asignatura");
                    clave = sc.nextInt();
                    if (asignaturas.containsKey(clave)){
                        System.out.println("Ya existe esta asignatura");
                    }else{
                        System.out.println("Ingrese el nombre de la asignatura");
                        nombre = sc.next();
                        
                        System.out.println("Ingrese el area de la asignatura");
                        String area = sc.next();
                        
                        System.out.println("Ingrese el semestre de la asignatura");
                        int semestre = sc.nextInt();
                        
                        asignaturas.put(clave, new Asignatura(nombre, area, semestre, clave));

                    }
                    break;
                }
                case 4 -> {
                    if(profesores.size() <= 0 || asignaturas.size() <= 0){
                        System.out.println("No hay profesores registrados o asignaturas registradas");
                    }
                    else{
                        System.out.println("Eliga un profesor");
                        Long[] profesoresKeys = profesores.keySet().toArray(new Long[profesores.size()]);
                        for(int i = 0; i < profesores.size(); i ++){
                            System.out.println("Profesor " + (i + 1) + ":");
                            profesores.get(profesoresKeys[i]);
                        }
                        opAux = sc.nextInt();
                        if (profesores.get(profesoresKeys[opAux - 1]).getGruposInscritos() < 5){
                            Integer[] asignaturasKeys = asignaturas.keySet().toArray(new Integer[asignaturas.size()]);
                            System.out.println("Eliga una asignatura");
                            for (int i = 0; i < asignaturas.size(); i++) {
                                System.out.println("Asignatura " + (i + 1) + ":");
                                asignaturas.get(asignaturasKeys[i]).printAsignatura();
                            }
                            opAux2 = sc.nextInt();
                            System.out.println("Ingrese la clave del grupo");
                            clave = sc.nextInt();

                            String claveGrupo = asignaturas.get(asignaturasKeys[opAux - 1]).getNombre() + Integer.toString(clave);

                            if(grupos.containsKey(claveGrupo)){
                                System.out.println("Ya existe este grupo");
                            }else{
                                System.out.println("Ingrese el horario de la asignatura");
                                //Calendar[] horario = funcionCrearHorario -> Horario [[dia1,horainicio1,horafin1],[dia2,horainicio2,horafin2],...,[dia n,horainicio n,horafin n]]
                                //grupos.put(claveGrupo, new Grupo( asignaturas.get(asignaturasKeys[opAux2 - 1]), clave, horario, profesores.get(profesoresKeys[opAux - 1])));
                                profesores.get(profesoresKeys[opAux - 1]).addClaveGrupo(claveGrupo);
                                asignaturas.get(asignaturasKeys[opAux2 - 1]).addClaveGrupo(claveGrupo);
                            }
                        }else{
                            System.out.println("Este profesor no puede dar más asignaturas");
                        }
                    }
                    break;
                }
                default ->{ System.out.println("Opción no válida"); break;}
                    
            }
        }while(op != 99);
    }
    
}
