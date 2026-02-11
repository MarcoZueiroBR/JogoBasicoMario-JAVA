package POO2;

public class Player {

    private MarioState estado;
    private int pontos;

    public Player() {
        this.estado = new MarioPequeno();
        this.pontos = 0;
    }

    public void pegarCogumelo() {
        this.estado = estado.pegarCogumelo();
        this.pontos += 1000;
    }

    public void pegarFlor() {
        this.estado = estado.pegarFlor();
        this.pontos += 1000;
    }

    public void pegarPena() {
        this.estado = estado.pegarPena();
        this.pontos += 1000;
    }

    public void levarDano() {
        this.estado = estado.levarDano();
        if (estado.pegarStatus().equals("Morto")) {
            System.out.println("Pontos resetados!");
            System.out.println("Você tinha " + this.pontos + " pontos");
            this.pontos = 0;
        }
    }

    public void pegarEstado() {
        System.out.println(estado.pegarEstado());
    }
}
