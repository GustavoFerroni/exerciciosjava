/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastrocliente;

/**
 *
 * @author Gustavo Ferroni
 */
import javax.swing.*;
import java.awt.*;

public class CadastroCliente {

    public static void main(String[] args) {
        
        //Criar janela principal
        JFrame frame = new JFrame("Cadastro de Cliente");
        frame.setSize(400,450);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Fecha ao clicar no x
        frame.setLocationRelativeTo(null); //Centralizar na tela
        
        //Criar um painel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(220, 220, 220));
        
        //Titulo
        JLabel titulo = new JLabel("Cadastro de Cliente");
        titulo.setBounds(110, 20, 200, 30); //Posição
        titulo.setFont(new Font("Arial", Font.BOLD, 16)); //Fonte
        panel.setBackground(Color.red);//Cor
        panel.add(titulo);
        
        //Nome
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(50, 70, 100, 20);
        panel.add(lblNome);
        JTextField txtNome = new JTextField();
        txtNome.add(txtNome);
        
        //CPF
        
    }
}
