
import java.util.Formatter;

public class GravaArquivo {

    public void mostraArq(String texto) {
        try {
            try (Formatter arq = new Formatter("C:\\Users\\mcamargo\\Downloads\\Aps02 Algoritmos e Programação\\evento.txt")) {
                arq.format("%s", texto);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
