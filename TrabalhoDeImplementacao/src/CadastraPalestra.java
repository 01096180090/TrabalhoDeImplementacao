
public class CadastraPalestra {

    private String titulo, resumo;

    public CadastraPalestra(String titulo, String resumo) {
        this.titulo = titulo;
        this.resumo = resumo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public String toString() {
        return "Titulo = " + titulo + "\nResumo = " + resumo;
    }

}
