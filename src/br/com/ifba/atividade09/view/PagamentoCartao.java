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
public class PagamentoCartao implements Pagamento{
    
    private double valor;
    private double valorFinal;
    private String adornos;
    private String mensagemRecibo;

    // metodo construtor
    public PagamentoCartao(double valor) {
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
        // 1.10 é o mesmo que 110%, ou seja, o valor total + 10%
        this.valorFinal = getValor() * 1.10; 
        return this.valorFinal;
    }

    @Override
    public void imprimirRecibo() {
        double taxa = this.valorFinal - getValor(); // calcula o valor da taxa aplicada 
        
        this.adornos = """
                       =====================
                       +                Recibo                +
                       =====================
                       """;
        
        // atribui os valores ao texto antes de ser impresso
        this.mensagemRecibo = this.adornos + String.format(
                " Forma de Pagamento: CARTÃO\n\n Valor: R$%.2f \n Taxa aplicada (+10%%): R$%.2f\n\n Valor a pagar: R$%.2f", 
                getValor(), taxa, this.valorFinal);
        
        // abre a caixa de dialogo simulando recibo
        JOptionPane.showMessageDialog(null, 
                this.mensagemRecibo, 
                "Recibo - Pagamento no Cartão", 
                JOptionPane.INFORMATION_MESSAGE);
    }
    
}
