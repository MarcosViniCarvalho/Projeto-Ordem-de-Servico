/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Code.MiniBD;
import Code.Pessoa;
import Code.Usuario;
import java.awt.Color;

/**
 *
 * @author Duke Mirage
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    
    //Frames / Cada um representa uma tela
    //O menu invoca as telas e tem acesso as suas variaveis e metodos
    //Do mesmo jeito que as telas podem alterar as variaveis do menu (No caso podemos alterar, remover, consultar itens do Banco de dados)
    //OBS: MenuPrincipal é a classe que comanda todas as outras
    
    public Cadastro cad = new Cadastro(this);
    public Login login = new Login(this);
    public CadastroOrdem cadOrdem = new CadastroOrdem(this);
    public ConsultAltEntidade consulEnt = new ConsultAltEntidade(this);
    public ConsultaOrdem consulOrd = new ConsultaOrdem(this);
    
    public MiniBD banco = new MiniBD(); //Banco de dados instanciado

    int tipoCad;
    
    public MenuPrincipal() {     
        initComponents();
        
        getContentPane().setBackground(Color.DARK_GRAY);
        banco.iniciandoUsuarios();

        //Iniciando com a tela de login e deixando menu invisivel.
        
        login.setVisible(true);
        setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SubTitulo = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        jBtnCadCliente = new javax.swing.JButton();
        jBtnCadFunc = new javax.swing.JButton();
        jBtnCadOrdem = new javax.swing.JButton();
        jBtnConsulCliFunc = new javax.swing.JButton();
        jBtnConsulOrdem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(700, 550));

        SubTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SubTitulo.setForeground(new java.awt.Color(255, 255, 255));
        SubTitulo.setText("Gerenciador de Ordem de Serviços");

        Titulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Klaus Manager");

        jBtnCadCliente.setBackground(new java.awt.Color(51, 51, 51));
        jBtnCadCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBtnCadCliente.setForeground(new java.awt.Color(255, 255, 255));
        jBtnCadCliente.setText("Cadastrar Clientes");
        jBtnCadCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnCadCliente.setBorderPainted(false);
        jBtnCadCliente.setFocusPainted(false);
        jBtnCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadClienteActionPerformed(evt);
            }
        });

        jBtnCadFunc.setBackground(new java.awt.Color(51, 51, 51));
        jBtnCadFunc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBtnCadFunc.setForeground(new java.awt.Color(255, 255, 255));
        jBtnCadFunc.setText("Cadastrar Funcionários");
        jBtnCadFunc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnCadFunc.setBorderPainted(false);
        jBtnCadFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadFuncActionPerformed(evt);
            }
        });

        jBtnCadOrdem.setBackground(new java.awt.Color(51, 51, 51));
        jBtnCadOrdem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBtnCadOrdem.setForeground(new java.awt.Color(255, 255, 255));
        jBtnCadOrdem.setText("Cadastar Ordem de Serviço");
        jBtnCadOrdem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnCadOrdem.setBorderPainted(false);
        jBtnCadOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadOrdemActionPerformed(evt);
            }
        });

        jBtnConsulCliFunc.setBackground(new java.awt.Color(51, 51, 51));
        jBtnConsulCliFunc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBtnConsulCliFunc.setForeground(new java.awt.Color(255, 255, 255));
        jBtnConsulCliFunc.setText("Consultar/Alterar Clientes/Funcionários");
        jBtnConsulCliFunc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnConsulCliFunc.setBorderPainted(false);
        jBtnConsulCliFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsulCliFuncActionPerformed(evt);
            }
        });

        jBtnConsulOrdem.setBackground(new java.awt.Color(51, 51, 51));
        jBtnConsulOrdem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBtnConsulOrdem.setForeground(new java.awt.Color(255, 255, 255));
        jBtnConsulOrdem.setText("Consultar/Alterar Ordem de Serviço");
        jBtnConsulOrdem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnConsulOrdem.setBorderPainted(false);
        jBtnConsulOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsulOrdemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(SubTitulo)
                    .addComponent(Titulo)
                    .addComponent(jBtnCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCadFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCadOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnConsulCliFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnConsulOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SubTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jBtnCadCliente)
                .addGap(18, 18, 18)
                .addComponent(jBtnCadFunc)
                .addGap(18, 18, 18)
                .addComponent(jBtnCadOrdem)
                .addGap(18, 18, 18)
                .addComponent(jBtnConsulCliFunc)
                .addGap(18, 18, 18)
                .addComponent(jBtnConsulOrdem)
                .addGap(154, 154, 154))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadClienteActionPerformed
        //Aqui vamos chamar o cadastro dos clientes
        //Ativando a tela cad, e dizendo que queremos cadastrar CLIENTES
        cad.resetCampos();//resetando todos os campos de string..
        cad.setVisible(true);//ativando tela cadastro
        setVisible(false); //se desativando, ao concluir a operação na tela cadastro será reativado
        cad.getTituloTxt().setText("Cadastro de Clientes");
        tipoCad = 1;
        
        
    }//GEN-LAST:event_jBtnCadClienteActionPerformed

    private void jBtnCadFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadFuncActionPerformed
        //Aqui vamos cadastrar os funcionários
        cad.resetCampos();
        //Ativando tela de cadastro func e se desativando.
        cad.setVisible(true);
        setVisible(false);
        cad.getTituloTxt().setText("Cadastro de Funcionários");
        tipoCad = 2;
    }//GEN-LAST:event_jBtnCadFuncActionPerformed

    private void jBtnCadOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadOrdemActionPerformed
        //Aqui vamos cadastrar uma nova ORDEM em um CLIENTE EXISTENTE
        cadOrdem.resetInfos();
        cadOrdem.ativaItens(false);
        cadOrdem.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_jBtnCadOrdemActionPerformed

    private void jBtnConsulCliFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsulCliFuncActionPerformed
        //Aqui vamos consultar todas as entidades, diferenciadas por tipo 1 ou 2;
        //Resetando campos e deixando os campos não editáveis
        consulEnt.resetInfos();

        consulEnt.ativaItens(false);
        consulEnt.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_jBtnConsulCliFuncActionPerformed

    private void jBtnConsulOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsulOrdemActionPerformed
        //Consulta ordens de serviço
        consulOrd.resetInfos();
        consulOrd.ativaItens(false);
        consulOrd.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jBtnConsulOrdemActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(false);
                
            }
        });
    }
    
    //Funções personalizadas
    
    public int getTipoCad() {
        return tipoCad;
    }

    public void setTipoCad(int tipoCad) {
        this.tipoCad = tipoCad;
    }
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SubTitulo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jBtnCadCliente;
    private javax.swing.JButton jBtnCadFunc;
    private javax.swing.JButton jBtnCadOrdem;
    private javax.swing.JButton jBtnConsulCliFunc;
    private javax.swing.JButton jBtnConsulOrdem;
    // End of variables declaration//GEN-END:variables
}
