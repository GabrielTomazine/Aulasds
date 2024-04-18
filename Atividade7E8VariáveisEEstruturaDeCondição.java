/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade7e8variáveiseestruturadecondição;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;
public class Atividade7E8VariáveisEEstruturaDeCondição {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        double combustivel;
        double consumo;
        
        System.out.println("Digite o custo de combustìvel: ");
        combustivel = sc.nextInt();

        System.out.println("Digite a média de consumo: ");
        consumo = sc.nextInt();
        
        double media = combustivel/consumo; 
        
        System.out.println("O custo estimado é: " +media+"km/l");
    }
    
}
