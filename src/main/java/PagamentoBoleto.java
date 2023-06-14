public class PagamentoBoleto implements MetodoPagamento{
    public String pagar(String conta){
        return  conta + " pago com Boleto com sucesso";
    }
}
