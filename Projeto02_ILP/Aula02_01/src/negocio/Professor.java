/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author dreis
 */
public class Professor extends Pessoa{
    
    public Professor(String nome) {
        super(nome);
    }

    // polimorfismo do tipo override (ou sobrescrita)
    @Override
    public String entrarNaAula() {
        // dá um novo comportamento ao método, descartando o original
        return String.format("Olá, meu nome é Prof. %s.", nome);
        
        //// no caso abaixo, aproveita o comportamento oriundo 
        //// do método original e adiciona mais um comportamento/ação/atuação
        // return super.entrarNaSala() + " Sou o professor de hoje."; 
    }
    
    // polimorfismo do tipo overload (ou sobrecarga)
    public String entrarNaAula(String tratamento){
        // dá um novo comportamento ao método, descartando o original
        return String.format("Olá, meu nome é Prof. %s %s.", tratamento, nome);
    }
}
