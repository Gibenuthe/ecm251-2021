/*
        NOME: Giovanni Brandini Blanco Benuthe
        RA:   19.00043-0
 */
package benuthe.giovanni;

public class Conta {

    // Atributos
    private int idConta;
    private double saldo;
    private static int nConta = 0;

    // Construtor
    public Conta(double saldo) {
        nConta += 1;
        this.idConta = nConta;
        this.saldo = saldo;
    }

    // Getters
    public int getIdConta() {
        return idConta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Metodos
    void depositar(double valor) {
        this.saldo += valor;
    }

    boolean sacar(double valor) {
        if (valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    boolean transferirDinheiro(Conta destino, double valor) {
        if (this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    // toString
    @Override
    public String toString() {
        return "Conta{" +
                "idConta=" + idConta +
                ", saldo=" + saldo +
                '}';
    }
}
