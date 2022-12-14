package Clases;

public class Casa extends Propiedad {
    
 /***************************************************
    * VARIABLES DE INSTANCIA Y DE CLASE *
    **************************************************/
    private int AntiguedadDeConstruccion;
    private static int CantCasas=0; // Variable de CLASE que llevara la cuenta de la cantidad de casas (es usada en algunos metodos)

    /**************************************************************
    * CONSTRUCTORES (CON Y SIN PARAMETROS) *
    ***************************************************************/
    
    public Casa() {
        CantCasas++;
    }
    
    public Casa(int AntiguedadDeConstruccion, Persona Propietario, Hipoteca Hipoteca, String Direccion, double ValorDeTasacion, int CantidadDeAmbientes, double MetrosCuadradosCubiertos, double MetrosCuadradosTotales) {
        super(Propietario, Hipoteca, Direccion, ValorDeTasacion, CantidadDeAmbientes, MetrosCuadradosCubiertos, MetrosCuadradosTotales);
        this.AntiguedadDeConstruccion = AntiguedadDeConstruccion;
        CantCasas++;
    }
    
    /****************************************************
     * METODOS DE INSTANCIA Y DE CLASE *
     ****************************************************/

    public int getAntiguedadDeConstruccion() {
        return AntiguedadDeConstruccion;
    }

    public void setAntiguedadDeConstruccion(int AntiguedadDeConstruccion) {
        this.AntiguedadDeConstruccion = AntiguedadDeConstruccion;
    }

    public static int getCantCasas() {
        return CantCasas;
    }

    public static void setCantCasas(int CantCasas) {
        Casa.CantCasas = CantCasas;
    }

    @Override
    public String toString() {
        return super.toString() + "Casa{" + "AntiguedadDeConstruccion=" + AntiguedadDeConstruccion + '}';
    }
}
