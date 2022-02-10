public class Biblioteca {
    private String livro;
    private Integer valor;

    public Biblioteca(String livro, Integer valor) {
        this.livro = livro;
        this.valor = valor;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "livro='" + livro + '\'' +
                ", valor=" + valor +
                '}';
    }
}
