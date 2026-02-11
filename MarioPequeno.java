package POO2;

public class MarioPequeno implements MarioState { ;

    @Override
    public MarioGrande pegarCogumelo() {
        System.out.println("Mário pegou o cogumelo e ficou grande!");
        System.out.println("Ganhou 1000 pontos!");
        return new MarioGrande();
    }

    @Override
    public MarioFogo pegarFlor() {
        System.out.println("Mário pegou a flor!");
        System.out.println("Ganhou 1000 pontos!");
        return new MarioFogo();
    }

    @Override
    public MarioCapa pegarPena() {
        System.out.println("Mário pegou a pena!");
        System.out.println("Ganhou 1000 pontos!");
        return new MarioCapa();
    }

    @Override
    public MarioMorto levarDano() {
        System.out.println("Game Over!");
        return new MarioMorto();
    }

    @Override
    public String pegarStatus() {
        return "Vivo";
    }

    @Override
    public String pegarEstado() {
        return "Márío está pequeno";
    }
}
