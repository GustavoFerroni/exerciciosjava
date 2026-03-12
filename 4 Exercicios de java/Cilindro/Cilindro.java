/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cilindro;

/**
 *
 * @author Admin
 */
public class Cilindro {

    double raio;
    double altura;
    double areaLateral;
    double volume;

    void calcular() {

        areaLateral = 2 * 3.14 * raio * altura;

        volume = 3.14 * raio * raio * altura;
    }
}