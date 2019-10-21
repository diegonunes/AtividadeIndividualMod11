
/**
 * Classe Estudante
 */
public class Estudante
{
    /*
     * Crie a classe: Estudante com os seguintes atributos:
     * a. Codigo = tipo de dados inteiro;
     * b. Nome = tipo de dados texto;
     * c. Data de Nascimento = tipo de dados texto;
     * d. Email = tipo de dados texto;
     * e. Senha = tipo de dados texto;
     * e. Cidade = tipo de dados Cidade.
     */
    private int codigo;
    private String nome;
    private String dtNascimento;
    private String email;
    private String senha;
    private Cidade cidade;
    
    /*
     * Crie um Construtor que receba como parâmetro os valores dos atributos:
     * i. Codigo
     * ii. Nome; 
     * iii. Data de Nascimento;
     * iv. Email; 
     * v. Senha;
     * vi. Cidade.
     */
    public Estudante(int cod, String nom, String dtn, String ema, String sen, Cidade cid)
    {
        codigo = cod;
        nome = nom;
        dtNascimento = dtn;
        email = ema;
        senha = sen;
        cidade = cid;// o parâmetro cid possui o objeto Cidade.  Este objeto será atribuído para o atributo cidade.
        
        /*
         * O método construtor deve fazer uso também do adicionaNovoEstudante da classe Cidade, 
         * para que, a cada novo estudante cadastrado para uma determinada cidade (Associacao simples entre classes), 
         * seja calculado e armazenado a quantidade de estudantes para a cidade selecionada.
         */
        cidade.adicionaNovoEstudante();
    }

    
    //Metodos de acesso (GET) para todos os atributos
    public int getCodigo()
    {
        return codigo;
    }
    
    public String getNome()
    {
        return nome;
    }

    public String getDtNascimento()
    {
        return dtNascimento;
    }
    
    public String getEmail()
    {
        return email;
    }

    public String getSenha()
    {
        return senha;
    }
    
    public Cidade getCidade()
    {
        return cidade;
    }
        
    //Metodos de configuracao (SET) para todos os atributos
    
    public void setCodigo(int cod)
    {
        codigo = cod;
    }
    
    public void setNome(String nom)
    {
        nome = nom;
    }

    public void setDtNascimento(String dtn)
    {
        dtNascimento = dtn;
    }
    
    public void setEmail(String ema)
    {
        email = ema;
    }

    public void setSenha(String sen)
    {
        senha = sen;
    }
    
    public void setCidade(Cidade cid)
    {
        cidade = cid;
    }
    
    
    //Metodo exibeDados para apresentar todos os dados da classe
    public void exibeDados()
    {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dtNascimento);
        System.out.println("Email: " + email);
        System.out.println("Senha: " + senha);
        System.out.println("Cidade: " + cidade.getNome());
    }
        
}
