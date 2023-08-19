package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio20 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Desafio 20 - Encontre a soma dos números divisíveis por 3 e 5
        var somaDivisiveis = numeros.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .reduce(0, Integer::sum);

        System.out.println(somaDivisiveis);
        // A lista original não contém nenhum número divisível por 3 e 5, portanto retorna 0.
    }

}
