package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Desafio 14 - Encontre o maior número primo da lista
        Integer maiorPrimo = numeros.stream()
                .filter(isPrimo)
                .max(Integer::compareTo)
                .orElse(null);

        System.out.println("Maior número primo: " + maiorPrimo);
    }

    public static Predicate<Integer> isPrimo = n -> {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    };

}
