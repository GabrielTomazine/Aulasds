/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade6variáveiseestruturadecondição;

/**
 *
 * @author Aluno CA
 */

public class Atividade6VariáveisEEstruturaDeCondição {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c;

        a = 10;
        b = 15;

        System.out.println("Os numeros escolhidos são: " + a + ", " + b);

        c = a;

        a = b;
        b = c;

        System.out.println("Os numeros invertidos são: " + a + ", " + b);
    }  
    
}
