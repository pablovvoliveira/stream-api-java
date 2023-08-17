package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
    Representa uma função que aceita um argumento do tipo T e retorna um booleano.
    É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */
public class PredicateExample {
    public static void main(String[] args) {
        // Criando lista de palavras
        List<String> palavras = Arrays.asList("java", "spring", "html", "css", "javascript");

        // Criando um Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        // Usando o Stream para filtrar as palavras com mais de 5 caracteres e em seguida imprimindo as palavras
        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);
    }
}
