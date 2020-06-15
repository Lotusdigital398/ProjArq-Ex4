package com.company;


import java.util.Scanner;

public class FactoryPagamento {
    public double valor;

    public void pagar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Como deseja efetuar o pagamento?");
        System.out.println("1- Cartao de Credito");
        System.out.println("2- Cartao de Debito");
        System.out.println("3- Boleto Bancario");
        System.out.println("4- PayPal");
        int input = sc.nextInt();

        switch (input) {
            case 1:
                PagarCredito p1 = new PagarCredito();
                p1.calculaPagamento(valor);
                System.out.println("Muito Obrigado por utilizar nossos servicos!\nVolte sempre!!!");
                break;
            case 2:
                PagarDebito p2 = new PagarDebito();
                p2.calculaPagamento(valor);
                System.out.println("Muito Obrigado por utilizar nossos servicos!\nVolte sempre!!!");
                break;
            case 3:
                PagarBoleto p3 = new PagarBoleto();
                p3.calculaPagamento(valor);
                System.out.println("Muito Obrigado por utilizar nossos servicos!\nVolte sempre!!!");
                break;
            case 4:
                PagarPayPal p4 = new PagarPayPal();
                p4.calculaPagamento(valor);
                System.out.println("Muito Obrigado por utilizar nossos servicos!\nVolte sempre!!!");
                break;
            default:
                System.out.println("Numero invalido, digite novamente.");
                pagar();
                break;
        }
    }
}

