/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import negocio.Aluno;
import negocio.Professor;

/**
 *
 * @author dreis
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instancia objeto da classe Aluno
        Aluno aluno1 = new Aluno("Gidelson");
        // executa uma das operações/comportamentos possíveis (regras de negócio)
        System.out.println(aluno1.entrarNaAula());
        
        // instancia outro objeto da classe Aluno
        Aluno aluno2 = new Aluno("Vinícius");
        // o segundo aluno também entra na sala (regras de negócio)
        System.out.println(aluno2.entrarNaAula());
        
        // instancia objeto da classe Professor
        Professor prof1 = new Professor("Rubens Lara");
        // executa operação (regra de negócio)
        System.out.println(prof1.entrarNaAula());
        
        // instancia outro objeto da classe Professor
        Professor prof2 = new Professor("Rubens");
        // executa operação (regra de negócio)
        System.out.println(prof2.entrarNaAula("Dr."));
        
//        Pessoa pessoa = new Pessoa("Pessoa Qualquer");
//        System.out.println(pessoa.entrarNaSala());
        
    }
    
}
