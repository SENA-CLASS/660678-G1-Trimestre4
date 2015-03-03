/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplowrappers;

import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author Enrique Moreno
 */
public class EjemploLectura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog("digite numero"));
        int b=Integer.parseInt(JOptionPane.showInputDialog("digite numero"));
        System.out.println(a+b);
        JOptionPane.showMessageDialog(null, a+b);
        
        Scanner teclado = new Scanner(System.in);
        int aa= teclado.nextInt();
        int bb= teclado.nextInt();
        System.out.println(aa+bb);
        
    }
}
