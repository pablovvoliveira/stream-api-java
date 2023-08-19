package desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5
        List<Integer> imparesMultiplosTresCinco = numeros.stream()
                .filter(n -> n % 2 != 0)
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .toList();

        imparesMultiplosTresCinco.forEach(System.out::println);
    }

}
