/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hipotenusa;

/**
 *
 * @author Admin
 */
public class ExemploHipotenusa {
    public static void main(String [] args) {
        
        ExemploHipotenusa c = new ExemploHipotenusa();
        
        double base = 3;
        double altura = 4;
        
        double resultado;
        resultado = c.hipotenusa (base, altura);
        
        System.out.println("Resultado: "+ resultado);
        
    }
    
    public double hipotenusa(double base, double altura) {
        return (base * base) + (altura * altura);
    }
}
