/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author juant
 */
public class Main {
    public static void main(String args[]){
        // define um array de objetos do tipo Forma, incluindo formas 2D e 3D
        Forma[] formas = new Forma[] {
            new Circulo(7.2, "Circulo"),
            new Quadrado(5.5, "Quadrado"),
            new Triangulo(6.0, 8.0, "Triangulo"),
            new Esfera(4.3, "Esfera"),
            new Cubo(2.0, "Cubo"),
            new Piramide(3.0, 7.0, 4.5, "Piramide")
        };


        for (int i = 0; i < formas.length; i++) {
            Forma forma = formas[i]; // atualiza o indice do array conforme o loop

            // imprime o indice do objeto e o nome da forma atual
            System.out.println("Objeto [" + i + "] - Nome: " + forma.getNome());

            double area = forma.obterArea(); // obtem a area do objeto, seja ela 2d ou 3d
            System.out.printf("Area: %.2f\n", area);

            // checa se o objeto atual é uma instância de Forma3D 
            if (forma instanceof Forma3D) {
                // Faz o casting da variável forma para Forma3D para poder acessar o método obterVolume()
                Forma3D forma3D = (Forma3D) forma;
                
                double volume = forma3D.obterVolume(); // obtem a area do objeto 3d
                
                // imprime o volume e o tipo da forma
                System.out.printf("Volume: %.2f\n", volume);
                System.out.println("Tipo: Forma Tridimensional");
            } 
            else {
                System.out.println("Tipo: Forma Bidimensional"); // imprime o tipo da forma
            }

            System.out.println("----------------------------------");
        }


    } 
}
