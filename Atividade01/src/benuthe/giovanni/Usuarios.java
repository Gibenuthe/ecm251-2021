/*
        NOME: Giovanni Brandini Blanco Benuthe
        RA:   19.00043-0
 */
package benuthe.giovanni;

public class Usuarios {

    // Atributos
    private String nome;
    private String senha;
    private String email;
    private Conta c;

    // Construtor
    public Usuários(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.c = new Conta(c.getSaldo());
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    public Conta getC() {
        return c;
    }

    //toString
    @Override
    public String toString() {
        return "Usuarios{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                ", conta=" + c +
                '}';
    }
}
