package Sobrecarga;

public class Retorna_Menor {

    public double menor(double a, double b) {

        if (a < b) {

            return a;
        } else {

            return b;
        }
    }

    public double menor(double a, double b, double c) {

        return this.menor(a, this.menor(b, c));
    }

    public char menor(char x, char y) {

        if (x < y) {

            return x;
        } else {

            return y;
        }
    }
}
