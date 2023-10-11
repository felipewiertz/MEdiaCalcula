package Tipagem;

import javax.swing.*;

public class Interface_tipagem {

    String p;
    int q;
    Cidade r = null;

    public Cidade locais_Cidade() {

        p = JOptionPane.showInputDialog("Digitar o Nome do Local");
        q = Integer.parseInt(JOptionPane.showInputDialog("Digitar a Quantidade de Habitantes"));
        String local = JOptionPane.showInputDialog("Cidade = c \n bairro = b \n distrito = d \n");
        char tipo = local.charAt(0);

        if (tipo == 'c') {
            return new Cidade(p, q);
        }

        if (tipo == 'b') {
            return new Bairro(p, q);
        }

        else if (tipo == 'd') {
            return r = new Distrito(p, q);
        }

        else {

            return null;
        }
    }

    public void tipo_local(Cidade f) {

        if (f instanceof Bairro) {

            ((Bairro) f).setNomeBairro(p);
            ((Bairro) f).setHabitantesBairro(q);

            System.out.println("Local e Bairro" + "\n nome do Bairro = " + ((Bairro) f).getNomeBairro() +
                    "\n Numero de habitantes = " + ((Bairro) f).getHabitantesBairro());
        }

        else if (f instanceof Distrito) {

            ((Distrito) f).setNomeDistrito(p);
            ((Distrito) f).setHabitanteDistrito(q);

            System.out.println("Local e Distrito" + "\n nome do Distrito = " + ((Distrito) f).getNomeDistrito() +
                    "\n Numero de habitantes = " + ((Distrito) f).getHabitanteDistrito());

        }

        else {

            f.setNome_local(p);
            f.setHabitantes(q);

            System.out.println("Local e cidade" + "\n Nome da Cidade = " + ((Cidade) f).getNome_local() +
                    "\n Numero de Habitantes = " + ((Cidade) f).getHabitantes());

        }
    }
}