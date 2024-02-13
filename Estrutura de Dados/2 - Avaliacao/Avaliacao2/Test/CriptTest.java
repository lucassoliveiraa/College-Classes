import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CriptTest {
    @Test
    void primeiroTeste() {
        String mensagem = "BANANA";
        assertEquals(new Cript().criptografar(mensagem), "B00A05A03A01N04N02");
    }

    @Test
    void segundoTeste() {
        String mensagem = "COMPLICOU";
        assertEquals(new Cript().criptografar(mensagem), "C06C00O07O01M02P03L04I05U08");
    }
}