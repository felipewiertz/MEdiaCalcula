package Figuras_Geometricas;

public class Figuras {

    private double lado_a;
    private double lado_b;
    private double lado_c;
    private double area;

    Figuras() {

        lado_a = 2.0;
        lado_b = 3.0;
        lado_c = 1.0;
    }

    public void setLado_a(double lado_a) {

        this.lado_a = lado_a;
    }

    public void setLado_b(double lado_b) {

        this.lado_b = lado_b;
    }

    public double getLado_a() {

        return lado_a;
    }

    public double getLado_b() {

        return lado_b;
    }

    public double getArea(double lado_a, double lado_b) {

        this.lado_a = lado_a;
        this.lado_b = lado_b;
        area = lado_a * lado_b;

        return area;

    }

    public double getArea() {

        area = lado_c * lado_c;
        return area;
    }
}
