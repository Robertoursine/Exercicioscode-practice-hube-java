package fudamentos;

// Neste código aprendemos a calcular a área de um quadrado

import java.util.Scanner;

public class CalculoMetroQuadrado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = lado * lado;

        System.out.println("A área do quadrado é: " + area);

        scanner.close();
    }
}