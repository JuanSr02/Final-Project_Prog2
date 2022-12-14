package Interfaces;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

// ESTA CLASE UNICAMENTE ES PARA AVISAR QUE CUANDO SALIMOS POR LA OPCION DE X DE LA VENTANA NO GUARDAREMOS EN EL ARCHIVO.

public class ManejadorVentanaCerrada implements WindowListener{
    private JFrame ventana;
    public ManejadorVentanaCerrada(JFrame ventana) {
        this.ventana = ventana;
    }    
    @Override
    public void windowClosing(WindowEvent e) {
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea cerrar el programa?\nPerderá toda la informacion guardada,\npara conservarlo salga del programa apropiadamente", "Confirmar acción", JOptionPane.YES_NO_OPTION) ==0){
            System.exit(1);}
    }
    @Override
    public void windowOpened(WindowEvent e) {}
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}
}
