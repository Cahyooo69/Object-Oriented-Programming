/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UjiCobaUTSpbo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ncahy
 */
public class Uts extends javax.swing.JFrame {

    private final String[] columns = {"ISBN", "judul_buku", "tahun_terbit", "penerbit"};
    private final ArrayList<String[]> dataList = new ArrayList<>();
    Connection conn;

    String driver = "org.postgresql.Driver";
    String koneksi = "jdbc:postgresql://localhost:5432/UTSpbo";
    String user = "postgres";
    String password = "codotganteng";

    public final void getAllData() {
        try {
            dataList.clear();
            String sql = "SELECT * FROM buku";
            conn = DriverManager.getConnection(koneksi, user, password);
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeQuery();
            final ResultSet data = ps.getResultSet();
            while (data.next()) {
                final String[] row = new String[]{
                    data.getString("isbn"),
                    data.getString("judul_buku"),
                    data.getString("tahun_penerbit"),
                    data.getString("penerbit")};
                dataList.add(row);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * Creates new form Uts
     */
    public final void refreshModel() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        for (String[] data : dataList) {
            model.addRow(data);
        }
        Table.setModel(model);
    }
    
    public Uts() {
        initComponents();
        this.getAllData();
        this.refreshModel();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TFisbn = new javax.swing.JTextField();
        TFjudul_buku = new javax.swing.JTextField();
        TFtahun_penerbit = new javax.swing.JTextField();
        TFpenerbit = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Binsert = new javax.swing.JButton();
        Bdelete = new javax.swing.JButton();
        Bclear = new javax.swing.JButton();
        Bupdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("BUKU");

        jLabel2.setText("ISBN");

        jLabel3.setText("Judul Buku");

        jLabel4.setText("Tahun Terbit");

        jLabel5.setText("Penerbit");

        TFisbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFisbnActionPerformed(evt);
            }
        });

        TFjudul_buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFjudul_bukuActionPerformed(evt);
            }
        });

        TFtahun_penerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFtahun_penerbitActionPerformed(evt);
            }
        });

        TFpenerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFpenerbitActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        Binsert.setText("INSERT");
        Binsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BinsertActionPerformed(evt);
            }
        });

        Bdelete.setText("DELETE");
        Bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdeleteActionPerformed(evt);
            }
        });

        Bclear.setText("CLEAR");
        Bclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BclearActionPerformed(evt);
            }
        });

        Bupdate.setText("UPDATE");
        Bupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BupdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Binsert, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(TFisbn)
                            .addComponent(TFjudul_buku)
                            .addComponent(TFtahun_penerbit)
                            .addComponent(TFpenerbit, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bdelete)
                        .addGap(18, 18, 18)
                        .addComponent(Bclear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Bupdate)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFisbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFjudul_buku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TFtahun_penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TFpenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Binsert)
                    .addComponent(Bdelete)
                    .addComponent(Bclear)
                    .addComponent(Bupdate))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BinsertActionPerformed
        // TODO add your handling code here:
        String ISBN = TFisbn.getText();
        String judul_buku= TFjudul_buku.getText();
        String tahun_penerbit = TFtahun_penerbit.getText();
        String penerbit = TFpenerbit.getText();
        if (ISBN.trim().isEmpty() && judul_buku.trim().isEmpty() && tahun_penerbit.trim().isEmpty() && penerbit.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "masukan data anda");

        } else if (ISBN.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "masukan ISBN");
        } else if (judul_buku.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "masukan Judul Buku");
        } else if (tahun_penerbit.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "masukan Tahun Penerbit");
        } else if (penerbit.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "masukan Penerbit");
        }
        else {
            PreparedStatement preparedStatement;
            try {
                String sql = "INSERT INTO buku (isbn, judul_buku, tahun_penerbit, penerbit) VALUES (?, ?, ?, ?)";

                preparedStatement = conn.prepareStatement(sql);

                preparedStatement.setString(1, TFisbn.getText());
                preparedStatement.setString(2, TFjudul_buku.getText());
                preparedStatement.setString(3, TFtahun_penerbit.getText());
                preparedStatement.setString(4, TFpenerbit.getText());

                preparedStatement.executeUpdate();
                this.getAllData();
                this.refreshModel();
                JOptionPane.showMessageDialog(this, "data berhasil ditambahkan");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "data gagal ditambahkan", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BinsertActionPerformed

    private void TFisbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFisbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFisbnActionPerformed

    private void TFjudul_bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFjudul_bukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFjudul_bukuActionPerformed

    private void TFtahun_penerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFtahun_penerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFtahun_penerbitActionPerformed

    private void TFpenerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFpenerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFpenerbitActionPerformed

    private void BdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdeleteActionPerformed
        // TODO add your handling code here:
        Statement statement;
        String isbn = TFisbn.getText();
        if (isbn.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error ngab", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                String query = String.format("Delete from buku where isbn ='%s'", isbn);
                statement = conn.createStatement();
                statement.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "data berhasil dihapus");
                this.getAllData();
                this.refreshModel();
            } catch (SQLException e) {

                JOptionPane.showMessageDialog(this, "data gagal dihapus");
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_BdeleteActionPerformed

    private void BupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BupdateActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "update buku set judul_buku =?,  tahun_penerbit = ?, penerbit = ? where isbn = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, TFjudul_buku.getText());
            ps.setString(2, TFtahun_penerbit.getText());
            ps.setString(3, TFpenerbit.getText());
            ps.setString(4, TFisbn.getText());
            int row = ps.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(this, "Update Berhasil");
                this.getAllData();
                this.refreshModel();
                
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BupdateActionPerformed

    private void BclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BclearActionPerformed
        // TODO add your handling code here:
        TFisbn.setText("");
        TFjudul_buku.setText("");
        TFtahun_penerbit.setText("");
        TFpenerbit.setText("");
    }//GEN-LAST:event_BclearActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
        int selectedRow = Table.getSelectedRow();
        if (selectedRow != -1) {
            String isbn = Table.getValueAt(selectedRow, 0).toString();
            String judul_buku = Table.getValueAt(selectedRow, 1).toString();
            String tahun_penerbit = Table.getValueAt(selectedRow, 2).toString();
            String penerbit = Table.getValueAt(selectedRow, 2).toString();

            TFisbn.setText(isbn);
            TFjudul_buku.setText(judul_buku);
            TFtahun_penerbit.setText(tahun_penerbit);
            TFpenerbit.setText(penerbit);
        }
    }//GEN-LAST:event_TableMouseClicked

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
            java.util.logging.Logger.getLogger(Uts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Uts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Uts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Uts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Uts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bclear;
    private javax.swing.JButton Bdelete;
    private javax.swing.JButton Binsert;
    private javax.swing.JButton Bupdate;
    private javax.swing.JTextField TFisbn;
    private javax.swing.JTextField TFjudul_buku;
    private javax.swing.JTextField TFpenerbit;
    private javax.swing.JTextField TFtahun_penerbit;
    private javax.swing.JTable Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
