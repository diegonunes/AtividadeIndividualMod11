
/**
 * TesteFun4Study
 */
public class TesteFun4Study {
    public static void main(String args[]) {
        /*
         * A classe de teste deve criar várias cidades e no mínimo 4 estudantes para
         * cada cidade criada. Utilize a classe: Teclado para solicitar os dados do
         * teclado
         */        
        int contadorCidades = 0;
        int contadorEstudantes = 0;
        char resposta;
        int opcao = 0;
        Cidade cidade;
        Estudante estudante;

        do {
            // Cadastra nova cidade
            contadorCidades++;
            System.out.println("Cadastre a Cidade " + contadorCidades + ":");
            cidade = new Cidade(contadorCidades,
                                Teclado.leString("Informe o nome: "),
                                Teclado.leString("Informe a UF: "));
            // Cadastra estudantes para cidade
            do {
                contadorEstudantes++;
                System.out.println("Cadastre o Estudante " + contadorEstudantes + ": ");
                estudante = new Estudante(contadorEstudantes,
                                          Teclado.leString("Informe o nome: "),
                                          Teclado.leString("Informe a data de nascimento: "),
                                          Teclado.leString("Informe o email: "),
                                          Teclado.leString("Informe a senha: "),
                                          cidade);
                // Exibe os dados do estudante cadastrado
                System.out.println("--- Dados do Estudante " + contadorEstudantes + " ---");
                estudante.exibeDados();
                // Altera estudante?
                resposta = Teclado.leChar("Deseja alterar algum dado do estudante?\nDigite S para Sim ou N para não\n");
                while (resposta == 'S' || resposta == 's') {
                    // Escolhe o que alterar
                    System.out.println("O que gostaria de alterar?");
                    opcao = Teclado.leInt("Digite:\n1 - para alterar o nome \n2 - para alterar a data de nascimento \n3 - para alterar o email \n4 - para alterar a senha\n");
                    switch (opcao) {
                    case 1:
                        estudante.setNome(Teclado.leString("Digite o novo nome: "));
                        break;
                    case 2:
                        estudante.setDtNascimento(Teclado.leString("Digite a nova data de nascimento: "));
                        break;
                    case 3:
                        estudante.setEmail(Teclado.leString("Digite o novo email: "));
                        break;
                    case 4:
                        estudante.setSenha(Teclado.leString("Digite a nova senha: "));
                        break;
                    default:
                        System.out.println("Opção Inválida!");
                    }
                    // Pergunta novamente se deseja alterar dados
                    resposta = Teclado.leChar("Deseja alterar mais algum dado do estudante? \nDigite S para Sim ou N para não\n");
                    if(resposta == 'N' || resposta == 'n') {
                        // Mostra os novos dados
                        System.out.println("--- Dados novos do Estudante " + contadorEstudantes + " ---");
                        estudante.exibeDados();
                    }
                }
                // Pergunta se deseja criar outro estudante
                opcao = Teclado.leInt("Deseja criar mais um estudante?\nDigite 0 para encerrar ou outro número para continuar\n");
            } while (opcao != 0 || contadorEstudantes < 4);
            contadorEstudantes = 0;
            // Exibe os dados da cidade criada
            System.out.println("--- Dados da Cidade " + contadorCidades + " ---");
            cidade.exibeDados();
            // Pergunta se deseja criar outra cidade
            opcao = Teclado.leInt("Deseja criar mais uma cidade?\nDigite 0 para encerrar ou outro número para continuar\n");
        } while (opcao != 0);
    }
}
