/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Code.Ordem;
import Code.Pessoa;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Duke Mirage
 */
public class AlteracoesOrdens extends javax.swing.JFrame {

    public ConsultaOrdem consultOrd ;
    
    public int indexCliente ; //Controle
    public int indexOrdem ;

    Calendar cal = new GregorianCalendar();

    public Boolean camposVazios = true;
         
    public AlteracoesOrdens(ConsultaOrdem consultOrd) {
        this.consultOrd = consultOrd;
        initComponents();
        
        getContentPane().setBackground(Color.DARK_GRAY);
    }
   
    
    public AlteracoesOrdens(){
        
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
        jShowNomeTxt = new javax.swing.JLabel();
        jShowTelTxt = new javax.swing.JLabel();
        jShowCpfTxt = new javax.swing.JLabel();
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

        TituloTxt.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        TituloTxt.setForeground(new java.awt.Color(255, 255, 255));
        TituloTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloTxt.setText("Ordem de Serviço");

        DataEmittxt.setForeground(new java.awt.Color(255, 255, 255));
        DataEmittxt.setText("Data da Emissão :");

        DadosClientetxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DadosClientetxt.setForeground(new java.awt.Color(255, 255, 255));
        DadosClientetxt.setText("Dados do Cliente");

        Nometxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Nometxt.setForeground(new java.awt.Color(255, 255, 255));
        Nometxt.setText("Nome :");

        Cpftxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Cpftxt.setForeground(new java.awt.Color(255, 255, 255));
        Cpftxt.setText("CPF :");

        Teltxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Teltxt.setForeground(new java.awt.Color(255, 255, 255));
        Teltxt.setText("Telefone :");

        Emailtxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Emailtxt.setForeground(new java.awt.Color(255, 255, 255));
        Emailtxt.setText("Email :");

        Separador1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        DadosPedidotxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DadosPedidotxt.setForeground(new java.awt.Color(255, 255, 255));
        DadosPedidotxt.setText("Dados do Pedido");

        Motivotxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Motivotxt.setForeground(new java.awt.Color(255, 255, 255));
        Motivotxt.setText("*Motivo :");

        Detalhestxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Detalhestxt.setForeground(new java.awt.Color(255, 255, 255));
        Detalhestxt.setText("Detalhes :");

        Responsaveistxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Responsaveistxt.setForeground(new java.awt.Color(255, 255, 255));
        Responsaveistxt.setText("*Funcionário :");

        DataInittxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DataInittxt.setForeground(new java.awt.Color(255, 255, 255));
        DataInittxt.setText("*Data de Inicio :");

        DataConclusaotxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DataConclusaotxt.setForeground(new java.awt.Color(255, 255, 255));
        DataConclusaotxt.setText("*Data de Conclusão(Estimada) :");

        MaoDeObratxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MaoDeObratxt.setForeground(new java.awt.Color(255, 255, 255));
        MaoDeObratxt.setText("*Mão de Obra : R$");

        Peçastxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Peçastxt.setForeground(new java.awt.Color(255, 255, 255));
        Peçastxt.setText("*Peças : R$");

        OrçamentoFinaltxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        OrçamentoFinaltxt.setForeground(new java.awt.Color(255, 255, 255));
        OrçamentoFinaltxt.setText("*Orçamento Final : R$");

        Separador2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        Serviçostxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Serviçostxt.setForeground(new java.awt.Color(255, 255, 255));
        Serviçostxt.setText("*Serviços Realizados");

        DataRealizaçãotxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DataRealizaçãotxt.setForeground(new java.awt.Color(255, 255, 255));
        DataRealizaçãotxt.setText("*Data da realização da Operação :");

        OrçamentoImptxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        OrçamentoImptxt.setForeground(new java.awt.Color(255, 255, 255));
        OrçamentoImptxt.setText("*Orçamento não planejado : R$");

        DataEmitLabel.setForeground(new java.awt.Color(255, 255, 255));
        DataEmitLabel.setText("...");

        jShowNomeTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jShowNomeTxt.setForeground(new java.awt.Color(255, 255, 255));
        jShowNomeTxt.setText("...");

        jShowTelTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jShowTelTxt.setForeground(new java.awt.Color(255, 255, 255));
        jShowTelTxt.setText("...");

        jShowCpfTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jShowCpfTxt.setForeground(new java.awt.Color(255, 255, 255));
        jShowCpfTxt.setText("...");

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

        jDataRealOpTxt.setBackground(new java.awt.Color(51, 51, 51));
        jDataRealOpTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jDataRealOpTxt.setForeground(new java.awt.Color(255, 255, 255));
        jDataRealOpTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jOrcamentoImpTxt.setBackground(new java.awt.Color(51, 51, 51));
        jOrcamentoImpTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jOrcamentoImpTxt.setForeground(new java.awt.Color(255, 255, 255));
        jOrcamentoImpTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

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
        BtnCadastrar.setText("Alterar");
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Cpftxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jShowCpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DadosClientetxt)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Nometxt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jShowNomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Teltxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jShowTelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Emailtxt)
                                .addGap(8, 8, 8)
                                .addComponent(jShowEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MaoDeObratxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jMaoDeObraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Peçastxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPecasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OrçamentoFinaltxt))
                            .addComponent(Serviçostxt)
                            .addComponent(DadosPedidotxt)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(OrçamentoImptxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jOrcamentoImpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DataRealizaçãotxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDataRealOpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 220, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jServRealizadosTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Separador2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DataInittxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDataInitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DataConclusaotxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDataFimTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(jFunc1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BtnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jOrcamentoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Teltxt)
                            .addComponent(jShowTelTxt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Emailtxt)
                            .addComponent(jShowEmailTxt)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nometxt)
                            .addComponent(jShowNomeTxt))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jShowCpfTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cpftxt))))
                .addGap(12, 12, 12)
                .addComponent(Separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrçamentoImptxt)
                    .addComponent(jOrcamentoImpTxt))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCancelar)
                    .addComponent(BtnCadastrar))
                .addGap(40, 40, 40))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        // TODO add your handling code here:

        consultOrd.menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarActionPerformed
        //Aqui vai acontecer toda a mágica do cadastro..
        //Primeiro uma verificação se os campos estão preenchidos ou não
        
        //Se retorna falso não existem campos vazios, então queremos que ela continue FALSE;
        verificaCampos();

        Object[] options = { "Sim", "Não" };
        
        
        
        if(!camposVazios){
            //Campos preenchidos
            int opc = JOptionPane.showOptionDialog(null, "Tem certeza que quer ALTERAR os dados dessa ORDEM?", "Alteração", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            
            if(opc == 0){
                
                try{
            //Alterando dados de uma ordem passada como parametro, essa logica abaixo é explicada na classe ConsultaOrdem....
            alterandoOrdem(consultOrd.menu.banco.entidades.get(indexCliente).ordens.get(indexOrdem));
            
            JOptionPane.showMessageDialog(null, "Dados da Ordem de Serviços Alterados!");
            
            consultOrd.menu.setVisible(true);
            setVisible(false);
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Nos campos com R$ é aceito somente VALORES. Eles não podem conter vígulas ou pontos!");
                }
            
            }
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios* para continuar.");
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
            java.util.logging.Logger.getLogger(AlteracoesOrdens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlteracoesOrdens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlteracoesOrdens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlteracoesOrdens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlteracoesOrdens().setVisible(true);
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
    private javax.swing.JLabel jShowCpfTxt;
    private javax.swing.JLabel jShowEmailTxt;
    private javax.swing.JLabel jShowNomeTxt;
    private javax.swing.JLabel jShowTelTxt;
    // End of variables declaration//GEN-END:variables

    //Funções Personalizadas
    
    
    public void alterandoOrdem(Ordem ordem){
        
        ordem.motivo = jMotivoTxt.getText();
        ordem.detalhes = jDetalhesTxt.getText();
        ordem.funcionarios = jFunc1Txt.getText();
        
        ordem.dataIni = jDataInitTxt.getText();
        ordem.dataFim = jDataFimTxt.getText();
        ordem.maoDeObra = Double.parseDouble(jMaoDeObraTxt.getText());
        ordem.pecas = Double.parseDouble(jPecasTxt.getText());
        ordem.orcamentoFinal = Double.parseDouble(jOrcamentoTxt.getText());
        
        ordem.servicosR = jServRealizadosTxt.getText();
        ordem.dataDaOp = jDataRealOpTxt.getText();
        ordem.orcamentoImp = Double.parseDouble(jOrcamentoImpTxt.getText());
        
    }
    
    public void resetInfos(){
        
        jShowCpfTxt.setText(null);
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

    
    //Vai setar todos os campos visiveis
    public void setarCampos(Ordem ordem){
       
        DataEmitLabel.setText(ordem.dataEmit);
       
        jShowCpfTxt.setText(ordem.cpf);
        jShowTelTxt.setText(ordem.telefone);
        jShowNomeTxt.setText(ordem.nome);
        jShowEmailTxt.setText(ordem.email);
        
        jMotivoTxt.setText(ordem.motivo);
        jFunc1Txt.setText(ordem.funcionarios);
        jDataInitTxt.setText(ordem.dataIni);
        jDataFimTxt.setText(ordem.dataFim);
        jPecasTxt.setText("" + ordem.pecas);
        jOrcamentoTxt.setText("" + ordem.orcamentoFinal);
        jDetalhesTxt.setText(ordem.detalhes);
        jMaoDeObraTxt.setText("" + ordem.maoDeObra);
    }
    
    //Essa é uma função exclusiva da aba alterações;
    public void setIndex(int idCliente, int idOrdem){
        indexCliente = idCliente;
        indexOrdem = idOrdem;
    }
    
    //Em razão de termos muitos campos para verificar, 
    //Criaremos uma função que retorna uma bool .
    public void verificaCampos (){
        
        camposVazios = true;
        
        //Se o input NÃO estiver vazio ficará verdadeiro se algum campo estiver vazio
        camposVazios = jMotivoTxt.getText().equals("") ? true : false;

        camposVazios = jFunc1Txt.getText().equals("") ? true : false;

        camposVazios = jDataInitTxt.getText().equals("") ? true : false;
        camposVazios = jDataFimTxt.getText().equals("") ? true : false;
        camposVazios = jPecasTxt.getText().equals("") ? true : false;
        camposVazios = jOrcamentoTxt.getText().equals("") ? true : false;
        //Preenchidos no dia da operação
        camposVazios = jServRealizadosTxt.getText().equals("") ? true : false;
        camposVazios = jDataRealOpTxt.getText().equals("") ? true : false;
        camposVazios = jOrcamentoImpTxt.getText().equals("") ? true : false;

    }
    
    //Getters an Setters
    


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

    public JLabel getjShowCpfTxt() {
        return jShowCpfTxt;
    }

    public void setjShowCpfTxt(JLabel jShowCpfTxt) {
        this.jShowCpfTxt = jShowCpfTxt;
    }
    
    
}
