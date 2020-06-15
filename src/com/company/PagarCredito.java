package com.company;

import java.util.Scanner;

public class PagarCredito implements Pagamento {

    @Override
    public void calculaPagamento(double pagamento) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os digitos do seu cartao: ");
        sc.nextLine();
        System.out.println("Insira a data de validade do cartao:");
        sc.nextLine();
        System.out.println("Insira os digitos do CVV:");
        sc.nextLine();

        System.out.println("Pagamento de R$ " + pagamento + " sendo efetuado por credito...");
        System.out.println("Pagamento realizado com sucesso!");
    }
}
