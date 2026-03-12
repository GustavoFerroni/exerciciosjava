/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lampada;

/**
 *
 * @author Admin
 */
public class TesteLampada {
    public static void main(String[] args){
        Lampada lampada = new Lampada(); //Cria um objeto da classe "Lampada"
        
        lampada.mostraEstado(); //Mostra estado inicial da lampada
        
        lampada.acende(); //Liga lampada
        lampada.mostraEstado(); //Mostra resultado depois de acender
        
        lampada.apaga(); //Apaga lampada
        lampada.mostraEstado(); //Mostra resultado depois de apagar
    }
    
}
