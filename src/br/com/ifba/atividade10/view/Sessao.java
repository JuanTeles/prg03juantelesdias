/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author juant
 */

public class Sessao {
    // declaração das variaveis
    private long id;
    private Usuario usuario;
    private String token;

    
    // metodo construtor
    public Sessao(long id, Usuario usuario, String token) {
        this.id = id;
        this.usuario = usuario;
        this.token = token;
    }

    
    // metodo toString da classe (usado para obter uma representação textual de um objeto.)
    @Override
    public String toString() {
        return "Sessao{" + "id=" + id 
                + ", usuario=" + usuario.getNomeUsuario() 
                + ", token=" + token + '}';
    }


    // getters e setters dos atributos
    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
}

