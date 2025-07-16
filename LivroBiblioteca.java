public class LivroBiblioteca extends Livro{

    // Atributos

    String localPrateileira;
    String categoria;
    String nomeQuemEmprestou;
    int prazoEntrega;

    // Metodos

    public void Alugar(){
        System.out.println("Estou alugando...");
    }

    public void Devolver(){
        System.out.println("Estou devolvendo...");
    }
}