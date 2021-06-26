//Arthur C Sarnadas – 19.00756-6
//Giovanni B Benuthe – 19.00043-0
//Luiz F Rodrigues – 19.01358-2
package benuthe.giovanni;

import benuthe.giovanni.Models.Sistema;

import java.io.IOException;

/**
 * Classe Main que faz a chamada de executar() da classe sistema.
 */

public class Main {

    public static void main(String[] args) throws IOException {

        Sistema sistema = new Sistema();
        sistema.executar();

    }
}
