package com.company;

public class Main {

    public static void main(String[] args) {
        MainFacade fachada = new MainFacade();

        fachada.addCarrinhoObserver(Carrinho.getInstance());

        fachada.UI();

    }
}
