package benuthe.giovanni.Models;

import benuthe.giovanni.Enum.Tipos;

/**
 * Classe herdada de Membros do Tipo: Mobile Member
 * Importando o Enum Tipos
 * Com um construtor de sua classe e
 * métodos de postar mensagem tanto para o horário regular
 * quanto horário "extra".
 */

public class MobileMembers extends Membros{
    public MobileMembers(String username, String email, Tipos funcao) {
        super(username, email, funcao);
    }

    @Override
    public void postarRegular() {
        System.out.println(getUsername() + ": Happy Coding!");
    }

    @Override
    public void postarExtra() {
        System.out.println(getUsername() + ": Happy_C0d1ng. Maskers");
    }

}
