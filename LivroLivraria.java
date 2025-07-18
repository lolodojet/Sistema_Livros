public class LivroLivraria extends Livro{
    
    // Atributos 
    private double preco;
    private String novoUsado;
    private String localPrateleira;
    private String categoria;

    
    // Preço
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    // Novo Usado
    public String getNovoUsado(){
        return novoUsado;
    }
    public void setNovoUsado(String novoUsado){
        this.novoUsado = novoUsado;
    }

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

    public void Vender(){
        System.out.println("Estou vendendo...");
    }

    @Override 
    public void Localizar(){
        System.out.println("Estou localizando o livro de livraria");
    }

    @Override
    public void Cadastrar(){
        System.out.println("Estou cadastrando o livro de livraria");
    }

    @Override
    public void Ler(){
        System.out.println("Estou lendo o livro de livraria");
    }
}
