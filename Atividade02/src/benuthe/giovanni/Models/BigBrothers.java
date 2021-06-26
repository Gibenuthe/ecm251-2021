package benuthe.giovanni.Models;

import benuthe.giovanni.Enum.Tipos;

/**
 * Classe herdada de Membros do Tipo: Big Brother
 * Importando o Enum Tipos
 * Com um construtor de sua classe e
 * métodos de postar mensagem tanto para o horário regular
 * quanto horário "extra".
 */

public class BigBrothers extends Membros{
    public BigBrothers(String username, String email, Tipos funcao) {
        super(username, email, funcao);
    }

    @Override
    public void postarRegular() {
        System.out.println(getUsername() + ": Sempre ajudando as pessoas membros ou não S2!");
    }

    @Override
    public void postarExtra() {
        System.out.println(getUsername() + ": ...");
    }

}
