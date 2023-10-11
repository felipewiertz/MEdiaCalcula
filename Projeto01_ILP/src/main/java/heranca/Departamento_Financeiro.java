package heranca;

public class Departamento_Financeiro extends Rede_de_Hotelaria {  
    
    private String clientes;
    private String Nome_funcionario;
    private String Kit_reserva;
    
    Departamento_Financeiro(){
    super();
    System.out.println("acesso ao metodo construtor da Rede de hotelaria");
    }

    public void setclientes(String clientes) {
   	 this.clientes = clientes;
   	 
    }
    
    public String getclientes() {
   	 return clientes;
   	 
    }	  

    public void setNome_funcionario(String Nome_funcionario) {
	 this.Nome_funcionario = Nome_funcionario;
	 
}

     public String getNome_funcionario() {
	 return Nome_funcionario;
	 
  }

    public void setKit_reserva(String Kit_reserva) {
	 this.Kit_reserva = Kit_reserva;
	 
}

    public String getKit_reserva() {
	 return Kit_reserva;
	 
	 

    } 
}
