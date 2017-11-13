
import java.util.*;

public class CriaEvento {

    Scanner teclado = new Scanner(System.in);

    private String data, titulo, resumo;
    private CadastraPalestra palestra;

    public CriaEvento() {
        System.out.println("Digite a data do Evento: ");
        data = teclado.nextLine();
        System.out.println("Digite o título da Palestra: ");
        titulo = teclado.nextLine();
        System.out.println("Digite um resumo da Palestra: ");
        resumo = teclado.nextLine();
        palestra = new CadastraPalestra(titulo, resumo);
    }

    public String getData() {
        return data;
    }

    public String toString() {
        return "Dados do Evento: \nData = " + data + "\n" + palestra;
    }

}
