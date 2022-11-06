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
public class MiniBD {
    
    //Uma lista com todas as entidades cadastradas
    public ArrayList <Pessoa> entidades = new ArrayList<>();
    
    //Uma lista somente com usuários (Entidade tipo 2)
    public ArrayList <Usuario> usuarios = new ArrayList<>();
    
    //Uma lista vazia foi adicionada, então
    ArrayList<Ordem> ord = new ArrayList<>(); 
    
    
    //Construtores
    public MiniBD() {
        
    }
    
    //Getters and Setters, autogerados

    public ArrayList<Pessoa> getEntidades() {
        return entidades;
    }

    public void setEntidades(ArrayList<Pessoa> entidades) {
        this.entidades = entidades;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    //ENTIDADES -------------------------------
    //adicionar entidade ao BD
    public void addEnt(String nome, String dataNasc, String cpf, String email, String endereço, String telefone, int tipoEntidade){
        entidades.add(new Pessoa(nome, dataNasc, cpf, email, endereço, telefone, tipoEntidade, ord));
    }
    
    //USUARIOS --------------------------------
    //Adicionar usuarios
    public void addUser(String nome, String senha, String cpf, int tipoEntidade){
        usuarios.add(new Usuario(nome, senha, cpf, tipoEntidade));
    }
    
    //ORDENS -----------------------------------
    //Adicionando uma nova ordem em um cliente da lista entidades
    public void addOrdem(String cpfEnt , String motivo, String detalhes,String funcionarios, String dataInit, String dataFim, String dataEmit, double maoDeObra, double pecas, double orcamentoFinal, String servicosR, String dataDaOp, double orcamentoImp){
        
        for(Pessoa cliente : entidades){
            
            if(cliente.cpf.equals(cpfEnt)){
                
                //Gerando uma ID para o pedido
                double ram = Math.random() * 1000000;
                String id = "NF : " + ram;
                
                //Se o cpf informado for igual ao CPF do cliente então adicionamos uma nova ordem na lista de ordens dele.
                cliente.ordens.add(new Ordem(id, cliente.nome, cliente.email, cliente.telefone, cpfEnt, motivo, detalhes, funcionarios, dataInit, dataFim, dataEmit, maoDeObra, pecas, orcamentoFinal, servicosR, dataDaOp, orcamentoImp));

            }
        }
        
    }
    
    //Usuarios pré existentes.
    public void iniciandoUsuarios(){
        //Carinhosamente os usuarios do sistema são meus companheiros de equipe :3
        
         usuarios.add(new Usuario ("marcos","202020",  "17111999", "244244244", "Rua 101, Teresina-PI", "88776655", 2));
         usuarios.add(new Usuario ("pablo","215215",  "12051999", "201201201", "Avenida Zero Two - Centro Sul, Teresina-PI", "99887766", 2));
         usuarios.add(new Usuario ("nathan","010101",  "15081998", "234234234", "Rua 2 - Jokey, Campo Maior", "10101010", 2));
         usuarios.add(new Usuario ("elen","987987",  "10102002", "234234234", "Avenida 10 - Marques - Teresina - PI", "88997799", 2));
         usuarios.add(new Usuario ("ryquelme","232323",  "01041995", "233233233", "Rua Chique - Noivos - Teresina - PI", "1223344", 2));
         
         //Adicionando alguns clientes.... São entidades tipo 1
         //Todos os endereços são fictícios / adicionei uma lista de ordem de serviços temporária, mas ela não será exibida
         entidades.add(new Pessoa("maria clara da costa", "18021987", "11223344551", "Avenida 4, Teresina-PI", "Claraa.costa@gmail.com", "86988778877", 1, ord));
         entidades.add(new Pessoa("josé antônio de lima", "11021950", "33224455667",  "Centro Sul, Teresina-PI","jose09@gmail.com", "86988778877", 1, ord));
         entidades.add(new Pessoa("carlos silva", "04101999", "99887799887",  "Notavel rua 5, Teresina-PI","carlossvaEvee@gmail.com", "86988778877", 1, ord));
         entidades.add(new Pessoa("claudia maria", "08051990", "11113333445", "Rua X , Teresina-PI", "claudinha89@gmail.com", "86988778877", 1, ord));
    
    }
    
   
    
    
}
