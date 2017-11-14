
import java.util.Scanner;

public class OrganizadorEventos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Scanner op = new Scanner(System.in);

        while (true) {
            System.out.println("1. Criar Evento\n2. Cadastrar Palestra\n3. Cadastrar Participante\n4. Grava arquivo\n5. Sair");
            switch (op.nextInt()) {
                case 1:
                    LeArquivo arquivo = new LeArquivo();
                    break;
                case 2:
                    CriaEvento evento = new CriaEvento();
                    System.out.println(evento.toString());
                    break;
                case 3:

                    break;
                case 4:
                    GravaArquivo mostra = new GravaArquivo();
                    System.out.println("Digite o texto para gravar no arquivo: ");
                    String texto = teclado.nextLine();
                    mostra.mostraArq(texto);
                    break;
                case 5:

                    System.exit(0);

                    break;

                default:
                    System.out.println("Digite um valor válido");
            }
        }
    }
}
