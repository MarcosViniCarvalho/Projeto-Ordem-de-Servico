/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author Duke Mirage
 */
public class Usuario extends Pessoa{
    public String senha;
    

    //Usuário é uma pessoa do tipo 2 / Funcionário
    public Usuario( String nome, String senha, String dataNasc, String cpf, String endereco, String telefone, int tipoEntidade) {
        super(nome, dataNasc, cpf, endereco, telefone, tipoEntidade);
        this.senha = senha;
    }
    
    public Usuario( String nome, String senha, String cpf, int tipoEntidade) {
        super(nome, cpf, tipoEntidade);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
