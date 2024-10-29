import org.example.ContaTerminal;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class ContaTerminalTest {

    public static void main(String[] args) {
        String simulatedInput = "1021\n067-8\nMARIO ANDRADE\n237,48\n";

        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        ContaTerminal.criarContaBanco();

        System.setIn(originalIn);
    }
}
