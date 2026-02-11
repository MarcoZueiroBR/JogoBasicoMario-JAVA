package POO2;

public class MarioMorto implements MarioState {

    @Override
    public MarioPequeno pegarCogumelo() {
        return new MarioPequeno();
    }

    @Override
    public MarioGrande pegarFlor() {
        return new MarioGrande();
    }

    @Override
    public MarioCapa pegarPena() {
        return new MarioCapa();
    }

    @Override
    public MarioState levarDano() {
        return this;
    }

    @Override
    public String pegarStatus() {
        return "Morto";
    }

    @Override
    public String pegarEstado() {
        return "Mário está morto";
    }
}
