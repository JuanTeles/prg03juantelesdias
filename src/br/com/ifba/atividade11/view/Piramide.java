/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author juant
 */
public class Piramide extends Forma3D {
    private double ladoBase; // medida do lado da base quadrada
    private double altura; // medida da altura da pirâmide (do vértice ao centro da base)
    private double alturaTriangulosLaterais; // medida da altura da face lateral (altura inclinada)

    // construtor
    public Piramide(double ladoBase, double altura, double alturaTriangulosLaterais, String nome) {
        super(nome);
        this.ladoBase = ladoBase;
        this.altura = altura;
        this.alturaTriangulosLaterais = alturaTriangulosLaterais;
    }

    @Override
    public double obterVolume() {
        // Volume da pirâmide = (1/3) * área da base * altura
        double areaBase = getLadoBase() * getLadoBase();
        return (1.0 / 3.0) * areaBase * getAltura();
    }

    @Override
    public double obterArea() {
        // Área total = área da base + área das 4 faces triangulares
        double areaBase = ladoBase * ladoBase;
        // 4 triângulos com base = 2 * ladoBase * alturaTrianguloLateral
        double areaLateral = 2 * getLadoBase() * getAlturaTriangulosLaterais(); 
        return areaBase + areaLateral;
    }

    @Override
    public String toString() {
        return "Piramide{" + "nome=" + nome 
                + ", ladoBase=" + ladoBase 
                + ", altura=" + altura 
                + ", alturaTriangulosLaterais=" + alturaTriangulosLaterais + '}';
    }
    
 
    // Getters e setters 
    public double getLadoBase() {
        return ladoBase;
    }

    public void setLadoBase(double ladoBase) {
        this.ladoBase = ladoBase;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAlturaTriangulosLaterais() {
        return alturaTriangulosLaterais;
    }

    public void setAlturaTriangulosLaterais(double alturaTriangulosLaterais) {
        this.alturaTriangulosLaterais = alturaTriangulosLaterais;
    }   
}
