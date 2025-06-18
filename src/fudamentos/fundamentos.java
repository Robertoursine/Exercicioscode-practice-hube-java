package fudamentos;
//Neste codigo aprendemos a usar o Scanner
// para pegar dados do usuário,

import java.util.Scanner;
import java.time.LocalDate;

public class fundamentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pega o nome do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Pega o ano de nascimento
        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        // Obtém o ano atual
        int anoAtual = LocalDate.now().getYear();

        int idade = anoAtual - anoNascimento;

        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");

        scanner.close();
    }
}