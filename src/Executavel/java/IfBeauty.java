package Executavel.java;

import Classes.java.Cliente;
import Classes.java.Endereco;
import Classes.java.Funcionario;
import Classes.java.Servicos;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

import static javax.swing.JOptionPane.*;

public class IfBeauty {
    static ArrayList<Servicos> servicos;
    public static void main(String[] args) {
    servicos = new ArrayList<>();
    int comandoInteiro = 0;
    while (comandoInteiro != 5){
        opcoesServicos();
    }
    }
    public static void opcoesServicos(){
    String comando = showInputDialog("SERVIÇOS:\n1-Cadastrar\n2-Alterar Serviços\n3-Listar\n4-Remover serviços\n5-Sair");
        int comandoInteiro = Integer.parseInt(comando);

        switch (comandoInteiro) {
        case 1 -> cadastrar();
        case 2 -> alterar();
        case 3 -> listar();
        case 4 -> removerServico();
        case 5 -> sair();
        default -> showMessageDialog(null, "Escolha uma operação válida!");
            }

    }
    private static void cadastrar(){
        LocalDate data;
        Servicos servicos;
        Cliente cliente;
        Funcionario funcionario;
        String[] options = {"Cadastrar Serviço", "Cadastrar Cliente"};
        int tipoCadastro = showOptionDialog(null, "Escolha o tipo de cadastro:",
                "Clique em uma opção",
                DEFAULT_OPTION, INFORMATION_MESSAGE, null, options, options[0]);
        if(tipoCadastro == 0){
            String nome = JOptionPane.showInputDialog("Qual o nome do serviço realizado: ");
            String valor = JOptionPane.showInputDialog("Qual o valor do serviço realizado: ");
            double novoValor = Double.parseDouble(valor);
            String descricao = JOptionPane.showInputDialog("Descreva o serviço realizado: ");
            Servicos servicos1 = new Servicos(nome, descricao, novoValor);

        } else if (tipoCadastro == 1) {
            String nome = JOptionPane.showInputDialog("Digite o nome: ");
            String sexo = JOptionPane.showInputDialog("Digite o sexo do cliente: ");
            String email = JOptionPane.showInputDialog("Digite o email do cliente: ");

            Endereco endereco = new Endereco();
            /*Servicos servicos2 = new Servicos(nome, email, sexo);*/
        }
    }
    private static void alterar(){

    }
    private static void listar(){

    }
    private static void removerServico(){

    }
    private static void sair(){
        showMessageDialog(null, "Saída executada!");
        System.exit(0);
    }

}


