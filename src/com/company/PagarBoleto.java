package com.company;

public class PagarBoleto implements Pagamento{

    @Override
    public void calculaPagamento(double pagamento) {
        System.out.println("Pague o boleto de código 123456789101112131415161718192021222324252627282 no valor de R$" + pagamento + " para confirmar sua compra.");
        System.out.println("PS: Note que voce tem ate 72h uteis para efetuar o pagamento.");
        System.out.println("Boleto emitido com sucesso!");
    }
}
