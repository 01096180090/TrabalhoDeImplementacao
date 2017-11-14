
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Palestrante extends Pessoa {

    private String email, curriculo;
    private int telefone;

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Nome = [" + nome + "], Email = [" + email + "]";
    }

    public void cadastraPalestrante() {
        File arquivo = new File("C:\\Users\\mcamargo\\Downloads\\Aps02 Algoritmos e Programação\\Palestrantes.txt");
        Palestrante pessoa[] = new Palestrante[10];

        {

            try {

                Scanner sc = new Scanner(arquivo).useDelimiter(",");

                for (int i = 0; i < pessoa.length; i++) {
                    while (sc.hasNext()) {

                        pessoa[i] = new Palestrante();
                        pessoa[i].setNome(sc.next());
                        pessoa[i].setEmail(sc.nextLine().replaceAll(",", ""));
                        break;
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < pessoa.length; i++) {
                System.out.println(pessoa[i]);
            }
        }
    }

}
