package POO2;

public class MarioCapa implements MarioState {

    @Override
    public MarioCapa pegarCogumelo() {
        System.out.println("Mário pegou o cogumelo, mas já está com a capa");
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
        System.out.println("Mário pegou a capa novamente!");
        System.out.println("Ganhou 1000 pontos!");
        return this;
    }

    @Override
    public MarioGrande levarDano() {
        System.out.println("Mário levou dano e perdeu a capa!");
        return new MarioGrande();
    }

    @Override
    public String pegarStatus() {
        return "Vivo";
    }

    @Override
    public String pegarEstado() {
        return "Mário está com a capa";
    }
}
