/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author juant
 */
public class Cubo extends Forma3D {
    private double aresta; // medida da aresta do cubo

    // construtor
    public Cubo(double aresta, String nome) {
        super(nome);
        this.aresta = aresta;
    }
    
    // Getter e setter
    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public double obterVolume() {
        double volumeCubo = Math.pow(getAresta(), 3); // calcula o volume do cubo
        return volumeCubo;
    }

    @Override
    public double obterArea() {
        double areaCubo = 6 * Math.pow(getAresta(), 2); // // calcula a area do cubo
        return areaCubo;
    }

    @Override
    public String toString() {
        return "Cubo{" + "nome=" + nome + ", aresta=" + aresta + '}';
    }
}

