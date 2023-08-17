package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/*
    Representa uma operação que combina dois argumentos do tipo T e retornar um resultado do tipo T.
    É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
 */
public class BinaryOperatorExample {
    public static void main(String[] args) {
        // Criando uma lista de inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usando o BinaryOperator com expressão lambda para somar dois números
        BinaryOperator<Integer> soma = Integer::sum;

        // Usando o BinaryOperator para somar todos os números no Stream
        int resultado = numeros.stream()
                .reduce(0, soma);

        System.out.println("Total da soma: " + resultado);
    }
}
