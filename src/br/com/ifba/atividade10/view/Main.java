/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author juant
 */

public class Main {
    public static void main(String[] args) {
        // lista de permissões
        List<String> permissoes = Arrays.asList("LER", "ESCREVER");
        
        // cria perfis de usuario
        PerfilUsuario admin = new PerfilUsuario(1L, "Administrador", permissoes); // tem ambas as permissões
        PerfilUsuario comum = new PerfilUsuario(2L, "Comum", Arrays.asList("LER")); // pode somente ler

        // cria usuario administrador
        Usuario user1 = new Usuario(1L, admin, "jose", "jose@email.com", "1234", true);
        
        // faz testes de login com senha errada e certa
        user1.logar("12345");
        pausarPrograma(); // faz pausa de 2 segundos durante a execução para melhor visualização
        user1.logar("1234");
        pausarPrograma();
        user1.deslogar(); // realiza o logout
        user1.imprimirLogs(); // imprime os logs, incluindo o log contendo a informação de logout
        
        System.out.println("\n");
        
        // cria usuario comum
        Usuario user2 = new Usuario(2L, comum, "joao", "joao@email.com", "4321", true);
        
        // faz testes de login com senha errada e certa
        user2.logar("1234");
        pausarPrograma(); // faz pausa de 2 segundos durante a execução para melhor visualização
        user2.logar("4321");
        pausarPrograma();
        user2.imprimirLogs(); // imprime os logs antes do logout
        pausarPrograma();
        user2.deslogar(); // realiza o logout

        System.out.println("\n");
        
        // retorna as informações do método toString, contendo as informações atualizadas do objeto usuario
        System.out.println(user1); 
        System.out.println(user2);
        
    }
    
    // método para pausar o programa por 2 segundos
    public static void pausarPrograma(){
        try {
            Thread.sleep(2000); // pausa de 2 segundos
        } catch (InterruptedException e) {
            System.out.println("Thread interrompida!");
        }
    }
}


