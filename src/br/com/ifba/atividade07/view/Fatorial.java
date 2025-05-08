/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author juant
 */
public class Fatorial {
    private int valor = 0; // inicializa o valor a ser calculado como 0
    private int fator = 1; // inicializa o valor resultante do calculo do fatorial
    private String formula = ""; // inicializa (vazia) a variavel que vai guardar a formula
    
    public void setValor(int n){
        valor = n; // Armazena o número fornecido na variavel para calculo do fatorial
    }
    public int getFatorial(){
        // realiza o calculo do fatorial com base no valor fornecido
        for(int i = valor; i > 1; i--){
            fator *= i;
        }
        
        return fator; // retorna o fatorial resolvido
    }
    public String getFormula(){
        // faz a concatenação dos valores e o simbolo de multiplicação na string
        for(int i = valor; i > 1; i--){
            formula += i + " x ";
        }
        
        formula += 1; // adiciona o ultimo numero a string
        
        return formula; // retorna por fim a formula completa
    } 
    
    
}
