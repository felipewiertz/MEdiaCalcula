package Tipagem1;

import javax.swing.*;

public class Interface_Biblioteca {

    String m, n;

    public Biblioteca_Central livro() {

        m = JOptionPane.showInputDialog("DIGITAR O NOME DO LIVRO");
        n = JOptionPane.showInputDialog("DIGITAR O NOME DA EDITORA");
        int tipo_livro = Integer.parseInt(JOptionPane.showInputDialog("1 - geral \n 2 - informatica \n 3 - biologia" +
                "\n 4 - historia \n 5 - geografia"));

        if (tipo_livro == 1) {

            return new Biblioteca_Central(m, n);

        } else if (tipo_livro == 2) {

            return new Biblioteca_Informatica(m, n);

        } else if (tipo_livro == 3) {

            return new Biblioteca_Biologia(m, n);

        } else if (tipo_livro == 4) {

            return new Biblioteca_Historia(m, n);

        } else if (tipo_livro == 5) {

            return new Biblioteca_Geografia(m, n);

        } else {

            return null;
        }

    }

    public void livraria(Biblioteca a) {

        if (a instanceof Biblioteca_Informatica) {

            System.out.println("livro é de informatica \n" + ((Biblioteca_Informatica) a).getLivro_informatica()
                    + "\n biblioteca: " +
                    ((Biblioteca_Informatica) a).getEditora_informatica());

        } else if (a instanceof Biblioteca_Biologia) {

            System.out.println(
                    "livro e de biologia \n" + ((Biblioteca_Biologia) a).getLivro_biologia() + "\n Editora: " +
                            ((Biblioteca_Biologia) a).getEditora_biologia());

        } else if (a instanceof Biblioteca_Historia) {

            System.out.println(
                    "livro e de historia \n" + ((Biblioteca_Historia) a).getLivro_historia() + "\n Editora: " +
                            ((Biblioteca_Historia) a).getEditora_historia());

        } else if (a instanceof Biblioteca_Geografia) {

            System.out.println(
                    "livro e de geografia \n" + ((Biblioteca_Geografia) a).getLivro_geografia() + "\n Editora: " +
                            ((Biblioteca_Geografia) a).getEditora_geografia());
        }

        else {

            System.out.println("livro e geral \n" + ((Biblioteca_Central) a).getLivro() + "\n Editora: " +
                    ((Biblioteca_Central) a).getEditora());
        }
    }
}
