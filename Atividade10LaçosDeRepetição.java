/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.pkg10.laços.de.repetição;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;
public class Atividade10LaçosDeRepetição {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor:");
            n = sc.nextInt();
        if (n<=0){
            System.out.println("O valor informado não pode ser igual a 0!");
        }else{
        for (i=0;i<=n;i++){
            System.out.println(i);
        }
    }
  }
}
