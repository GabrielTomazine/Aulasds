/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.vetores;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;
public class AtividadeVetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Entender o Arrays
        int num [] = new int[5];
        Scanner entrada = new Scanner (System.in);
        
        //Recebendo Números
        for (int indice = 0; indice<5; indice++){
            System.out.println("Digite um Número: ");
            num[indice] = entrada.nextInt();
        }
    }
    
}
