/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;
import Code.MiniBD;
import Code.Usuario;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Marcos Vinicius
 */
public class Login extends javax.swing.JFrame {

    //Variavel para pegar dados ou enviar para o menu
    public MenuPrincipal menu;
    
    public Login(MenuPrincipal menu) {
        this.menu = menu;
        initComponents();
        getContentPane().setBackground (Color.DARK_GRAY);
        
    }

    public Login(){
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BemVindotxt = new javax.swing.JLabel();
        usuarioL = new javax.swing.JLabel();
        passwordL = new javax.swing.JLabel();
        jBtnEntrar = new javax.swing.JButton();
        passWordTxt = new javax.swing.JPasswordField();
        BemVindotxt2 = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(20, 20, 20, 20));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(102, 102, 102));
        setPreferredSize(new java.awt.Dimension(700, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 55));

        BemVindotxt.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        BemVindotxt.setForeground(new java.awt.Color(255, 255, 255));
        BemVindotxt.setText("Bem-Vindo");
        BemVindotxt.setName("BemVindo"); // NOI18N

        usuarioL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usuarioL.setForeground(new java.awt.Color(255, 255, 255));
        usuarioL.setText("Senha");
        usuarioL.setName("Senha"); // NOI18N

        passwordL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordL.setForeground(new java.awt.Color(255, 255, 255));
        passwordL.setText("Usuário");
        passwordL.setName("Usuario"); // NOI18N

        jBtnEntrar.setBackground(new java.awt.Color(51, 51, 51));
        jBtnEntrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBtnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnEntrar.setText("Entrar");
        jBtnEntrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnEntrar.setBorderPainted(false);
        jBtnEntrar.setFocusPainted(false);
        jBtnEntrar.setFocusable(false);
        jBtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEntrarActionPerformed(evt);
            }
        });

        passWordTxt.setBackground(new java.awt.Color(51, 51, 51));
        passWordTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passWordTxt.setForeground(new java.awt.Color(255, 255, 255));
        passWordTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        passWordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passWordTxtActionPerformed(evt);
            }
        });

        BemVindotxt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BemVindotxt2.setForeground(new java.awt.Color(255, 255, 255));
        BemVindotxt2.setText("copyright @2022");
        BemVindotxt2.setName("BemVindo"); // NOI18N

        userNameTxt.setBackground(new java.awt.Color(51, 51, 51));
        userNameTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userNameTxt.setForeground(new java.awt.Color(255, 255, 255));
        userNameTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        userNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BemVindotxt2)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(usuarioL)
                    .addComponent(passwordL)
                    .addComponent(BemVindotxt)
                    .addComponent(jBtnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passWordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(BemVindotxt)
                .addGap(61, 61, 61)
                .addComponent(passwordL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(usuarioL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passWordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jBtnEntrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(BemVindotxt2)
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEntrarActionPerformed
        //Apertar o botão entrar
        //Passando como parametro os caracteres digitados nos campos Usuario e Senha para o teste.     
        testeLogin(getUserNameTxt().getText(), getPassWordTxt().getText());
       
        

        
    }//GEN-LAST:event_jBtnEntrarActionPerformed

    private void passWordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passWordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passWordTxtActionPerformed

    private void userNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtActionPerformed

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
    private javax.swing.JLabel BemVindotxt;
    private javax.swing.JLabel BemVindotxt2;
    private javax.swing.JButton jBtnEntrar;
    private javax.swing.JPasswordField passWordTxt;
    private javax.swing.JLabel passwordL;
    private javax.swing.JTextField userNameTxt;
    private javax.swing.JLabel usuarioL;
    // End of variables declaration//GEN-END:variables

    //FUNÇÕES PERSONALIZADAS
    
    public void testeLogin(String nome, String senha){
        //Fazendo o teste 
        Boolean usNome = false;
        //para cada user do tipo USUARIO dentro da lista usuarios do MiniBD, faça o seguinte teste =
        for(Usuario user : menu.banco.usuarios){

            
            //Primeiro verificamos se o nome de usuario existe dentro da lista usuarios do Banco
            if(user.nome.equals(nome)){
                
                //Achamos o usuario, falta a senha.
                usNome = true;
                                        
                if(user.senha.equals(senha) && usNome == true){
                    //Senha correta, seguir pro menu
                     JOptionPane.showMessageDialog(null, "Login Efetuado com sucesso!");
                     
                     //Deixando login invisivel e ativando o menu novamente, ja que o menu é quem inicia primeiro e chama o login e se desativa...
                     setVisible(false);
                     menu.setVisible(true);
                     
                }else{
                    //Senha não foi encontrada
                     JOptionPane.showMessageDialog(null, "Senha Incorreta!");
                }
              
            }
            
        }
        //Como o usuario não foi encontrado, seguimos com a mensagem
        if(usNome == false){
            JOptionPane.showMessageDialog(null, "Nome de usuário incorreto");
        }
        
    }
    
   //Getters and Setters
    
   //Aqui disponibilizamos todas essas variaveis para as classes.
    public JPasswordField getPassWordTxt() {
        return passWordTxt;
    }

    public void setPassWordTxt(JPasswordField passWordTxt) {
        this.passWordTxt = passWordTxt;
    }

    public JTextField getUserNameTxt() {
        return userNameTxt;
    }

    public void setUserNameTxt(JTextField userNameTxt) {
        this.userNameTxt = userNameTxt;
    }
    
    
}
