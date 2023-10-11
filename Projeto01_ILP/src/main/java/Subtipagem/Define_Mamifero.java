package Subtipagem;

public class Define_Mamifero {

    Mamifero m = null;
    String animal;

    public Mamifero tipo_mamifero(String animal) {

        this.animal = animal;

        if (animal == "cachorro") {

            return m = new Mamifero();

        } else if (animal == "Puma") {

            return m = new Mamifero_America();

        } else if (animal == "onça") {

            return m = new Mamifero_America_Sul();
        }

        else
            return null;
    }

    int g = 0;

    public void verifica_instancia(Mamifero f) {

        g = g + 1;

        if (f instanceof Mamifero) {

            System.out.println("Animal: cachorro " + g + "ª interação");
        }

        if (f instanceof Mamifero_America) {

            System.out.println("Animal: puma " + g + "ª interação");
        }

        if (f instanceof Mamifero_America_Sul) {

            System.out.println("Animal: onça " + g + "ª interação");
        }

    }
}
