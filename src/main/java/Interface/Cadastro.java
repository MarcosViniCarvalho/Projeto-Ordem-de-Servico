/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Duke Mirage
 */
public class Cadastro extends javax.swing.JFrame {

    int tipoEntidade;
    
    public MenuPrincipal menu; //Estávariavel vai servir para manipular o menu.
    
    public Cadastro(){
        
    }
    
    //Com a variavel menu setada sendo o menu principal
    //Podemos alterar os valores do mesmo.
    public Cadastro(MenuPrincipal menu) {
        this.menu = menu; // Setando o menu... Precisamos passar um Menu como parametro no construtor
        initComponents();
        
        getContentPane().setBackground(Color.DARK_GRAY);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloTxt = new javax.swing.JLabel();
        jBtnCad = new javax.swing.JButton();
        jNome = new javax.swing.JLabel();
        jNomeTxt = new javax.swing.JTextField();
        jData = new javax.swing.JLabel();
        jCPF = new javax.swing.JLabel();
        jCPF1 = new javax.swing.JLabel();
        jCPF2 = new javax.swing.JLabel();
        jCPF3 = new javax.swing.JLabel();
        jDataTxt = new javax.swing.JTextField();
        jCPFTxt = new javax.swing.JTextField();
        jEmailTxt = new javax.swing.JTextField();
        jEnderTxt = new javax.swing.JTextField();
        jTelTxt = new javax.swing.JTextField();
        jBtnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tituloTxt.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        tituloTxt.setForeground(new java.awt.Color(255, 255, 255));
        tituloTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloTxt.setText("Cadastro de Cliente");

        jBtnCad.setBackground(new java.awt.Color(51, 51, 51));
        jBtnCad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBtnCad.setForeground(new java.awt.Color(255, 255, 255));
        jBtnCad.setText("Cadastrar");
        jBtnCad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnCad.setBorderPainted(false);
        jBtnCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadActionPerformed(evt);
            }
        });

        jNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jNome.setForeground(new java.awt.Color(255, 255, 255));
        jNome.setText("Nome :");

        jNomeTxt.setBackground(new java.awt.Color(51, 51, 51));
        jNomeTxt.setForeground(new java.awt.Color(255, 255, 255));
        jNomeTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jData.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jData.setForeground(new java.awt.Color(255, 255, 255));
        jData.setText("Data de nascimento :");

        jCPF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCPF.setForeground(new java.awt.Color(255, 255, 255));
        jCPF.setText("CPF :");

        jCPF1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCPF1.setForeground(new java.awt.Color(255, 255, 255));
        jCPF1.setText("Email :");

        jCPF2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCPF2.setForeground(new java.awt.Color(255, 255, 255));
        jCPF2.setText("Endereço :");

        jCPF3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCPF3.setForeground(new java.awt.Color(255, 255, 255));
        jCPF3.setText("Telefone :");

        jDataTxt.setBackground(new java.awt.Color(51, 51, 51));
        jDataTxt.setForeground(new java.awt.Color(255, 255, 255));
        jDataTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jCPFTxt.setBackground(new java.awt.Color(51, 51, 51));
        jCPFTxt.setForeground(new java.awt.Color(255, 255, 255));
        jCPFTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jEmailTxt.setBackground(new java.awt.Color(51, 51, 51));
        jEmailTxt.setForeground(new java.awt.Color(255, 255, 255));
        jEmailTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jEnderTxt.setBackground(new java.awt.Color(51, 51, 51));
        jEnderTxt.setForeground(new java.awt.Color(255, 255, 255));
        jEnderTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jTelTxt.setBackground(new java.awt.Color(51, 51, 51));
        jTelTxt.setForeground(new java.awt.Color(255, 255, 255));
        jTelTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jBtnCancel.setBackground(new java.awt.Color(51, 51, 51));
        jBtnCancel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBtnCancel.setForeground(new java.awt.Color(255, 255, 255));
        jBtnCancel.setText("Cancelar");
        jBtnCancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnCancel.setBorderPainted(false);
        jBtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDataTxt))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCPF2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jEnderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCPF1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCPFTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jNome)
                        .addGap(31, 31, 31)
                        .addComponent(jNomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnCad, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCPF3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tituloTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(tituloTxt)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jData)
                    .addComponent(jDataTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCPF)
                    .addComponent(jCPFTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCPF1)
                    .addComponent(jEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCPF2)
                    .addComponent(jEnderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCPF3)
                    .addComponent(jTelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadActionPerformed
        //Cadastrar
        tipoEntidade = menu.tipoCad;
        String vazio = "";
        //Aqui pegamos todos os campos da tela cadastro e enviamos como parametro para para a função de add Entidade
        
        //Teste se todos os campos foram preenchidos. caso contrário não será possivel avançar.
        if((!getjNomeTxt().getText().equals(vazio)) && (!getjDataTxt().getText().equals(vazio)) && (!getjCPFTxt().getText().equals(vazio)) && (!getjEmailTxt().getText().equals(vazio)) && (!getjEnderTxt().getText().equals(vazio)) && (!getjTelTxt().getText().equals(vazio)) ){
            //Cadastrando cliente, sem a ordem de serviço
            menu.banco.addEnt(getjNomeTxt().getText(), getjDataTxt().getText(), getjCPFTxt().getText() , getjEmailTxt().getText(), getjEnderTxt().getText(), getjTelTxt().getText(), tipoEntidade);
            JOptionPane.showMessageDialog(null, "Cadastro concluido com sucesso!");
            menu.setVisible(true);
            setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os dados para concluir o cadastro!");
        }
        


    }//GEN-LAST:event_jBtnCadActionPerformed

    private void jBtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelActionPerformed
        // TODO add your handling code here:
        menu.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_jBtnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    public JLabel getTituloTxt() {
        return tituloTxt;
    }

    public void setTituloTxt(JLabel tituloTxt) {
        this.tituloTxt = tituloTxt;
    }

    public JTextField getjCPFTxt() {
        return jCPFTxt;
    }

    public void setjCPFTxt(JTextField jCPFTxt) {
        this.jCPFTxt = jCPFTxt;
    }

    public JTextField getjDataTxt() {
        return jDataTxt;
    }

    public void setjDataTxt(JTextField jDataTxt) {
        this.jDataTxt = jDataTxt;
    }

    public JTextField getjEmailTxt() {
        return jEmailTxt;
    }

    public void setjEmailTxt(JTextField jEmailTxt) {
        this.jEmailTxt = jEmailTxt;
    }

    public JTextField getjEnderTxt() {
        return jEnderTxt;
    }

    public void setjEnderTxt(JTextField jEnderTxt) {
        this.jEnderTxt = jEnderTxt;
    }

    public JTextField getjNomeTxt() {
        return jNomeTxt;
    }

    public void setjNomeTxt(JTextField jNomeTxt) {
        this.jNomeTxt = jNomeTxt;
    }

    public JTextField getjTelTxt() {
        return jTelTxt;
    }

    public void setjTelTxt(JTextField jTelTxt) {
        this.jTelTxt = jTelTxt;
    }

    

    public int getTipoEntidade() {
        return tipoEntidade;
    }

    public void setTipoEntidade(int tipoEntidade) {
        this.tipoEntidade = tipoEntidade;
    }
    
    //Funções personalizadas
    
    //Clear nos campos digitados
    public void resetCampos(){
        jNomeTxt.setText(null);
        jDataTxt.setText(null);
        jCPFTxt.setText(null);
        jEmailTxt.setText(null);
        jEnderTxt.setText(null);
        jTelTxt.setText(null);
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCad;
    private javax.swing.JButton jBtnCancel;
    private javax.swing.JLabel jCPF;
    private javax.swing.JLabel jCPF1;
    private javax.swing.JLabel jCPF2;
    private javax.swing.JLabel jCPF3;
    private javax.swing.JTextField jCPFTxt;
    private javax.swing.JLabel jData;
    private javax.swing.JTextField jDataTxt;
    private javax.swing.JTextField jEmailTxt;
    private javax.swing.JTextField jEnderTxt;
    private javax.swing.JLabel jNome;
    private javax.swing.JTextField jNomeTxt;
    private javax.swing.JTextField jTelTxt;
    private javax.swing.JLabel tituloTxt;
    // End of variables declaration//GEN-END:variables

}
