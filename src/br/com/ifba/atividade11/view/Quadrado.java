/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author juant
 */
public class Quadrado extends Forma2D{
    private double lado; // medida do lado do quadrado

    // construtor
    public Quadrado(double lado, String nome) {
        super(nome);
        this.lado = lado;
    }
    
    // Getter e setter
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double obterArea(){
        double areaQuadrado = getLado() * getLado();  // calcula a area do quadrado
        return areaQuadrado;
    }

    @Override
    public String toString() {
        return "Quadrado{" + "lado=" + lado + '}';
    }
}
