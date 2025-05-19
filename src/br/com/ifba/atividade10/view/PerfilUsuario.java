package br.com.ifba.atividade10.view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.List;

/**
 *
 * @author juant
 */

public class PerfilUsuario {
    // declaração das variaveis
    private long id;
    private String descricao;
    private List<String> permissoes;

    
    // metodo construtor
    public PerfilUsuario(long id, String descricao, List<String> permissoes) {
        this.id = id;
        this.descricao = descricao;
        this.permissoes = permissoes;
    }
    
    
    // metodo toString da classe (usado para obter uma representação textual de um objeto.)
    @Override
    public String toString() {
        return "PerfilUsuario{" + "id=" + id 
                + ", descricao=" + descricao 
                + ", permissoes=" + permissoes + '}';
    }
    

    // getters e setters dos atributos
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(List<String> permissoes) {
        this.permissoes = permissoes;
    }

}

