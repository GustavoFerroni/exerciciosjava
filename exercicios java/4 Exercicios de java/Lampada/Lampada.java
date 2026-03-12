/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lampada;

/**
 *
 * @author Admin
 */
public class Lampada {
    
    boolean estadoDaLampada; //Guarda o estado da lampada
    
    void acende() {
        estadoDaLampada = true; //Metodo para acender a lampada
    }
    
    void apaga() {
        estadoDaLampada = false; //Metodo para apagar a luz
    }
    
    //Metodo para mostrar estado da lamapada
    void mostraEstado() {
        if (estadoDaLampada == true){
            System.out.println("A lampada esta acesa"); //Verifica se lampada esta acesa
        }
        else {
            System.out.println("A lampada esta apagada"); //Verifica se lampada esta apaga
        }
    }
}
