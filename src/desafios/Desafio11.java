package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Desafio11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Desafio 11 - Encontre a soma dos quadrados de todos os números da lista
        int totalSomaQuadrados = numeros.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println(totalSomaQuadrados);
    }

}
