/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
//import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import products.Entry;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import java.util.Properties;
import java.util.Vector;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;

import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import sun.rmi.transport.Transport;
public class cart extends javax.swing.JFrame {
   //Connection conn;
   // ResultSet rs;
    //PreparedStatement st;

    /**
     * Creates new form cart
     */
    String recipient;
   public cart() {
      super("cart");
        initComponents();
      //  this.recipient=recipient;
       
    }
    String price,brand,Model,description;
    /*public cart(String price,String brand,String Model,String description)
    {
        initComponents();
        this.price=price;
        this.Model=Model;
        this.brand=brand;
        this.description=description;
        
        fetchdata();
        JOptionPane.showMessageDialog(null,"Added To Cart");
    }*/
    public cart(Vector<Entry> v,int i){
        initComponents();
        i=i-1;
        int tot_cost=0,p;
        while(i>=0){
            Entry e = v.get(i);
             this.price=e.price;
             this.Model=e.Model;
             this.brand=e.brand;
             this.description=e.description;
             i--;
             addDataToTable();
             try{
             p=Integer.parseInt(e.price);
            tot_cost=tot_cost+p;
             }catch(Exception ex){
                 JOptionPane.showMessageDialog(null,e);
             }
            
        }
        String final_val=Integer.toString(tot_cost);
        finalprice.setText(final_val);
       
    }
    //public String toString(int tot_cost)
    //{
      //  String final_val= tot_cost;
       // return final_val;
   // }
//public ArrayList<Items> details()
    //{
       // ArrayList<Items> details=new ArrayList<>();
        //try
        //{
           // String query1="SELECT * FROM mobiletabs";
           // st=conn.prepareStatement(query1);
            
            //rs=st.executeQuery(query1);
            //Items item;
            //while(rs.next())
            //{
               // item=new Items(rs.getString("price"),rs.getString("brand"),rs.getString("model"),rs.getString("descrip"));
               // details.add(item);
                
           // }
            
            
        //}catch(Exception e)
        //{
           // e.printStackTrace();
            //JOptionPane.showMessageDialog(null,e);
        //}
        //return details;
        
    //}//
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        finalprice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "brand", "model", "price", "description"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(jScrollPane1);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("BUY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("TOTAL AMOUNT :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finalprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(60, 60, 60)
                .addComponent(jButton2)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jLabel1)
                    .addComponent(finalprice, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        setSize(new java.awt.Dimension(484, 393));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        MobileAndTabs h=new MobileAndTabs();
        h.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        email_id e=new email_id();
        e.setVisible(true);
        
        
        // email ID of Recipient. 
      
       
       
       
       
      
  
      // Setting up mail server 
      
      
  
      // creating session object to get properties 
       
  
     // try 
      //{ 
       //  String sender = "rahul.mistry@somaiya.edu"; 
    //  String password="S@123456";
     // String subject="Ekart invoice";
     // String mssg="Thank you for purchasing from Ekart";
     // boolean sessionDebug=false;
  
      // email ID of  Sender. 
      //String recipient = "k.mataghare@somaiya.edu"; 
  
      // using host as localhost 
     // String host = "smtp.gmail.com"; 
  
      // Getting system properties 
     // Properties properties = System.getProperties(); 
     // properties.put("mail.smtp.starttls.enable","true");
     // properties.put("mail.smtp.port","587");
     //  properties.put("mail.smtp.auth","true");
     //  properties.put("mail.smtp.starttls.required","true");
      // properties.setProperty("mail.smtp.host", host); 
        
      // java.security.Security.addProvider(new com.sum.net.ssl.internal.ssl.Provider());
      // Session mailSession=Session.getDefaultInstance(properties,null);
      // mailSession.setDebug(sessionDebug);
      // Message msg=(Message) new MimeMessage(mailSession);
      // msg.setFrom(new InternetAddress(sender));
        //  InternetAddress[] address={new InternetAddress(recipient)};
           
     // msg.setRecipients(Message.RecipientType.TO,address);
      //msg.setSubject(subject);
     //msg.setSentDate(new Date());
     // msg.setText(mssg);
      //Transport transport=mailSession.getTransport("smtp");
      //transport.connect(host,sender,password);
      //transport.sendMessage(msg,msg.getAllRecipients());
      //transport.close();
     // JOptionPane.showMessageDialog(null,"Ordered Successfully");
      
      
      
      
      
      
       
          
     // } 
     // catch (Exception e)  
     // { 
     //    JOptionPane.showMessageDialog(null,e);
     // } 
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public  void addDataToTable()
    {
       // Entry e=new Entry();
        
        Vector v;
        //ArrayList<Items> list=details();
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        v=new Vector();
       v.add(brand);
       v.add(Model);
       v.add(price);
       v.add(description);
       model.addRow(v);
       
        
        
                
        
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
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cart().setVisible(true);
                //cart c=new cart();
                //c.addDataToTable();
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel finalprice;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
