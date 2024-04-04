/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.pkg4.pkgwhile;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;
public class Atividade4While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos tem na sala? ");
        int numAlunos = scanner.nextInt();

        double somaNotas = 0.0;
        int cont = 1;

        while (cont <= numAlunos) {
            System.out.print("Digite a nota do aluno " + cont + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
            cont++;
        }

        double media = somaNotas / numAlunos;

        System.out.println("A média da turma é: " + media);
    }
}
