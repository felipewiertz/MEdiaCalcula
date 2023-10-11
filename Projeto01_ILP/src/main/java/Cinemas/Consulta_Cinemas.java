package Cinemas;

public class Consulta_Cinemas {
    public static void main(String args[]){
    
        Cine_Cinemark Cinemark = new Cine_Cinemark();
        Cine_Roxy roxy = new Cine_Roxy();
        Cine_caicara caicara = new Cine_caicara("""
                                                Antigo cinema da
                                                Av. Conselheiro Nebias - Boqueirao""");
        
        caicara.setLocalizacao("Av. Conselheiro Nebias com a Praia");
        caicara.setNome("Cine Caicara");
        System.out.println("Cine \t" + caicara.getNome() + "\nficava na esquina da:\t"
        + caicara.getLocalizacao());
        
        Cinemark.setCinemark("Cinemark shopping praiamar\n");
        Cinemas_do_Shopping praiamar = new Cinemas_do_Shopping();
        System.out.println("Localizado em: " + Cinemark.getCinemark());
        
    }
}
