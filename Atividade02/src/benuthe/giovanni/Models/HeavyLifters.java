package benuthe.giovanni.Models;

import benuthe.giovanni.Enum.Tipos;

/**
 * Classe herdada de Membros do Tipo: Heavy Lifter
 * Importando o Enum Tipos
 * Com um construtor de sua classe e
 * métodos de postar mensagem tanto para o horário regular
 * quanto horário "extra".
 */

public class HeavyLifters extends Membros{
    public HeavyLifters(String username, String email, Tipos funcao) {
        super(username, email, funcao);
    }

    @Override
    public void postarRegular() {
        System.out.println(getUsername() + ": Podem contar conosco!");
    }

    @Override
    public void postarExtra() {
        System.out.println(getUsername() + ": N00b_qu3_n_Se_r3pita.bat");
    }


}
