package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Desafio09 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem)
        Predicate<Integer> distintos = i -> numeros.stream()
                .filter(j-> Objects.equals(j, i))
                .count() == 1;

        System.out.println(numeros.stream().allMatch(distintos));

    }

}
