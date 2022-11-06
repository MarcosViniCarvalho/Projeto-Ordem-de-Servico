/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import java.util.ArrayList;

/**
 *
 * @author Marcos Vinicius
 */
public class Ordem {
    
    //Variaveis criadas de acordo com o protótipo.
    
    //Detalhes do cliente
    public String nome, email, telefone, cpf;
    
    //Detalhes do pedido
    public String motivo, detalhes, id;
    public String funcionarios; //Aqui estão os funcionários responsáveis pelo serviço
    public String dataIni, dataFim, dataEmit, dataDaOp;
    public double maoDeObra, pecas, orcamentoFinal;
    
    //Serviços realizados / para serem preenchidos no dia da conclusão da operação
    public String servicosR;
    public double orcamentoImp;

    //Construtores

    public Ordem(String id, String nome, String email, String telefone, String cpf, String motivo, String detalhes, String funcionarios, String dataIni, String dataFim, String dataEmit, double maoDeObra, double pecas, double orcamentoFinal, String servicosR, String dataDaOp, double orcamentoImp) {
        
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.motivo = motivo;
        this.detalhes = detalhes;
        this.funcionarios = funcionarios;
        this.dataIni = dataIni;
        this.dataFim = dataFim;
        this.dataEmit = dataEmit;
        this.maoDeObra = maoDeObra;
        this.pecas = pecas;
        this.orcamentoFinal = orcamentoFinal;
        this.servicosR = servicosR;
        this.dataDaOp = dataDaOp;
        this.orcamentoImp = orcamentoImp;
        
    }
    
    public Ordem(){
        
    }

    //Getters and Setters
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public String getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(String funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String getDataIni() {
        return dataIni;
    }

    public void setDataIni(String dataIni) {
        this.dataIni = dataIni;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public double getMaoDeObra() {
        return maoDeObra;
    }

    public void setMaoDeObra(double maoDeObra) {
        this.maoDeObra = maoDeObra;
    }

    public double getPecas() {
        return pecas;
    }

    public void setPecas(double pecas) {
        this.pecas = pecas;
    }

    public double getOrcamentoFinal() {
        return orcamentoFinal;
    }

    public void setOrcamentoFinal(double orcamentoFinal) {
        this.orcamentoFinal = orcamentoFinal;
    }

    public String getServicosR() {
        return servicosR;
    }

    public void setServicosR(String servicosR) {
        this.servicosR = servicosR;
    }

    public String getDataDaOp() {
        return dataDaOp;
    }

    public void setDataDaOp(String dataDaOp) {
        this.dataDaOp = dataDaOp;
    }

    public double getOrcamentoImp() {
        return orcamentoImp;
    }

    public void setOrcamentoImp(double orcamentoImp) {
        this.orcamentoImp = orcamentoImp;
    }

    public String getDataEmit() {
        return dataEmit;
    }

    public void setDataEmit(String dataEmit) {
        this.dataEmit = dataEmit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
