package Sobrecarga;

public class Acessa_Menor {

    public static void main(String[] args) {

        Retorna_Menor f = new Retorna_Menor();

        System.out.println("Menor entre 12 e 6");
        System.out.println(f.menor(12, 6));

        System.out.println("Menor entre 5, 10 e 15");
        System.out.println(f.menor(5, 10, 15));

        System.out.println("Menor entre B e H");
        System.out.println(f.menor('b', 'h'));
    }
}
