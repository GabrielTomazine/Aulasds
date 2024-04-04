/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.pkg6.pkgwhile;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;
public class Atividade6While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        float maior = 0;
        float segundoMaior = 0;
        int cont = 1;

        while (cont <= 10) {
            System.out.print("Digite o " + cont + "º número: ");
            float num = entrada.nextFloat();

            if (num > maior) {
                segundoMaior = maior;
                maior = num;
            } else if (num > segundoMaior) {
                segundoMaior = num;
            }

            cont++;
        }

        System.out.println("Os dois maiores números digitados são: " + maior + " e " + segundoMaior);
    }
    
}
