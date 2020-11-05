package proyecto.colecciones.en.java;

import java.io.IOException; 
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ProyectoColeccionesEnJava { 
    
    public static void main(String[] args) throws IOException {
        
        //Hashtable key = #cuenta, value = alumno || clave, asignatura
        HashMap<Long,Alumno> alumnos = new HashMap<>();
        HashMap<Long,Profesor> profesores = new HashMap<>();
        
        HashMap<Integer,Asignatura> asignaturas = new HashMap<>(); 
        HashMap<String, Grupo> grupos = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        
        int selector = 0;
        String nombre;
        String correo;
        String gradoAcademico;
        String area;
        int semestre;
        int clave;
        int opAux;
        int opAux2;
        //
        do{

            switch(selector){
               
                case 0->{
                
                    System.out.println("###  Menu Principal  ###");

                    System.out.println("Actualmente cuento con: ");
                    System.out.println("\t " + alumnos.size() + " alumnos");
                    System.out.println("\t " + profesores.size() + " profesores");
                    System.out.println("\t " + asignaturas.size() + " asignaturas");
                    System.out.println("\t " + grupos.size() + " grupos");
                    
                    System.out.println("\nIndicame por favor, sobre que entidad deseas trabajar?");
                    
                    String[] opciones = {"Alumnos", "Profesores", "Asignaturas", "Grupos", "Sácame de aqui"};
                    selector = Menu.menu(opciones);
                    
                }
                
                case 1->{
                    
                    System.out.println("\n** Alumnos ");
                    String[] subOpciones = {"Crear Alumno", "Mostrar Alumno", "Mostrar todos los Alumnos", "Volver"};
                    
                    int subSelector = Menu.menu(subOpciones);
                        
                    switch(subSelector){
                        case 1 ->{
                            System.out.println("\n* Creando Alumno");
                            System.out.println("Ingrese los siguientes datos");
                            System.out.print("\nNúmero de cuenta: ");
                            long numCuenta = sc.nextLong();
                            sc.nextLine();
                            
                            if(alumnos.containsKey(numCuenta)){
                                System.out.println("Lo siento, ya existe un alumno con ese número de cuenta");
                            }else{
                                System.out.print("Nombre completo: ");
                                nombre = sc.nextLine();
                                
                                Alumno nuevoAlumno = new Alumno(nombre);
                                
                                while(nuevoAlumno.getNombre() == null){
                                    System.out.print("Nombre completo: ");
                                    nombre = sc.nextLine();
                                }
                                
                                alumnos.put(numCuenta, nuevoAlumno);
                            }
                            
                            break;
                        }
                        
                        case 2 -> {
                            System.out.println("\n* Ingrese el número de cuenta del alumno");
                            long numCuenta =sc.nextLong();
                            sc.nextLine();
                            
                            if(alumnos.containsKey(numCuenta)){
                                alumnos.get(numCuenta).imprimeAlumno();
                                System.out.println("Clases");
                                String[] clases = alumnos.get(numCuenta).getClavesGrupos();
                                if (clases == null){
                                    System.out.println("Este alumno no esta inscrito a ningún grupo");
                                }else{
                                    for(String var : clases){
                                        grupos.get(var).printGrupo();
                                    }
                                }
                            }else{
                                System.out.println("Lo siento, no existe un alumno con ese número de cuenta");
                            }
                            break;
                        }
                        
                        case 3 -> {
                            if (alumnos.size() <= 0) {
                                System.out.println("No hay alumnos registrados");
                                continue;
                            }
                            //else
                            System.out.println("Alumnos");
                            Long[] alumnosKeys = alumnos.keySet().toArray(new Long[alumnos.size()]);
                            
                            for (int i = 0; i < alumnos.size(); i++) {
                                System.out.println("Alumno " + (i + 1) + ":");
                                System.out.println("\tNúmero de cuenta: " + alumnosKeys[i]);
                                alumnos.get(alumnosKeys[i]).imprimeAlumno();
                            }
                        }
                        
                        case 4 -> {
                            selector = 0;
                            break;
                        }
                        
                        default -> { System.out.println("Opción no válida"); break;} 
                    }
                        
                    break;
                }
                
                
                case 2 -> {
                    
                    System.out.println("\n** Profesores ");
                    String[] subOpciones = {"Crear Profesor", "Mostrar Profesor", "Mostrar todos los Profesores", "Volver"};
                    
                    int subSelector = Menu.menu(subOpciones);
                        
                    switch(subSelector){
                        case 1 ->{
                            System.out.println("\n* Creando Profesor");
                            System.out.println("Ingrese los siguientes datos");
                            System.out.print("\nNúmero de cuenta: ");
                            long numCuenta = sc.nextLong();
                            sc.nextLine();
                            
                            if(profesores.containsKey(numCuenta)){
                                System.out.println("Lo siento, ya existe un profesor con ese número de cuenta");
                            }else{
                                System.out.print("Nombre completo: ");
                                nombre = sc.nextLine();
                                
                                System.out.print("Correo: ");
                                correo = sc.nextLine();
                                
                                System.out.print("Grado académico: ");
                                gradoAcademico = sc.nextLine();
                                
                                Profesor nuevoProfesor = new Profesor(nombre, gradoAcademico, correo);
                                
                                while(nuevoProfesor.getNombre() == null){
                                    System.out.print("Nombre completo: ");
                                    nombre = sc.nextLine();
                                    nuevoProfesor.setNombre(nombre);
                                }
                                
                                while(nuevoProfesor.getCorreo() == null){
                                    System.out.print("Correo: ");
                                    correo = sc.nextLine();
                                    nuevoProfesor.setCorreo(correo);
                                }
                                
                                while(nuevoProfesor.getGradoAcademico() == null){
                                    System.out.print("Grado académico: ");
                                    gradoAcademico = sc.nextLine();
                                    nuevoProfesor.setGradoAcademico(gradoAcademico);
                                }
                                profesores.put(numCuenta, nuevoProfesor);
                            }
                            
                            break;
                        }
                        
                        case 2 -> {
                            System.out.println("\n* Ingrese el número de cuenta del profesor");
                            long numCuenta =sc.nextLong();
                            sc.nextLine();
                            
                            if(profesores.containsKey(numCuenta)){
                                profesores.get(numCuenta).imprimeProfesor();
                                System.out.println("Grupos ");
                                List<String> clases = profesores.get(numCuenta).getClavesGrupos();
                                if (clases == null){
                                    System.out.println("Este profesor no tiene grupos");
                                }else{
                                    for(String var : clases){
                                        grupos.get(var).printGrupo();
                                    }
                                }
                            }else{
                                System.out.println("Lo siento, no existe un profesor con ese número de cuenta");
                            }
                            break;
                        }
                        
                        case 3 -> {
                            if (profesores.size() <= 0) {
                                System.out.println("No hay profesores registrados");
                                continue;
                            }
                            //else
                            System.out.println("Profesores");
                            Long[] profesoresKeys = profesores.keySet().toArray(new Long[profesores.size()]);
                            
                            for (int i = 0; i < profesores.size(); i++) {
                                System.out.println("Profesor " + (i + 1) + ":");
                                System.out.println("\tNúmero de cuenta: " + profesoresKeys[i]);
                                profesores.get(profesoresKeys[i]).imprimeProfesor();
                            }
                        }
                        
                        case 4 -> {
                            selector = 0;
                            break;
                        }
                        
                        default -> { System.out.println("Opción no válida"); break;} 
                    }
                        
                    break;
                }
                
                case 3 -> {
                    
                    System.out.println("\n** Asignaturas ");
                    String[] subOpciones = {"Crear Asignatura", "Mostrar Asignatura", "Mostrar todas las Asignaturas", "Volver"};
                    
                    int subSelector = Menu.menu(subOpciones);
                        
                    switch(subSelector){
                        case 1 ->{
                            
                            System.out.println("\n* Creando Asignatura");
                            System.out.println("Ingrese los siguientes datos");
                            System.out.print("\nClave de asignatura: ");
                            clave = sc.nextInt();
                            sc.nextLine();
                            
                            if(asignaturas.containsKey(clave)){
                                System.out.println("Lo siento, ya existe una asignatura con esta clave");
                            }else{
                                System.out.print("Nombre: ");
                                nombre = sc.nextLine();
                                
                                System.out.print("Area: ");
                                area = sc.nextLine();
                                
                                System.out.print("Semestre: ");
                                semestre = sc.nextInt();
                                sc.nextLine();
                                
                                Asignatura nuevaAsignatura = new Asignatura(nombre, area, semestre);
                                
                                while(nuevaAsignatura.getNombre() == null){
                                    System.out.print("Nombre: ");
                                    nombre = sc.nextLine();
                                    nuevaAsignatura.setNombre(nombre);
                                }
                                
                                while(nuevaAsignatura.getArea() == null){
                                    System.out.print("Area: ");
                                    area = sc.nextLine();
                                    nuevaAsignatura.setArea(area);
                                }
                                
                                while(nuevaAsignatura.getSemestre() == 0){
                                    System.out.print("Semestre: ");
                                    semestre = sc.nextInt();
                                    sc.nextLine();
                                    nuevaAsignatura.setSemestre(semestre);
                                }
                                asignaturas.put(clave, nuevaAsignatura);
                            }
                            
                            break;
                        }
                        
                        case 2 -> {
                            System.out.println("\n* Ingrese la clave de la asignatura");
                            clave = sc.nextInt();
                            sc.nextLine();
                            
                            if(asignaturas.containsKey(clave)){
                                asignaturas.get(clave).printAsignatura();
                                List<String> clases = asignaturas.get(clave).getClavesGrupos();
                                if (clases == null){
                                    System.out.println("Esta asignatura no tiene grupos");
                                }else{
                                    for(String var : clases){
                                        grupos.get(var).printGrupo();
                                    }
                                }
                            }else{
                                System.out.println("Lo siento, no existe una asignatura con esta clave");
                            }
                            break;
                        }
                        
                        case 3 -> {
                            if (asignaturas.size() <= 0) {
                                System.out.println("No hay asignaturas registradas");
                                continue;
                            }
                            //else
                            Integer[] asignaturasKeys = asignaturas.keySet().toArray(new Integer[asignaturas.size()]);
                            System.out.println("Asignaturas");
                            for (int i = 0; i < asignaturas.size(); i++) {
                                System.out.println("Asignatura " + (i + 1) + ":");
                                System.out.println("\tClave: " + asignaturasKeys[i]);
                                asignaturas.get(asignaturasKeys[i]).printAsignatura();
                            }
                        }
                        
                        case 4 -> {
                            selector = 0;
                            break;
                        }
                        
                        default -> { System.out.println("Opción no válida"); break;} 
                    }
                        
                    break;
                }
                
                case 4 -> {

                    System.out.println("\n** Grupos ");
                    String[] subOpciones = {"Crear Grupo", "Mostrar Grupo", "Añadir alumno a Grupo", "Volver"};

                    int subSelector = Menu.menu(subOpciones);
                    
                    
                    switch (subSelector) {
                        case 1 -> {

                            System.out.println("\n* Creando Grupo");
                            if (profesores.size() <= 0 || asignaturas.size() <= 0) {
                                System.out.println("No hay profesores registrados o asignaturas registradas");
                                continue;
                            }
                            //else
                            System.out.println("Elija un profesor");
                            Long[] profesoresKeys = profesores.keySet().toArray(new Long[profesores.size()]);
                            
                            for (int i = 0; i < profesores.size(); i++) {
                                System.out.println("Profesor " + (i + 1) + ":");
                                profesores.get(profesoresKeys[i]).imprimeProfesor();
                            }
                            opAux = sc.nextInt();
                            sc.nextLine();
                            
                            if(profesores.containsKey(profesoresKeys[opAux - 1]) == false){
                                System.out.println("Elegiste una opción inválida");
                                continue;
                            }
                            
                            Integer[] asignaturasKeys = asignaturas.keySet().toArray(new Integer[asignaturas.size()]);
                            System.out.println("Elija una asignatura");
                            for (int i = 0; i < asignaturas.size(); i++) {
                                System.out.println("Asignatura " + (i + 1) + ":");
                                asignaturas.get(asignaturasKeys[i]).printAsignatura();
                            }
                            opAux2 = sc.nextInt();
                            sc.nextLine();
                            
                            if(asignaturas.containsKey(asignaturasKeys[opAux2 - 1]) == false){
                                System.out.println("Elegiste una opción inválida");
                                continue;
                            }
                            //else
                            System.out.println("Ingrese la clave del grupo");
                            String claveGrupo = sc.nextLine();
                            //Clave grupo = nombre asignatura + clave de grupo;
                            claveGrupo = asignaturas.get(asignaturasKeys[opAux2 - 1]).getNombre() + claveGrupo;
                            
                            if (grupos.containsKey(claveGrupo)) {
                                System.out.println("Ya existe este grupo");
                            } else {
                                grupos.put(claveGrupo, new Grupo(asignaturas.get(asignaturasKeys[opAux2 - 1]), claveGrupo, profesores.get(profesoresKeys[opAux - 1])));
                                profesores.get(profesoresKeys[opAux - 1]).addClaveGrupo(claveGrupo);
                                asignaturas.get(asignaturasKeys[opAux2 - 1]).addClaveGrupo(claveGrupo);
                            }
                            
                            break;
                        }

                        case 2 -> {
                            System.out.println("\n* Mostrar Grupo");
                            if (grupos.size() <= 0 ) {
                                System.out.println("No hay grupos registrados");
                                continue;
                            }
                            
                            String[] gruposKeys = grupos.keySet().toArray(new String[grupos.size()]);
                            System.out.println("Elija un grupo");
                            for (int i = 0; i < grupos.size(); i++) {
                                System.out.println("Grupo " + (i + 1) + ":");
                                grupos.get(gruposKeys[i]).printGrupo();
                            }
                            
                            opAux = sc.nextInt();
                            sc.nextLine();
                            
                            if (grupos.containsKey(gruposKeys[opAux - 1]) == false) {
                                System.out.println("No existe este grupo");
                            } else {
                                grupos.get(gruposKeys[opAux - 1]).imprimirListaGrupo(alumnos);
                            }
                            
                            break;
                        }

                        case 3 -> {
                            System.out.println("\n* Editar grupos");
                            if (grupos.size() <= 0 ) {
                                System.out.println("No hay grupos registrados");
                                continue;
                            }
                            
                            String[] gruposKeys = grupos.keySet().toArray(new String[grupos.size()]);
                            System.out.println("Elija un grupo");
                            for (int i = 0; i < grupos.size(); i++) {
                                System.out.println("Grupo " + (i + 1) + ":");
                                grupos.get(gruposKeys[i]).printGrupo();
                            }
                            
                            opAux = sc.nextInt();
                            sc.nextLine();
                            
                            if (grupos.containsKey(gruposKeys[opAux - 1]) == false) {
                                System.out.println("No existe este grupo");
                            } else {
                                //Añadir alumno a grupo
                            }
                            
                            break;
                        }

                        case 4 -> {
                            selector = 0;
                        }

                        default -> {
                            System.out.println("Opción no válida");
                            break;
                        }
                    }

                    break;
                }
                
                default ->{ System.out.println("Opción no válida"); break;}

                }
            
        }while(selector != 5);
    }
    
}