/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package autentikasi;

import com.mycompany.FantasyFittings.koneksiDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import main.Dashboard;

/**
 *
 * @author ASUS
 */
public class Login extends javax.swing.JFrame {
    private int userId;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }
    
    // Getter untuk userId
    public int getUserId() {
        return userId;
    }

    // Setter untuk userId
    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TombolLogin = new javax.swing.JToggleButton();
        Username = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        LabelUsername = new javax.swing.JLabel();
        LabelPassword = new javax.swing.JLabel();
        PesanRegister = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        TombolLupaPW = new javax.swing.JLabel();
        TombolRegister = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TombolLogin.setBackground(new java.awt.Color(0, 153, 255));
        TombolLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TombolLogin.setForeground(new java.awt.Color(255, 255, 255));
        TombolLogin.setText("Login");
        TombolLogin.setHideActionText(true);
        TombolLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolLoginActionPerformed(evt);
            }
        });

        LabelUsername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelUsername.setText("User");

        LabelPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelPassword.setText("Password");

        PesanRegister.setText("Belum punya akun?");

        Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Title.setText("Welcome");

        TombolLupaPW.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TombolLupaPW.setForeground(new java.awt.Color(153, 153, 153));
        TombolLupaPW.setText("Lupa password?");
        TombolLupaPW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TombolLupaPWMouseClicked(evt);
            }
        });

        TombolRegister.setForeground(new java.awt.Color(0, 102, 204));
        TombolRegister.setText("Register");
        TombolRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TombolRegisterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(Title))
                    .addComponent(LabelUsername)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPassword)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(TombolLupaPW))
                    .addComponent(TombolLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(PesanRegister)
                        .addGap(6, 6, 6)
                        .addComponent(TombolRegister)))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(Title)
                .addGap(38, 38, 38)
                .addComponent(LabelUsername)
                .addGap(4, 4, 4)
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(LabelPassword)
                .addGap(4, 4, 4)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(TombolLupaPW)
                .addGap(4, 4, 4)
                .addComponent(TombolLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PesanRegister)
                    .addComponent(TombolRegister)))
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void clearForm() {
        Username.setText("");
        Password.setText("");
    }
    
    
    private void TombolLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolLoginActionPerformed
        try {
            // 01. Tangkap variabel inputan 
            String uname = Username.getText();
            String pw = new String(Password.getPassword());
            
            // 02. Query SQL - SELECT
            String perintah_SQL = "SELECT id, username, password FROM pengguna WHERE username = ? AND password = ?";

            // 03. Menghubungkan SQL - Java
            Connection penghubung = (Connection)koneksiDB.konfigurasi_koneksiDB();
            if (penghubung == null) {
                JOptionPane.showMessageDialog(null, "Koneksi ke database gagal. Silakan cek konfigurasi database Anda.");
                return;
            }
            // 04. Membuat statement SQL
            PreparedStatement pernyataanSQL = penghubung.prepareStatement(perintah_SQL);
            pernyataanSQL.setString(1, uname);
            pernyataanSQL.setString(2, pw);
            
            // 05. Mengeksekusi perintah SQL
            ResultSet hasilSQL = pernyataanSQL.executeQuery();

            // 06. Validasi data SQL
            if (hasilSQL.next()) {
                // Kondisi Berhasil
                userId = hasilSQL.getInt("id");  // Simpan id pengguna yang berhasil login
                JOptionPane.showMessageDialog(null, "Login Berhasil, ID: " + userId);

                // Pass userId to DashboardPengguna
                Dashboard dashboardLogin = new Dashboard();
                dashboardLogin.setVisible(true); //Meredirect ke object dashboard
                this.dispose(); // Menutup window login
            } else {
                // Kondisi Gagal 
                JOptionPane.showMessageDialog(null, "Username atau Password Salah");
                clearForm();
            }

            // Tutup hasilSQL, pernyataanSQL, dan penghubung
            hasilSQL.close();
            pernyataanSQL.close();
            penghubung.close();

        } catch (SQLException e) {
            // 07. Exception()
            JOptionPane.showMessageDialog(null, "Login Gagal \n" + e.getMessage());
        }
    }//GEN-LAST:event_TombolLoginActionPerformed

    private void TombolLupaPWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolLupaPWMouseClicked
        // TODO add your handling code here:
        new LupaPW().setVisible(true); //Meredirect ke object Register
        this.dispose();
    }//GEN-LAST:event_TombolLupaPWMouseClicked

    private void TombolRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolRegisterMouseClicked
        new Register().setVisible(true); //Meredirect ke object Register
        this.dispose();
    }//GEN-LAST:event_TombolRegisterMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelUsername;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel PesanRegister;
    private javax.swing.JLabel Title;
    private javax.swing.JToggleButton TombolLogin;
    private javax.swing.JLabel TombolLupaPW;
    private javax.swing.JLabel TombolRegister;
    private javax.swing.JTextField Username;
    // End of variables declaration//GEN-END:variables
}
