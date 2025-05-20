/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author juant
 */
public class Circulo extends Forma2D{
    private double raio; // medida do raio do circulo

    // construtor
    public Circulo(double raio, String nome) {
        super(nome);
        this.raio = raio;
    }
    
    // Getter e setter
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double obterArea() {
        double areaCirculo = Math.PI * Math.pow(getRaio(), 2); // calcula a area do circulo
        return areaCirculo; 
    }

    @Override
    public String toString() {
        return "Circulo{" + "raio=" + raio + '}';
    }
}
