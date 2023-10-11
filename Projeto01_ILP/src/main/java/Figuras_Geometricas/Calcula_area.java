package Figuras_Geometricas;

public class Calcula_area {

    public static void main(String[] args) {

        Figuras u = new Figuras();

        System.out.println("Area do retangulo: " + u.getArea(u.getLado_a(), u.getLado_b()));
        System.out.println("Area do quadrado: " + u.getArea());

        u.setLado_a(4.0);

        System.out.println("Area do retangulo: " + u.getArea(u.getLado_a(), u.getLado_b()));
        System.out.println("Area do quadrado: " + u.getArea());

    }
}
