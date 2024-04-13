/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.pkg2.variáveis.e.estrutura.de.condição;


/**
 *
 * @author Gabriel
 */
import java.util.Scanner;
public class Atividade2VariáveisEEstruturaDeCondição {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a Distância Percorrida (Em Km): ");
        float Km = scanner.nextFloat ();
        
        System.out.println("Digite a Quantidade de Gasolina Gasta (Em Litros): ");
        float gasolina = scanner.nextFloat ();
        
        float media;
        
        media = Km / gasolina;
        
        System.out.println("A Média de Gasolina Gasta Durante o Trajeto é: " + media);
        
    }
    
}
