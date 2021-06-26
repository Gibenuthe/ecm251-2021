package benuthe.giovanni.Models;

import benuthe.giovanni.Enum.Tipos;

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

//    @Override
//    public void apresentar() {
//        System.out.println("O " + getFuncao() + " " + getUsername() + " pediu este relatorio:");
//    }

}
