package Figuras_Geometricas;

public class Areas extends Figuras {

    private double area;

    public double Area(double lado_a, double lado_b) {

        area = lado_a * lado_b;

        return area;
    }

    public double Area(double lado_a, double lado_b, double lado_c) {

        area = lado_a * lado_b * lado_c;

        return area;
    }

    public double Area(double lado_a) {

        area = lado_a * lado_a;

        return area;
    }
}