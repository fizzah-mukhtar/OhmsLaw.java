import java.text.DecimalFormat;
public class ohms_law extends javax.swing.JFrame {
    public ohms_law() {
        initComponents();
    }
    
    private void calculatebtnActionPerformed(java.awt.event.ActionEvent evt) {                                             
       DecimalFormat numberFormatter = new DecimalFormat("#,##0.0##");
float volts, resistance, current;
volts = Float.parseFloat(jTextField1.getText());
resistance = Float.parseFloat(jTextField2.getText());
current = volts/resistance;
jTextField3.setText(numberFormatter.format(current));
    }                                            

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
      
        jTextField1.setText("");
jTextField2.setText("");
jTextField3.setText("");
jTextField1.requestFocus();
    }                                        

    private void quitbtnActionPerformed(java.awt.event.ActionEvent evt) {                                        

        System.exit(0);
    }                                       

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ohms_law().setVisible(true);
            }
        });
    }
