package Livraria;

public class Livro_Acesso {

    public static void main(String[] args) {

        Livro c = null;

        acessa_classes("y", c);
        acessa_classes("z", c);
        acessa_classes("x", c);
        acessa_classes("w", c);
    }

    public static void acessa_classes(String a, Livro c) {

        if (a == "x") {

            c = new Livro();
        } else if (a == "z") {

            c = new Tipo_Romance("Autor importante: Jose de Alencar");
        } else if (a == "y") {

            c = new Tipo_Espirita("Autor importante: Chico Chavier");
        } else if (a == "w") {

            c = new Tipo_Terror("Autor importante: Lovecraft");
        }

        c.Consulta_Livro();
    }

}
