package com.company;

import java.util.Scanner;

public class PagarPayPal implements Pagamento{

    @Override
    public void calculaPagamento(double pagamento) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu e-mail: ");
        sc.nextLine();
        System.out.println("Insira a senha de sua conta:");
        sc.nextLine();

        System.out.println("Pagamento de R$ " + pagamento + " sendo efetuado por PayPal...");
        System.out.println("Pagamento realizado com sucesso!");
    }
}
