/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.converasaotemperatura;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Converasaotemperatura {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //Cria um objeto Scanner para ler os valores que serão digitados
        
        //Declarando variaveis
        double fahrenheit;
        double kelvin;
        double celsius;
        
        System.out.print("Digite a temperatura em Fahrenheit:"); 
        fahrenheit = input.nextDouble(); //Le o valor e guarda na variavel
        celsius = 5.0/9.0 * (fahrenheit - 32); //Aplica a formula da conversão
        System.out.println("Celsius" + celsius); //Exibe o resultado da conversão
        
        System.out.print("Digite a temperatura em Kelvin:");
        kelvin = input.nextDouble(); //Le o valor e guarda variavel
        celsius = kelvin - 273.15; //Aplica a conersão
        System.out.println("Celsius:" + celsius); //Exibe o resultado      
        
    }
 
}
