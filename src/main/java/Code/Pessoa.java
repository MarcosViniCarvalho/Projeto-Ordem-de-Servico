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
public class Pessoa {
    
    public int id; //não é nescessário no preenchimento
    public String nome;
    public String dataNasc;
    public String cpf;
    public String endereco;
    public String email;
    public String telefone;
    public int tipoEntidade; // 1 cliente 2 funcionário
    public ArrayList<Ordem> ordens;

    public Pessoa(String nome, String dataNasc, String cpf, String email, String endereco, String telefone, int tipoEntidade) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.tipoEntidade = tipoEntidade;
    }
    
    
    public Pessoa(String nome, String dataNasc, String cpf, String endereco, String telefone, int tipoEntidade) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.tipoEntidade = tipoEntidade;
    }
    
    //Construtor com ordem de serviço

    public Pessoa(String nome, String dataNasc, String cpf, String endereco, String email, String telefone, int tipoEntidade, ArrayList<Ordem> ordens) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.tipoEntidade = tipoEntidade;
        this.ordens = ordens;
    }
    
    //------------------------------
    
    public Pessoa(String nome, String cpf, int tipoEntidade) {
        this.nome = nome;     
        this.cpf = cpf;
        this.tipoEntidade = tipoEntidade;
    }

    //Funções
  
    //Getters and Setters/ Auto gerados
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereço) {
        this.endereco = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getTipoEntidade() {
        return tipoEntidade;
    }

    public void setTipoEntidade(int tipoEntidade) {
        this.tipoEntidade = tipoEntidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public ArrayList<Ordem> getOrdens() {
        return ordens;
    }

    public void setOrdens(ArrayList<Ordem> ordens) {
        this.ordens = ordens;
    }
    
    
    
}
