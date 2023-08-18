package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio05 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Desafio 5 - Calcule a média dos números maiores que 5
        List<Integer> maioresQueCinco = numeros.stream()
                .filter(n -> n > 5)
                .toList();

        double media = maioresQueCinco.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);


        System.out.println("Números maiores que 5: " + maioresQueCinco);
        System.out.println("Média dos números maiores que 5: " + media);

    }

}
