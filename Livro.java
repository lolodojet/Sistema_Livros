public class Livro {
    private int codigo;
    private String titulo;
    private String autor;
    private String editora;
    private int nrPaginas;
    private int edicao;

    // Metodo Construtor (serve para construir seu objeto com valores default)
    Livro(){
        this.codigo = 0;
        this.titulo = "Nenhum";
        this.autor = "";
        this.editora = "";
        this.nrPaginas = 0;
        this.edicao = 0;
    }

    Livro(int codigo,String titulo){
    this.codigo = codigo;
    this.titulo = titulo;
    this.autor = "";
    this.editora = "";
    this.nrPaginas = 0;
    this.edicao = 0;
    }
    
    Livro(int codigo,String titulo, String autor, String editora, int nrPaginas, int edicao){
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.nrPaginas = nrPaginas;
        this.edicao = edicao;
    }

    // Metodo de acesso á um atributo que é privado Código
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    // Titulo
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    // Autor
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;

    }

    // Editora
    public String getEditora(){
        return editora;
    }
    public void setEditora (String editora){
        this.editora = editora;
    }

    // Numero de paginas
    public int getNumPag(){
        return nrPaginas;
    }
    public void setNumPag (int nrPaginas){
        this.nrPaginas = nrPaginas;
    }

    // Edição
    public int getEdicao(){
        return edicao;
    }
    public void setEdicao (int edicao){
        this.edicao = edicao;
    }

    public void Ler(){
        System.out.println("Estou lendo...");
    }

    public void Cadastrar(){
        System.out.println("Estou cadastrando...");
    }
    
    public void Localizar(){
        System.out.println("Estou localizando...");
    }
}