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
public class PagamentoPix implements Pagamento{
    
    private double valor;
    private double valorFinal;
    private String adornos;
    private String mensagemRecibo;

    // metodo construtor da classe
    public PagamentoPix(double valor) {
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
        this.valorFinal = getValor() * 0.98; // 0.98 é igual a 98% do valor total
        return this.valorFinal;
    }

    @Override
    public void imprimirRecibo() {
        double cashback = getValor() - this.valorFinal; // calcula o valor de cashback aplicado 
        
        this.adornos = """
                       =====================
                       +                Recibo                +
                       =====================
                       """;
        
        // atribui os valores ao texto antes de ser impresso
        this.mensagemRecibo = this.adornos + String.format(
                " Forma de Pagamento: PIX\n\n Valor: R$%.2f \n Cashback (-2%%): R$%.2f\n\n Valor a pagar: R$%.2f", 
                getValor(), cashback, this.valorFinal);
        
        // abre a caixa de dialogo simulando recibo
        JOptionPane.showMessageDialog(null, 
                this.mensagemRecibo, 
                "Recibo - Pagamento Pix", 
                JOptionPane.INFORMATION_MESSAGE);
    }
    
}
