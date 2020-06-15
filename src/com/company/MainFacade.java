package com.company;

import java.util.*;

import java.util.ArrayList;

public class MainFacade {


    private Carrinho carrinho;
    private List<ProdutoAdicionadoObserver> observers = new ArrayList<ProdutoAdicionadoObserver>();


    public void addCarrinhoObserver(ProdutoAdicionadoObserver observer) {
        this.observers.add(observer);
    }

    public void UI() {

        createCarrinho();
        System.out.println("O que gostaria de fazer agora?");
        System.out.println("Digite o número correspondente:");
        System.out.println("1- Adicionar produto no carrinho");
        System.out.println("2- Visualizar Carrinho");
        System.out.println("3- Efetuar Pagamento");
        System.out.println("4- Fechar programa");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        switch (input) {
            case 1:
                adicionaProduto();
                break;
            case 2:
                printCarrinho();
                break;
            case 3:
                endOperation();
                break;
            case 4:
                System.out.println("Obrigado por utilizar nossos serviços!");
                break;
            default:
                System.out.println("Numero invalido");
                UI();
                break;
        }
    }

    public void endOperation(){
        FactoryPagamento fac = new FactoryPagamento();
        fac.valor = carrinho.getValorTotal();
        fac.pagar();

    }


    public void createCarrinho() {
        carrinho = Carrinho.getInstance();

    }

    public void printCarrinho(){
        System.out.println(carrinho.toString());
        UI();
    }

    public void adicionaProduto() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual produto gostaria de adicionar?");
        System.out.println("Digite abaixo o nome do produto:");

        String nome = sc.next();

        System.out.println("Agora digite seu preco:");

        int preco = sc.nextInt();

        Produto p = new Produto(nome, preco);
        ProdutoAdicionadoEvent event = new ProdutoAdicionadoEvent(p);

        for (ProdutoAdicionadoObserver observer : this.observers) {
            observer.chamado(event);
        }

        UI();
    }
}
