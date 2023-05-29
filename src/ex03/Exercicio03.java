package ex03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------------------------");
        System.out.println("Boas-vindas a Calculadora - Soma de 5 números");
        System.out.println("* Digite 5 números para realizar a soma deles *");
        System.out.println("-----------------------------------------------");

        double soma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite o %dª número: ", i);
            soma += sc.nextDouble();
        }

        System.out.println("------------------------------");
        System.out.printf("A soma dos números é: %.3f %n", soma);
        System.out.println("------------------------------");

    }
}
