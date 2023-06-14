public class GerenciadorPagamento {

    public static String pagar(MetodoPagamento metodoPagamento, String conta){
        return metodoPagamento.pagar(conta);
    }
}
