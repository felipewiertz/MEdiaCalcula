package Sobrecarga;

import javax.swing.JOptionPane;

public class Acessa_Maior {

    public static void main(String[] args) {

        Retorna_Maior f = new Retorna_Maior();

        double a, b, c;
        String d, e;
        char char01, char02;

        int opc;

        opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                "VERIFICA MAIOR \n1-Entre 2 numeros\n2-Entre 3 numeros\n3-Entre 2 caracteres"));

        switch (opc) {

            case 1: {
                a = Double.parseDouble(JOptionPane.showInputDialog(null, "Primeiro valor!"));
                b = Double.parseDouble(JOptionPane.showInputDialog(null, "Segundo valor!"));

                JOptionPane.showMessageDialog(null, "O maior valor e: " + f.maior(a, b));
                break;
            }

            case 2: {

                a = Double.parseDouble(JOptionPane.showInputDialog(null, "Primeiro valor!"));
                b = Double.parseDouble(JOptionPane.showInputDialog(null, "Segundo valor!"));
                c = Double.parseDouble(JOptionPane.showInputDialog(null, "Terceiro valor!"));

                JOptionPane.showMessageDialog(null, "O maior valor e: " + f.maior(a, b, c));
                break;
            }

            case 3: {

                d = JOptionPane.showInputDialog(null, "Primeiro Caractere");
                char01 = d.charAt(0);

                e = JOptionPane.showInputDialog(null, "Segundo caractere");
                char02 = e.charAt(0);

                JOptionPane.showMessageDialog(null, "O maior caractere e: " + f.maior(char01, char02));
                break;
            }

        }

    }
}
