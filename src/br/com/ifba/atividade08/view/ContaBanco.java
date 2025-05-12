/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;

import java.util.Random; // importando biblioteca para gerar numero aleatório
import java.util.Scanner; // importando biblioteca para entrada de dados

/**
 *
 * @author juant
 */

public class ContaBanco {
    Random random = new Random();  // criar objeto random
    Scanner sc = new Scanner(System.in);// criaçao do objeto scanner
    
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    // metodo construtor do objeto da Conta Bancária
    public ContaBanco(double saldo, boolean status) {
        this.saldo = saldo;
        this.status = status;
    }

    // métodos setters e getters dos atributos
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    // método para abertura de conta
    public void abrirConta(){       
        // verifica se a conta ja esta aberta
        if(this.status == true){
            System.out.println("Conta ja criada!!!");
        }
        // cria de fato a conta caso não exista ainda
        else{
            System.out.print("Qual tipo de conta deseja abrir? (CC ou CP): ");
            setTipo(sc.nextLine()); // adiciona o tipo de conta

            // verifica se o tipo foi digitado corretamente
            if(this.tipo.equalsIgnoreCase("cc") || this.tipo.equalsIgnoreCase("cp")){        
                this.status = true; // altera status para verdadeiro (conta aberta)

                // adiciona o nome do dono da conta
                System.out.print("Qual o nome do dono da conta?: ");
                setDono(sc.nextLine());

                setNumConta(100 + random.nextInt(999)); // adiciona o numero da conta            

                // adiciona saldo de presente por criação de conta
                if(this.tipo.equalsIgnoreCase("cc")){
                    setSaldo(150);
                }
                else{
                    setSaldo(50);
                }
            }
            // caso digite o tipo de forma errada
            else{
                System.out.println("Tipo de Conta invalido!!!");
            }
        }  
    }
    
    // metodo encerramento de conta
    public void fecharConta(){
        // verificação se a conta está aberta
        if(this.status == true){
            // só é possivel realizar saque se não houver saldo disponivel
            if(getSaldo() > 0){
                System.out.println("Infelizmente nao foi possível fechar a conta!!");
                System.out.printf("Ainda ha R$%.2f em conta", this.saldo);
            }
            else{
                this.status = false;
                System.out.println("Conta encerrada com sucesso.");
                
            }
        }
        // caso nao tenha conta aberta, simplesmente exibe uma mensagem
        else{
            System.out.println("Conta nao encontrada.");
        }
    }

    // metodo para deposito
    public void depositar(){
        // verifica se a conta ta aberta
        if(this.status == true){
            // captura o valor de depósito
            System.out.print("Valor a depositar: ");
            double valorDeposito = sc.nextDouble();
            sc.nextLine();
            
            this.saldo += valorDeposito; // incrementa o valor depositado
        }
        else{
            System.out.print("Conta bancaria nao encontrada!!!");
        }
    }
    
    public void sacar(){
        // verifica se a conta ta aberta
        if(this.status == true){
            // verifique se tem saldo disponivel
            if(this.saldo > 0){
                System.out.println("Saldo disponivel para saque: R$" + this.saldo);
                System.out.print("Valor a sacar: ");
                double valorSacar = sc.nextDouble(); // captura o valor de saque
                sc.nextLine();

                // verifica se possui saldo suficiete para saque
                if(valorSacar <= this.saldo){
                    this.saldo -= valorSacar;
                }
                else{
                    System.out.print("Saldo insuficiente para saque!!!");
                }
            }
            else{                
                System.out.println("Voce nao possui fundos na conta");
            }
        }
        else{
            System.out.print("Conta bancaria nao encontrada!!!");
        }
    }
    
    // metodo pagamento de mensalidade
    public void pagarMensal(){
        // verifica se a conta ta aberta
        if(this.status == true){
            // verifica se possui saldo
            if(this.saldo > 0){
                // verifica o tipo de conta e se há saldo suficiente para pagamento
                if(this.tipo.equalsIgnoreCase("cc") && this.saldo >= 12){
                    this.saldo -= 12;
                }
                else if(this.tipo.equalsIgnoreCase("cp") && this.saldo >= 20){
                    this.saldo -= 20;
                }
                else{
                    System.out.print("Saldo insuficiente para pagamento da mensalidade!!!");
                }
            }
            else{                
                System.out.println("Voce nao possui fundos na conta!!!");
            }
        }
        else{
            System.out.print("Conta bancaria nao encontrada!!!");
        }
    } 
}
