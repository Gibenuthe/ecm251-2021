package benuthe.giovanni.Models;

import benuthe.giovanni.Enum.Tipos;
import benuthe.giovanni.Interfaces.Apresentacao;
import benuthe.giovanni.Interfaces.PostarMensagem;

public abstract class Membros implements PostarMensagem, Apresentacao {

    private String username;
    private String email;
    private Tipos funcao;

    public Membros(String username, String email,Tipos funcao) {
        this.username = username;
        this.email = email;
        this.funcao = funcao;
    }

    @Override
    public void apresentar() {
        System.out.println("O " + getFuncao() + " " + getUsername() + " pediu este relatorio:");
    }

    @Override
    public void postarRegular() {

    }

    @Override
    public void postarExtra() {

    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Tipos getFuncao() {
        return funcao;
    }

    @Override
    public String toString() {
        return "Membros{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", funcao=" + funcao +
                '}';
    }


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
