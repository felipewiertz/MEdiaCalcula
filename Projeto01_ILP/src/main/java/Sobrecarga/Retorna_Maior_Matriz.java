package Sobrecarga;

public class Retorna_Maior_Matriz {

    public int maior(int matriz[]) {

        int maior = 0;

        for (int i = 0; i < matriz.length; i++) {

            if (matriz[i] > maior) {

                maior = matriz[i];
            }
        }

        return maior;
    }

    public double maior(double matrizD[]) {

        double maior = 0;

        for (int i = 0; i < matrizD.length; i++) {

            if (matrizD[i] > maior) {

                maior = matrizD[i];
            }
        }

        return maior;
    }

    public char maior(char matrizC[]) {

        char maior = 0;

        for (int i = 0; i < matrizC.length; i++) {

            if (matrizC[i] > maior) {

                maior = matrizC[i];
            }
        }

        return maior;
    }
}