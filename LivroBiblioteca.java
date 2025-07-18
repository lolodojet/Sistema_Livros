public class LivroBiblioteca extends Livro{

    // Atributos

    private String localPrateleira;
    private String categoria;
    private String nomeQuemEmprestou;
    private int prazoEntrega;

    // Método construtor (tem que ter o mesmo nome da classe)

    LivroBiblioteca(){}

    LivroBiblioteca(int codigo,String titulo, String autor, String editora, int nrPaginas, int edicao, String localPrateleira, String categoria, String nomeQuemEmprestou, int prazoEntrega){

        // Acesso ao método construtor PAI (Livro)
        super(codigo, titulo, autor, editora, nrPaginas, edicao);

        this.localPrateleira = localPrateleira;
        this.categoria = categoria;
        this.nomeQuemEmprestou = nomeQuemEmprestou;
        this.prazoEntrega = prazoEntrega;
    }

    // Metodos
    // Local Prateleira
    public String getLocalPrateleira(){
        return localPrateleira;
    }
    public void setLocalPrateleira(String localPrateleira){
        this.localPrateleira = localPrateleira;
    }

    // Categoria
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    // Quem Emprestou
    public String getNomeEmprestou(){
        return nomeQuemEmprestou;
    }
    public void setNomeEmprestou(String nomeQuemEmprestou){
        this.nomeQuemEmprestou = nomeQuemEmprestou;
    }

    // Prazo de Entrega
    public int getPrazoEntrega(){
        return prazoEntrega;
    }
    public void setPrazoEntrega(int prazoEntrega){
        this.prazoEntrega = prazoEntrega;
    }

    public void Alugar(){
        System.out.println("Estou alugando...");
    }

    public void Devolver(){
        System.out.println("Estou devolvendo...");
    }

    @Override 
    public void Localizar(){
        System.out.println("Estou localizando livro de biblioteca");
    }

    @Override
    public void Cadastrar(){
        System.out.println("Estou cadastrando o livro de biblioteca");
    }

    @Override
    public void Ler(){
        System.out.println("Estou lendo o livro de biblioteca");
    }
}