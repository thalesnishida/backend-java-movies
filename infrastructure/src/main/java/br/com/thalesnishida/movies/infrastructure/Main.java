package br.com.thalesnishida.movies.infrastructure;

import br.com.thalesnishida.movies.application.UseCase;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(new UseCase().execute());
    }
}