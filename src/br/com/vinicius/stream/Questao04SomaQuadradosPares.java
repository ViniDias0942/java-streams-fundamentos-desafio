package br.com.vinicius.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Questao04SomaQuadradosPares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        int somaDosQuadrados =
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .mapToInt(n -> n)
                .sum();
        System.out.println(somaDosQuadrados);
    }
}
