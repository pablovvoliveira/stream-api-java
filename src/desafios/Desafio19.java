package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class Desafio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Desafio 19 - Verifique se todos os números da lista são iguais
        boolean todosIguais = numeros.stream()
                .allMatch(n -> Objects.equals(n, numeros.get(0)));

        System.out.println(todosIguais);
    }

}
