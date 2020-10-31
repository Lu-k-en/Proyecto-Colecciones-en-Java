public class Alumno {
    private String Nombre;
    private long numeroCuenta;
    private String[] clavesGrupos = new String[3];
    
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
    
    public void setClavesGrupos(String [] clavesGrupos) { 
        this.clavesGrupos = clavesGrupos;
    }
}
