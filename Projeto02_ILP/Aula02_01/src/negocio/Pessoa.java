/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author dreis
 */
abstract class Pessoa {
    // declaração de atributos
    protected String nome, email;

    // encapsulamento de atributos
    public String getNome() { return nome; }

    public String getEmail() { return email; }
//    public void setEmail(String email) { this.email = email; }
    
    // construtor não-default
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String entrarNaAula(){
        return String.format("Olá, meu nome é %s.", nome);
    }

}
