public class LivroBiblioteca extends Livro{

    // Atributos

    private String localPrateleira;
    private String categoria;
    private String nomeQuemEmprestou;
    private int prazoEntrega;

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
}