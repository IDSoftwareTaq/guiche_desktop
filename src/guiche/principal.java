/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guiche;

import java.awt.Frame;

import javax.swing.JPanel;

import model.Sistema;

/**
 *
 * @author Tucaa
 */
@SuppressWarnings("serial")
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField25 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jTextField2 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        panel2 = new java.awt.Panel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guiche Eletrônico - V. 0.0.1");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(350, 50, 1280, 960));
        setPreferredSize(new java.awt.Dimension(1280, 960));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField25.setEditable(false);
        jTextField25.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField25.setToolTipText("");
        jTextField25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 180, 90));

        jTextField24.setEditable(false);
        jTextField24.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField24.setToolTipText("");
        jTextField24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField24ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 180, 90));

        jTextField23.setEditable(false);
        jTextField23.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField23.setToolTipText("");
        jTextField23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 180, 90));

        jTextField26.setEditable(false);
        jTextField26.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jTextField26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField26.setToolTipText("");
        jTextField26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField26ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 180, 90));

        jTextField22.setEditable(false);
        jTextField22.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.setToolTipText("");
        jTextField22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 180, 90));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 184, -1, -1));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Arial Black", 0, 90)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setToolTipText("");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 260, 130));

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setToolTipText("");
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, 180, 90));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiche/images/Letter N blue.png"))); // NOI18N
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 180, 170));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiche/images/Letter P red.png"))); // NOI18N
        jButton3.setToolTipText("");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 620, 180, 170));

        panel2.setBackground(new java.awt.Color(85, 157, 229));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 810, 1280, 150));

        jPanel1.setBackground(new java.awt.Color(85, 157, 229));

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiche/images/para alterar.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(353, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(262, 262, 262))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 270));

        jTextField27.setEditable(false);
        jTextField27.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jTextField27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField27.setToolTipText("");
        jTextField27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField27ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 180, 100));

        jTextField28.setEditable(false);
        jTextField28.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jTextField28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField28.setToolTipText("");
        jTextField28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField28ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 290, 180, 100));

        jTextField29.setEditable(false);
        jTextField29.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jTextField29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField29.setToolTipText("");
        jTextField29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField29ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 400, 180, 100));

        jTextField30.setEditable(false);
        jTextField30.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jTextField30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField30.setToolTipText("");
        jTextField30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField30ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 290, 180, 100));

        jTextField31.setEditable(false);
        jTextField31.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jTextField31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField31.setToolTipText("");
        jTextField31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField31ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 180, 100));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Arial Black", 0, 90)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setToolTipText("");
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 640, 270, 150));

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setToolTipText("");
        jTextField11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 400, 180, 100));
        
        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHAMAR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 750, 200, 70));

        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiche/images/Receptionist.png"))); // NOI18N
        jButton4.setToolTipText("");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 510, 180, 260));
        
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23ActionPerformed

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField24ActionPerformed

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25ActionPerformed

    private void jTextField26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField26ActionPerformed

    private void jTextField27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField27ActionPerformed

    private void jTextField28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField28ActionPerformed

    private void jTextField29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField29ActionPerformed

    private void jTextField30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField30ActionPerformed

    private void jTextField31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField31ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    	Sistema.getInstance().gerarSenhaConvencional();
    	updateSenhasGeradas();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Sistema.getInstance().gerarSenhaPrioritaria();
       updateSenhasGeradas();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    @SuppressWarnings("static-access")
	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    	Sistema.getInstance().chamarSenha();
        updateSenhasChamadas();
        ((guiche) guiche).update();
    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void updateSenhasGeradas(){
    	jTextField2.setText(Sistema.getInstance().getSenhaGerada(0));
    	jTextField25.setText(Sistema.getInstance().getSenhaGerada(1));
    	jTextField26.setText(Sistema.getInstance().getSenhaGerada(2));
    	jTextField24.setText(Sistema.getInstance().getSenhaGerada(3));
    	jTextField22.setText(Sistema.getInstance().getSenhaGerada(4));
    	jTextField23.setText(Sistema.getInstance().getSenhaGerada(5));
    	jTextField10.setText(Sistema.getInstance().getSenhaGerada(6));
    }
    
    private void updateSenhasChamadas(){
    	jTextField3.setText(Sistema.getInstance().getSenhaChamada(0));
    	jTextField27.setText(Sistema.getInstance().getSenhaChamada(1));
    	jTextField30.setText(Sistema.getInstance().getSenhaChamada(2));
    	jTextField28.setText(Sistema.getInstance().getSenhaChamada(3));
    	jTextField31.setText(Sistema.getInstance().getSenhaChamada(4));
    	jTextField29.setText(Sistema.getInstance().getSenhaChamada(5));
    	jTextField11.setText(Sistema.getInstance().getSenhaChamada(6));
    }
    
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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new principal().setVisible(true);
                guiche = new guiche();
                new guiche().setVisible(true);
            }
        });
        
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JPanel jPanel1;
    private java.awt.Panel panel2;
    private static Frame guiche;
    // End of variables declaration//GEN-END:variables
}
