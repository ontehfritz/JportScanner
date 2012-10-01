/*
 * JFrame.java
 *
 * Created on June 23, 2002, 12:54 PM
 */

//package JPortScanner;
import java.io.*;
import javax.swing.Timer.*;
import java.net.*;


/**
 *
 * @author  nameless1
 */
public class JFrame extends javax.swing.JFrame {

    TextFileIO txtFile;
    public static Thread scanPorts;
    /** Creates new form JFrame */
    public JFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        jPanel1 = new javax.swing.JPanel();
        txtHost2IP4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResults = new javax.swing.JTextArea();
        btnScan = new javax.swing.JButton();
        txtMinPort = new javax.swing.JTextField();
        txtMaxPort = new javax.swing.JTextField();
        scanProgress = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        btnStop = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtHost2IP3 = new javax.swing.JTextField();
        chkEnable = new javax.swing.JCheckBox();
        txtHostIP1 = new javax.swing.JTextField();
        txtHostIP2 = new javax.swing.JTextField();
        txtHostIP3 = new javax.swing.JTextField();
        txtHostIP4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton111 = new javax.swing.JButton();
        txtScanInfo = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        lblOpenPorts = new javax.swing.JLabel();
        txtPath = new javax.swing.JTextField();

        setTitle("JPortScanner v0.3a");
        setName("main");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jPanel1.setLayout(null);

        jPanel1.setBackground(java.awt.Color.lightGray);
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setForeground(new java.awt.Color(102, 102, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 4));
        jPanel1.setPreferredSize(new java.awt.Dimension(480, 325));
        txtHost2IP4.setBackground(new java.awt.Color(153, 153, 153));
        txtHost2IP4.setBorder(new javax.swing.border.BevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtHost2IP4.setEnabled(false);
        jPanel1.add(txtHost2IP4);
        txtHost2IP4.setBounds(140, 50, 30, 20);

        txtResults.setBackground(new java.awt.Color(0, 0, 0));
        txtResults.setFont(new java.awt.Font("Arial", 1, 12));
        txtResults.setForeground(new java.awt.Color(0, 204, 102));
        txtResults.setBorder(new javax.swing.border.BevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane1.setViewportView(txtResults);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 170, 460, 140);

        btnScan.setBackground(java.awt.Color.gray);
        btnScan.setForeground(new java.awt.Color(0, 0, 0));
        btnScan.setText("SCAN");
        btnScan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnScan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScanActionPerformed(evt);
            }
        });

        jPanel1.add(btnScan);
        btnScan.setBounds(200, 10, 80, 22);

        txtMinPort.setText("1");
        txtMinPort.setToolTipText("Min port");
        txtMinPort.setBorder(new javax.swing.border.BevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtMinPort.setMinimumSize(new java.awt.Dimension(20, 30));
        txtMinPort.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(txtMinPort);
        txtMinPort.setBounds(300, 20, 50, 20);

        txtMaxPort.setText("65535");
        txtMaxPort.setToolTipText("current port");
        txtMaxPort.setBorder(new javax.swing.border.BevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtMaxPort.setPreferredSize(new java.awt.Dimension(50, 20));
        txtMaxPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaxPortActionPerformed(evt);
            }
        });

        jPanel1.add(txtMaxPort);
        txtMaxPort.setBounds(400, 20, 60, 20);

        scanProgress.setBackground(new java.awt.Color(255, 255, 255));
        scanProgress.setForeground(new java.awt.Color(255, 51, 51));
        scanProgress.setToolTipText("Scan Progress");
        scanProgress.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(scanProgress);
        scanProgress.setBounds(10, 150, 460, 20);

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("to");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(360, 20, 40, 20);

        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Possible # of Vulnerablities");
        jPanel1.add(jLabel32);
        jLabel32.setBounds(10, 80, 180, 16);

        btnStop.setBackground(java.awt.Color.gray);
        btnStop.setForeground(new java.awt.Color(0, 0, 0));
        btnStop.setText("STOP");
        btnStop.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        jPanel1.add(btnStop);
        btnStop.setBounds(200, 40, 80, 22);

        jLabel5.setBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EtchedBorder(), "TCP/IP PORTS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(290, 0, 180, 50);

        txtHost2IP3.setBackground(new java.awt.Color(153, 153, 153));
        txtHost2IP3.setBorder(new javax.swing.border.BevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtHost2IP3.setEnabled(false);
        jPanel1.add(txtHost2IP3);
        txtHost2IP3.setBounds(100, 50, 30, 20);

        chkEnable.setFont(new java.awt.Font("Dialog", 1, 10));
        chkEnable.setText("IP RANGE");
        chkEnable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEnableActionPerformed(evt);
            }
        });

        jPanel1.add(chkEnable);
        chkEnable.setBounds(20, 50, 70, 22);

        txtHostIP1.setText("127");
        txtHostIP1.setBorder(new javax.swing.border.BevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txtHostIP1);
        txtHostIP1.setBounds(20, 20, 30, 20);

        txtHostIP2.setText("0");
        txtHostIP2.setBorder(new javax.swing.border.BevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txtHostIP2);
        txtHostIP2.setBounds(60, 20, 30, 20);

        txtHostIP3.setText("0");
        txtHostIP3.setBorder(new javax.swing.border.BevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txtHostIP3);
        txtHostIP3.setBounds(100, 20, 30, 20);

        txtHostIP4.setText("1");
        txtHostIP4.setBorder(new javax.swing.border.BevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txtHostIP4);
        txtHostIP4.setBounds(140, 20, 30, 20);

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EtchedBorder(), "Enter IP", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 180, 80);

        jButton111.setBackground(java.awt.Color.gray);
        jButton111.setForeground(new java.awt.Color(0, 0, 0));
        jButton111.setText("ABOUT");
        jButton111.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton111ActionPerformed(evt);
            }
        });

        jPanel1.add(jButton111);
        jButton111.setBounds(200, 70, 80, 22);

        txtScanInfo.setBackground(new java.awt.Color(0, 0, 0));
        txtScanInfo.setFont(new java.awt.Font("Arial", 1, 12));
        txtScanInfo.setForeground(new java.awt.Color(0, 204, 51));
        txtScanInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel1.add(txtScanInfo);
        txtScanInfo.setBounds(300, 70, 160, 60);

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EtchedBorder(), "SCANNING", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(290, 50, 180, 90);

        lblOpenPorts.setFont(new java.awt.Font("Arial", 1, 24));
        lblOpenPorts.setForeground(new java.awt.Color(0, 0, 0));
        lblOpenPorts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblOpenPorts);
        lblOpenPorts.setBounds(10, 100, 170, 40);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        txtPath.setText("Output:");
        txtPath.setToolTipText("current port");
        txtPath.setBorder(new javax.swing.border.EmptyBorder(new java.awt.Insets(1, 1, 1, 1)));
        txtPath.setPreferredSize(new java.awt.Dimension(50, 20));
        getContentPane().add(txtPath, java.awt.BorderLayout.SOUTH);

        pack();
    }//GEN-END:initComponents

    private void jButton111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton111ActionPerformed
        // Add your handling code here:
    }//GEN-LAST:event_jButton111ActionPerformed

    private void chkEnableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEnableActionPerformed

          if(chkEnable.isSelected()){

                txtHost2IP3.enable();
                txtHost2IP3.setBackground(new java.awt.Color(255, 255, 255));
                txtHost2IP4.enable();
                txtHost2IP4.setBackground(new java.awt.Color(255, 255, 255));
          }
          else{

                txtHost2IP3.disable();
                txtHost2IP3.setBackground(new java.awt.Color(153, 153, 153));
                txtHost2IP4.disable();
                txtHost2IP4.setBackground(new java.awt.Color(153, 153, 153));
          }







    }//GEN-LAST:event_chkEnableActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        scanPorts.stop();

    }//GEN-LAST:event_btnStopActionPerformed

    private void btnScanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScanActionPerformed




                lblOpenPorts.setText("0");

               btnScan.disable();

    class SearchPorts implements Runnable{
        public void run(){
            String host = txtHostIP1.getText() + "." + txtHostIP2.getText() +
            "." + txtHostIP3.getText() + "." + txtHostIP4.getText();


            txtPath.setText("Output File: " + host);
            TextFileIO file = new TextFileIO(host + "");
            String s = new String();
            int min = 0,max = 0;
            try{
                min = Integer.parseInt(txtMinPort.getText());
                if(min < 1){
                    min = 1;
                }
                max = Integer.parseInt(txtMaxPort.getText());
                if(max > 65535){
                        max = 65535;
                }
            }catch(NumberFormatException e){
                System.out.println("Error:" + " " + e);
            }


            boolean checkport = true;
            //SocketFun socketsearch = new SocketFun(host,min);
            scanProgress.setMaximum(max - min);


            int [] ipset1;
            int [] ipset2;
            ipset1 = new int[4];
            ipset1[0] =  Integer.parseInt(txtHostIP4.getText());
            ipset1[1] =  Integer.parseInt(txtHostIP3.getText());
            ipset1[2] =  Integer.parseInt(txtHostIP2.getText());
            ipset1[3] =  Integer.parseInt(txtHostIP1.getText());

            //int ipset2 = ipset;
            int openport = 0;
             if(chkEnable.isSelected()){
                  txtResults.setText("");
                 ipset2 = new int[2];
                 ipset2[0] = Integer.parseInt(txtHost2IP3.getText());
                 ipset2[1] = Integer.parseInt(txtHost2IP4.getText());

                 for(int ip3 = ipset1[1]; ip3 <= ipset2[0]; ip3++){

                     for(int ip4 = ipset1[0]; ip4 <= ipset2[1]; ip4++){
                          openport = 0;
                           lblOpenPorts.setText(Integer.toString(openport));
                         s = txtResults.getText();
                         host = (txtHostIP1.getText() + "." + txtHostIP2.getText() +
            "." + Integer.toString(ip3) + "." + Integer.toString(ip4));
                           txtResults.setText( txtResults.getText() + "           ------------------------------------ Scan: " + host + " ------------------------------------     \n");
                          SocketFun socketsearch = new SocketFun(host,min);
                          for(int i = min; i <= max; i++){
                    scanProgress.setValue(i-min);
                    checkport = socketsearch.testConnection();
                    if(checkport == false){
                        txtResults.setText("Host unreachable!");
                        break;

                    }
                    checkport = socketsearch.makeConnection();

			if(checkport == true){
                            openport++;
                            s = s + "Port: " + (i - 1) + " " + "is open\n";
                            txtResults.setText(txtResults.getText() + "Port: " + (i - 1) + " " + "is open\n");

                           lblOpenPorts.setText(Integer.toString(openport));
                            socketsearch.closeConnection();
			}
			txtScanInfo.setText("Host: " + host +  "\n\nPort: " + Integer.toString(i));
			socketsearch.setPort(i);

		}

                        txtResults.setText(txtResults.getText() + "           ------------------------------------ Scan Complete ------------------------------------     \n");

                     }



                 }

                   file.setText(s);

             }
             else{
                  txtResults.setText("           ------------------------------------ Scan: " + host + " ------------------------------------     \n");
              SocketFun socketsearch = new SocketFun(host,min);
         //for(int ip = ipset; ip <= ipset2; ip++){

                for(int i = min; i <= max; i++){
                    scanProgress.setValue(i-min);
                    checkport = socketsearch.testConnection();
                    if(checkport == false){
                        txtResults.setText("Host unreachable!");
                        break;

                    }
                    checkport = socketsearch.makeConnection();

			if(checkport == true){
                            openport++;
                            s = s + "Port: " + (i - 1) + " " + "is open\n";
                            txtResults.setText(txtResults.getText() + "Port: " + (i - 1) + " " + "is open\n");

                           lblOpenPorts.setText(Integer.toString(openport));
                            socketsearch.closeConnection();
			}
			txtScanInfo.setText("Host: " + host +  "\n\nPort: " + Integer.toString(i));
			socketsearch.setPort(i);

		}
                   txtResults.setText(txtResults.getText() + "           ------------------------------------ Scan Complete ------------------------------------     \n");
                   btnScan.enable(true);
                   file.setText(s);
               // socketsearch.closeConnection();
               }

           }


        }

                SearchPorts s = new SearchPorts();
                scanPorts = new Thread(s);
                scanPorts.start();

    }//GEN-LAST:event_btnScanActionPerformed

    private void txtMaxPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaxPortActionPerformed
        // Add your handling code here:
    }//GEN-LAST:event_txtMaxPortActionPerformed

    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new JFrame().show();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStop;
    private javax.swing.JButton btnScan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtPath;
    private javax.swing.JTextField txtHostIP4;
    private javax.swing.JTextField txtMaxPort;
    private javax.swing.JTextField txtHostIP3;
    private javax.swing.JTextField txtHostIP2;
    private javax.swing.JTextField txtHost2IP4;
    private javax.swing.JTextField txtHostIP1;
    private javax.swing.JTextField txtHost2IP3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea txtResults;
    private javax.swing.JTextField txtMinPort;
    private javax.swing.JTextArea txtScanInfo;
    private javax.swing.JButton jButton111;
    private javax.swing.JLabel lblOpenPorts;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar scanProgress;
    private javax.swing.JCheckBox chkEnable;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}