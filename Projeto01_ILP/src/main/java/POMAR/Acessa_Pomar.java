package POMAR;

public class Acessa_Pomar extends Pomar {

    public static void main(String[] args) {

        Pomar A = new Pomar();

        System.out.println("Arvore: " + A.get_arvore() + "\n" +
                "Fruta: " + A.get_fruta());

        A.set_arvore("Laranjeira");
        A.get_arvore();

        A.set_fruta("Laranja");
        A.get_fruta();

        System.out.println("Arvore: " + A.get_arvore() + "\n" +
                "Fruta: " + A.get_fruta());

    }

    public double area_pomar() {

        return 880.13;
    }
}
