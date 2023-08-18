package desafios;

import java.util.Arrays;
import java.util.List;

public class desafio06 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Desafio 6 - Verificar se a lista contém algum número maior que 10
        List<Integer> maioresQueDez = numeros.stream()
                .filter(n -> n > 10)
                .toList();

        System.out.println(maioresQueDez);

    }

}
