package Tipagem1;

public class Biblioteca_Central extends Biblioteca {

    protected String titulo_livro;
    protected String editora_livro;

    Biblioteca_Central(String titulo_livro, String editora_livro) {

        this.editora_livro = titulo_livro;
        this.titulo_livro = editora_livro;
    }

    public String getLivro() {

        return titulo_livro;
    }

    public String getEditora() {

        return editora_livro;
    }
}
