package exerc4;

import java.util.Scanner;

public class Banco {

    protected int idade ,tipo, cpf;
    protected float saldo = 0;
    protected String nome;
    Scanner input = new Scanner(System.in);

    public void Sacar(float valor){}

    public void depositar(float valor){}

    // Método toString

    public void status(){
        System.out.println("================== Banco FATEK-DINDIN ==================");
        System.out.println("Titular da conta: "+getNome());
        System.out.println("CPF: "+getCpf());
        System.out.println("Idade: "+getIdade());
    }


    // Métodos Especiais


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 18){
            System.out.println("Menores de idade não podem abrir conta na FATEK-DINDIN");
            System.out.println("Encerrando");
            System.exit(0);
        }
        else{
            this.idade = idade;}
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void menuConta(){
        System.out.println("========================================================");
        System.out.println("Escolha o tipo de conta que você prefere: ");
        System.out.println("1 - Conta Poupança");
        System.out.println("2 - Conta Investimento");
        System.out.print(" > ");
    }

    public void menuOperacao(){
        System.out.println("========================================================");
        System.out.println("Escolha a operação desejada: ");
        System.out.println("1 - Saque");
        System.out.println("2 - Depósito");
        System.out.println("3 - Sair");
        System.out.print(" > ");
    }
}
