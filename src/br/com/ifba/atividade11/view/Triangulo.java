/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author juant
 */
public class Triangulo extends Forma2D{
    private double base; // medida da base do triangulo
    private double altura; // medida da altura do triangulo

    // construtor
    public Triangulo(double base, double altura, String nome) {
        super(nome);
        this.base = base;
        this.altura = altura;
    }

    // Getters e setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    @Override
    public double obterArea(){
        double areaTriangulo = (getBase() * getAltura()) / 2; // calcula a area do triangulo
        return areaTriangulo;
    }   

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
}
