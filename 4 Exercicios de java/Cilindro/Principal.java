/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cilindro;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        Cilindro c = new Cilindro();

        c.raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio:"));

        c.altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura:"));

        c.calcular();

        JOptionPane.showMessageDialog(null,
                "Área lateral: " + c.areaLateral +
                "\nVolume: " + c.volume);
    }
}
