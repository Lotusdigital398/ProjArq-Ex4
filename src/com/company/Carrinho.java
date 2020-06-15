package com.company;


import java.util.ArrayList;

public class Carrinho implements ProdutoAdicionadoObserver {

    private ArrayList<Produto> carrinho;
    private static Carrinho uniqueInstance;


    private Carrinho() {
        carrinho = new ArrayList<>();
    }

    public static Carrinho getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Carrinho();
        }
        return uniqueInstance;
    }

    public void addProd(Produto p) {
        if (p != null) {
            if (!carrinho.contains(p)) {
                carrinho.add(p);
            }
        }
    }

    public String printProdutos() {
        String print = "";
        for (Produto p : carrinho) {
            print += p.toString() + "\n";
        }
        return print;
    }

    public double getValorTotal() {
        double valorTotal = 0;
        for (Produto p : carrinho) {
            valorTotal += p.getPreco();
        }
        return valorTotal;
    }

    @Override
    public void chamado(ProdutoAdicionadoEvent event) {
        addProd(event.getProdutoAdicionado());
        System.out.println("Produto adicionado com sucesso!");
        System.out.println("=================================");
    }

    public String toString() {
        String toString = "Preco total atual:\nR$ " + getValorTotal();
        toString += "\nItens do carrinho:\n" + printProdutos();
        return toString;
    }


}