/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

import javax.swing.JOptionPane;

/**
 *
 * @author juant
 */
public class PagamentoDinheiro implements Pagamento{
    
    private double valor;
    private double valorFinal;
    private String adornos;
    private String mensagemRecibo;

    // metodo construtor
    public PagamentoDinheiro(double valor) {
        this.valor = valor;
    }

    // metodo get e set da variavel valor
    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // metodos da interface (utilizando override para evitar sobreposição)
    @Override
    public double calcularTotal() {
        this.valorFinal = getValor() * 0.90;
        return this.valorFinal;
    }

    @Override
    public void imprimirRecibo() {
        double desconto = getValor() - this.valorFinal; // calcula o valor de desconto aplicado 
        
        this.adornos = """
                       =====================
                       +                Recibo                +
                       =====================
                       """;
        
        // atribui os valores ao texto antes de ser impresso
        this.mensagemRecibo = this.adornos + String.format(
                " Forma de Pagamento: DINHEIRO\n\n Valor: R$%.2f \n Desconto (-10%%): R$%.2f\n\n Valor a pagar: R$%.2f", 
                getValor(), desconto, this.valorFinal);
        
        // abre a caixa de dialogo simulando recibo
        JOptionPane.showMessageDialog(null, 
                this.mensagemRecibo, 
                "Recibo - Pagamento em Dinheiro", 
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    
}
