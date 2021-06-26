package benuthe.giovanni.Models;

import benuthe.giovanni.Enum.Tipos;

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

//    @Override
//    public void apresentar() {
//
//    }

//    @Override
//    public String toString() {
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    }

//    @Override
//    public String toString() {
//        String pacote = getClass().getName();
//        String arroba = "@";
//        String codigo = Integer.toHexString(hashCode());
//        if (pacote == "benuthe.giovanni.Models.HeavyLifters"){
//            pacote = "HeavyLifters";
//        }
//        codigo.toString();
//        String stringloca = pacote + ";" + codigo;
//        return stringloca;
//    }

}
