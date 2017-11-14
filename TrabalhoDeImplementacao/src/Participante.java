
public class Participante extends Pessoa{

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Nome = [" + nome + "], Email = [" + email + "]";
    }
}
