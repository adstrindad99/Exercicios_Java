package Exercicio2;

import java.util.Scanner;

public class Exercicio2 {

        public static void main(String [] args){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Qual o tamanho no lado do quadrado? ");

            int ladoQuadrado = scanner.nextInt();

            int areaQuadrado = ladoQuadrado * ladoQuadrado;

            System.out.printf("O valor digitado para o lado do quadrado foi: %d\n", ladoQuadrado);
            System.out.printf("A aréa tatal do quadrado é: %d", areaQuadrado);

            scanner.close();
        }
}