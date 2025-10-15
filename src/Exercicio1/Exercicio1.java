package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int anoAtual = 2025;
        int idade = anoAtual - anoNascimento;

        System.out.printf("Olá, %s, é um prazer te conhecer.\nSua idade atual é %d.", nome, idade);

        scanner.close();
    }
}
