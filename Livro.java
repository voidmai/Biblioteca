public class Livro extends Publicacao {
    private String edicao;
    private String isbn;

    public Livro(String titulo, String autor, int anoPublicacao, String genero, String editora, int quantidadeDisponivel, String edicao, String isbn) {
        super(titulo, autor, anoPublicacao, genero, editora, quantidadeDisponivel);
        this.edicao = edicao;
        this.isbn = isbn;
    }

    public String getEdicao() {
        return edicao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void imprimeDados() {
        System.out.println("Livro:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano de Publicação: " + getAnoPublicacao());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Editora: " + getEditora());
        System.out.println("Quantidade Disponível: " + getQuantidadeDisponivel());
        System.out.println("Edição: " + edicao);
        System.out.println("ISBN: " + isbn);
    }
}
