package Exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite qual o valor da base do retangulo: ");
        int baseRetangulo = scanner.nextInt();

        System.out.print("Digite o valor da altura do retangulo: ");
        int alturaRetangulo = scanner.nextInt();

        int areaRetangulo = baseRetangulo * alturaRetangulo;

        System.out.printf("O valor atribuido para a base do retangulo foi: %d\n", baseRetangulo);
        System.out.printf("O valor atribuido para a altura do retangulo foi: %d\n", alturaRetangulo);
        System.out.printf("A área do retangulo é: %d", areaRetangulo);

        scanner.close();
    }

}
