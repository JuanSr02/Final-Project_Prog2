package Clases;
import Estructura.*;
   
public abstract class Propiedad {
    
/************************************
 * VARIABLES DE INSTANCIA *
 ***********************************/
    
    private Persona Propietario;
    private Hipoteca Hipoteca;
    private String Direccion;
    private double ValorDeTasacion;
    private int CantidadDeAmbientes;
    private double MetrosCuadradosCubiertos;
    private double MetrosCuadradosTotales;
    
/**********************************************************
* CONSTRUCTORES (CON Y SIN PARAMETROS) *
***********************************************************/
    
    public Propiedad() {}

    public Propiedad(Persona Propietario, Hipoteca Hipoteca, String Direccion, double ValorDeTasacion, int CantidadDeAmbientes, double MetrosCuadradosCubiertos, double MetrosCuadradosTotales) {
        this.Propietario = Propietario;
        this.Hipoteca = Hipoteca;
        this.Direccion = Direccion;
        this.ValorDeTasacion = ValorDeTasacion;
        this.CantidadDeAmbientes = CantidadDeAmbientes;
        this.MetrosCuadradosCubiertos = MetrosCuadradosCubiertos;
        this.MetrosCuadradosTotales = MetrosCuadradosTotales;
    }

/*************************************************
* METODOS DE INSTANCIA Y DE CLASE *
*************************************************/
    
    public Persona getPropietario() {
        return Propietario;
    }

    public Hipoteca getHipoteca() {
        return Hipoteca;
    }

    public String getDireccion() {
        return Direccion;
    }

    public double getValorDeTasacion() {
        return ValorDeTasacion;
    }

    public int getCantidadDeAmbientes() {
        return CantidadDeAmbientes;
    }

    public double getMetrosCuadradosCubiertos() {
        return MetrosCuadradosCubiertos;
    }

    public double getMetrosCuadradosTotales() {
        return MetrosCuadradosTotales;
    }

    public void setPropietario(Persona Propietario) {
        this.Propietario = Propietario;
    }

    public void setHipoteca(Hipoteca Hipoteca) {
        this.Hipoteca = Hipoteca;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setValorDeTasacion(double ValorDeTasacion) {
        this.ValorDeTasacion = ValorDeTasacion;
    }

    public void setCantidadDeAmbientes(int CantidadDeAmbientes) {
        this.CantidadDeAmbientes = CantidadDeAmbientes;
    }

    public void setMetrosCuadradosCubiertos(double MetrosCuadradosCubiertos) {
        this.MetrosCuadradosCubiertos = MetrosCuadradosCubiertos;
    }

    public void setMetrosCuadradosTotales(double MetrosCuadradosTotales) {
        this.MetrosCuadradosTotales = MetrosCuadradosTotales;
    }

    @Override
    public String toString() {
        return "Propiedad{" + "Propietario=" + Propietario + ", Hipoteca=" + Hipoteca + ", Direccion=" + Direccion + ", ValorDeTasacion=" + ValorDeTasacion + ", CantidadDeAmbientes=" + CantidadDeAmbientes + ", MetrosCuadradosCubiertos=" + MetrosCuadradosCubiertos + ", MetrosCuadradosTotales=" + MetrosCuadradosTotales + '}';
    }
    
    public static int TipoPropiedadMasHipotecada(){
        int x=Casa.getCantCasas(); int y=Departamento.getCantDepartamentos();
        if (x>y)
            return 1;
        if(x==y)
            return 2;
        else
            return 3;
    } // Item a
    
    public static double PromedioM2CubiertosCasasHipotecados(ArrayListPropiedad a){
        double prom=0,cant=0;
        for (Propiedad o : a){
            if (o.getClass()==Casa.class){
            prom=prom+o.getMetrosCuadradosCubiertos();
            cant++;
            }
        }
        prom=prom/cant;
        return prom;
    } // Item e
        public static double PromedioM2CubiertosDepartamentosHipotecados(ArrayListPropiedad a){
        double prom=0,cant=0;
        for (Propiedad o : a){
            if (o.getClass()==Departamento.class){
            prom=prom+o.getMetrosCuadradosCubiertos();
            cant++;
            }
        }
        prom=prom/cant;
        return prom;
    } // Item e
         public static double PromedioM2CubiertosPropiedadesHipotecados(ArrayListPropiedad a){
        double prom=0,cant=0;
        for (Propiedad o : a){
            prom=prom+o.getMetrosCuadradosCubiertos();
            cant++;
        }
        prom=prom/cant;
        return prom;
    } // Item e
    
  
}
