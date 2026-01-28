package br.com.vinicius.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Questao08MaisCaroPorCategoria {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis")
        );
        Map<String, Optional<Produto>> maiorPorCategoria =
            produtos.stream()
                    .collect(Collectors.groupingBy(p -> p.getCategoria(), Collectors.maxBy(Comparator.comparing(p -> p.getPreco()))));
        System.out.println(maiorPorCategoria);
    }
}
