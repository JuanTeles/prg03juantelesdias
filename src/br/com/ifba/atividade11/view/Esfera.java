/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author juant
 */
public class Esfera extends Forma3D{
    private double raio; // medida do raio da esfera

    // construtor
    public Esfera(double raio, String nome) {
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
    public double obterArea(){
        double areaEsfera = 4 * Math.PI * Math.pow(getRaio(), 2); // calcula a area da esfera
        return areaEsfera;
    }

    @Override    
    public double obterVolume(){
        double volumeEsfera = (4 / 3) * Math.PI * Math.pow(getRaio(), 3);
        return volumeEsfera;
    }

    @Override
    public String toString() {
        return "Esfera{" + "raio=" + raio + '}';
    }   
}
