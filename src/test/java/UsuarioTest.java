import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    Usuario usuario;
    String nomeContaAPagar;


    @BeforeEach
    void setUp(){
        usuario = new Usuario();
        nomeContaAPagar = "Conta de luz";
    }

    @Test
    void devePagarComSaldo(){
        assertEquals("Conta de luz pago com Saldo com sucesso", usuario.pagarSaldo(nomeContaAPagar));
    }
    @Test
    void devePagarComCartao(){
        assertEquals("Conta de luz pago com Cartão com sucesso", usuario.pagarCartao(nomeContaAPagar));
    }
    @Test
    void devePagarComBoleto(){
        assertEquals("Conta de luz pago com Boleto com sucesso", usuario.pagarBoleto(nomeContaAPagar));
    }
}