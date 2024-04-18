/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade19variáveiseestruturadecondição;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;
public class Atividade19VariáveisEEstruturaDeCondição {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o número de carros vendidos pelo vendedor:");
        int numeroCarrosVendidos = sc.nextInt();
        
        System.out.println("Digite o valor total das vendas:");
        double valorTotalVendas = sc.nextDouble();
        
        System.out.println("Digite o salário fixo do vendedor:");
        double salarioFixo = sc.nextDouble();
        
        System.out.println("Digite o valor que o vendedor recebe por carro vendido:");
        double comissaoPorCarro = sc.nextDouble();
        
        // Cálculo do salário final
        double comissaoTotal = numeroCarrosVendidos * comissaoPorCarro;
        double bonusVendas = valorTotalVendas * 0.05;
        double salarioFinal = salarioFixo + comissaoTotal + bonusVendas;
        
        System.out.printf("O salário final do vendedor é: "+ salarioFinal);
        
        sc.close();
    }
    
}

