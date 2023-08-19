package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Desafio16 {
    public static void main(String[] args) {
        // Desafio 16 - Calcule o fatorial de um número
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();

        int fatorial = Stream.iterate(1, i -> i + 1)
                .limit(numero)
                .reduce(1, (a, b) -> a * b);

        System.out.println("Fatorial de " + numero + ": " + fatorial);

    }

}
