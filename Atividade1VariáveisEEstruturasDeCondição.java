/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.pkg1.variáveis.e.estruturas.de.condição;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;
public class Atividade1VariáveisEEstruturasDeCondição {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float soma;
        float mult;
        float sub;
        float div;
                
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número? ");
        float num1 = scanner.nextFloat();
        
        System.out.print("Digite o segundo número? ");
        float num2 = scanner.nextFloat();
        
        soma = num1 + num2;
        System.out.println("O valor da Soma é: " + soma);
        
        sub = num1 - num2;
        System.out.println("O valor da Subtração: " +sub);
        
        mult = num1 * num2;
        System.out.println("O valor da Multiplicação: " +mult);
        
        div = num1 / num2;
        System.out.println("O valor da Divisão: " +div);
    }
    
}
