package psicontrol;

import java.util.Scanner;

public class PsiControl {

    public static void main(String[] args) {
        int opcao;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá Psicólogo(a)!");
        System.out.println("Seja bem vindo ao PsiControl =D");
        System.out.println("Qual opção você deseja?");
        System.out.println();
        System.out.println("Opção 1: Cadastrar um novo cliente.");
        System.out.println("Opção 2: Formalizar pagamento do cliente.");
        System.out.println("Opção 3: Acessar informação de cliente cadastrado.");
        System.out.println("Opção 4: Agendar consulta.");
        System.out.println("Opção 5: Acessar controle financeiro.");
        System.out.println("Opção 6: Fechar aplicativo.");
        System.out.println();

        do {

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    //formalizarPagamentoDoCliente(Cliente cliente);
                    break;
                case 3:
                    //acessarInformacoesDoCliente(Cliente cliente);
                    break;
                case 4:
                    //agendarConsulta(Cliente cliente, String data);
                case 5:
                    //acessarControleFinanceiro();
                case 6:
                    System.out.println("Obrigado e até a próxima! o/");
                default:
                    System.out.println("ATENÇÃO PSICÓLOGO(A)! Apenas funcionarão opções entre 1 e 6.");
                    break;
            }
        } while (opcao == 6);

    }

    public static void cadastrarCliente() {

        Scanner entrada = new Scanner(System.in);

        Cliente novoCliente = new Cliente();

        System.out.println();
        System.out.println("Insira o nome completo do cliente: ");
        novoCliente.setNome(entrada.nextLine());

        System.out.println();
        System.out.println("Insira a idade do cliente: ");
        novoCliente.setIdade(entrada.nextInt());

        System.out.println();
        System.out.println("Insira o CPF do cliente: (ex: 078.424.632-01)");
        novoCliente.setCpf(entrada.nextLine());

        System.out.println();
        System.out.println("Insira a profissão do cliente: ");
        novoCliente.setProfissao(entrada.nextLine());

        System.out.println();
        System.out.println("Insira o endereço do cliente: (ex: Rua Aurora, 754 - Bairro/Cidade - Apt 501.)");
        novoCliente.setEndereco(entrada.nextLine());

        System.out.println();
        System.out.println("Insira o número, para contato, do cliente: (ex: (081)99542-3215 / (081)3345-4221)");
        novoCliente.setNumeroDoCelular(entrada.nextLine());

        System.out.println();
        System.out.println("Nome completo:" + novoCliente.getNome());
        System.out.println("Idade:" + novoCliente.getIdade());
        System.out.println("CPF:" + novoCliente.getCpf());
        System.out.println("Profissão:" + novoCliente.getProfissao());
        System.out.println("Endereço:" + novoCliente.getEndereco());
        System.out.println("Número para contato:" + novoCliente.getNumeroDoCelular());

        System.out.println();
        System.out.println("Deseja confirmar o cadastro?");

    }

}
