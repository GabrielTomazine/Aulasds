/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade5variáveiseestruturadecondição;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;
public class Atividade5VariáveisEEstruturaDeCondição {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

          int l1;
          int l2;

          System.out.println("Digite a largura: ");
          l1 = sc.nextInt();

          System.out.println("Digite a altura: ");
          l2 = sc.nextInt();

          int area = l1 * l2;

          System.out.println("A área do retângulo é: " + area);

    }
    
}
