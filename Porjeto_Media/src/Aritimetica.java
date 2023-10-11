import java.util.SortedSet;

import static java.lang.System.*;

public class Aritimetica implements ICalcMedia{

    double media;

    public double CalculaMedia(double a, double b) {

        media = (a+b)/2;

        return media;
    }

    @Override
    public String Situacao(double a) {

        String resultado;

        if (a > 5){

            resultado = "Aluno Aprovado!!";;
        }
        else
        {
            resultado = ("Aluno reprovado");

        }

        return resultado;
    }
}
