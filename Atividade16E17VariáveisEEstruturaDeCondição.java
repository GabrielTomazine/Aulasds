/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade16e17variáveiseestruturadecondição;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;
public class Atividade16E17VariáveisEEstruturaDeCondição {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int salario; 
    int reajuste; 

    System.out.println("Qual o seu salário mensal? ");
    salario = sc.nextInt();

    System.out.println("Qual o percentual de reajuste (apenas o número )? ");
            reajuste = sc.nextInt();

    int total = salario + (salario * reajuste / 100); 

    System.out.println("Seu novo salário é: " + total);
    }
    
}
