package fudamentos;
//Neste exercico vamos aprender a calcular a area do triangulo, e as variaveis foi nomeadas em ingles, por questão de padrao.

import java.util.Scanner;

public class RectangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com a base do triangulo: ");
        double base = scanner.nextDouble();

        System.out.print("Insira a altura do retangulo: ");
        double height = scanner.nextDouble();

        double area = base * height;

        System.out.println("A area do retangulo é: " + area);

        scanner.close();
    }
}
