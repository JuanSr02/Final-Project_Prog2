package Clases;

import Estructura.ArrayListPropiedad;

public class Hipoteca {
    
   /*************************************
     * VARIABLES DE INSTANCIA *
     ************************************/
    
    private double Capital;
    private double InteresMensual;
    private String FechaInicio;
    private String FechaFinal;
    private double ImporteCuotaMensual;
    private String ID;
    
   /*************************************************************
     * CONSTRUCTORES (CON Y SIN PARAMETROS) *
     ************************************************************/
    
    public Hipoteca() {}
    
    public Hipoteca(double Capital, double InteresMensual, String FechaInicio, String FechaFinal, double ImporteCuotaMensual,String ID) {
        this.Capital = Capital;
        this.InteresMensual = InteresMensual;
        this.FechaInicio = FechaInicio;
        this.FechaFinal = FechaFinal;
        this.ImporteCuotaMensual = ImporteCuotaMensual;
        this.ID=ID;
    }
    
   /***************************************************
     * METODOS DE INSTANCIA Y DE CLASE *
     **************************************************/
    
    public double getCapital() {
        return Capital;
    }
    public double getInteresMensual() {
        return InteresMensual;
    }
    public String getFechaInicio() {
        return FechaInicio;
    }
    public String getFechaFinal() {
        return FechaFinal;
    }
    public double getImporteCuotaMensual() {
        return ImporteCuotaMensual;
    }
    public String getID() {
        return ID;
    }
    public void setCapital(double Capital) {
        this.Capital = Capital;
    }
    public void setInteresMensual(double InteresMensual) {
        this.InteresMensual = InteresMensual;
    }
    public void setFechaInicio(String FechaInicio) {
        this.FechaInicio = FechaInicio;
    }
    public void setFechaFinal(String FechaFinal) {
        this.FechaFinal = FechaFinal;
    }
    public void setImporteCuotaMensual(double ImporteCuotaMensual) {
        this.ImporteCuotaMensual = ImporteCuotaMensual;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Hipoteca{" + "Capital=" + Capital + ", InteresMensual=" + InteresMensual + ", FechaInicio=" + FechaInicio + ", FechaFinal=" + FechaFinal + ", ImporteCuotaMensual=" + ImporteCuotaMensual + ", ID=" + ID + '}';
    }
  
    public static Propiedad PrestamoDeMayor(ArrayListPropiedad a){
        int x=0;double m=0;
        for (Propiedad o:a){
            if (o.getHipoteca().getCapital()>m){
                x=a.indexOf(o);
                m=o.getHipoteca().getCapital();
            }
        }
        return a.get(x);
    } // Item d
    public static Propiedad PrestamoDeMenor(ArrayListPropiedad a){
        int x=0;double m=a.get(x).getHipoteca().getCapital();
        for (Propiedad o:a){
            if (o.getHipoteca().getCapital()<m){
                x=a.indexOf(o);
                m=o.getHipoteca().getCapital();
            }
        }
        return a.get(x);
    } // Item d
}
