/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Code.Pessoa;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Duke Mirage
 */
public class CadastroOrdem extends javax.swing.JFrame {

    public MenuPrincipal menu;
    
    public int indexCliente ; //Controle

    Calendar cal = new GregorianCalendar();

    public Boolean camposVazios = true;
    
    public String data ;
    
    Boolean cpfEncontrado = false;//variavel de controle
         
    public CadastroOrdem(MenuPrincipal menu) {
        this.menu = menu;
        initComponents();
        
        
        //setando a data ao iniciar
        int ano = Calendar.getInstance().get(Calendar.YEAR);
        int mes = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        
        data = "" + dia + " / "+ mes + " / " + ano;

        DataEmitLabel.setText(data);
        
        getContentPane().setBackground(Color.DARK_GRAY);
    }
   
    
    public CadastroOrdem(){
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TituloTxt = new javax.swing.JLabel();
        DataEmittxt = new javax.swing.JLabel();
        DadosClientetxt = new javax.swing.JLabel();
        Nometxt = new javax.swing.JLabel();
        Cpftxt = new javax.swing.JLabel();
        Teltxt = new javax.swing.JLabel();
        Emailtxt = new javax.swing.JLabel();
        Separador1 = new javax.swing.JSeparator();
        DadosPedidotxt = new javax.swing.JLabel();
        Motivotxt = new javax.swing.JLabel();
        Detalhestxt = new javax.swing.JLabel();
        Responsaveistxt = new javax.swing.JLabel();
        DataInittxt = new javax.swing.JLabel();
        DataConclusaotxt = new javax.swing.JLabel();
        MaoDeObratxt = new javax.swing.JLabel();
        Peçastxt = new javax.swing.JLabel();
        OrçamentoFinaltxt = new javax.swing.JLabel();
        Separador2 = new javax.swing.JSeparator();
        Serviçostxt = new javax.swing.JLabel();
        DataRealizaçãotxt = new javax.swing.JLabel();
        OrçamentoImptxt = new javax.swing.JLabel();
        DataEmitLabel = new javax.swing.JLabel();
        jCpfTxtInput = new javax.swing.JTextField();
        jBtnPesquisaCpf = new javax.swing.JButton();
        jShowNomeTxt = new javax.swing.JLabel();
        jShowTelTxt = new javax.swing.JLabel();
        jShowEmailTxt = new javax.swing.JLabel();
        jMotivoTxt = new javax.swing.JTextField();
        jDetalhesTxt = new javax.swing.JTextArea();
        jFunc1Txt = new javax.swing.JTextField();
        jDataInitTxt = new javax.swing.JTextField();
        jDataFimTxt = new javax.swing.JTextField();
        jMaoDeObraTxt = new javax.swing.JTextField();
        jPecasTxt = new javax.swing.JTextField();
        jOrcamentoTxt = new javax.swing.JTextField();
        jServRealizadosTxt = new javax.swing.JTextArea();
        jDataRealOpTxt = new javax.swing.JTextField();
        jOrcamentoImpTxt = new javax.swing.JTextField();
        BtnCancelar = new javax.swing.JButton();
        BtnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        TituloTxt.setBackground(new java.awt.Color(204, 204, 204));
        TituloTxt.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        TituloTxt.setForeground(new java.awt.Color(255, 255, 255));
        TituloTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloTxt.setText("Ordem de Serviço");

        DataEmittxt.setBackground(new java.awt.Color(204, 204, 204));
        DataEmittxt.setForeground(new java.awt.Color(255, 255, 255));
        DataEmittxt.setText("Data da Emissão :");

        DadosClientetxt.setBackground(new java.awt.Color(204, 204, 204));
        DadosClientetxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DadosClientetxt.setForeground(new java.awt.Color(255, 255, 255));
        DadosClientetxt.setText("Dados do Cliente");

        Nometxt.setBackground(new java.awt.Color(204, 204, 204));
        Nometxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Nometxt.setForeground(new java.awt.Color(255, 255, 255));
        Nometxt.setText("Nome :");

        Cpftxt.setBackground(new java.awt.Color(204, 204, 204));
        Cpftxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Cpftxt.setForeground(new java.awt.Color(255, 255, 255));
        Cpftxt.setText("*Buscar por CPF :");

        Teltxt.setBackground(new java.awt.Color(204, 204, 204));
        Teltxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Teltxt.setForeground(new java.awt.Color(255, 255, 255));
        Teltxt.setText("Telefone :");

        Emailtxt.setBackground(new java.awt.Color(204, 204, 204));
        Emailtxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Emailtxt.setForeground(new java.awt.Color(255, 255, 255));
        Emailtxt.setText("Email :");

        Separador1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        DadosPedidotxt.setBackground(new java.awt.Color(204, 204, 204));
        DadosPedidotxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DadosPedidotxt.setForeground(new java.awt.Color(255, 255, 255));
        DadosPedidotxt.setText("Dados do Pedido");

        Motivotxt.setBackground(new java.awt.Color(204, 204, 204));
        Motivotxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Motivotxt.setForeground(new java.awt.Color(255, 255, 255));
        Motivotxt.setText("*Motivo :");

        Detalhestxt.setBackground(new java.awt.Color(204, 204, 204));
        Detalhestxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Detalhestxt.setForeground(new java.awt.Color(255, 255, 255));
        Detalhestxt.setText("Detalhes :");

        Responsaveistxt.setBackground(new java.awt.Color(204, 204, 204));
        Responsaveistxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Responsaveistxt.setForeground(new java.awt.Color(255, 255, 255));
        Responsaveistxt.setText("*Funcionário :");

        DataInittxt.setBackground(new java.awt.Color(204, 204, 204));
        DataInittxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DataInittxt.setForeground(new java.awt.Color(255, 255, 255));
        DataInittxt.setText("*Data de Inicio :");

        DataConclusaotxt.setBackground(new java.awt.Color(204, 204, 204));
        DataConclusaotxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DataConclusaotxt.setForeground(new java.awt.Color(255, 255, 255));
        DataConclusaotxt.setText("*Data de Conclusão(Estimada) :");

        MaoDeObratxt.setBackground(new java.awt.Color(204, 204, 204));
        MaoDeObratxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MaoDeObratxt.setForeground(new java.awt.Color(255, 255, 255));
        MaoDeObratxt.setText("*Mão de Obra : R$");

        Peçastxt.setBackground(new java.awt.Color(204, 204, 204));
        Peçastxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Peçastxt.setForeground(new java.awt.Color(255, 255, 255));
        Peçastxt.setText("*Peças : R$");

        OrçamentoFinaltxt.setBackground(new java.awt.Color(204, 204, 204));
        OrçamentoFinaltxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        OrçamentoFinaltxt.setForeground(new java.awt.Color(255, 255, 255));
        OrçamentoFinaltxt.setText("*Orçamento Final : R$");

        Separador2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        Serviçostxt.setBackground(new java.awt.Color(204, 204, 204));
        Serviçostxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Serviçostxt.setForeground(new java.awt.Color(255, 255, 255));
        Serviçostxt.setText("Serviços Realizados");

        DataRealizaçãotxt.setBackground(new java.awt.Color(204, 204, 204));
        DataRealizaçãotxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DataRealizaçãotxt.setForeground(new java.awt.Color(255, 255, 255));
        DataRealizaçãotxt.setText("Data da realização da Operação :");

        OrçamentoImptxt.setBackground(new java.awt.Color(204, 204, 204));
        OrçamentoImptxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        OrçamentoImptxt.setForeground(new java.awt.Color(255, 255, 255));
        OrçamentoImptxt.setText("Orçamento não planejado :");

        DataEmitLabel.setBackground(new java.awt.Color(204, 204, 204));
        DataEmitLabel.setForeground(new java.awt.Color(255, 255, 255));
        DataEmitLabel.setText("...");

        jCpfTxtInput.setBackground(new java.awt.Color(51, 51, 51));
        jCpfTxtInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCpfTxtInput.setForeground(new java.awt.Color(255, 255, 255));
        jCpfTxtInput.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jBtnPesquisaCpf.setBackground(new java.awt.Color(51, 51, 51));
        jBtnPesquisaCpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBtnPesquisaCpf.setForeground(new java.awt.Color(255, 255, 255));
        jBtnPesquisaCpf.setText("Pesquisar");
        jBtnPesquisaCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisaCpfActionPerformed(evt);
            }
        });

        jShowNomeTxt.setBackground(new java.awt.Color(204, 204, 204));
        jShowNomeTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jShowNomeTxt.setForeground(new java.awt.Color(255, 255, 255));
        jShowNomeTxt.setText("...");

        jShowTelTxt.setBackground(new java.awt.Color(204, 204, 204));
        jShowTelTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jShowTelTxt.setForeground(new java.awt.Color(255, 255, 255));
        jShowTelTxt.setText("...");

        jShowEmailTxt.setBackground(new java.awt.Color(204, 204, 204));
        jShowEmailTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jShowEmailTxt.setForeground(new java.awt.Color(255, 255, 255));
        jShowEmailTxt.setText("...");

        jMotivoTxt.setBackground(new java.awt.Color(51, 51, 51));
        jMotivoTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMotivoTxt.setForeground(new java.awt.Color(255, 255, 255));
        jMotivoTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jDetalhesTxt.setBackground(new java.awt.Color(51, 51, 51));
        jDetalhesTxt.setColumns(20);
        jDetalhesTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jDetalhesTxt.setForeground(new java.awt.Color(255, 255, 255));
        jDetalhesTxt.setRows(5);
        jDetalhesTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jFunc1Txt.setBackground(new java.awt.Color(51, 51, 51));
        jFunc1Txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jFunc1Txt.setForeground(new java.awt.Color(255, 255, 255));
        jFunc1Txt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jDataInitTxt.setBackground(new java.awt.Color(51, 51, 51));
        jDataInitTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jDataInitTxt.setForeground(new java.awt.Color(255, 255, 255));
        jDataInitTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jDataFimTxt.setBackground(new java.awt.Color(51, 51, 51));
        jDataFimTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jDataFimTxt.setForeground(new java.awt.Color(255, 255, 255));
        jDataFimTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jMaoDeObraTxt.setBackground(new java.awt.Color(51, 51, 51));
        jMaoDeObraTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMaoDeObraTxt.setForeground(new java.awt.Color(255, 255, 255));
        jMaoDeObraTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPecasTxt.setBackground(new java.awt.Color(51, 51, 51));
        jPecasTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPecasTxt.setForeground(new java.awt.Color(255, 255, 255));
        jPecasTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jOrcamentoTxt.setBackground(new java.awt.Color(51, 51, 51));
        jOrcamentoTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jOrcamentoTxt.setForeground(new java.awt.Color(255, 255, 255));
        jOrcamentoTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jServRealizadosTxt.setBackground(new java.awt.Color(51, 51, 51));
        jServRealizadosTxt.setColumns(20);
        jServRealizadosTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jServRealizadosTxt.setForeground(new java.awt.Color(255, 255, 255));
        jServRealizadosTxt.setRows(5);
        jServRealizadosTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jServRealizadosTxt.setEnabled(false);

        jDataRealOpTxt.setBackground(new java.awt.Color(51, 51, 51));
        jDataRealOpTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jDataRealOpTxt.setForeground(new java.awt.Color(255, 255, 255));
        jDataRealOpTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jDataRealOpTxt.setEnabled(false);

        jOrcamentoImpTxt.setBackground(new java.awt.Color(51, 51, 51));
        jOrcamentoImpTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jOrcamentoImpTxt.setForeground(new java.awt.Color(255, 255, 255));
        jOrcamentoImpTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jOrcamentoImpTxt.setEnabled(false);

        BtnCancelar.setBackground(new java.awt.Color(51, 51, 51));
        BtnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancelar.setText("Cancelar");
        BtnCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCancelar.setBorderPainted(false);
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnCadastrar.setBackground(new java.awt.Color(51, 51, 51));
        BtnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BtnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        BtnCadastrar.setText("Cadastrar");
        BtnCadastrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCadastrar.setBorderPainted(false);
        BtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DataEmittxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DataEmitLabel)
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DataInittxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDataInitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DataConclusaotxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDataFimTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DadosClientetxt)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Cpftxt)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCpfTxtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnPesquisaCpf))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Nometxt)
                                .addGap(18, 18, 18)
                                .addComponent(jShowNomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Teltxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jShowTelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Emailtxt)
                                .addGap(8, 8, 8)
                                .addComponent(jShowEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Serviçostxt)
                            .addComponent(DadosPedidotxt)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(OrçamentoImptxt)
                                    .addGap(18, 18, 18)
                                    .addComponent(jOrcamentoImpTxt))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(DataRealizaçãotxt)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jDataRealOpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jServRealizadosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BtnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Separador2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(MaoDeObratxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jMaoDeObraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Peçastxt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPecasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(OrçamentoFinaltxt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jOrcamentoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
                                .addGap(28, 28, 28)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Separador1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Motivotxt)
                                    .addComponent(Detalhestxt))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jMotivoTxt)
                                        .addGap(18, 18, 18)
                                        .addComponent(Responsaveistxt))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jDetalhesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFunc1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))))
            .addGroup(layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(TituloTxt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DataEmittxt)
                    .addComponent(DataEmitLabel))
                .addGap(7, 7, 7)
                .addComponent(TituloTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(DadosClientetxt)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cpftxt)
                    .addComponent(jCpfTxtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPesquisaCpf)
                    .addComponent(Teltxt)
                    .addComponent(jShowTelTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Emailtxt)
                    .addComponent(jShowEmailTxt)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Nometxt)
                        .addComponent(jShowNomeTxt)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DadosPedidotxt)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Motivotxt)
                    .addComponent(jMotivoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Responsaveistxt)
                    .addComponent(jFunc1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Detalhestxt)
                    .addComponent(jDetalhesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DataInittxt)
                        .addComponent(jDataInitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DataConclusaotxt)
                        .addComponent(jDataFimTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaoDeObratxt)
                    .addComponent(Peçastxt)
                    .addComponent(OrçamentoFinaltxt)
                    .addComponent(jMaoDeObraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPecasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jOrcamentoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Serviçostxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jServRealizadosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DataRealizaçãotxt)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDataRealOpTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OrçamentoImptxt)
                    .addComponent(jOrcamentoImpTxt))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCancelar)
                    .addComponent(BtnCadastrar))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnPesquisaCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisaCpfActionPerformed
        // Fazer uma rápida busca no BD se existe o clente.
        cpfEncontrado = false;
        
       if(!getjCpfTxtInput().getText().equals("")){
           //Caso o campo não esteja vazio
           for(Pessoa cliente : menu.banco.entidades){
           
           //Fazendo uma comparação se o CPF digitado existe no banco de dados
                if(getjCpfTxtInput().getText().equals(cliente.cpf)){
               
                    cpfEncontrado = true;
                    
                    JOptionPane.showMessageDialog(null, "Cliente encontrado! A ordem de serviço será vinculada em seu cadastro.");
                
                    indexCliente = menu.banco.entidades.indexOf(cliente);
                    
                    //Aqui vamos setar os textos nos camos Nome, Email e Telefone;
                    jShowNomeTxt.setText(cliente.nome);
                    jShowEmailTxt.setText(cliente.email);
                    jShowTelTxt.setText(cliente.telefone);
                    
                    ativaItens(true);
                }
            }
           if(cpfEncontrado == false){
                ativaItens(false);
                JOptionPane.showMessageDialog(null, "O CPF informado não foi encontrado!");
           }
       }else{
           //Campo vazio
           JOptionPane.showMessageDialog(null, "O campo CPF não pode estar vazio!");
       }
       
    }//GEN-LAST:event_jBtnPesquisaCpfActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        // TODO add your handling code here:
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarActionPerformed
        //Aqui vai acontecer toda a mágica do cadastro..
        //Primeiro uma verificação se os campos estão preenchidos ou não
        
        //Se retorna falso não existem campos vazios, então queremos que ela continue FALSE;
        verificaCampos();

        if(!camposVazios && cpfEncontrado){
            //Campos preenchidos
            //Cadastrando a nova ordem / baseado no cpf
            try{
            String cpf = getjCpfTxtInput().getText(); //Somente para controle
            String motivo = getjMotivoTxt().getText();
            String detalhes = getjDetalhesTxt().getText();
            String funcionario = getjFunc1Txt().getText();
            String dataInit = getjDataInitTxt().getText();
            String dataFim = getjDataFimTxt().getText();
            String dataEmit = data;
            double maoDeObra = Double.parseDouble(getjMaoDeObraTxt().getText());
            double pecas = Double.parseDouble(getjPecasTxt().getText());
            double orcamentoFinal = Double.parseDouble(getjOrcamentoTxt().getText());
            String servicosR = getjServRealizadosTxt().getText();
            String dataDaOp = getjDataRealOpTxt().getText();
            double orcamentoImp = Double.parseDouble(getjOrcamentoImpTxt().getText());

            //Um pequeno try para verificar erros de digitação, somente numeros em campos de numeros!
            
            
            //Adicionando a nova ordem
            menu.banco.addOrdem(cpf, motivo, detalhes, funcionario, dataInit, dataFim, dataEmit, maoDeObra, pecas, orcamentoFinal, servicosR, dataDaOp, orcamentoImp);
            
            JOptionPane.showMessageDialog(null, "Ordem de Serviço Cadastrada!");
            menu.setVisible(true);
            setVisible(false);
            
            }catch(NumberFormatException e){
                //Caso alguma casa de numero tenha alguma string
                JOptionPane.showMessageDialog(null, "Nos campos com R$ é aceito somente VALORES. Eles não podem conter vígulas ou pontos!");
            }
            
        }else{
            //Falta preencher alguns campos.
            JOptionPane.showMessageDialog(null, "Por favor, Preencha todos os campos obrigatórios*");
        }
    }//GEN-LAST:event_BtnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroOrdem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroOrdem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroOrdem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroOrdem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroOrdem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadastrar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JLabel Cpftxt;
    private javax.swing.JLabel DadosClientetxt;
    private javax.swing.JLabel DadosPedidotxt;
    private javax.swing.JLabel DataConclusaotxt;
    private javax.swing.JLabel DataEmitLabel;
    private javax.swing.JLabel DataEmittxt;
    private javax.swing.JLabel DataInittxt;
    private javax.swing.JLabel DataRealizaçãotxt;
    private javax.swing.JLabel Detalhestxt;
    private javax.swing.JLabel Emailtxt;
    private javax.swing.JLabel MaoDeObratxt;
    private javax.swing.JLabel Motivotxt;
    private javax.swing.JLabel Nometxt;
    private javax.swing.JLabel OrçamentoFinaltxt;
    private javax.swing.JLabel OrçamentoImptxt;
    private javax.swing.JLabel Peçastxt;
    private javax.swing.JLabel Responsaveistxt;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JLabel Serviçostxt;
    private javax.swing.JLabel Teltxt;
    private javax.swing.JLabel TituloTxt;
    private javax.swing.JButton jBtnPesquisaCpf;
    private javax.swing.JTextField jCpfTxtInput;
    private javax.swing.JTextField jDataFimTxt;
    private javax.swing.JTextField jDataInitTxt;
    private javax.swing.JTextField jDataRealOpTxt;
    private javax.swing.JTextArea jDetalhesTxt;
    private javax.swing.JTextField jFunc1Txt;
    private javax.swing.JTextField jMaoDeObraTxt;
    private javax.swing.JTextField jMotivoTxt;
    private javax.swing.JTextField jOrcamentoImpTxt;
    private javax.swing.JTextField jOrcamentoTxt;
    private javax.swing.JTextField jPecasTxt;
    private javax.swing.JTextArea jServRealizadosTxt;
    private javax.swing.JLabel jShowEmailTxt;
    private javax.swing.JLabel jShowNomeTxt;
    private javax.swing.JLabel jShowTelTxt;
    // End of variables declaration//GEN-END:variables

    //Funções Personalizadas
    public void resetInfos(){
        cpfEncontrado = false;
        jCpfTxtInput.setText(null);
        jShowTelTxt.setText(null);
        jShowNomeTxt.setText(null);
        jShowEmailTxt.setText(null);
        
        jMotivoTxt.setText(null);
        jFunc1Txt.setText(null);
        jDataInitTxt.setText(null);
        jDataFimTxt.setText(null);
        jPecasTxt.setText(null);
        jOrcamentoTxt.setText(null);
        jDetalhesTxt.setText(null);
        jMaoDeObraTxt.setText(null);
        //Esses aqui so serão preenchidos no dia da operação
        jServRealizadosTxt.setText("Preencher no dia da operação.");
        jDataRealOpTxt.setText("Preencher no dia da operação.");
        jOrcamentoImpTxt.setText("0");
        
    }
    
    //Ativar / Desativar campos . OBS: os campos so podem ser ativos quando o cliente for encontrado!
    public void ativaItens(Boolean ativador){
        
        jMotivoTxt.setEditable(ativador);
        jFunc1Txt.setEditable(ativador);
        jDataInitTxt.setEditable(ativador);
        jDataFimTxt.setEditable(ativador);
        jPecasTxt.setEditable(ativador);
        jOrcamentoTxt.setEditable(ativador);
        jDetalhesTxt.setEditable(ativador);
        jMaoDeObraTxt.setEditable(ativador);
        BtnCadastrar.setEnabled(ativador);
        
    }
    
    //Em razão de termos muitos campos para verificar, 
    //Criaremos uma função que retorna uma bool .
    public void verificaCampos (){
        
        camposVazios = true;
        
        //Se o input NÃO estiver vazio ; x ficará verdadeiro se algum campo estiver vazio
        camposVazios = jMotivoTxt.getText().equals("") ? true : false;
        //x = !jDetalhesTxt.getText().equals("") ? false : true;
        camposVazios = jFunc1Txt.getText().equals("") ? true : false;
        //x = !jFunc2Txt1.getText().equals("") ? false : true;
        camposVazios = jDataInitTxt.getText().equals("") ? true : false;
        camposVazios = jDataFimTxt.getText().equals("") ? true : false;
        camposVazios = jPecasTxt.getText().equals("") ? true : false;
        camposVazios = jOrcamentoTxt.getText().equals("") ? true : false;
        //Preenchidos no dia da operação
        //camposVazios = jServRealizadosTxt.getText().equals("") ? true : false;
        //camposVazios = jDataRealOpTxt.getText().equals("") ? true : false;
        //camposVazios = jOrcamentoImpTxt.getText().equals("") ? true : false;

    }
    
    //Getters an Setters
    
    
    public JTextField getjCpfTxtInput() {
        return jCpfTxtInput;
    }

    public void setjCpfTxtInput(JTextField jCpfTxtInput) {
        this.jCpfTxtInput = jCpfTxtInput;
    }

    public int getIndexCliente() {
        return indexCliente;
    }

    public void setIndexCliente(int indexCliente) {
        this.indexCliente = indexCliente;
    }

    public Boolean getCamposVazios() {
        return camposVazios;
    }

    public void setCamposVazios(Boolean camposVazios) {
        this.camposVazios = camposVazios;
    }

    public Boolean getCpfEncontrado() {
        return cpfEncontrado;
    }

    public void setCpfEncontrado(Boolean cpfEncontrado) {
        this.cpfEncontrado = cpfEncontrado;
    }

    public JTextField getjDataFimTxt() {
        return jDataFimTxt;
    }

    public void setjDataFimTxt(JTextField jDataFimTxt) {
        this.jDataFimTxt = jDataFimTxt;
    }

    public JTextField getjDataInitTxt() {
        return jDataInitTxt;
    }

    public void setjDataInitTxt(JTextField jDataInitTxt) {
        this.jDataInitTxt = jDataInitTxt;
    }

    public JTextField getjDataRealOpTxt() {
        return jDataRealOpTxt;
    }

    public void setjDataRealOpTxt(JTextField jDataRealOpTxt) {
        this.jDataRealOpTxt = jDataRealOpTxt;
    }

    public JTextArea getjDetalhesTxt() {
        return jDetalhesTxt;
    }

    public void setjDetalhesTxt(JTextArea jDetalhesTxt) {
        this.jDetalhesTxt = jDetalhesTxt;
    }

    public JTextField getjFunc1Txt() {
        return jFunc1Txt;
    }

    public void setjFunc1Txt(JTextField jFunc1Txt) {
        this.jFunc1Txt = jFunc1Txt;
    }

    public JTextField getjMaoDeObraTxt() {
        return jMaoDeObraTxt;
    }

    public void setjMaoDeObraTxt(JTextField jMaoDeObraTxt) {
        this.jMaoDeObraTxt = jMaoDeObraTxt;
    }

    public JTextField getjMotivoTxt() {
        return jMotivoTxt;
    }

    public void setjMotivoTxt(JTextField jMotivoTxt) {
        this.jMotivoTxt = jMotivoTxt;
    }

    public JTextField getjOrcamentoImpTxt() {
        return jOrcamentoImpTxt;
    }

    public void setjOrcamentoImpTxt(JTextField jOrcamentoImpTxt) {
        this.jOrcamentoImpTxt = jOrcamentoImpTxt;
    }

    public JTextField getjOrcamentoTxt() {
        return jOrcamentoTxt;
    }

    public void setjOrcamentoTxt(JTextField jOrcamentoTxt) {
        this.jOrcamentoTxt = jOrcamentoTxt;
    }

    public JTextField getjPecasTxt() {
        return jPecasTxt;
    }

    public void setjPecasTxt(JTextField jPecasTxt) {
        this.jPecasTxt = jPecasTxt;
    }

    public JTextArea getjServRealizadosTxt() {
        return jServRealizadosTxt;
    }

    public void setjServRealizadosTxt(JTextArea jServRealizadosTxt) {
        this.jServRealizadosTxt = jServRealizadosTxt;
    }

    public JButton getBtnCadastrar() {
        return BtnCadastrar;
    }

    public void setBtnCadastrar(JButton BtnCadastrar) {
        this.BtnCadastrar = BtnCadastrar;
    }
    
    
}
