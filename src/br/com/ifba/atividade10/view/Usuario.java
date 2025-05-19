/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


/**
 *
 * @author juant
 */

public class Usuario {
    // declaração das variaveis
    private long id;
    private PerfilUsuario perfil;
    private String nomeUsuario;
    private String email;
    private String senha;
    private LocalDateTime ultimoLogin;
    private boolean ativo;
    private Sessao sessao;
    private final List<LogAuditoria> logs = new ArrayList<>(); // Inicializar lista de logs

    
    // metodo construtor
    public Usuario(long id, PerfilUsuario perfil, String nomeUsuario, String email, String senha, boolean ativo) {
        this.id = id;
        this.perfil = perfil;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.ativo = ativo;
    }
    
    
    // metodo toString da classe (usado para obter uma representação textual de um objeto.)
    @Override
    public String toString() {
        return "Usuario{" + "id=" + id 
                + ", perfil=" + perfil 
                + ", nomeUsuario=" + nomeUsuario 
                + ", email=" + email 
                + ", senha=" + senha 
                + ", ultimoLogin=" + ultimoLogin 
                + ", ativo=" + ativo + '}';
    }
    
    
    // getters e setters dos atributos
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(LocalDateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    
    // METODOS ESPECIFICOS
    // Método para simular login e gerar log
    public void logar(String senha) {
        if (this.senha.equals(senha)) {
            criarSessao(); // cria a instancia de sessao
            criaLog("Login realizado com sucesso"); // registra o log de login realizado
            
            System.out.println("Login realizado!"); 
            this.ultimoLogin = LocalDateTime.now(); // atualiza a data e hora do atual login como ultimo login
            this.ativo = true; // ativa o status da conta
        } else {
            criaLog("Tentativa de login com senha incorreta"); // registra o log de login nao realizado
            System.out.println("Senha incorreta.");
        }
    }
    
    
    // metodo de logout
    public void deslogar() {
        // verifica se a sessao é valida e o usuario esta ativo
        if(sessao != null && this.ativo) {
            criaLog("Logout realizado com sucesso");  // cria o log de logout
            
            System.out.println("Usuario deslogado");
            sessao = null; // finaliza a sessao atual 
            this.ativo = false; // atualiza o status da conta pra false (desativado)
        } else {
            criaLog("Tentativa de Logout sem estar logado"); // log de tentativa invalida de logout
            System.out.println("Usuario ja estava deslogado");
        }
    }
    
    
    // cria o log com a acao atual
    public void criaLog(String acao) {
        long idLog = logs.size() + 1; // gera o id de forma sequencial para o log

        // cria nova instancia de log com os atuais dados
        LogAuditoria log = new LogAuditoria(idLog, this, acao, LocalDateTime.now(), "127.0.0.1");
        logs.add(log); // adiciona o log a lista do usuario 
    }    
    
    // metodo para exibir os logs quando solicitados
    public void imprimirLogs() {
        // loop percorre a lista de logs.
        for (int i = 0; i < logs.size(); i++) {
            LogAuditoria log = logs.get(i); // Acessa o log pela posição i
            System.out.println(log); // Imprime o log usando o toString
        }
    }
    
    // cria a sessao
    public void criarSessao() {
        String tokenGerado = UUID.randomUUID().toString(); // atribui um token aleatorio e unico
        sessao = new Sessao(System.currentTimeMillis(), this, tokenGerado); //inicia a sessao
    }

}
