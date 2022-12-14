package Clases;
public class Persona {
    
/************************************
 * VARIABLES DE INSTANCIA *
 ***********************************/
    
    private int DNI;
    private String Nombre;
    private String Apellido;
    private long Telefono;
    private String CorreoElectronico;
    private int CUIT;
    private double IngresosMensuales;
    
/**********************************************************
* CONSTRUCTORES (CON Y SIN PARAMETROS) *
***********************************************************/
    
    public Persona(){}
    
    public Persona(int DNI, String Nombre, String Apellido, long Telefono, String CorreoElectronico, int CUIT, double IngresosMensuales) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.CorreoElectronico = CorreoElectronico;
        this.CUIT = CUIT;
        this.IngresosMensuales = IngresosMensuales;
    }
    
/*************************************************
* METODOS DE INSTANCIA Y DE CLASE *
*************************************************/
    
    public int getDNI() {
        return DNI;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public long getTelefono() {
        return Telefono;
    }
    public String getCorreoElectronico() {
        return CorreoElectronico;
    }
    public int getCUIT() {
        return CUIT;
    }
    public double getIngresosMensuales() {
        return IngresosMensuales;
    }
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    public void setTelefono(long Telefono) {
        this.Telefono = Telefono;
    }
    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }
    public void setCUIT(int CUIT) {
        this.CUIT = CUIT;
    }
    public void setIngresosMensuales(double IngresosMensuales) {
        this.IngresosMensuales = IngresosMensuales;
    }
    @Override
    public String toString() {
        return "Persona{" + "DNI=" + DNI + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Telefono=" + Telefono + ", CorreoElectronico=" + CorreoElectronico + ", CUIT=" + CUIT + ", IngresosMensuales=" + IngresosMensuales + '}';
    }
    
    public static void Listado10PersonasConPrestamosVigentesMasCortosEnCuotas(){} // Item b
    public static void Listado10PersonasConPrestamosNoVigentesMasLargosEnCuotas(){} // Item c
    public static void ListadoPersonasConHipotecasActivas(){} // Item f
}
