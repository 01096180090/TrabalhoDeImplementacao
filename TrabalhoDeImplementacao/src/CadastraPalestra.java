
public class CadastraPalestra {

    String titulo, resumo;

    public CadastraPalestra(String titulo, String resumo) {
        this.titulo = titulo;
        this.resumo = resumo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String toString() {
        return "Titulo = " + titulo + "\nResumo = " + resumo;
    }

}
