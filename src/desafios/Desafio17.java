package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Desafio 17 - Agrupe os números em pares e ímpares
        var pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        var impares = numeros.stream()
                .filter(n -> n % 2 != 0)
                .toList();

        System.out.println("Pares: " + pares + "\n" + "Impares: " + impares);

    }

}
