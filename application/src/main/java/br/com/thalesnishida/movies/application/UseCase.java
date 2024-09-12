package br.com.thalesnishida.movies.application;

import br.com.thalesnishida.movies.domain.Category;

public class UseCase {

    public Category execute() {
        return new Category();
    }
}