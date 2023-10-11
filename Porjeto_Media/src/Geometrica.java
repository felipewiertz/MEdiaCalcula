import static java.lang.Math.sqrt;

public class Geometrica implements ICalcMedia{

    @Override

    double media;

    public double CalculaMedia(double a, double b) {

        media = sqrt(a*b);

        return media;
    }

    @Override
    public String Situacao(double a) {

        String resultado;

        if (a > 7){

            resultado = "Aluno Aprovado!!";;
        }
        else
        {
            resultado = ("Aluno reprovado");

        }

        return resultado;
    }
}
