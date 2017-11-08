
public class CriaEvento {

    String data, titulo, resumo;
    CadastraPalestra palestra = new CadastraPalestra(titulo, resumo);

    public CriaEvento(String data, CadastraPalestra palestra) {
        this.data = data;
        this.palestra = palestra;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String toString() {
        return "Dados do Evento: \nData = " + data + "\n " + palestra;
    }

}
