package POMAR;

public class Roda_Pomar {

    public static void main(String[] args) {

        Pomar B = null;
        B = new Pomar();

        System.out.println("Area do Pomar = " + B.area_pomar());
        B = new Acessa_Pomar();
        System.out.println("Area do Pomar = " + B.area_pomar());

    }
}
