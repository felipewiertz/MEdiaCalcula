package Sobrecarga;

public class Retorna_Volume {

    public double Volume(double comprimento, double altura, double largura) {

        double volume;

        volume = comprimento * largura * altura;

        return volume;
    }

    public double volume(double aresta) {

        double volume;

        volume = aresta * aresta;

        return volume;
    }

    public double volume(double base, double altura) {

        double area;
        double volume;

        area = base * base;

        volume = area * altura / 3;

        return volume;
    }
}
