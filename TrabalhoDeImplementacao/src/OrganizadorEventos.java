
import java.util.Scanner;

public class OrganizadorEventos {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in);

        while (true) {
            System.out.println("1. Criar Evento\n2. Cadastrar Palestra\n3. Cadastrar Participante\n4. Grava arquivo\n5. Sair");
            switch (op.nextInt()) {
                case 1:
                    LeArquivo arquivo = new LeArquivo();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    MostraArquivo mostra = new MostraArquivo();
                    break;
                case 5:

                    System.exit(0);

                    break;

                default:
                    break;
            }
        }

    }

}
