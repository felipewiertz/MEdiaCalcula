package Sobrecarga;

public class Retorna_Maior {

    public double maior(double a, double b) {

        if (a > b) {

            return a;
        } else {

            return b;
        }
    }

    public double maior(double a, double b, double c) {

        return this.maior(a, this.maior(b, c));
    }

    public char maior(char x, char y) {

        if (x > y) {

            return x;
        } else {

            return y;
        }
    }
}
