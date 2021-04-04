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
    public Usuarios(String nome, String senha, String email, double valor) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.c = new Conta(valor);
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
