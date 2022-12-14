package Clases;

public class Departamento extends Propiedad{
    
    /* **************************************************
    * VARIABLES DE INSTANCIA Y DE CLASE *
    **************************************************/
    
    private int Piso;
    private String ID;
    private static int CantDepartamentos=0; // Variable de CLASE que llevara la cuenta de la cantidad de departamentos (es usada en algunos metodos)
    
    /***********************************************************
    * CONSTRUCTORES (CON Y SIN PARAMETROS) *
    ***********************************************************/

    public Departamento() {
        CantDepartamentos++;
    }

    public Departamento(int Piso, String ID, Persona Propietario, Clases.Hipoteca Hipoteca, String Direccion, double ValorDeTasacion, int CantidadDeAmbientes, double MetrosCuadradosCubiertos, double MetrosCuadradosTotales) {
        super(Propietario, Hipoteca, Direccion, ValorDeTasacion, CantidadDeAmbientes, MetrosCuadradosCubiertos, MetrosCuadradosTotales);
        this.Piso = Piso;
        this.ID = ID;
        CantDepartamentos++;
    }
    
  /*************************************************
   * METODOS DE INSTANCIA Y DE CLASE *
   *************************************************/

    public int getPiso() {
        return Piso;
    }

    public String getID() {
        return ID;
    }

    public void setPiso(int Piso) {
        this.Piso = Piso;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public static int getCantDepartamentos() {
        return CantDepartamentos;
    }

    public static void setCantDepartamentos(int CantDepartamentos) {
        Departamento.CantDepartamentos = CantDepartamentos;
    }

    @Override
    public String toString() {
        return super.toString() + "Departamento{" + "Piso=" + Piso + ", ID=" + ID + '}';
    }
}
