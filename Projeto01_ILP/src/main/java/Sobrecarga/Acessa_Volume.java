package Sobrecarga;

public class Acessa_Volume {

    public static void main(String[] args) {

        Retorna_Volume f = new Retorna_Volume();

        System.out.println("Volume de um parelelepido! " + "\n" +
                "Comprimento = 10" + "\n" + "Largura = 5.5" + "\n" + "Altura = 12.5");
        System.out.println(f.Volume(10, 5.5, 12.5));

        System.out.println("Volume de um Cubo de Aresta 3.5");
        System.out.println(f.volume(3.5));

        System.out.println("Volume de Uma piramide quadrada de base 4 e altura 10");
        System.out.println(f.volume(4, 10));
    }
}
