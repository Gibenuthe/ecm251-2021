package benuthe.giovanni.Models;

import benuthe.giovanni.Enum.Tipos;

public class ScriptGuys extends Membros{
    public ScriptGuys(String username, String email, Tipos funcao) {
        super(username, email, funcao);
    }

    @Override
    public void postarRegular() {
        System.out.println(getUsername() + ": Prazer em ajudar novos amigos de código!");
    }

    @Override
    public void postarExtra() {
        System.out.println(getUsername() + ": QU3Ro_S3us_r3curs0s.py");
    }

//    @Override
//    public void apresentar() {
//
//    }
}
