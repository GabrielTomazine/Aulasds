/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade12variáveiseestruturadecondição;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;
public class Atividade12VariáveisEEstruturaDeCondição {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        int valor;
        
        System.out.println("Digite um valor: ");
        valor = sc.nextInt();
        
        int antecessor = valor - 1;
        
        System.out.println("O antecessor desse número é: "+ antecessor);
    }
    
}
