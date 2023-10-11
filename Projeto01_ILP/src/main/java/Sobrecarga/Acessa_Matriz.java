package Sobrecarga;

public class Acessa_Matriz {

    public static void main(String[] args) {

        Retorna_Maior_Matriz f = new Retorna_Maior_Matriz();

        int[] MatrizA = { 10, 20, 30, 40, 50, 60 };
        double[] MatrizB = { 10.5, 20.5, 36.7, 49.8 };
        char[] MatrizC = { 'a', 'b', 'c', 'd', 'e', 'f' };

        System.out.println("Maior entre Matriz de Inteiros");
        System.out.println(f.maior(MatrizA));

        System.out.println("Maior entre Matriz de Reais");
        System.out.println(f.maior(MatrizB));

        System.out.println("Maior entre Matriz de Caracteres");
        System.out.println(f.maior(MatrizC));
    }

}
