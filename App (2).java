public class App {
    public static void main(String[] args) {

        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, "Fantasia", "HarperCollins", 10, "1ª edição", "978-3-16-148410-0");

        Filme filme = new Filme("O Senhor dos Anéis: A Sociedade do Anel", "J.R.R. Tolkien", 2001, "Fantasia", "New Line Cinema", 5, "Peter Jackson", "Elijah Wood", "A jornada épica de Frodo para destruir o Um Anel.", 178);

        Publicacao[] publicacoes = new Publicacao[2];
        publicacoes[0] = livro;
        publicacoes[1] = filme;

        for (Publicacao publicacao : publicacoes) {
            publicacao.imprimeDados();
            System.out.println();
        }

        System.out.println("É possível adicionar objetos do tipo Livro e Filme ao array de Publicacao porque ambas as classes herdam de Publicacao. Um array de uma superclasse pode armazenar objetos de subclasses.");

        System.out.println("O método imprimeDados é abstrato na classe Publicacao, o que força as subclasses Livro e Filme a implementarem sua própria versão. Durante o loop, o método apropriado de cada classe é chamado devido ao polimorfismo.");
    }
}
