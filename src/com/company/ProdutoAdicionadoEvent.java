package com.company;

public class ProdutoAdicionadoEvent {

    private final Produto prod;

    public ProdutoAdicionadoEvent(Produto prod) {
        super();
        this.prod = prod;
    }

    public Produto getProdutoAdicionado() {
        return prod;
    }
}
