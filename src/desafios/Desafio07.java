package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio07 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Desafio 7 - Encontrar o segundo número maior da lista
        int segundoMaiorNumero = numeros.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(segundoMaiorNumero);

    }

}
