
/**
 * Write a description of class Cidade here.
 *
 * @author (Rosemary)
 * @version (1)
 */
public class Cidade
{
    // atributos
    private int codigo;
    private String nome;
    private String uf;
    private int qtdeEstudantes;

    /**
     * Constructor for objects of class Cidade
     */
    public Cidade(int c, String n, String u)
    {
        // initialise instance variables
        codigo = c;
        nome = n;
        uf = u;
    }

    /**
     * Metodos Get
     */
    public int getCodigo()
    {
        return codigo;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public String getUF()
    {
        return uf;
    }
    
    // Metodo adicionaNovoEstudante
    public void adicionaNovoEstudante()
    {
        qtdeEstudantes++;
    }
    
    //Metodo exibeDados
    public void exibeDados()
    {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("UF: " + uf);
        System.out.println("Qtde. Estudantes: " + qtdeEstudantes);
    }
}
