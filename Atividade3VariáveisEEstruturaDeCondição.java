/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.pkg3.variáveis.e.estrutura.de.condição;

/**
 *
 * @author Gabriel
 */
import java.util.Scanner;
public class Atividade3VariáveisEEstruturaDeCondição {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite o Nome do Vendedor: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite o Salário Fixo Deste Vendedor: ");
        float salario_fixo = scanner.nextFloat();
        
        System.out.println("Digite o Valor Total de Vendas Feitas por Este Vendedor (Em Dinheiro): ");
        float vendas = scanner.nextFloat();
        
        float comissão;
        float porcentagem;
        
        porcentagem = vendas * 15;
        
        comissão = porcentagem /100;
        
        float salario_final;
        
        salario_final = comissão + salario_fixo;
        
        System.out.println("Nome do Vendedor: "+nome+" Salario Fixo: "+salario_fixo+" Salario Final: "+salario_final);
    }
    
}
