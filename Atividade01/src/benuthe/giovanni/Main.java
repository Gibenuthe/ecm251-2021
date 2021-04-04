/*
        NOME: Giovanni Brandini Blanco Benuthe
        RA:   19.00043-0
 */
package benuthe.giovanni;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Criando Usuarios
        System.out.println("Nome do usuário 1: ");
        String nome1 = new Scanner(System.in).nextLine();
        System.out.println("Nome do usuário 2: ");
        String nome2 = new Scanner(System.in).nextLine();
        System.out.println("Nome do usuário 3: ");
        String nome3 = new Scanner(System.in).nextLine();

        Usuarios U1 = new Usuarios(nome1, "", "", 1000);
        Usuarios U2 = new Usuarios(nome2, "", "", 250);
        Usuarios U3 = new Usuarios(nome3, "", "", 3000);

        // Estado Inicial
        System.out.println("Estado Inicial:");
        System.out.println("Nome Usuário: " + U1.getNome() + " - Saldo: " + U1.getC().getSaldo());
        System.out.println("Nome Usuário: " + U2.getNome() + " - Saldo: " + U2.getC().getSaldo());
        System.out.println("Nome Usuário: " + U3.getNome() + " - Saldo: " + U3.getC().getSaldo());

        // Operacoes
        String QrU1 = Transacoes.gerarQrCode(U1.getC().getIdConta(), nome1, 250);
        Transacoes.transacao(U2, U1, QrU1);
        Transacoes.transacao(U3, U1, QrU1);
        Transacoes.transacao(U2, U1, QrU1);
        String QrU2 = Transacoes.gerarQrCode(U2.getC().getIdConta(), nome2, 1000);
        Transacoes.transacao(U3, U2, QrU2);

        // Estado Final
        System.out.println("Estado Final:");
        System.out.println("Nome Usuário: " + U1.getNome() + " - Saldo: " + U1.getC().getSaldo());
        System.out.println("Nome Usuário: " + U2.getNome() + " - Saldo: " + U2.getC().getSaldo());
        System.out.println("Nome Usuário: " + U3.getNome() + " - Saldo: " + U3.getC().getSaldo());
    }
}
