/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabuada.pkgfor;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;
public class TabuadaFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tabuada = new Scanner (System.in);
        System.out.println("Digite o Número da Tábuada Desejada: ");
        int num = tabuada.nextInt();
        for (int cont = 0;cont<= 10; cont ++)
        {
            int valor;
            valor = num * cont;
            System.out.println(num +"x"+ cont + "="+ valor);
        }
    }
    
}
