package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class Desafio08 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Desafio 8 - Somar os dígitos de todos os números da lista
        BinaryOperator<Integer> soma = Integer::sum;

        int resultado = numeros.stream()
                .reduce(0, soma);

        System.out.println("Total da soma: " + resultado);

    }

}
