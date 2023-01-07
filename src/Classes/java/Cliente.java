package Classes.java;

import javax.swing.*;

public class Cliente {
    private static int contador = 1;
    private int codigo;
    private String nome;
    private String email;
    private String sexo;
    private Endereco endereco;
    public Cliente(String nome, String email, String sexo, Endereco endereco){
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.endereco =endereco;
        this.codigo = contador;
        contador +=1;

    }

    public int getCodigo() {
        return codigo;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void removerClientes(Cliente cliente, int codigo){
        if(cliente.getCodigo() == codigo){
            cliente.removerClientes(cliente, codigo);
        }
        else {
            JOptionPane.showMessageDialog(null, "Não foi possível remover cliente!");
        }
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void setEnderecoNumero(String numero){
        this.endereco.setNumero(numero);
    }
    public void setEnderecoBairro(String nome){
        this.endereco.setBairro(nome);
    }
    public void setEnderecoCidade(String cidade){
        this.endereco.setBairro(cidade);
    }
    public String getSexo() {
        return sexo;
    }
    public void setEnderecoLogradouro(String logradouro){
        this.endereco.setLogradouro(logradouro);
    }
    public void setEnderecoUf(String uf){
        this.endereco.setUf(uf);
    }
    public String toString () {
        return  "nome: " + getNome() + "\n" +
                "codigo:" +getCodigo() + "\n" +
                "Email:" +getEmail() +"\n" +
                "Sexo : " +getSexo() + "\n" +
                "Endereco: "+getEndereco().getUf()+","+getEndereco().getCidade()+"," +getEndereco().getBairro() + "," + getEndereco().getLogradouro() + ","+getEndereco().getNumero() ;

    }

    public void alterarCliente(Cliente cliente, int codigo, String nome, String email, String sexo, String uf, String cidade, String bairro, String logradouro, String numero) {
        if(cliente.getCodigo() == codigo){
            cliente.setNome(nome);
            cliente.setEmail(email);
            cliente.setSexo(sexo);
            cliente.setEnderecoUf(uf);
            cliente.setEnderecoCidade(cidade);
            cliente.setEnderecoBairro(bairro);
            cliente.setEnderecoLogradouro(logradouro);
            cliente.setEnderecoNumero(numero);
        }
        else{
            JOptionPane.showMessageDialog(null, "Não foi possivel alterar cliente!");
        }
    }
}
