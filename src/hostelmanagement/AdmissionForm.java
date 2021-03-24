/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagement;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Atel Dot Net
 */
public class AdmissionForm extends javax.swing.JFrame {

    /**
     * Creates new form AdmissionForm
     */
    public AdmissionForm() {
        initComponents();
        BanglaFont();
    }

      public void BanglaFont() {
        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResource("k.TTF").openStream());
            Font font1 = Font.createFont(Font.TRUETYPE_FONT, getClass().getResource("k.TTF").openStream());

            GraphicsEnvironment genv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            genv.registerFont(font);
// makesure to derive the size
            font = font.deriveFont(18f);
            font1 = font1.deriveFont(14f);
            
            jPanel1.setFont(font);
            
            jLabel1.setFont(font);
            jLabel2.setFont(font);
            jLabel3.setFont(font);
            jLabel4.setFont(font);
            jLabel5.setFont(font);
            jLabel6.setFont(font);
            jLabel7.setFont(font);
            jLabel8.setFont(font1);
            jLabel9.setFont(font);
            jLabel10.setFont(font);
            jLabel11.setFont(font);
            jLabel12.setFont(font);
            jLabel13.setFont(font);
            jLabel14.setFont(font);
            jLabel15.setFont(font);
            jLabel16.setFont(font);
            
            jLabel17.setFont(font1);
            
            jLabel18.setFont(font1);
            
            jLabel19.setFont(font1);
            
            ApplicantNameTextField_Bangla.setFont(font);
            ApplicantNameTextField_English.setFont(font);
            ApplicantFather_Name.setFont(font);
            Applicant_MotherNAme.setFont(font);

            // jLabel17.setText("আবেদন কারির "+"\n"+" নাম  "+"\n"+" (বাংলা )");

            
            
           // jTextPane1.setFont(font);
          //  MemberName.setFont(font);
            
           // jTextField1.setFont(font);
            
        } catch (IOException e) {
            e.printStackTrace();
        } catch (FontFormatException e) {
            e.printStackTrace();
        }
       

//use the font
//yourSwingComponent.setFont(customFont);
        //Handle exception
    }
       private void printRecord(JPanel jPanel1) {
        PrinterJob pj = PrinterJob.getPrinterJob();
        pj.setJobName(" Print Component ");

        pj.setPrintable(new Printable() {
            public int print(Graphics pg, PageFormat pf, int pageNum) {
                if (pageNum > 0) {
                    return Printable.NO_SUCH_PAGE;
                }

                Graphics2D g2 = (Graphics2D) pg;
                //   g2.translate(pf.getImageableX(), pf.getImageableY());
                // double factorX = pf.getImageableWidth(); // component.getWidth();
                //double factorY = pf.getImageableHeight();// component.getHeight();
                //  double factor = Math.min(factorX, factorY);
                //g2.scale(factor, factor);
                g2.translate(-40, -40);
                jPanel1.paint(g2);
                return Printable.PAGE_EXISTS;

                ///
            }
        });
        if (pj.printDialog() == false) {
            return;
        }

        try {
            pj.print();
        } catch (PrinterException ex) {
            // handle exception
        }
    }

    /**
     * /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Applicant_MotherNAme = new javax.swing.JTextField();
        ApplicantNameTextField_Bangla = new javax.swing.JTextField();
        ApplicantNameTextField_English = new javax.swing.JTextField();
        ApplicantFather_Name = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("লতিফ ছাত্রাবাস পশ্চিম শাখা ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(290, 10, 520, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("তেজগাঁও ঢাকা - 1208  ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(340, 80, 250, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ঢাকা পলিটেকনিক ইনস্টিটিউট");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(310, 50, 330, 30);

        jLabel4.setText("রশিদ নং:");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 170, 170, 40);

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(680, 130, 170, 40);

        jLabel6.setText("আবেদন পত্রের নং :");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 130, 170, 40);

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(220, 130, 160, 40);

        jLabel8.setText(" মাতার নাম :");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 540, 200, 90);

        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(520, 130, 160, 40);

        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(520, 170, 160, 40);

        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel11);
        jLabel11.setBounds(680, 170, 170, 40);

        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel12);
        jLabel12.setBounds(220, 170, 160, 40);

        jLabel13.setText("১");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel13);
        jLabel13.setBounds(50, 220, 20, 140);

        jLabel14.setText("২ ");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel14);
        jLabel14.setBounds(50, 360, 20, 90);

        jLabel15.setText("৩");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel15);
        jLabel15.setBounds(50, 450, 20, 90);

        jLabel16.setText("৪");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel16);
        jLabel16.setBounds(50, 540, 20, 90);

        jLabel17.setText(" আবেদন কারির নাম  (বাংলা ):");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel17);
        jLabel17.setBounds(70, 220, 200, 140);

        jLabel18.setText(" আবেদন কারির নাম  (ইংরেজিতে ) :");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel18);
        jLabel18.setBounds(70, 360, 200, 90);

        jLabel19.setText(" পিতার নাম :");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel19);
        jLabel19.setBounds(70, 450, 200, 90);

        Applicant_MotherNAme.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(Applicant_MotherNAme);
        Applicant_MotherNAme.setBounds(270, 540, 580, 90);

        ApplicantNameTextField_Bangla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(ApplicantNameTextField_Bangla);
        ApplicantNameTextField_Bangla.setBounds(270, 220, 580, 140);

        ApplicantNameTextField_English.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(ApplicantNameTextField_English);
        ApplicantNameTextField_English.setBounds(270, 360, 580, 90);

        ApplicantFather_Name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(ApplicantFather_Name);
        ApplicantFather_Name.setBounds(270, 450, 580, 90);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(170, 50, 910, 650);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("NEXT");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1130, 360, 110, 130);

        setSize(new java.awt.Dimension(1306, 776));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdmissionPage2 obj=new AdmissionPage2();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdmissionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmissionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmissionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmissionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdmissionForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApplicantFather_Name;
    private javax.swing.JTextField ApplicantNameTextField_Bangla;
    private javax.swing.JTextField ApplicantNameTextField_English;
    private javax.swing.JTextField Applicant_MotherNAme;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

/*print first page
   try
        {
            Toolkit tkp = jPanel1.getToolkit();
            PrintJob pjp = tkp.getPrintJob(this, null, null);
            Graphics g = pjp.getGraphics();
        //    jPanel1.print(g);
            jPanel1.printAll(g);
            g.dispose();
            pjp.end();
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        } */