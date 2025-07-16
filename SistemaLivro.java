public class SistemaLivro {

    public static void main(String[] args) {
        
        System.out.println("== Livro ==");
        // Livro
        Livro livro = new Livro();
        livro.codigo = 1;
        livro.titulo = "O Código da Vinci";
        livro.editora = "Editora Rocco";
        livro.nrPaginas = 100;
        livro.edicao = 3;

        livro.Ler();
        livro.Cadastrar();
        livro.Localizar();

        System.out.println("");

        System.out.println("== Livro Biblioteca ==");
        // Livro biblioteca
        LivroBiblioteca livro_biblioteca = new LivroBiblioteca();
        livro_biblioteca.codigo = 11;
        livro_biblioteca.titulo = "Cinderela";
        livro_biblioteca.autor = "Autora Desconhecido";
        livro_biblioteca.editora = "Grupo Editoral Record";
        livro_biblioteca.nrPaginas = 200;
        livro_biblioteca.edicao = 6;
        livro_biblioteca.localPrateileira = "Prateleira AB2";
        livro_biblioteca.categoria = "Animação";
        livro_biblioteca.prazoEntrega = 10;
        livro_biblioteca.nomeQuemEmprestou = "Maria Heloisa";
       
        livro_biblioteca.Ler();
        livro_biblioteca.Cadastrar();
        livro_biblioteca.Localizar();
        livro_biblioteca.Alugar();
        livro_biblioteca.Devolver();

        System.out.println("");
        
        // Livro livraria
        System.out.println("== Livro livraria ==");
        LivroLivraria livro_livraria = new LivroLivraria();
        livro_livraria.codigo = 15;
        livro_livraria.titulo = "Os sete maridos de Evelyn Hugo";
        livro_livraria.autor = "Não sei quem";
        livro_livraria.editora = "Editora 1234";
        livro_livraria.nrPaginas = 300;
        livro_livraria.edicao = 8;
        livro_livraria.localPrateleira = "Prateleira B18";
        livro_livraria.categoria = "Romance";
        livro_livraria.novoUsado = "Novo";

        livro_biblioteca.Ler();
        livro_biblioteca.Cadastrar();
        livro_biblioteca.Localizar();
        livro_livraria.Vender();
    }  
}
