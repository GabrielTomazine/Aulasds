/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.pkg2.pkgwhile;

/**
 *
 * @author Aluno CA
 */
public class Atividade2While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 1;
        System.out.println("Número pares de 1 a 100:");
        while (num <= 100) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }
    }
    
}
