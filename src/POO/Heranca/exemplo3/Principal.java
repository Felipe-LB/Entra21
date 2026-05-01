package POO.Heranca.exemplo3;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Bonequinho de Brinquedo");
        produto.setPreco(100);

        produto.exibirInformacoes();

        System.out.println("=================================================");

        Livro livro = new Livro();
        livro.setNome("Diário de um Banana");
        livro.setPreco(59.90d);
        livro.setAutor("Jeff Kinney");

        livro.exibirInformacoes();
    }
}
