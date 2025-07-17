public class SistemaLivro {

    public static void main(String[] args) {
        
        System.out.println("== Livro ==");
        // Livro
        Livro livro = new Livro();
        livro.setCodigo(7);
        livro.setTitulo("O Código da Vinci");
        livro.setEditora("Editora Rocco");
        livro.setNumPag(100);
        livro.setEdicao(3);

        livro.Ler();
        livro.Cadastrar();
        livro.Localizar();

        System.out.println();

        System.out.println("== Livro Biblioteca ==");
        // Livro biblioteca
        LivroBiblioteca livro_biblioteca = new LivroBiblioteca();
        livro_biblioteca.setCodigo(11);
        livro_biblioteca.setTitulo("Cinderela"); 
        livro_biblioteca.setAutor("Autora Desconhecida"); 
        livro_biblioteca.setEditora("Grupo Editoral Record");
        livro_biblioteca.setNumPag(200); 
        livro_biblioteca.setEdicao(6); 
        livro_biblioteca.setLocalPrateleira("AB23");
        livro_biblioteca.setCategoria("Animação"); 
        livro_biblioteca.setPrazoEntrega(10 ); 
        livro_biblioteca.setNomeEmprestou("Maria Heloisa");
       
        livro_biblioteca.Ler();
        livro_biblioteca.Cadastrar();
        livro_biblioteca.Localizar();
        livro_biblioteca.Alugar();
        livro_biblioteca.Devolver();

        System.out.println();
        
        // Livro livraria
        System.out.println("== Livro livraria ==");
        LivroLivraria livro_livraria = new LivroLivraria();
        livro_livraria.setCodigo(21);
        livro_livraria.setTitulo("Os sete maridos de Evelyn Hugo");
        livro_livraria.setAutor("Não sei quem é");
        livro_livraria.setEditora("Editora Brasil");
        livro_livraria.setNumPag(300);
        livro_livraria.setEdicao(9);
        livro_livraria.setLocalPrateleira("Prateleira B18");
        livro_livraria.setCategoria("Romance");
        livro_livraria.setNovoUsado("Novo");

        livro_livraria.Ler();
        livro_livraria.Cadastrar();
        livro_livraria.Localizar();
        livro_livraria.Vender();

        System.out.println();

        String mensagem = "\nCódigo: "+livro.getCodigo()+ "\nTítulo: "+livro.getTitulo()+ "\nEditora: "+livro.getEditora()+ "\nNúmero de Páginas: "+livro.getNumPag()+ "\nEdição: "+livro.getEdicao();
        System.out.println("Livro: "+mensagem);

        System.out.println();

        mensagem = "\nCódigo: "+livro_biblioteca.getCodigo()+ 
        "\nTítulo: "+livro_biblioteca.getTitulo()+ 
        "\nEditora: "+livro_biblioteca.getEditora()+ 
        "\nNúmero de Páginas: "+livro_biblioteca.getNumPag()+ 
        "\nEdição: "+livro_biblioteca.getEdicao()+ 
        "\nLocal prateleira: "+livro_biblioteca.getLocalPrateleira()+ "\nCategoria: "+livro_biblioteca.getCategoria()+ 
        "\nPrazo de Entrega: "+livro_biblioteca.getPrazoEntrega()+ 
        "\nNome de Quem Emprestou: "+livro_biblioteca.getNomeEmprestou();
        System.out.println("Livro Biblioteca: "+mensagem);

        System.out.println();

        mensagem = "\nCódigo: "+livro_livraria.getCodigo()+
        "\nTítulo: "+livro_livraria.getTitulo()+ 
        "\nEditora: "+livro_livraria.getEditora()+ 
        "\nNúmero de Páginas: "+livro_livraria.getNumPag()+ 
        "\nEdição: "+livro_livraria.getEdicao()+ 
        "\nLocal prateleira: "+livro_livraria.getLocalPrateleira()+ "\nCategoria: "+livro_livraria.getCategoria()+ 
        "\nNovo usado: "+livro_livraria.getNovoUsado();
        System.out.println("Livro Livraria: "+mensagem);
    
    }  
}
