package br.com.vinicius.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Questao01MaiorNumero {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);
        IntSummaryStatistics est = numeros.stream()
                .collect(Collectors.summarizingInt(n -> n));
        System.out.println(est.getMax());
    }
}