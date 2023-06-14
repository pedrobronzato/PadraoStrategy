public class PagamentoCartao implements MetodoPagamento {
    public String pagar(String conta){
        return  conta + " pago com Cartão com sucesso";
    }
}