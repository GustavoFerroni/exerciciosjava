/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pitagoras;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Pitagoras {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Cria o objeto para ler os valores 

        double a;
        double b;
        double c;

        //Pede o valor do cateto A
        System.out.print("Digite o valor do cateto A: ");
        a = input.nextDouble();

        //Pede o valor do cateto B
        System.out.print("Digite o valor do cateto B: ");
        b = input.nextDouble();

        //Calcula c² (hipotenusa ao quadrado)
        c = (a * a) + (b * b);

        //Mostra o resultado
        System.out.println("Valor de c²: " + c);

    }
}