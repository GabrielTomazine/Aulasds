/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.pkg3.pkgwhile;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;
public class Atividade3While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        System.out.println("Números pares até " + num + ":");
        int i = 1;
        while (i <= num) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println("\nNúmeros ímpares até " + num + ":");
        i = 1;
        while (i <= num) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
    
}
