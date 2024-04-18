/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.pkg1.laços.de.repetição;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;
public class Atividade1LaçosDeRepetição {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        float v1, v2, v3;
        
        System.out.println("Digite o Primeiro Valor: ");
        v1 = sc.nextFloat();
        
        System.out.println("Digite o Segundo Valor: ");
        v2 = sc.nextFloat();
        
        if (v2==0){
            System.out.println("O Valor '0' Não Pode Ser Inserido No Segundo Valor. Digite o Valor Novamente: ");
            v2 = sc.nextFloat();
            
            v3 = v1 / v2;
        
        System.out.println("O Resultado da Divisão Entre o Valor Um e Dois é:" + v3);
        }
        else{
        
        v3 = v1 / v2;
        
        System.out.println("O Resultado da Divisão Entre o Valor Um e Dois é:" + v3);
        }
    }
    
}
