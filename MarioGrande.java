package POO2;

public class MarioGrande implements MarioState {

    @Override
    public MarioGrande pegarCogumelo() {
        System.out.println("Mário pegou o cogumelo novamente");
        System.out.println("Ganhou 1000 pontos!");
        return this;
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
    public MarioPequeno levarDano() {
        System.out.println("Mário levou dano e ficou pequeno!");
        return new MarioPequeno();
    }

    @Override
    public String pegarStatus() {
        return "Vivo";
    }

    @Override
    public String pegarEstado() {
        return "Mário está grande";
    }
}