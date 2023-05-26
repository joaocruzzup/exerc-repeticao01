package ex05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        System.out.println("-----------------------------");
        System.out.println("Boas-vindas ao Banco Digital!");
        System.out.println("-----------------------------");

        long numAleatorio = Math.round(Math.random() * 100);

        System.out.printf("Sua posição na fila é: %d %n", numAleatorio);

        for (int i = (int) numAleatorio; i>0; i--){
            System.out.printf("A fila atualizou! Sua posição é: %d %n", i);
            if (i == 1) {
                System.out.println("Você será o próximo a ser atendido!");
            }
        }
        System.out.println("Olá! Tudo bem? Como eu poderia te ajudar?");
    }
}
