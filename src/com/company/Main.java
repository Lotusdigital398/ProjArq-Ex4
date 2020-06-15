package com.company;

public class Main {

    public static void main(String[] args) {
        MainFacade fachada = new MainFacade();

        System.out.println("TESTE HÁ não ççç á");

        fachada.addCarrinhoObserver(Carrinho.getInstance());

        fachada.UI();

    }
}
