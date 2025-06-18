package fudamentos.AgeDifference;

import java.util.Scanner;

public class AgeDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coletando dados da primeira pessoa
        System.out.print("Digite o nome da primeira pessoa: ");
        String name1 = scanner.nextLine();
        System.out.print("Digite a idade da primeira pessoa: ");
        int age1 = scanner.nextInt();
        scanner.nextLine(); // consumir quebra de linha

        // Coletando dados da segunda pessoa
        System.out.print("Digite o nome da segunda pessoa: ");
        String name2 = scanner.nextLine();
        System.out.print("Digite a idade da segunda pessoa: ");
        int age2 = scanner.nextInt();

        // Criando objetos Person
        Person person1 = new Person(name1, age1);
        Person person2 = new Person(name2, age2);

        // Calculando diferença de idade
        int diff = Math.abs(person1.age - person2.age);
        System.out.println("A diferença de idade entre " + person1.name +
                " e " + person2.name + " é de " + diff + " anos.");

        scanner.close();
    }
}