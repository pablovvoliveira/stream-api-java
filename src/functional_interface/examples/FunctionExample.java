package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/*
    Representa uma função que aceita um argumento do tipo T e um resultado do tipo R.
    É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.
 */
public class FunctionExample {
    public static void main(String[] args) {
        // Criando uma lista de inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usando Function com expressão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        // Usando a função para dobrar todos os números no Stream e armazená-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .toList();

        // Imprimindo a lista completa(formato de array)
        System.out.println(numerosDobrados);

        // Imprimindo item a item da lista
        numerosDobrados.forEach(System.out::println);
    }

}
