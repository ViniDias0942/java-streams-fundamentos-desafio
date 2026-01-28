package br.com.vinicius.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Questao02AgruparPorTamanho {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");
        Map <Integer, List<String>> agrupado =
        palavras.stream()
                .collect(Collectors.groupingBy(p -> p.length()));
        System.out.println(agrupado);
    }
}
