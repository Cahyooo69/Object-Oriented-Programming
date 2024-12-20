/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pboUAS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ncahy
 */
public class Uas extends javax.swing.JFrame {

    private final String[] columns = {"nim", "nama" , "alamat", "asal_sma", "nama_orangtua"};
    private final ArrayList<String[]> dataList = new ArrayList<>();
    Connection conn;
    Mahasiswa mahasiswa = new Mahasiswa();
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("cobaCrudPU");
    EntityManager em = emf.createEntityManager();

    String driver = "org.postgresql.Driver";
    String koneksi = "jdbc:postgresql://localhost:5432/pboUTS";
    String user = "postgres";
    String password = "codotganteng";

//    public final void getAllData() {
//        try {
//            dataList.clear();
//            String sql = "SELECT * FROM matakuliah order by kode_mk asc";
//            conn = DriverManager.getConnection(koneksi, user, password);
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.executeQuery();
//            final ResultSet data = ps.getResultSet();
//            while (data.next()) {
//                final String[] row = new String[]{
//                    data.getString("kode_mk"),
//                    data.getString("sks"),
//                    data.getString("nama_mk"),
//                    data.getString("semester_ajar")};
//                dataList.add(row);
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }
    
    public void tampilPU() {
        em = emf.createEntityManager();

        try {
            // Buat model tabel dengan kolom yang sesuai
            DefaultTableModel tbnmhs = new DefaultTableModel(new String[]{"nim", "nama", "alamat", "asal_sma", "nama_orangtua"}, 0);

            // Menggunakan NamedQuery "Matakuliah.findAll" untuk mengambil semua data
            List<Mahasiswa> mahaSiswaList = em.createNamedQuery("Mahasiswa.findAll", Mahasiswa.class).getResultList();

            // Iterasi hasil query dan tambahkan baris ke model tabel
            for (Mahasiswa mahasiswa : mahaSiswaList) {
                tbnmhs.addRow(new Object[]{
                    mahasiswa.getNim(),
                    mahasiswa.getNama(),
                    mahasiswa.getAlamat(),
                    mahasiswa.getAsalSma(),
                    mahasiswa.getNamaOrangtua()
                });
            }

            // Atur model tabel ke tabel GUI
            Table.setModel(tbnmhs);
        } catch (Exception ex) {
        }
    }

    

    /**
     * Creates new form Uas
     */
    public final void refreshModel() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        for (String[] data : dataList) {
            model.addRow(data);
        }
        Table.setModel(model);
    }

    public Uas() {
        initComponents();
        Bupdate.setEnabled(false);
        tampilPU();
        try{
            conn=DriverManager.getConnection(koneksi, user, password);
        }
        catch(Exception e){
            
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

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TFnama = new javax.swing.JTextField();
        TFalamat = new javax.swing.JTextField();
        TFasalsma = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Binsert = new javax.swing.JButton();
        Bdelete = new javax.swing.JButton();
        Bclear = new javax.swing.JButton();
        Bupdate = new javax.swing.JButton();
        Bcetak = new javax.swing.JButton();
        Bupload = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TFnamaortu = new javax.swing.JTextField();
        TFnim = new javax.swing.JTextField();
        Blogout = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("MAHASISWA");

        jLabel2.setText("NIM");

        jLabel3.setText("Nama");

        jLabel4.setText("Alamat");

        jLabel5.setText("AsalSMA");

        TFnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFnamaActionPerformed(evt);
            }
        });

        TFalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFalamatActionPerformed(evt);
            }
        });

        TFasalsma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFasalsmaActionPerformed(evt);
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

        Bcetak.setText("CETAK");
        Bcetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcetakActionPerformed(evt);
            }
        });

        Bupload.setText("UPLOAD");
        Bupload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuploadActionPerformed(evt);
            }
        });

        jLabel6.setText("Nama Orang Tua");

        TFnamaortu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFnamaortuActionPerformed(evt);
            }
        });

        Blogout.setText("LOGOUT");
        Blogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Binsert, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bdelete)
                        .addGap(18, 18, 18)
                        .addComponent(Bclear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Bupdate))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TFnama)
                            .addComponent(TFalamat)
                            .addComponent(TFasalsma)
                            .addComponent(TFnamaortu, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(TFnim))))
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Bupload)
                                .addGap(18, 18, 18)
                                .addComponent(Bcetak, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(93, 93, 93)
                                .addComponent(Blogout, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Blogout)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(TFalamat, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFasalsma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFnamaortu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Binsert)
                    .addComponent(Bdelete)
                    .addComponent(Bclear)
                    .addComponent(Bupdate))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bcetak)
                    .addComponent(Bupload))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BinsertActionPerformed
        // TODO add your handling code here:
        String nim = TFnim.getText();
        String nama = TFnama.getText();
        String alamat = TFalamat.getText();
        String asal_sma = TFasalsma.getText();
        String nama_orangtua = TFnamaortu.getText();
        if (nim.trim().isEmpty() && nama.trim().isEmpty() && alamat.trim().isEmpty() && asal_sma.trim().isEmpty() && nama_orangtua.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "masukan data anda");

        } else if (nim.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "masukan NIM");
        } else if (nama.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "masukan Nama");
        } else if (alamat.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "masukan Alamat");
        } else if (asal_sma.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "masukan Asal SMA");
        } else if (nama_orangtua.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "masukan Nama orangtua");}
        else {
            em.getTransaction().begin();
            mahasiswa.setNim(TFnim.getText());
            mahasiswa.setNama(TFnama.getText());
            mahasiswa.setAlamat(TFalamat.getText());
            mahasiswa.setAsalSma(TFasalsma.getText());
            mahasiswa.setNamaOrangtua(TFnamaortu.getText());
            em.persist(mahasiswa);
            em.getTransaction().commit();
            tampilPU();

                Bupdate.setEnabled(false);
                TFnim.setEditable(true);
                JOptionPane.showMessageDialog(this, "data berhasil ditambahkan");

            
        };
    }//GEN-LAST:event_BinsertActionPerformed

    private void TFnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFnamaActionPerformed

    private void TFalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFalamatActionPerformed

    private void TFasalsmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFasalsmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFasalsmaActionPerformed

    private void BdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdeleteActionPerformed
        // TODO add your handling code here:
        String nim = TFnim.getText();
        if (nim.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error ngab", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            em.getTransaction().begin();

            mahasiswa = em.find(Mahasiswa.class, TFnim.getText());
            em.remove(mahasiswa);
            em.getTransaction().commit();
            
            tampilPU();
        }
    }//GEN-LAST:event_BdeleteActionPerformed

    private void BupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BupdateActionPerformed
        // TODO add your handling code here:
        em.getTransaction().begin();

            mahasiswa = em.find(Mahasiswa.class, TFnim.getText());

            mahasiswa.setNim(TFnim.getText());
            mahasiswa.setNama(TFnama.getText());
            mahasiswa.setAlamat(TFalamat.getText());
            mahasiswa.setAsalSma(TFasalsma.getText());
            mahasiswa.setNamaOrangtua(TFnamaortu.getText());
            em.persist(mahasiswa);
            em.getTransaction().commit();
            
            tampilPU();
    }//GEN-LAST:event_BupdateActionPerformed

    private void BclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BclearActionPerformed
        // TODO add your handling code here:
        TFnim.setText("");
        TFnama.setText("");
        TFalamat.setText("");
        TFasalsma.setText("");
        TFnamaortu.setText("");
        Bupdate.setEnabled(false);
        TFnim.setEditable(true);
    }//GEN-LAST:event_BclearActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
        int selectedRow = Table.getSelectedRow();
        if (selectedRow != -1) {
            String nim = Table.getValueAt(selectedRow, 0).toString();
            String nama = Table.getValueAt(selectedRow, 1).toString();
            String alamat = Table.getValueAt(selectedRow, 2).toString();
            String asal_sma = Table.getValueAt(selectedRow, 3).toString();
            String nama_orangtua = Table.getValueAt(selectedRow, 4).toString();

            TFnim.setText(nim);
            TFnama.setText(nama);
            TFalamat.setText(alamat);
            TFasalsma.setText(asal_sma);
            TFnamaortu.setText(nama_orangtua);
            Bupdate.setEnabled(true);
            TFnim.setEditable(false);
        }
    }//GEN-LAST:event_TableMouseClicked

    private void BcetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcetakActionPerformed
        // TODO add your handling code here:
        try {
            JasperReport reports;
            String path = "src\\pboUAS\\report1.jasper";
            reports = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint print = JasperFillManager.fillReport(path, null, conn);
            JasperViewer view = new JasperViewer(print, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);

        } catch (JRException e) {
            System.out.println(e.getMessage());
        }

//try {
//        String path = "src\\Persistence\\report1.jasper";
//        
//        // Validasi file
//        File file = new File(path);
//        if (!file.exists()) {
//            throw new FileNotFoundException("File report1.jasper tidak ditemukan di " + file.getAbsolutePath());
//        }
//        
//        // Pastikan koneksi database valid
//        if (conn == null || conn.isClosed()) {
//            throw new SQLException("Koneksi database tidak valid.");
//        }
//        
//        // Isi parameter jika diperlukan
//        Map<String, Object> parameters = new HashMap<>(); 
//        // parameters.put("parameter_name", value); // Tambahkan parameter jika ada
//        
//        // Load dan tampilkan laporan
//        JasperReport reports = (JasperReport) JRLoader.loadObjectFromFile(path);
//        JasperPrint print = JasperFillManager.fillReport(reports, parameters, conn);
//        JasperViewer view = new JasperViewer(print, false);
//        view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//        view.setVisible(true);
//
//    } catch (FileNotFoundException e) {
//        JOptionPane.showMessageDialog(this, "File laporan tidak ditemukan: " + e.getMessage());
//    } catch (SQLException e) {
//        JOptionPane.showMessageDialog(this, "Kesalahan koneksi database: " + e.getMessage());
//    } catch (JRException e) {
//        JOptionPane.showMessageDialog(this, "Kesalahan pada JasperReports: " + e.getMessage());
//    }
    }//GEN-LAST:event_BcetakActionPerformed

    private void BuploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuploadActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int returnValue = jfc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File filePilihan = jfc.getSelectedFile();
            System.out.println("yang dipilih : " + filePilihan.getAbsolutePath());
            try {
                BufferedReader br = new BufferedReader(new FileReader(filePilihan));
                String baris = new String("");
                String pemisah = ",";
                while ((baris = br.readLine()) != null) //returns a Boolean value
                {
                    String[] dataMhs = baris.split(pemisah);
                    String nim = dataMhs[0];
                    String nama = dataMhs[1];
                    String alamat = dataMhs[2];
                    String asal_sma = dataMhs[3];
                    String nama_orangtua = dataMhs[4];

                    if (!nim.isEmpty() && !nama.isEmpty() && !alamat.isEmpty() && !asal_sma.isEmpty() && !nama_orangtua.isEmpty()) {
                        em.getTransaction().begin();
                        mahasiswa.setNim(nim);
                        mahasiswa.setNama(nama);
                        mahasiswa.setAlamat(alamat);
                        mahasiswa.setAsalSma(asal_sma);
                        mahasiswa.setNamaOrangtua(nama_orangtua);
                        em.persist(mahasiswa);
                        em.getTransaction().commit();
                        JOptionPane.showMessageDialog(this, "data berhasil ditambahkan");
                        
                tampilPU();
//                        showAll();
//                        this.refreshModel();
                    }
                }
            } catch (FileNotFoundException ex) {
            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_BuploadActionPerformed

    private void TFnamaortuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFnamaortuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFnamaortuActionPerformed

    private void BlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlogoutActionPerformed
        // TODO add your handling code here:
        Logincuy frame = new Logincuy();
                this.dispose();
                frame.setVisible(true);
    }//GEN-LAST:event_BlogoutActionPerformed

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
            java.util.logging.Logger.getLogger(Uas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Uas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Uas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Uas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Uas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcetak;
    private javax.swing.JButton Bclear;
    private javax.swing.JButton Bdelete;
    private javax.swing.JButton Binsert;
    private javax.swing.JButton Blogout;
    private javax.swing.JButton Bupdate;
    private javax.swing.JButton Bupload;
    private javax.swing.JTextField TFalamat;
    private javax.swing.JTextField TFasalsma;
    private javax.swing.JTextField TFnama;
    private javax.swing.JTextField TFnamaortu;
    private javax.swing.JTextField TFnim;
    private javax.swing.JTable Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
