/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;

/**
 *
 * @author Admin
 */
public class PessoaExemplo {
    public static void main (String[] args){
            
            Pessoa umaPessoa = new Pessoa();
            umaPessoa.nome = "Gustavo";
            umaPessoa.sexo = "Masculino";
            umaPessoa.pais = "Brasil";
                
    System.out.println("Nome: " + umaPessoa.nome);
    System.out.println("Sexo: " + umaPessoa.sexo);
    System.out.println("Pais: " + umaPessoa.pais);
    
    umaPessoa.pessoaAnda();
    umaPessoa.pessoaFala();
    umaPessoa.pessoaCorre();
    umaPessoa.pessoaEstuda();
    umaPessoa.pessoaBrinca();
    
    umaPessoa = null;
    }
}
