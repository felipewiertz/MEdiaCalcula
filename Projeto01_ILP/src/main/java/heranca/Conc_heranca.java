package heranca;
public class Conc_heranca {
	
    public static void main(String args[]) {
		
	Setor_de_RH a = new Setor_de_RH();
        Almoxarifado_e_materiais b = new Almoxarifado_e_materiais();
		
		
        a.setnome("Hotel Root");
	System.out.println(a.getnome());
	a.setCidade("Sao Paulo");
	System.out.println(a.getCidade());
	b.setNome_funcionario("Pedro");
	System.out.println(b.getNome_funcionario());
	b.setKit_reserva("\"Itens de Higiene\"");
	System.out.println(b.getKit_reserva());
	b.setclientes("Ana");
	System.out.println(b.getclientes());
		
    }

}
