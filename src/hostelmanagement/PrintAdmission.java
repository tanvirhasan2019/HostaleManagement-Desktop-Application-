/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagement;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Base64;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Atel Dot Net
 */
public class PrintAdmission extends javax.swing.JFrame {

    /**
     * Creates new form PrintAdmission
     */
     private BufferedImage chosen_picture;
    private String filename=null;
    private byte[]personimage=null;
    private ImageIcon icon;
    private File image;
    
    Image newimg;
   
    

    public PrintAdmission() {
        initComponents();
        BanglaFont();
      /// jTextPane1.setContentType("text/html");
       ReadImage_DataBase();
       
    }

     public void BanglaFont() {
        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResource("k.TTF").openStream());

            GraphicsEnvironment genv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            genv.registerFont(font);
// makesure to derive the size
            font = font.deriveFont(28f);
            
            MemberName.setFont(font);
            CollegeName.setFont(font);
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
   public void ReadImage_DataBase()
   {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=MicroFinanceManagement;selectMethod=cursor", "sa", "123456");

            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM AdmissionForm WHERE MemberId=100";
            //System.out.println(sql);
            ResultSet resultSet = statement
                    .executeQuery(sql);

            //  String sql="SELECT * FROM AdmissionForm WHERE MemberId=?";
            
            while (resultSet.next()) {

                //    MemberName.setText(resultSet.getString("MemberName"));
                InputStream in = resultSet.getBinaryStream("MemberImage");
                Image image = ImageIO.read(in);
                newimg = image.getScaledInstance(190, 130, java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(newimg);
                MemberImage.setIcon(icon);
                MemberImage.revalidate();
              
                //
                Icon icons = MemberImage.getIcon();
                BufferedImage bi = new BufferedImage(icons.getIconWidth(), icons.getIconHeight(), BufferedImage.TYPE_INT_RGB);
                Graphics g = bi.createGraphics();
                icons.paintIcon(null, g, 0, 0);
                g.setColor(Color.WHITE);
                g.drawString(MemberImage.getText(), 10, 20);
                g.dispose();

                ByteArrayOutputStream os = new ByteArrayOutputStream();
                System.out.println("  Path "+os.toString());
                ImageIO.write(bi, "jpg", os);
                
                ImageIO.write(bi, "jpg", new File(
                "E:\\index.jpg"));
                
               // System.out.println("  Path "+os.toString());
                
                InputStream fis = new ByteArrayInputStream(os.toByteArray());
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                byte[] buf = new byte[1024];
                for (int readNum; (readNum = fis.read(buf)) != -1;) {
                    bos.write(buf, 0, readNum);
                    System.out.println("read " + readNum + " bytes,");
                }
               
                
              File fds=new File("E:\\index.jpg");
              //String paths="E:\\index.jpg";
              StringBuffer strBuffer = new StringBuffer();
               strBuffer.append("<table style=\"width:100%\">\n"
                    + "  <tr>\n"
                    + "    <th>লতিফ ছাত্রাবাস (পূর্ব  শাখা )</th>\n"
                    + //hostel name
                    "  </tr>\n"
                    + "  \n"
                    + "   <tr>\n"
                    + "    <th>ঢাকা পলিটেক ইনস্টিটিউট </th>\n"
                    + //adress
                    "  </tr>\n"
                    + "  \n"
                    + "</table>\n"
                    + "\n"
                    + "<table style=\"width:100%\">\n"
                    + "  <tr>\n"
                    + "    <th><img src=\""+fds+"\" alt=\"Trulli\" width=\"50\" height=\"53\"></th>\n"
                    + "    <th>তেজগাঁও, ঢাকা -১২০৮</th>\n"
                    +//address
                    "    <th>image</th>\n"
                    + "  </tr>\n"
                    + "</table>");

              //  jTextPane1.setText(strBuffer.toString()); 
             //   String url=MemberImage.getURL 

            
            
            

            }
               


            connection.close();
        }
    
    catch (Exception e) {
            e.printStackTrace();
    }

   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MemberImage = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        CollegeName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        MemberName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        MemberImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(MemberImage);
        MemberImage.setBounds(60, 30, 190, 130);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(110, 170, 73, 23);
        getContentPane().add(CollegeName);
        CollegeName.setBounds(100, 360, 250, 40);

        jLabel1.setText("institute");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 360, 50, 40);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(100, 230, 250, 40);
        getContentPane().add(MemberName);
        MemberName.setBounds(100, 290, 250, 40);

        jLabel2.setText("ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 230, 50, 40);

        jLabel3.setText("NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 290, 50, 40);

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(180, 430, 73, 50);

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(860, 530, 73, 40);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hostelmanagement/index.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 80, 140, 120);

        jLabel5.setText("TANSHEN IT SOLUTION ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(260, 110, 410, 70);

        jLabel6.setText("MD. TANVIR HASAN TANSHEN");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(80, 280, 530, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(520, 40, 710, 470);

        setSize(new java.awt.Dimension(1273, 643));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         JFileChooser chooser=new JFileChooser();
       chooser.showOpenDialog(null);
       File f=chooser.getSelectedFile();
       filename=f.getAbsolutePath();
       ImageIcon imageicon=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(MemberImage.getWidth(), MemberImage.getHeight(), 100));
       MemberImage.setIcon(imageicon);
       try
       {
           image=new File(filename);
           FileInputStream fis=new FileInputStream(image);
           
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf)) != -1;) 
            {
              bos.write(buf, 0, readNum);
             // System.out.println("read " + readNum + " bytes,");
            }
            
            personimage = bos.toByteArray();
            
            //JAVA CLASS 
            /*   StringBuffer strBuffer = new StringBuffer();
               strBuffer.append("<table style=\"width:100%\">\n"
                    + "  <tr>\n"
                    + "    <th>HOSTEL MANAGEMENT</th>\n"
                    + //hostel name
                    "  </tr>\n"
                    + "  \n"
                    + "   <tr>\n"
                    + "    <th>MD. TANVIR HASAN </th>\n"
                    + //adress
                    "  </tr>\n"
                    + "  \n"
                    + "</table>\n"
                    + "\n"
                    + "<table style=\"width:100%\">\n"
                    + "  <tr>\n"
                    + "    <th><img src=" +MemberImage.getIcon()+"></th>\n"  //READ FROM JLABEL
                    + "    <th>comilla victoria govt college</th>\n"
                    +//address
                    "    <th></th>\n"
                    + "  </tr>\n"
                    + "</table>");

                jTextPane1.setText(strBuffer.toString());
             //   String url=MemberImage.getURL */ 

            
           
       }catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         StringBuffer strBuffer = new StringBuffer();
         
          String name=MemberName.getText();
          String college=CollegeName.getText();
          
          
       //   in = resultSet.getBinaryStream("MemberImage");
      
                 strBuffer.append("<table style=\"width:100%\">\n"
                    + "  <tr>\n"
                    + "    <th>লতিফ ছাত্রাবাস (পূর্ব  শাখা )</th>\n"
                    + //hostel name
                    "  </tr>\n"
                    + "  \n"
                    + "   <tr>\n"
                    + "    <th>ঢাকা পলিটেক ইনস্টিটিউট </th>\n"
                    + //adress
                    "  </tr>\n"
                    + "  \n"
                    + "</table>\n"
                    + "\n"
                    + "<table style=\"width:100%\">\n"
                    + "  <tr>\n"
                    + "    <th><img src='" +MemberImage.getIcon()+ "'style=\"width:50px;height:50px;></th>\n"
                    + "    <th>তেজগাঁও, ঢাকা -১২০৮</th>\n"
                    +//address
                    "    <th>image</th>\n"
                    + "  </tr>\n"
                    + "</table>");

      //      jTextPane1.setText(strBuffer.toString());

      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try
        {
            Toolkit tkp = jPanel1.getToolkit();
            PrintJob pjp = tkp.getPrintJob(this, null, null);
            Graphics g = pjp.getGraphics();
            jPanel1.print(g);
            g.dispose();
            pjp.end();
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(PrintAdmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrintAdmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrintAdmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrintAdmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrintAdmission().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CollegeName;
    private javax.swing.JLabel MemberImage;
    private javax.swing.JTextField MemberName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
