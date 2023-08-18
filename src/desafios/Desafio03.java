package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio03 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Desafio 03 - Verifique se todos os números da lista são positivos
        Predicate<Integer> positivos = n -> n >= 0;

        numeros.stream()
                .filter(positivos)
                .forEach(System.out::println);

    }

}
