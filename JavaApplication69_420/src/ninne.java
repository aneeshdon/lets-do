
public class ninne extends javax.swing.JFrame {
int as;
int j;
int y;
int v;
   
    public ninne() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        nigga = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        j1 = new javax.swing.JTextField();
        j2 = new javax.swing.JTextField();
        j3 = new javax.swing.JTextField();
        j4 = new javax.swing.JTextField();
        j5 = new javax.swing.JTextField();
        ch = new javax.swing.JRadioButton();
        va = new javax.swing.JRadioButton();
        bu = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        a = new javax.swing.JRadioButton();
        b = new javax.swing.JRadioButton();
        c = new javax.swing.JRadioButton();
        d = new javax.swing.JRadioButton();
        e = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        i = new javax.swing.JLabel();
        o = new javax.swing.JLabel();
        u = new javax.swing.JLabel();
        p = new javax.swing.JLabel();
        m = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/beans.gif"))); // NOI18N
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel2.setText("Coca Cola  ($70 for ONE)");

        jRadioButton4.setText("jRadioButton4");

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel3.setText("Burger ($50 for ONE)");

        jLabel4.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel4.setText("Pizza ($69 for ONE) ");

        jLabel5.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel5.setText("Popcorn ($30 for ONE)");

        jRadioButton8.setText("jRadioButton8");

        jLabel6.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel6.setText("Ice Cream");

        nigga.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel1.setText("You Can Have Some with the Movie!!");

        j1.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        j1.setEnabled(false);
        j1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1ActionPerformed(evt);
            }
        });

        j2.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        j2.setEnabled(false);
        j2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2ActionPerformed(evt);
            }
        });

        j3.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        j3.setEnabled(false);

        j4.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        j4.setEnabled(false);

        j5.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        j5.setEnabled(false);

        ch.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        ch.setText("Chocalate");
        ch.setEnabled(false);

        va.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        va.setText("Vanilla");
        va.setEnabled(false);

        bu.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        bu.setText("ButterScotch");
        bu.setEnabled(false);

        jButton1.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jButton1.setText("Place Your Order! (AND GET YOUR BILL)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jButton2.setText("I'll Pass");

        a.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        a.setText("Coca Cola  ($70 for ONE)");
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });

        b.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        b.setText("Burger ($50 for ONE)");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        c.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        c.setText("Pizza ($69 for ONE) ");
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        d.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        d.setText("Popcorn ($30 for ONE)");
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });

        e.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        e.setText("Ice Cream");
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel8.setText("The Bill");

        jLabel9.setText("jay has swag");

        i.setForeground(new java.awt.Color(0, 153, 255));
        i.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));

        o.setForeground(new java.awt.Color(0, 153, 255));
        o.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));

        u.setForeground(new java.awt.Color(0, 153, 255));
        u.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));

        p.setForeground(new java.awt.Color(0, 153, 255));
        p.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));

        jButton3.setText("Git the final bill");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(e))
                            .addComponent(a)
                            .addComponent(b)
                            .addComponent(c)
                            .addComponent(d))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(j1)
                                    .addComponent(j3)
                                    .addComponent(j2)
                                    .addComponent(j4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(o, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(i, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(u, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(j5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bu)
                                .addGap(87, 87, 87)))
                        .addGap(46, 46, 46)
                        .addComponent(va)
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel8)
                        .addGap(29, 29, 29)
                        .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(u, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(i, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(o, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(b)
                                    .addGap(4, 4, 4)
                                    .addComponent(c)
                                    .addGap(42, 42, 42))
                                .addComponent(d))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(j4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e)
                    .addComponent(j5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ch)
                    .addComponent(va)
                    .addComponent(bu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void j1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1ActionPerformed
if(a.isSelected())
{
    j1.setEnabled(true);
}
    }//GEN-LAST:event_j1ActionPerformed

    private void j2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2ActionPerformed

    }//GEN-LAST:event_j2ActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
if(a.isSelected())
{
    j1.setEnabled(true);
}
if(a.isSelected()==false)
{
    j1.setEnabled(false);
}
    }//GEN-LAST:event_aActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
if(b.isSelected())
{
    j2.setEnabled(true);
}   
if(b.isSelected()==false)
{
    j2.setEnabled(false);
}
    }//GEN-LAST:event_bActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
if(c.isSelected())
{
    j3.setEnabled(true);
} 
if(c.isSelected()==false)
{
    j3.setEnabled(false);
}
    }//GEN-LAST:event_cActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
if(d.isSelected())
{
    j4.setEnabled(true);
}   
if(d.isSelected()==false)
{
    j4.setEnabled(false);
}
    }//GEN-LAST:event_dActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
if(e.isSelected())
{
 ch.setEnabled(true);
 va.setEnabled(true);
bu.setEnabled(true);
j5.setEnabled(true);
}   
if(e.isSelected()==false)
{
     ch.setEnabled(false);
 va.setEnabled(false);
bu.setEnabled(false);
j5.setEnabled(false);
}
    }//GEN-LAST:event_eActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String str1=j1.getText();
int coke=Integer.parseInt(str1);
int j=coke*70;
u.setText(""+j);


String str2=j2.getText();
int burger=Integer.parseInt(str2);
int as=burger*50;
i.setText(""+a);


String str3=j3.getText();
int pizza=Integer.parseInt(str3);
int y=pizza*69;
o.setText(""+y);


String str4=j4.getText();
int pop=Integer.parseInt(str4);
int v=pop*30;
p.setText(""+v);

int total=j+as+y+v;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed
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
            java.util.logging.Logger.getLogger(ninne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ninne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ninne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ninne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ninne().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton a;
    private javax.swing.JRadioButton b;
    private javax.swing.JRadioButton bu;
    private javax.swing.JRadioButton c;
    private javax.swing.JRadioButton ch;
    private javax.swing.JRadioButton d;
    private javax.swing.JRadioButton e;
    private javax.swing.JLabel i;
    private javax.swing.JTextField j1;
    private javax.swing.JTextField j2;
    private javax.swing.JTextField j3;
    private javax.swing.JTextField j4;
    private javax.swing.JTextField j5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JLabel m;
    private javax.swing.JTextField nigga;
    private javax.swing.JLabel o;
    private javax.swing.JLabel p;
    private javax.swing.JLabel u;
    private javax.swing.JRadioButton va;
    // End of variables declaration//GEN-END:variables
}
