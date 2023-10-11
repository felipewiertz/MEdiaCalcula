package Interface;

public class Sacolao {

    public static void main(String[] args) {

        Implementa_interface a = new Implementa_interface();
        a.fruta_citrica = "Laranja";
        a.fruta_vermelha = "Maca";

        System.out.println("Fruta Citrica: " + a.identifica_fruta(a.fruta_citrica));
        System.out.println("Fruta Vermelha: " + a.identifica_fruta(a.fruta_vermelha));
        System.out.println("Quantidade de frutas: " + a.quantidade_fruta(12));
        System.out.println("Preco Kilo da fruta: " + a.preco_kilo(5.66));

    }
}
