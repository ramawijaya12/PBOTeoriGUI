/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author RAMA
 */
public class tambah_data extends javax.swing.JInternalFrame {

    /**
     * Creates new form tambah_data
     */
    public tambah_data() {
        initComponents();
    }
    Connection kon = null;
    Statement st = null;
    ResultSet rs = null;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pemilik = new javax.swing.JLabel();
        lokasi = new javax.swing.JLabel();
        panjang = new javax.swing.JLabel();
        lebar = new javax.swing.JLabel();
        harga = new javax.swing.JLabel();
        harga_total = new javax.swing.JLabel();
        txt_pemilik = new javax.swing.JTextField();
        txt_lokasi = new javax.swing.JTextField();
        txt_panjang = new javax.swing.JTextField();
        txt_lebar = new javax.swing.JTextField();
        txt_harga = new javax.swing.JTextField();
        txt_harga_total = new javax.swing.JTextField();
        btn_hitung = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("TAMBAH DATA PENJUALAN TANAH");

        pemilik.setText("PEMILIK                          : ");

        lokasi.setText("LOKASI                           :");

        panjang.setText("PANJANG TANAH /m2    :");

        lebar.setText("LEBAR TANAH/m2          :");

        harga.setText("HARGA/m2                    :");

        harga_total.setText("HARGA TOTAL   Rp.");

        txt_pemilik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pemilikActionPerformed(evt);
            }
        });

        btn_hitung.setText("HITUNG");
        btn_hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hitungActionPerformed(evt);
            }
        });

        jButton1.setText("TAMBAHKAN DATA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pemilik)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_pemilik, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lokasi)
                                            .addComponent(panjang)
                                            .addComponent(lebar))
                                        .addGap(13, 13, 13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_panjang, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                            .addComponent(txt_lokasi)
                                            .addComponent(txt_lebar)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(harga)
                                            .addComponent(harga_total))
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_harga)
                                            .addComponent(txt_harga_total))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_hitung))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jButton1)))))))
                .addContainerGap(320, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pemilik)
                    .addComponent(txt_pemilik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lokasi)
                    .addComponent(txt_lokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panjang)
                    .addComponent(txt_panjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lebar)
                    .addComponent(txt_lebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(harga)
                    .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hitung))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(harga_total)
                    .addComponent(txt_harga_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_pemilikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pemilikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pemilikActionPerformed

    private void btn_hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hitungActionPerformed
        // TODO add your handling code here:
        float a = Float.parseFloat(txt_panjang.getText());
        float b = Float.parseFloat(txt_lebar.getText());
        float c = Float.parseFloat(txt_harga.getText());
        double d = a*b*c;
        DecimalFormat df = new DecimalFormat("#");
        df.setMinimumFractionDigits(0);
        String result = String.valueOf(df.format(d));
        txt_harga_total.setText(result);
    }//GEN-LAST:event_btn_hitungActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String sql = "INSERT INTO `tanah` (`pemilik`, `lokasi`, `panjang`, `lebar`, `harga`, `hargatotal`) "
                + "VALUES ('"+txt_pemilik.getText()+"', '"+txt_lokasi.getText()+"', '"+txt_panjang.getText()+"', '"+txt_lebar.getText()+"', '"+txt_harga.getText()+"', '"+txt_harga_total.getText()+"') ";
        
        try {
            kon = Koneksi.getConnection();
            st = kon.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "Berhasil Dimasukkan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hitung;
    private javax.swing.JLabel harga;
    private javax.swing.JLabel harga_total;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lebar;
    private javax.swing.JLabel lokasi;
    private javax.swing.JLabel panjang;
    private javax.swing.JLabel pemilik;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_harga_total;
    private javax.swing.JTextField txt_lebar;
    private javax.swing.JTextField txt_lokasi;
    private javax.swing.JTextField txt_panjang;
    private javax.swing.JTextField txt_pemilik;
    // End of variables declaration//GEN-END:variables
}
