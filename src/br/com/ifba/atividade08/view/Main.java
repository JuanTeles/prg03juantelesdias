/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;
import java.util.Scanner; // iportando biblioteca para entrada de dados

/**
 *
 * @author juant
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criação do objeto conta
        ContaBanco contaBancaria01 = new ContaBanco(0.0, false);

        int opcao; // variavel para utilizar no menu

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Abrir Conta");
            System.out.println("2 - Fechar Conta");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Pagar Mensalidade");
            System.out.println("6 - Informacoes");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            
            opcao = sc.nextInt();
            sc.nextLine(); // limpa buffer

            // verifica qual metodo deve ser acionado de acordo com o menu
            switch (opcao) {
                case 1:
                    contaBancaria01.abrirConta();
                    break;
                case 2:
                    contaBancaria01.fecharConta();
                    break;
                case 3:
                    contaBancaria01.depositar();
                    break;
                case 4:
                    contaBancaria01.sacar();
                    break;
                case 5:
                    contaBancaria01.pagarMensal();
                    break;
                case 6:
                    // utiliza metódos getters para colher informações da conta
                    if(contaBancaria01.isStatus()){ // verifica o status da conta para apresentar seu tipo ou não
                        System.out.println("Conta aberta (" +  
                                contaBancaria01.getTipo() + ")");
                    }
                    else{
                        System.out.println("Conta fechada.");
                    }
                    System.out.println("Nome: " + contaBancaria01.getDono());
                    System.out.printf("Saldo atual: R$%.2f\n", 
                            contaBancaria01.getSaldo());
                    break;
                case 0:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}

