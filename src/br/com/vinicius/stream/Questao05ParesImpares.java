package br.com.vinicius.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Questao05ParesImpares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> separados =
        numeros.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Pares: " + separados.get(true));
        System.out.println("Ímpares: " + separados.get(false));
    }
}
