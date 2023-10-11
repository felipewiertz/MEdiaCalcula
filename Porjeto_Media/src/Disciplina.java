public class Disciplina {

    private ICalcMedia CalcMedia;
    private double media;
    private String Nome;
    private double P1;
    private double P2;
    private String Situacao;



    public double getP1() {
        return P1;
    }

    public double getP2() {
        return P2;
    }

    public double getMedia() {
        return media;
    }

    public String getNome() {
        return Nome;
    }

    public String getSituacao() {
        return Situacao;
    }

    public void setP1(double p1) {
        P1 = p1;
    }

    public void setP2(double p2) {
        P2 = p2;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void setICalcMedia(ICalcMedia ICalcMedia) {
        this.CalcMedia = ICalcMedia;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setSituacao(String situacao) {
        Situacao = situacao;
    }


    public void CalcularMedia() {

    }

    public Disciplina(){

    }

}
