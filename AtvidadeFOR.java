/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atvidade.pkgfor;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;
public class AtvidadeFOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Laços de Repetição
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um Número: ");
        int contador = entrada.nextInt();
        
        for (int inicio = 0; inicio <= contador; inicio++)
        {
            System.out.println("Número "+inicio);
        }
    }
    
}
