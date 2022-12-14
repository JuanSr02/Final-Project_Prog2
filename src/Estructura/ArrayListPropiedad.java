package Estructura;
import Clases.*;
import java.util.*;
import java.io.*;

public class ArrayListPropiedad extends ArrayList<Propiedad> { 
// ESTA CLASE LA HICE PARA PODER IMPLEMENTAR ALGUNOS METODOS Y PODER BUSCAR ENTRE TODAS LAS PROPIEDADES CARGADAS FACILMENTE
    
/**********************************************************
* CONSTRUCTORES (CON Y SIN PARAMETROS) *
***********************************************************/
    
    public ArrayListPropiedad(int CapacidadInicial) {
        super(CapacidadInicial);
    }

    public ArrayListPropiedad() {}
    
/*********************************
* METODOS DE INSTANCIA *
**********************************/

   public Propiedad buscarPropiedadPorIDDeHipoteca(String ID) {
    //Retorna una propiedad si se encuentra en la lista
    //Retorna NULL si no es encontrada   
        Iterator<Propiedad> iteratorA = this.iterator();
        boolean encontrado = false;
        Propiedad auxiliar = null;
        Propiedad temporal;
        while (iteratorA.hasNext()) {
            temporal = iteratorA.next();
            if (temporal.getHipoteca().getID().equals(ID)) {
                encontrado = true;
                auxiliar = temporal;
                break;
            }
        }
        if (encontrado)
            return auxiliar;
        else
            return null;
    }
   
  public Propiedad buscarPropiedadPorDNIPropietario(int DNI) {
        //Retorna una propiedad si se encuentra en la lista
        //Retorna NULL si no es encontrada
        Iterator<Propiedad> iteratorA = this.iterator();
        boolean encontrado = false;
        Propiedad auxiliar = null;
        Propiedad temporal;
        while (iteratorA.hasNext()) {
            temporal = iteratorA.next();
            if (temporal.getPropietario().getDNI()==DNI) {
                encontrado = true;
                auxiliar = temporal;
                break;
            }
        }
        if (encontrado)
            return auxiliar;
        else
            return null;
    }
   public Propiedad buscarPropiedadPorDireccion(String Dire) {
    //Retorna una propiedad si se encuentra en la lista
    //Retorna NULL si no es encontrada   
        Iterator<Propiedad> iteratorA = this.iterator();
        boolean encontrado = false;
        Propiedad auxiliar = null;
        Propiedad temporal;
        while (iteratorA.hasNext()) {
            temporal = iteratorA.next();
            if (temporal.getDireccion().equals(Dire)) {
                encontrado = true;
                auxiliar = temporal;
                break;
            }
        }
        if (encontrado)
            return auxiliar;
        else
            return null;
    }
  
     public int indexOfPropiedad(Propiedad Prop) {
        //Funcion para obtener el indice de un objeto pasado por parametro en una lista
        Iterator<Propiedad> iteradorLista = this.iterator();
        Propiedad auxiliar = null;    //para almacenar los elementos del iterator
        int encontrado = -1; //se almacena la salida
         while (iteradorLista.hasNext()) {
            auxiliar = iteradorLista.next();
            if (Prop==auxiliar)
                encontrado = this.indexOf(auxiliar);    //si se encuentra en la lista, se busca el indice en la misma lista
        }
        return encontrado;
    }
     public void CargarDesdeArchivo() throws IOException, NumberFormatException{
         // Funcion para cargar desde el archivo propiedades.
        File archivo=new File("Carga.txt");
        FileReader archivoReader= new FileReader(archivo);
        BufferedReader archivoBuffered = new BufferedReader(archivoReader);

        /*
        El archivo a leer debe tener los datos puestos en el siguiente orden:
            -CASA O DEPARTAMENTO
            -DNI
            -NOMBRE
            -APELLIDO
            -TELEFONO
            -CORREOELECTRONICO
            -CUIT
            -INGRESOSMENSUALES
            -CAPITAL
            -INTERES MENSUAL
            -FECHA INICIO
            -FECHA FINAL
            -IMPORTE CUOTA MENSUAL
            -ID
            -DIRECCION
            -VALOR DE TASACION
            -CANTIDAD DE AMBIENTES
            -METROS CUADRADOS CUBIERTOS
            -METROS CUADRADOS TOTALES
            -ANTIGUEDAD / PISO
            -ID
        */

        while (archivoBuffered.ready()) {
            String tipo=archivoBuffered.readLine();
            if(tipo!=null)
            {
                int DNI=new Integer(archivoBuffered.readLine());
                String nombre = archivoBuffered.readLine();
                String apellido = archivoBuffered.readLine();
                long telefono = new Long(archivoBuffered.readLine());
                String correo = archivoBuffered.readLine();
                int CUIT = new Integer(archivoBuffered.readLine());
                Double IngresosMensuales = new Double(archivoBuffered.readLine());
                Persona aux=new Persona(DNI,nombre,apellido,telefono,correo,CUIT,IngresosMensuales);
                Double Capital = new Double(archivoBuffered.readLine());
                Double InteresMensual = new Double(archivoBuffered.readLine());
                String fechaInicio = archivoBuffered.readLine();
                String fechaFin = archivoBuffered.readLine(); 
                Double ImporteCuotaMensual = new Double(archivoBuffered.readLine());
                String ID = archivoBuffered.readLine();
                Hipoteca aux2=new Hipoteca(Capital,InteresMensual,fechaInicio,fechaFin,ImporteCuotaMensual,ID);
                String Direccion = archivoBuffered.readLine();
                Double ValorDeTasacion =new Double(archivoBuffered.readLine());
                int CantDeAmbientes= new Integer(archivoBuffered.readLine());
                Double M2Cubiertos =new Double(archivoBuffered.readLine());
                Double M2Totales =new Double(archivoBuffered.readLine());
                if (tipo.equals("Casa")){
                     int Antiguedad= new Integer(archivoBuffered.readLine());
                     Propiedad aux3=new Casa(Antiguedad,aux,aux2,Direccion,ValorDeTasacion,CantDeAmbientes,M2Cubiertos,M2Totales);
                     this.add(aux3);
                }
                else{
                    int Piso= new Integer(archivoBuffered.readLine());
                    String ID2= archivoBuffered.readLine();
                     Propiedad aux4=new Departamento(Piso,ID2,aux,aux2,Direccion,ValorDeTasacion,CantDeAmbientes,M2Cubiertos,M2Totales);
                     this.add(aux4);
                }
            }
            else 
                break;
        }
        archivoBuffered.close();      
     }
 
     public void GuardarEnArchivoTxt() throws IOException{
         // Funcion para guardar en el archivo todas las propiedades que haya en el arraylist
          /*
        El archivo va a guardar los datos en el siguiente orden:
            -CASA O DEPARTAMENTO
            -DNI
            -NOMBRE
            -APELLIDO
            -TELEFONO
            -CORREOELECTRONICO
            -CUIT
            -INGRESOSMENSUALES
            -CAPITAL
            -INTERES MENSUAL
            -FECHA INICIO
            -FECHA FINAL
            -IMPORTE CUOTA MENSUAL
            -ID
            -DIRECCION
            -VALOR DE TASACION
            -CANTIDAD DE AMBIENTES
            -METROS CUADRADOS CUBIERTOS
            -METROS CUADRADOS TOTALES
            -ANTIGUEDAD / PISO
            -ID
        */
          
         File archivo = new File("Carga.txt"); String x;
        FileWriter archivoWriter = new FileWriter(archivo);
        BufferedWriter buffer = new BufferedWriter(archivoWriter);
        for (Propiedad p:this){
            if (p.getClass()==Casa.class){
               Casa p1=(Casa)p;
               buffer.append("Casa"+"\n");
               buffer.flush();
               buffer.append(Integer.toString(p1.getPropietario().getDNI())+"\n");
               buffer.flush();
               buffer.append(p1.getPropietario().getNombre()+"\n");
               buffer.flush();
               buffer.append(p1.getPropietario().getApellido()+"\n");
               buffer.flush();
               buffer.append(Long.toString(p1.getPropietario().getTelefono())+"\n");
               buffer.flush();
               buffer.append(p1.getPropietario().getCorreoElectronico()+"\n");
               buffer.flush();
               buffer.append(Integer.toString(p1.getPropietario().getCUIT())+"\n");
               buffer.flush();
               buffer.append(Double.toString(p1.getPropietario().getIngresosMensuales())+"\n");
               buffer.flush();
               buffer.append(Double.toString(p1.getHipoteca().getCapital())+"\n");
               buffer.flush();
               buffer.append(Double.toString(p1.getHipoteca().getInteresMensual())+"\n");
               buffer.flush();
               buffer.append(p1.getHipoteca().getFechaInicio()+"\n");
               buffer.flush();
               buffer.append(p1.getHipoteca().getFechaFinal()+"\n");
               buffer.flush();
               buffer.append(Double.toString(p1.getHipoteca().getImporteCuotaMensual())+"\n");
               buffer.flush();
               buffer.append(p1.getHipoteca().getID()+"\n");
               buffer.flush();
               buffer.append(p1.getDireccion()+"\n");
               buffer.flush();
               buffer.append(Double.toString(p1.getValorDeTasacion())+"\n");
               buffer.flush();
               buffer.append(Integer.toString(p1.getCantidadDeAmbientes())+"\n");
               buffer.flush();
               buffer.append(Double.toString(p1.getMetrosCuadradosCubiertos())+"\n");
               buffer.flush();
               buffer.append(Double.toString(p1.getMetrosCuadradosTotales())+"\n");
               buffer.flush();
               buffer.append(Integer.toString(p1.getAntiguedadDeConstruccion())+"\n");
               buffer.flush();
        }
            else{
               Departamento p2=(Departamento)p;
               buffer.append("Departamento"+"\n");
               buffer.flush();
               buffer.append(Integer.toString(p2.getPropietario().getDNI())+"\n");
               buffer.flush();
               buffer.append(p2.getPropietario().getNombre()+"\n");
               buffer.flush();
               buffer.append(p2.getPropietario().getApellido()+"\n");
               buffer.flush();
               buffer.append(Long.toString(p2.getPropietario().getTelefono())+"\n");
               buffer.flush();
               buffer.append(p2.getPropietario().getCorreoElectronico()+"\n");
               buffer.flush();
               buffer.append(Integer.toString(p2.getPropietario().getCUIT())+"\n");
               buffer.flush();
               buffer.append(Double.toString(p2.getPropietario().getIngresosMensuales())+"\n");
               buffer.flush();
               buffer.append(Double.toString(p2.getHipoteca().getCapital())+"\n");
               buffer.flush();
               buffer.append(Double.toString(p2.getHipoteca().getInteresMensual())+"\n");
               buffer.flush();
               buffer.append(p2.getHipoteca().getFechaInicio()+"\n");
               buffer.flush();
               buffer.append(p2.getHipoteca().getFechaFinal()+"\n");
               buffer.flush();
               buffer.append(Double.toString(p2.getHipoteca().getImporteCuotaMensual())+"\n");
               buffer.flush();
               buffer.append(p2.getHipoteca().getID()+"\n");
               buffer.flush();
               buffer.append(p2.getDireccion()+"\n");
               buffer.flush();
               buffer.append(Double.toString(p2.getValorDeTasacion())+"\n");
               buffer.flush();
               buffer.append(Integer.toString(p2.getCantidadDeAmbientes())+"\n");
               buffer.flush();
               buffer.append(Double.toString(p2.getMetrosCuadradosCubiertos())+"\n");
               buffer.flush();
               buffer.append(Double.toString(p2.getMetrosCuadradosTotales())+"\n");
               buffer.flush();
               buffer.append(Integer.toString(p2.getPiso())+"\n");
               buffer.flush();
               buffer.append(p2.getID()+"\n");
               buffer.flush();
            }
        }
        buffer.close();
     }
}
