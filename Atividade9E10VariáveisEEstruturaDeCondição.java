/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade9e10variáveiseestruturadecondição;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;
public class Atividade9E10VariáveisEEstruturaDeCondição {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        int dist;
        double consumo;
        
        System.out.println("Digite em km a distância percorrida: ");
        dist = sc.nextInt();
        
        System.out.println("Digite a média de consumo km/l: ");
        consumo = sc.nextInt();
        
        double total = dist/consumo; 
        double gasto = total * 5.58;

        System.out.println("A quantidade de gasolina e = "+total + "\n" + "O preço gasto é = " +gasto);
    }
    
}
