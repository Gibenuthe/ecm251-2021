package benuthe.giovanni;

public class Spoke extends Jogada {
    @Override
    public Jogada[] jogadasQueVenco() {
        return new Jogada[]{new Pedra(), new Tesoura()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Papel(), new Lagarto()};
    }
    @Override
    public String toString() {
        return "Spoke";
    }
}