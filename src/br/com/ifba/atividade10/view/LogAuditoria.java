/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;
import java.time.LocalDateTime;

/**
 *
 * @author juant
 */

public class LogAuditoria {
    // declaração das variaveis
    private long id;
    private Usuario usuario;
    private String acao;
    private LocalDateTime dataHora;
    private String ip;

    
    // metodo construtor
    public LogAuditoria(long id, Usuario usuario, String acao, LocalDateTime dataHora, String ip) {
        this.id = id;
        this.usuario = usuario;
        this.acao = acao;
        this.dataHora = dataHora;
        this.ip = ip;
    }

    
    // metodo toString da classe (usado para obter uma representação textual de um objeto.)
    @Override
    public String toString() {
        return "LogAuditoria{" + "id=" + id 
                + ", usuario=" + usuario 
                + ", acao=" + acao 
                + ", dataHora=" + dataHora 
                + ", ip=" + ip + '}';
    }

    
    // getters e setters dos atributos
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    
}

