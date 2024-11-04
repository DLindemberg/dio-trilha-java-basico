import org.example.Contador;
import org.example.ParametrosInvalidosException;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ContadorTest {

    @Test
    void testRealizarContagemComParametrosValidos() throws ParametrosInvalidosException {
        // Captura a saída do console
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Parâmetros de teste
        int parametroUm = 5;
        int parametroDois = 10;

        // Chama o método
        Contador.realizarContagem(parametroUm, parametroDois);

        // Verifica a saída
        String[] linhas = outputStreamCaptor.toString().trim().split("\n");
        assertEquals(5, linhas.length); // Espera 5 linhas de saída (de 1 a 5)

        for (int i = 0; i < linhas.length; i++) {
            assertEquals("Imprimindo o número: " + (i + 1) + ".", linhas[i].trim());
        }
    }

    @Test
    void testRealizarContagemComParametrosInvalidos() {
        // Parâmetros de teste
        int parametroUm = 10;
        int parametroDois = 5;

        // Verifica se a exceção é lançada com a mensagem correta
        ParametrosInvalidosException exception = assertThrows(ParametrosInvalidosException.class, () -> {
            Contador.realizarContagem(parametroUm, parametroDois);
        });

        assertEquals("O segundo parâmetro deve ser maior que o primeiro.", exception.getMessage());
    }
}
