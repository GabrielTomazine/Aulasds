/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade18variáveiseestruturadecondição;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;
public class Atividade18VariáveisEEstruturaDeCondição {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double valorF; 

    System.out.println("Qual o custo de fábrica do seu carro?");
    valorF = sc.nextDouble();

    double valorC = valorF + (valorF * 0.28) + (valorF * 0.45); 

    System.out.println("O custo do consumidor é: " +valorC);
    }
    
}
