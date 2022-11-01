package leerpdf2capas.GUI;

import com.sun.awt.AWTUtilities;
import java.awt.*;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GUI extends javax.swing.JFrame {
    File fichero=null, f=null; 
    String[] data = new String[13];
    FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.PDF", "pdf");
    LectorQR qr = new LectorQR();
    javax.swing.JLabel coQR = new javax.swing.JLabel();
    //private File ficheros=new File("");
 
    public GUI() {        
        super("Extracción de datos de RUT [Versión Beta2]");   
        setResizable(false);        
        setLocation(250, 100);
        initComponents();
        setIconImage(getIconImage());//ICONO REPRESENTATIVO
        this.setSize(819,577);
        jFileChooser1.setFileFilter(filtro);
        jLabel2.setOpaque(false);      
        rSButtonRiple1.setVisible(false);
        rSMPassView1.setVisible(false);
        jCheckBox1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel2.setOpaque(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel7.setOpaque(false);
        jFileChooser1.setVisible(false);
        TipoContribuyente.setVisible(false);
        NIT.setVisible(false);
        TipoDeDoc.setVisible(false);
        NumeroDoc.setVisible(false);
        FechaExp.setVisible(false);
        LugarExp.setVisible(false);
        Departamento.setVisible(false);
        Ciudad.setVisible(false);
        Apellidos.setVisible(false);
        Nombres.setVisible(false);
        Direccion.setVisible(false);
        Correo.setVisible(false);
        Telefono.setVisible(false);
        
        jLabel8.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        jLabel16.setVisible(false);
        jLabel17.setVisible(false);
        jLabel18.setVisible(false);
        jLabel19.setVisible(false);
        jLabel20.setVisible(false);
        jLabel21.setVisible(false);
        jQR.setVisible(false);
        
        rSButtonRiple2.setVisible(false);
        rSButtonRiple3.setVisible(false);
    }
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("icon.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelsSlider1 = new rojeru_san.RSPanelsSlider();
        NumeroDoc = new javax.swing.JLabel();
        Nombres = new javax.swing.JLabel();
        Apellidos = new javax.swing.JLabel();
        TipoDeDoc = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        NIT = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LugarExp = new javax.swing.JLabel();
        Direccion = new javax.swing.JLabel();
        Ciudad = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Departamento = new javax.swing.JLabel();
        FechaExp = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Correo = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jQR = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        rSButtonRiple2 = new rojeru_san.RSButtonRiple();
        rSButtonRiple3 = new rojeru_san.RSButtonRiple();
        TipoContribuyente = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rSMPassView1 = new rojeru_san.RSMPassView();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel4 = new javax.swing.JLabel();
        rSButtonRiple1 = new rojeru_san.RSButtonRiple();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rSButton1 = new rojeru_san.RSButton();
        fondo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NumeroDoc.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        NumeroDoc.setForeground(new java.awt.Color(255, 255, 255));
        NumeroDoc.setText("NumeroDoc");
        getContentPane().add(NumeroDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, -1));

        Nombres.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        Nombres.setForeground(new java.awt.Color(255, 255, 255));
        Nombres.setText("Nombres");
        getContentPane().add(Nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 230, -1));

        Apellidos.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        Apellidos.setForeground(new java.awt.Color(255, 255, 255));
        Apellidos.setText("Apellidos");
        getContentPane().add(Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 230, -1));

        TipoDeDoc.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TipoDeDoc.setForeground(new java.awt.Color(255, 255, 255));
        TipoDeDoc.setText("CC");
        getContentPane().add(TipoDeDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("NIT con código QR:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, 30));

        NIT.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        NIT.setForeground(new java.awt.Color(255, 255, 255));
        NIT.setText("NIT");
        getContentPane().add(NIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 130, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tipo de contribuyente:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, 30));

        LugarExp.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LugarExp.setForeground(new java.awt.Color(255, 255, 255));
        LugarExp.setText("LugarExp");
        getContentPane().add(LugarExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, 30));

        Direccion.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Direccion.setForeground(new java.awt.Color(255, 255, 255));
        Direccion.setText("Direccion");
        getContentPane().add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        Ciudad.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Ciudad.setForeground(new java.awt.Color(255, 255, 255));
        Ciudad.setText("Ciudad");
        getContentPane().add(Ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Número:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));

        Departamento.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Departamento.setForeground(new java.awt.Color(255, 255, 255));
        Departamento.setText("Departamento");
        getContentPane().add(Departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, -1, -1));

        FechaExp.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        FechaExp.setForeground(new java.awt.Color(255, 255, 255));
        FechaExp.setText("FechaExp");
        getContentPane().add(FechaExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tipo de documento:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, 30));

        Correo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Correo.setForeground(new java.awt.Color(255, 255, 255));
        Correo.setText("Correo");
        getContentPane().add(Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, -1));

        Telefono.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Telefono.setForeground(new java.awt.Color(255, 255, 255));
        Telefono.setText("Telefono");
        getContentPane().add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nombres y apellidos completos:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Fecha y lugar de expedición:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Departamento:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Ciudad de residencia:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Dirección:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Teléfono de contacto:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, 40));

        jQR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jQR.setForeground(new java.awt.Color(255, 255, 255));
        jQR.setText("QR");
        getContentPane().add(jQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 150, 150));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Correo electrónico:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, -1, -1));

        rSButtonRiple2.setBackground(new java.awt.Color(255, 204, 0));
        rSButtonRiple2.setForeground(new java.awt.Color(51, 51, 51));
        rSButtonRiple2.setText("Guardar cambios");
        rSButtonRiple2.setColorHover(new java.awt.Color(255, 204, 102));
        rSButtonRiple2.setColorText(new java.awt.Color(51, 51, 51));
        rSButtonRiple2.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        rSButtonRiple2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple2ActionPerformed(evt);
            }
        });
        getContentPane().add(rSButtonRiple2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 433, -1, 50));

        rSButtonRiple3.setBackground(new java.awt.Color(102, 102, 102));
        rSButtonRiple3.setText("Editar campos");
        rSButtonRiple3.setColorHover(new java.awt.Color(153, 153, 153));
        getContentPane().add(rSButtonRiple3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 433, 140, 50));

        TipoContribuyente.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TipoContribuyente.setForeground(new java.awt.Color(255, 255, 255));
        TipoContribuyente.setText("TipoContrinuyente");
        getContentPane().add(TipoContribuyente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 160, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leerpdf2capas/GUI/Resultados.png"))); // NOI18N
        jLabel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel7MouseMoved(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("null");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 440, 30));

        rSMPassView1.setBackground(new java.awt.Color(181, 237, 113));
        rSMPassView1.setForeground(new java.awt.Color(0, 0, 0));
        rSMPassView1.setBordeColorFocus(new java.awt.Color(181, 237, 113));
        rSMPassView1.setBordeColorNoFocus(new java.awt.Color(102, 102, 102));
        rSMPassView1.setBotonColor(new java.awt.Color(51, 153, 0));
        rSMPassView1.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        rSMPassView1.setPlaceholder("Ingrese la clave");
        rSMPassView1.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        rSMPassView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMPassView1ActionPerformed(evt);
            }
        });
        getContentPane().add(rSMPassView1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 140, 40));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("¿Clave de apertura?");
        jCheckBox1.setActionCommand("");
        jCheckBox1.setOpaque(false);
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, 120, 180, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" 2.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 100, 50, -1));

        jFileChooser1.setCurrentDirectory(new java.io.File("C:\\Users\\Carlos\\Documents\\NetBeansProjects\\Leerpdf"));
        jFileChooser1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });
        getContentPane().add(jFileChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 120, 610, 310));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("3.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 170, -1, -1));

        rSButtonRiple1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rSButtonRiple1.setText("Procesar archivo");
        rSButtonRiple1.setColorText(new java.awt.Color(51, 51, 51));
        rSButtonRiple1.setEnabled(false);
        rSButtonRiple1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rSButtonRiple1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple1ActionPerformed(evt);
            }
        });
        getContentPane().add(rSButtonRiple1, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 242, 250, 60));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Archivo seleccionado:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 230, 30));

        jLabel2.setBackground(new java.awt.Color(84, 114, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leerpdf2capas/GUI/Selector.png"))); // NOI18N
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 820, 550));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("1.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, -8, 50, 90));

        rSButton1.setBackground(new java.awt.Color(99, 134, 0));
        rSButton1.setText("Seleccionar Archivo");
        rSButton1.setColorHover(new java.awt.Color(133, 180, 0));
        rSButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rSButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(rSButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 0, 260, 80));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leerpdf2capas/GUI/GUIbienvenida_B2.png"))); // NOI18N
        fondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                fondoMouseMoved(evt);
            }
        });
        fondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fondoMouseEntered(evt);
            }
        });
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 900, 550));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo de contribuyente:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tipo de contribuyente:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tipo de contribuyente:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) 
       {
           JOptionPane.showMessageDialog(null, "Se seleccionó la ruta "+fichero);
           
 
 
       }
    
    private void rSButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton1ActionPerformed
        // TODO add your handling code here:
        jLabel2.setVisible(true);
        jLabel2.setOpaque(true);
        jFileChooser1.setVisible(true); 
        rSButtonRiple1.setVisible(false);
        rSMPassView1.setVisible(false);
        jCheckBox1.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
    }//GEN-LAST:event_rSButton1ActionPerformed

    private void rSButtonRiple1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple1ActionPerformed

        LeerPdf obj2=new LeerPdf();
        File FF=getFichero();
        String archivo=jFileChooser1.getName(FF);
        rSButtonRiple1.setText(" Procesando ...");
        JOptionPane.showMessageDialog(null, "Se procesará el documento seleccionado\n'"+archivo+"'", "Procesar '"+archivo+"'",JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "el fichero es:"+fichero);
        rSButtonRiple1.setEnabled(false);
        
        new File("C:\\QR").mkdirs();
        f = new File("C:\\QR\\qrNIT.png");
        
        char[] contra=this.rSMPassView1.getPassword();
        String passText = new String(contra);
        
        
        int cuenta=0;
        while(fichero!=null&&cuenta==0){
        cuenta++;
            try {
                data=obj2.extraccion(fichero,passText);
                 
            } catch (Exception ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
             try {
                 qr.generateQR(f, data[1], 150, 150);
                //JOptionPane.showMessageDialog(null,"QR esta en: " + f.getAbsolutePath());
                String qrString = qr.decoder(f);
                 } 
             catch (Exception e) {
                e.printStackTrace();
                }
             
       char cad [] = data[0].toCharArray(); 
       if(data[0]!=null){
        jLabel7.setOpaque(true);
        jLabel7.setVisible(true);
        rSButtonRiple2.setVisible(true);
        rSButtonRiple3.setVisible(true);

        switch (cad[8]){
            case 'n':
                TipoContribuyente.setText("Persona natural");
                NIT.setText(data[1]);
                TipoDeDoc.setText(data[2]);
                NumeroDoc.setText(data[3]);
                FechaExp.setText(data[4]);
                LugarExp.setText(data[5]);
                Departamento.setText(data[6]);
                Ciudad.setText(data[7]);
                Apellidos.setText(data[8]);
                Nombres.setText(data[9]);
                Direccion.setText(data[10]);
                Correo.setText(data[11]);
                Telefono.setText(data[12]);

                TipoContribuyente.setVisible(true);
                NIT.setVisible(true);
                TipoDeDoc.setVisible(true);
                NumeroDoc.setVisible(true);
                FechaExp.setVisible(true);
                LugarExp.setVisible(true);
                Departamento.setVisible(true);
                Ciudad.setVisible(true);
                Apellidos.setVisible(true);
                Nombres.setVisible(true);
                Direccion.setVisible(true);
                Correo.setVisible(true);
                Telefono.setVisible(true);

                jLabel8.setVisible(true);
                jLabel12.setVisible(true);
                jLabel13.setVisible(true);
                jLabel14.setVisible(true);
                jLabel15.setVisible(true);
                jLabel16.setVisible(true);
                jLabel17.setVisible(true);
                jLabel18.setVisible(true);
                jLabel19.setVisible(true);
                jLabel20.setVisible(true);
                jLabel21.setVisible(true);
                break;

            case 'j':
                TipoContribuyente.setText("Persona judrírica");
                NIT.setText(data[1]);
                Departamento.setText(data[6]);
                Ciudad.setText(data[7]);
                Direccion.setText(data[10]);
                Correo.setText(data[11]);
                Telefono.setText(data[12]);

                TipoContribuyente.setVisible(true);
                NIT.setVisible(true);
                Departamento.setVisible(true);
                Ciudad.setVisible(true);
                Direccion.setVisible(true);
                Correo.setVisible(true);
                Telefono.setVisible(true);

                jLabel8.setVisible(true);
                jLabel12.setVisible(true);
                jLabel13.setVisible(true);
                jLabel14.setVisible(true);
                jLabel15.setVisible(true);
                jLabel17.setVisible(true);
                jLabel18.setVisible(true);
                jLabel19.setVisible(true);
                jLabel20.setVisible(true);
                jLabel21.setVisible(true);
                break;               
         }
       }
       
    }//GEN-LAST:event_rSButtonRiple1ActionPerformed

    
    
    private void rSMPassView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMPassView1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rSMPassView1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:      
        this.rSMPassView1.setVisible(true);
        jLabel3.setText(" Sí");
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jCheckBox1StateChanged

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        // TODO add your handling code here:
        this.rSMPassView1.setVisible(true);
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void fondoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMouseMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fondoMouseMoved

    private void fondoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_fondoMouseEntered

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        // TODO add your handling code here:
        setFichero(jFileChooser1.getSelectedFile());        
        File FF=getFichero();
        String archivo=jFileChooser1.getName(FF);
        //JOptionPane.showMessageDialog(null, "Archivo es: "+aa);
        
        if(FF!=null){
            //JOptionPane.showMessageDialog(null, "Seleccionó "+FF);
            jCheckBox1.setVisible(true);
            jLabel2.setVisible(false);
            jFileChooser1.setVisible(false);
            jLabel3.setVisible(true);
            jLabel1.setText("OK");
            this.rSButton1.setEnabled(false);
            rSButton1.setText("  Seleccionado");
            rSButtonRiple1.setBackground(Color.orange);
            rSButtonRiple1.setVisible(true);
            rSButtonRiple1.setEnabled(true);
            rSButtonRiple1.setColorText(Color.white);
            rSButtonRiple1.setColorTextHover(Color.white);
            rSButtonRiple1.setColorHover(Color.orange);
            rSButtonRiple1.setText("Procesar Archivo");
            jLabel5.setText(archivo);
            this.jLabel5.setVisible(true);
            jLabel6.setText("Archivo seleccionado: ");
            this.jLabel6.setVisible(true);
            }
            jLabel2.setVisible(false);
            jFileChooser1.setVisible(false);
        
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    private void rSButtonRiple2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple2ActionPerformed
        // TODO add your handling code here:
        LeerPdf obj=new LeerPdf();
        jLabel7.setOpaque(false);
        jLabel7.setVisible(false);
        TipoContribuyente.setVisible(false);
        NIT.setVisible(false);
        TipoDeDoc.setVisible(false);
        NumeroDoc.setVisible(false);
        FechaExp.setVisible(false);
        LugarExp.setVisible(false);
        Departamento.setVisible(false);
        Ciudad.setVisible(false);
        Apellidos.setVisible(false);
        Nombres.setVisible(false);
        Direccion.setVisible(false);
        Correo.setVisible(false);
        Telefono.setVisible(false);
        
        jLabel8.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        jLabel16.setVisible(false);
        jLabel17.setVisible(false);
        jLabel18.setVisible(false);
        jLabel19.setVisible(false);
        jLabel20.setVisible(false);
        jLabel21.setVisible(false);
        rSButtonRiple2.setVisible(false);
        rSButtonRiple3.setVisible(false);
        
        jLabel2.setOpaque(false);      
        rSButtonRiple1.setVisible(false);
        rSMPassView1.setVisible(false);
        rSMPassView1.setText("");
        jCheckBox1.setVisible(false);
        jCheckBox1.setSelected(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel2.setOpaque(false);
        jLabel5.setVisible(false);
        jLabel7.setVisible(false);
        jLabel7.setOpaque(false);
        jQR.setVisible(false);
        jQR.setIcon(new javax.swing.ImageIcon("<none>"));
        jLabel1.setText(" 1.");
        jLabel3.setText(" 2.");
        this.rSButton1.setEnabled(true);
        rSButton1.setText("Seleccionar archivo");
        this.setFichero(null);
        JOptionPane.showMessageDialog(null, "Datos almacenados correctamente", "Confirmación",JOptionPane.INFORMATION_MESSAGE,
        new ImageIcon(GUI.class.getResource("ok.png")));
        
        String gato=String.join(" , ",data);
        obj.generarTXT("NIT_"+data[1], gato);
        jLabel6.setText("Datos almacenados correctamente");
        jLabel5.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_rSButtonRiple2ActionPerformed

    private void jLabel7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseMoved
             
        jQR.setIcon(new javax.swing.ImageIcon("C:\\QR\\qrNIT.png"));
        jQR.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseMoved

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellidos;
    private javax.swing.JLabel Ciudad;
    private javax.swing.JLabel Correo;
    private javax.swing.JLabel Departamento;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel FechaExp;
    private javax.swing.JLabel LugarExp;
    private javax.swing.JLabel NIT;
    private javax.swing.JLabel Nombres;
    private javax.swing.JLabel NumeroDoc;
    private javax.swing.JLabel Telefono;
    private javax.swing.JLabel TipoContribuyente;
    private javax.swing.JLabel TipoDeDoc;
    private javax.swing.JLabel fondo;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jQR;
    private rojeru_san.RSButton rSButton1;
    public rojeru_san.RSButtonRiple rSButtonRiple1;
    private rojeru_san.RSButtonRiple rSButtonRiple2;
    private rojeru_san.RSButtonRiple rSButtonRiple3;
    private rojeru_san.RSMPassView rSMPassView1;
    private rojeru_san.RSPanelsSlider rSPanelsSlider1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the fichero
     */
    public File getFichero() {
        return fichero;
    }

    /**
     * @param fichero the fichero to set
     */
    public void setFichero(File fichero) {
        this.fichero = fichero;
    }
}
