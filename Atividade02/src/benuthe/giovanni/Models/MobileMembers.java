package benuthe.giovanni.Models;

import benuthe.giovanni.Enum.Tipos;

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

//    @Override
//    public void apresentar() {
//
//    }
}
