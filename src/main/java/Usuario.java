public class Usuario {

    public String pagarSaldo(String conta){
        return GerenciadorPagamento.pagar(new PagamentoSaldo(),conta);
    }

    public String pagarCartao(String conta){
        return GerenciadorPagamento.pagar(new PagamentoCartao(),conta);
    }

    public String pagarBoleto(String conta){
        return GerenciadorPagamento.pagar(new PagamentoBoleto(),conta);
    }
}
