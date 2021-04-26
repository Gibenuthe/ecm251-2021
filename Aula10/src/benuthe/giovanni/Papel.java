package benuthe.giovanni;

public class Papel extends Jogada {

    @Override
    public Jogada[] jogadasQueVenco() {
        return new Jogada[]{new Pedra(), new Spoke()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Tesoura(), new Lagarto()};
    }

    @Override
    public String toString() {
        return "Papel";
    }
}