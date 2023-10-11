public class Main {
    public static void main(String[] args) {

        Aritimetica calculo = new Aritimetica();

        Disciplina d = new Disciplina(calculo);

        d.setNome("Padroes de desenvolvimento");

        d.setP1(10);
        d.setP2(5);
        d.CalcularMedia();

        System.out.println(String.format("P1:%.2f P2:%.2f media:%.2f  Situacao: %s", d.getP1(),d.getP2(),d.getMedia(),d.getSituacao()));
    }
}