package poo.vista;

import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import poo.control.Empleado;

public class App extends javax.swing.JFrame {
      Empleado empTemp =  new Empleado();
      double total = 0;

    public App() {
        initComponents();
        this.setLocationRelativeTo(null);
        txta.append("Nombre \t Basico \t Total \n");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ejercicio Nivelación 2");
        setResizable(false);
         System.out.printf("          .                                                      .\n" +
"        .n                   .                 .                  n.\n" +
"  .   .dP                  dP                   9b                 9b.    .\n" +
" 4    qXb         .       dX                     Xb       .        dXp     t\n" +
"dX.    9Xb      .dXb    __                         __    dXb.     dXP     .Xb\n" +
"9XXb._       _.dXXXXb dXXXXbo.                 .odXXXXb dXXXXb._       _.dXXP\n" +
" 9XXXXXXXXXXXXXXXXXXXVXXXXXXXXOo.           .oOXXXXXXXXVXXXXXXXXXXXXXXXXXXXP\n" +
"  `9XXXXXXXXXXXXXXXXXXXXX'~   ~`OOO8b   d8OOO'~   ~`XXXXXXXXXXXXXXXXXXXXXP'\n" +
"    `9XXXXXXXXXXXP' `9XX'   BY    `98v8P'  ARNOLD   `XXP' `9XXXXXXXXXXXP'\n" +
"        ~~~~~~~       9X.          .db|db.          .XP       ~~~~~~~\n" +
"                        )b.  .dbo.dP'`v'`9b.odb.  .dX(\n" +
"                      ,dXXXXXXXXXXXb     dXXXXXXXXXXXb.\n" +
"                     dXXXXXXXXXXXP'   .   `9XXXXXXXXXXXb\n" +
"                    dXXXXXXXXXXXXb   d|b   dXXXXXXXXXXXXb\n" +
"                    9XXb'   `XXXXXb.dX|Xb.dXXXXX'   `dXXP\n" +
"                     `'      9XXXXXX(   )XXXXXXP      `'\n" +
"                              XXXX X.`v'.X XXXX\n" +
"                              XP^X'`b   d'`X^XX\n" +
"                              X. 9  `   '  P )X\n" +
"                              `b  `       '  d'\n" +
"                               `             '" ); 
        
        
        JOptionPane.showMessageDialog(null, "Autor: Arnold Salazar \n Código fuente en:  https://github.com/rundelhouse/Poo-Ejercicios-nivelacion2.git");
      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtBasico = new javax.swing.JTextField();
        txtHoras = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        txtSalario = new javax.swing.JTextField();
        btnLimpiarEmpleado = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta = new javax.swing.JTextArea();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lbTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(246, 246, 246));
        setSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(246, 246, 246));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre:");
        jLabel1.setAlignmentX(0.5F);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 14, -1, -1));

        jLabel2.setText("Básico:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 43, -1, -1));

        jLabel3.setText("Horas:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 14, -1, -1));

        txtNombre.setAlignmentX(0.0F);
        txtNombre.setAlignmentY(0.0F);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 11, 210, -1));
        jPanel1.add(txtBasico, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 40, 210, -1));
        jPanel1.add(txtHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 11, 30, -1));

        btnCalcular.setBackground(new java.awt.Color(234, 233, 233));
        btnCalcular.setText("Calcular");
        btnCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcularMouseClicked(evt);
            }
        });
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 42, 80, 23));

        txtSalario.setEditable(false);
        txtSalario.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 68, 210, -1));

        btnLimpiarEmpleado.setBackground(new java.awt.Color(234, 233, 233));
        btnLimpiarEmpleado.setText("Limpiar");
        btnLimpiarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarEmpleadoMouseClicked(evt);
            }
        });
        jPanel1.add(btnLimpiarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 69, 80, 23));

        jLabel4.setText("Salario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 71, -1, -1));

        txta.setColumns(20);
        txta.setRows(5);
        jScrollPane1.setViewportView(txta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 360, 140));

        btnLimpiar.setBackground(new java.awt.Color(212, 215, 221));
        btnLimpiar.setForeground(new java.awt.Color(102, 102, 102));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 265, 70, 23));

        btnSalir.setBackground(new java.awt.Color(66, 0, 0));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setMaximumSize(new java.awt.Dimension(65, 23));
        btnSalir.setMinimumSize(new java.awt.Dimension(65, 23));
        btnSalir.setPreferredSize(new java.awt.Dimension(65, 23));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 265, 65, 23));

        lbTotal.setText("Total:");
        jPanel1.add(lbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 265, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMouseClicked
        calcularSalario();
    }//GEN-LAST:event_btnCalcularMouseClicked

    private void btnLimpiarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarEmpleadoMouseClicked
      limpiar();
    }//GEN-LAST:event_btnLimpiarEmpleadoMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiar();
        txta.setText(null);
        txta.append("Nombre \t Basico \t Total \n");
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
       this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked
   
    public void calcularSalario(){
      boolean fallo = false;
      empTemp.setNombre(txtNombre.getText());
      try{
        empTemp.setBasico(Double.parseDouble(txtBasico.getText()));
        empTemp.setHoras(Integer.parseInt(txtHoras.getText()));
        total += empTemp.getSalario();
      }catch(Exception e){
          JOptionPane.showMessageDialog(null,"Se esperan datos númericos","Error",JOptionPane.INFORMATION_MESSAGE);
          fallo = true;
      }      
      if (fallo == false){          
      txtSalario.setText(String.valueOf(total));
      lbTotal.setText("Total: " + String.valueOf(total));
      txta.append(empTemp.getLineaEmpleado() + "\n");
      }else {
          txtNombre.requestFocus();
      }
    }
    
    public void limpiar(){
        txtNombre.setText(null);
        txtSalario.setText(null);
        txtBasico.setText(null);
        txtHoras.setText(null);
    }
    
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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiarEmpleado;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTextField txtBasico;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextArea txta;
    // End of variables declaration//GEN-END:variables
}
