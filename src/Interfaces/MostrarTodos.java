package Interfaces;
import Clases.Casa;
import Clases.Departamento;
import Clases.Propiedad;
import Estructura.ArrayListPropiedad;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MostrarTodos extends javax.swing.JPanel {
    private ProgramaPrincipal Principal;
    private ArrayListPropiedad Propiedades;
    
    public MostrarTodos(ArrayListPropiedad Propiedades,ProgramaPrincipal Principal) {
        initComponents();
        this.Propiedades=Propiedades;
        this.Principal=Principal;
        LlenadoTabla();
    }
     public ArrayListPropiedad getPropiedades() {
        return Propiedades;
    }

    public void setPropiedades(ArrayListPropiedad Propiedades) {
        this.Propiedades = Propiedades;
    }
     public ProgramaPrincipal getPrincipal() {
        return Principal;
    }

    public void setPrincipal(ProgramaPrincipal Principal) {
        this.Principal=Principal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MostrarPanel = new javax.swing.JPanel();
        Arriba3 = new javax.swing.JPanel();
        Titulo3 = new javax.swing.JLabel();
        Regresar2 = new javax.swing.JButton();
        LogoFacu = new javax.swing.JLabel();
        Salir3 = new javax.swing.JButton();
        ScrollMostrar = new javax.swing.JScrollPane();
        Mostrar = new javax.swing.JTable();

        MostrarPanel.setBackground(new java.awt.Color(255, 204, 204));

        Arriba3.setBackground(new java.awt.Color(153, 0, 51));

        Titulo3.setBackground(new java.awt.Color(255, 255, 255));
        Titulo3.setFont(new java.awt.Font("Arial", 3, 28)); // NOI18N
        Titulo3.setForeground(new java.awt.Color(255, 255, 255));
        Titulo3.setText("Propiedades Cargadas");
        Titulo3.setToolTipText("");

        Regresar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        Regresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Regresar2ActionPerformed(evt);
            }
        });

        LogoFacu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoFacultad.png"))); // NOI18N

        javax.swing.GroupLayout Arriba3Layout = new javax.swing.GroupLayout(Arriba3);
        Arriba3.setLayout(Arriba3Layout);
        Arriba3Layout.setHorizontalGroup(
            Arriba3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Arriba3Layout.createSequentialGroup()
                .addComponent(Regresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(Titulo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoFacu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Arriba3Layout.setVerticalGroup(
            Arriba3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Arriba3Layout.createSequentialGroup()
                .addGroup(Arriba3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Regresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoFacu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Salir3.setBackground(new java.awt.Color(255, 0, 0));
        Salir3.setText("Salir");
        Salir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir3ActionPerformed(evt);
            }
        });

        Mostrar = new javax.swing.JTable(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        Mostrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Mostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Direccion", "Valor de Tasacion", "Cant. de Ambientes", "M2 Cubiertos", "M2 Totales", "Antiguedad", "Piso", "ID"
            }
        ));
        Mostrar.setFocusable(false);
        Mostrar.getTableHeader().setReorderingAllowed(false);
        ScrollMostrar.setViewportView(Mostrar);

        javax.swing.GroupLayout MostrarPanelLayout = new javax.swing.GroupLayout(MostrarPanel);
        MostrarPanel.setLayout(MostrarPanelLayout);
        MostrarPanelLayout.setHorizontalGroup(
            MostrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Arriba3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MostrarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MostrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MostrarPanelLayout.createSequentialGroup()
                        .addGap(0, 676, Short.MAX_VALUE)
                        .addComponent(Salir3))
                    .addComponent(ScrollMostrar))
                .addContainerGap())
        );
        MostrarPanelLayout.setVerticalGroup(
            MostrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MostrarPanelLayout.createSequentialGroup()
                .addComponent(Arriba3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Salir3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MostrarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MostrarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Regresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Regresar2ActionPerformed
        PanelAdmPropiedades p3=new PanelAdmPropiedades(Propiedades,this.Principal);
        try {
                    this.finalize();
                    } catch (Throwable ex) {}
        this.setVisible(false);
        this.Principal.setSize(767,808);
        this.Principal.setContentPane(p3);
    }//GEN-LAST:event_Regresar2ActionPerformed

    private void Salir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir3ActionPerformed
        Salir();
    }//GEN-LAST:event_Salir3ActionPerformed
public void Salir(){
     try{
         Propiedades.GuardarEnArchivoTxt();}
     catch(IOException e){
         JOptionPane.showMessageDialog(null,"Error guardando los archivos \n"+e.toString(),"Error",JOptionPane.ERROR_MESSAGE);}
        System.exit(1);
}
public void LlenadoTabla(){
 DefaultTableModel modelo= new javax.swing.table.DefaultTableModel(
            new Object [][] {
            
            },
            new String [] {
                "Direccion", "Valor de Tasacion", "Cant. de Ambientes","M2 Cubiertos","M2 Totales", "Antiguedad" ,"Piso", "ID"
            }
        );
        
        for (Propiedad p : this.Propiedades) {
            if (p.getClass()==Casa.class){
                Casa p1=(Casa)p;
                modelo.addRow(new String[] {p1.getDireccion(),""+p1.getValorDeTasacion(),""+p1.getCantidadDeAmbientes(),""+p1.getMetrosCuadradosCubiertos(),""+p1.getMetrosCuadradosTotales(),""+p1.getAntiguedadDeConstruccion(),"",""});
            }
            else{
                Departamento p2=(Departamento)p;
                modelo.addRow(new String[] {p2.getDireccion(),""+p2.getValorDeTasacion(),""+p2.getCantidadDeAmbientes(),""+p2.getMetrosCuadradosCubiertos(),""+p2.getMetrosCuadradosTotales(),"",""+p2.getPiso(),p2.getID()});
            }
            
        }
        this.Mostrar.setModel(modelo);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Arriba3;
    private javax.swing.JLabel LogoFacu;
    private javax.swing.JTable Mostrar;
    private javax.swing.JPanel MostrarPanel;
    private javax.swing.JButton Regresar2;
    private javax.swing.JButton Salir3;
    private javax.swing.JScrollPane ScrollMostrar;
    private javax.swing.JLabel Titulo3;
    // End of variables declaration//GEN-END:variables
}
