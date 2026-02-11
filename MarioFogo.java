package POO2;

public class MarioFogo implements MarioState {

    @Override
    public MarioFogo pegarCogumelo() {
        System.out.println("Mário pegou o cogumelo, mas já está com a flor");
        System.out.println("Ganhou 1000 pontos!");
        return this;
    }

    @Override
    public MarioFogo pegarFlor() {
        System.out.println("Mário pegou a flor novamente");
        System.out.println("Ganhou 1000 pontos!");
        return this;
    }

    @Override
    public MarioCapa pegarPena() {
        System.out.println("Mário pegou a pena!");
        System.out.println("Ganhou 1000 pontos!");
        return new MarioCapa();
    }

    @Override
    public MarioGrande levarDano() {
        System.out.println("Mário levou dano e perdeu a flor!");
        return new MarioGrande();
    }

    @Override
    public String pegarStatus() {
        return "Vivo";
    }

    @Override
    public String pegarEstado() {
        return "Mário está com a flor de fogo";
    }
}