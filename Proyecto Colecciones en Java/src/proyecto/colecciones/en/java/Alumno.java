package proyecto.colecciones.en.java;

public class Alumno {
    private String Nombre;
    private long numeroCuenta;
    private int gruposInscritos = 0;
    private String[] clavesGrupos = new String[3];
    private static int numAlumnos=0;
    
    public Alumno (String Nombre, long numeroCuenta){
        numAlumnos++;
        setNombre(Nombre);
        setNumeroCuenta(numeroCuenta);
    }
    
    public String getNombre() {
        return Nombre;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public long getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
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
        System.out.println("Nombre del Alumno: "+getNombre());
        System.out.println("Número de Cuenta: "+getNumeroCuenta());
    }
    
    public void imprimeClavesGrupos(){
        if(clavesGrupos == null || clavesGrupos.length == 0){  
            System.out.println("No está inscrito a ninguna Asigantura");
        } else { 
            System.out.println("Las Claves de las Asignaturas a las que está inscrito: ");
            for (String i: clavesGrupos) {
                System.out.println(" - "+i);
            }
        }
    }
    
    public void addClaveGrupos(String ClaveGrupo){
        this.clavesGrupos[gruposInscritos] = ClaveGrupo;
        gruposInscritos++;
    }
}
