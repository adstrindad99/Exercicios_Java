package Exercicio4;

import java.util.Scanner;

public class Exercicio4 {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do usuario 1: ");
        String usuario1 = scanner.nextLine();
        System.out.println("Digite a idade do usuario 1: ");
        int idade1 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o nome do usuario 2: ");
        String usuario2 = scanner.nextLine();
        System.out.println("Digite a idade do usuario 2: ");
        int idade2 = scanner.nextInt();

        int diferencaIdade = idade1 % idade2;

        System.out.printf("A diferença de idade entre %s e %s é de %d anos.", usuario1, usuario2, diferencaIdade);

        scanner.close();
    }
}
