/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones.OperacionesView;

import operaciones.Service.Service;

/**
 *
 * @author RAFAEL
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public View() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextPantalla = new javax.swing.JTextField();
        jBtn1 = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn7 = new javax.swing.JButton();
        jBtnp = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn0 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        Igual = new javax.swing.JButton();
        Sumar = new javax.swing.JButton();
        Restar = new javax.swing.JButton();
        Multiplicar = new javax.swing.JButton();
        Division = new javax.swing.JButton();
        Borrado = new javax.swing.JButton();
        Borrado1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextPantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jBtn1.setText("1");
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtn4.setText("4");
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn7.setText("7");
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtnp.setText(".");
        jBtnp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnpActionPerformed(evt);
            }
        });

        jBtn2.setText("2");
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn5.setText("5");
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn8.setText("8");
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn0.setText("0");
        jBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn0ActionPerformed(evt);
            }
        });

        jBtn3.setText("3");
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jBtn6.setText("6");
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtn9.setText("9");
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        Igual.setText("=");
        Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IgualActionPerformed(evt);
            }
        });

        Sumar.setText("+");
        Sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumarActionPerformed(evt);
            }
        });

        Restar.setText("-");
        Restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarActionPerformed(evt);
            }
        });

        Multiplicar.setText("x");
        Multiplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicarActionPerformed(evt);
            }
        });

        Division.setText("/");
        Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisionActionPerformed(evt);
            }
        });

        Borrado.setText("C");
        Borrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorradoActionPerformed(evt);
            }
        });

        Borrado1.setText("CE");
        Borrado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Borrado1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextPantalla)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtn4)
                            .addComponent(jBtn1)
                            .addComponent(jBtn7)
                            .addComponent(jBtnp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtn5)
                            .addComponent(jBtn2)
                            .addComponent(jBtn8)
                            .addComponent(jBtn0))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtn6)
                            .addComponent(jBtn3)
                            .addComponent(jBtn9)
                            .addComponent(Igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Borrado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Division, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Multiplicar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Restar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Borrado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Sumar))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTextPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtn4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtn7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnp))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtn5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtn8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtn0))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtn3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtn6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtn9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Igual))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Sumar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Restar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Multiplicar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Division)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Borrado)
                    .addComponent(Borrado1))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    String Operacion;
    double[] numeros= new double[2];
   
    
    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
      String uno;
        uno = jTextPantalla.getText()+ jBtn4.getText();
        jTextPantalla.setText(uno);
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void SumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumarActionPerformed
       numeros[0]= Double.parseDouble(jTextPantalla.getText());
       jTextPantalla.setText(" ");
       Operacion= "+";
    }//GEN-LAST:event_SumarActionPerformed

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        String uno;
        uno = jTextPantalla.getText()+ jBtn1.getText();
        jTextPantalla.setText(uno);
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
       String uno;
        uno = jTextPantalla.getText()+ jBtn2.getText();
        jTextPantalla.setText(uno);
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        String uno;
        uno = jTextPantalla.getText()+ jBtn3.getText();
        jTextPantalla.setText(uno);
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
      String uno;
        uno = jTextPantalla.getText()+ jBtn5.getText();
        jTextPantalla.setText(uno);
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
       String uno;
        uno = jTextPantalla.getText()+ jBtn6.getText();
        jTextPantalla.setText(uno);
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
        String uno;
        uno = jTextPantalla.getText()+ jBtn7.getText();
        jTextPantalla.setText(uno);
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
        String uno;
        uno = jTextPantalla.getText()+ jBtn8.getText();
        jTextPantalla.setText(uno);
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        String uno;
        uno = jTextPantalla.getText()+ jBtn9.getText();
        jTextPantalla.setText(uno);
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn0ActionPerformed
        String uno;
        uno = jTextPantalla.getText()+ jBtn0.getText();
        jTextPantalla.setText(uno);
    }//GEN-LAST:event_jBtn0ActionPerformed

    private void jBtnpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnpActionPerformed
        String uno;
        String length;
        length= jTextPantalla.getText();
        if(length.length()<=0){
        jTextPantalla.setText("0.");
        }else{
        uno = jTextPantalla.getText()+ jBtnp.getText();
        jTextPantalla.setText(uno);
        }
        
    }//GEN-LAST:event_jBtnpActionPerformed

    private void RestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarActionPerformed
       numeros[0]= Double.parseDouble(jTextPantalla.getText());
       jTextPantalla.setText(" ");
       Operacion= "-";
    }//GEN-LAST:event_RestarActionPerformed

    private void MultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicarActionPerformed
       numeros[0]= Double.parseDouble(jTextPantalla.getText());
       jTextPantalla.setText(" ");
       Operacion= "x";
    }//GEN-LAST:event_MultiplicarActionPerformed

    private void DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisionActionPerformed
        numeros[0]= Double.parseDouble(jTextPantalla.getText());
       jTextPantalla.setText(" ");
       Operacion= "/";
    }//GEN-LAST:event_DivisionActionPerformed

    private void IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgualActionPerformed
       numeros[1]= Double.parseDouble(jTextPantalla.getText());
       double[] numero =numeros;
       String ResultadoS;
       Service serv = new Service();
       if(Operacion=="+"){
       double Resultado = serv.CalculosSuma(numero);
       ResultadoS=String.valueOf(Resultado);
       jTextPantalla.setText(ResultadoS);
       }
       if(Operacion=="-"){
       double Resultado = serv.CalculosResta(numero);
       ResultadoS=String.valueOf(Resultado);
       jTextPantalla.setText(ResultadoS);
      }
       if (Operacion=="x"){
       double Resultado = serv.CalculosMultiplicacion(numero);
       ResultadoS=String.valueOf(Resultado);
       jTextPantalla.setText(ResultadoS);
       }
       if(Operacion=="/" ){
       double Resultado = serv.CalculosDivision(numero);
       ResultadoS=String.valueOf(Resultado);
       jTextPantalla.setText(ResultadoS);
       }
    }//GEN-LAST:event_IgualActionPerformed

    private void BorradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorradoActionPerformed
      String extrac;
        extrac= jTextPantalla.getText();
        if(extrac.length()>0){
        extrac=extrac.substring(0, extrac.length()-1);
        jTextPantalla.setText(extrac);
        }
    }//GEN-LAST:event_BorradoActionPerformed

    private void Borrado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Borrado1ActionPerformed
        jTextPantalla.setText(" ");
    }//GEN-LAST:event_Borrado1ActionPerformed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrado;
    private javax.swing.JButton Borrado1;
    private javax.swing.JButton Division;
    private javax.swing.JButton Igual;
    private javax.swing.JButton Multiplicar;
    private javax.swing.JButton Restar;
    private javax.swing.JButton Sumar;
    private javax.swing.JButton jBtn0;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtnp;
    private javax.swing.JTextField jTextPantalla;
    // End of variables declaration//GEN-END:variables
}
