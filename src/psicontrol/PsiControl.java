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
                    Cliente novoCliente = new Cliente();
                    acessarInformacoesDoCliente(novoCliente);
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
        } while (opcao != 6);

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
        System.out.println("Insira a data de nascimento do cliente: (ex: 02/07/1995)");
        novoCliente.setDataDeNascimento(entrada.nextLine());

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
        System.out.println("Data de nascimento:" + novoCliente.getDataDeNascimento());
        System.out.println("CPF:" + novoCliente.getCpf());
        System.out.println("Profissão:" + novoCliente.getProfissao());
        System.out.println("Endereço:" + novoCliente.getEndereco());
        System.out.println("Número para contato:" + novoCliente.getNumeroDoCelular());

        System.out.println();
        System.out.println("Deseja confirmar o cadastro?");

    }

    public static void acessarInformacoesDoCliente(Cliente novoCliente) {

        System.out.println();
        
        // Nome do cliente

        if (novoCliente.getNome() != null) {
            System.out.println("Nome completo:" + novoCliente.getNome());
        }
        if (novoCliente.getNome() == null) {
            System.out.print("Nome completo: ");
            mensagemErroInformacaoNaoAtualizada();
        }
        
        // Idade do cliente
        
        if (novoCliente.getIdade() != 0) {
            System.out.println("Idade:" + novoCliente.getIdade());
        }
        if (novoCliente.getIdade() == 0) {
            System.out.print("Idade: ");
            mensagemErroInformacaoNaoAtualizada();
        }
        
        // Data de nascimento do cliente

        if (novoCliente.getDataDeNascimento() != null) {
            System.out.println("Data de nascimento:" + novoCliente.getDataDeNascimento());
        }
        if (novoCliente.getDataDeNascimento() == null) {
            System.out.print("Data de nascimento: ");
            mensagemErroInformacaoNaoAtualizada();
        }
        
        // CPF do cliente

        if (novoCliente.getCpf() != null) {
            System.out.println("CPF:" + novoCliente.getCpf());
        }
        if (novoCliente.getCpf() == null) {
            System.out.print("CPF: ");
            mensagemErroInformacaoNaoAtualizada();
        }
        
        // Profissão do cliente
        
        if (novoCliente.getProfissao() != null) {
            System.out.println("Profissão:" + novoCliente.getProfissao());
        }
        if (novoCliente.getProfissao() == null) {
            System.out.print("Profissão: ");
            mensagemErroInformacaoNaoAtualizada();
        }
        
        // Endereço do cliente

        if (novoCliente.getEndereco() != null) {
            System.out.println("Endereço:" + novoCliente.getEndereco());
        }
        if (novoCliente.getEndereco() == null) {
            System.out.print("Endereço: ");
            mensagemErroInformacaoNaoAtualizada();
        }
        
        // Número do celular do cliente

        if (novoCliente.getNumeroDoCelular()!= null) {
            System.out.println("Número do celular:" + novoCliente.getNumeroDoCelular());
        }
        if (novoCliente.getNumeroDoCelular()== null) {
            System.out.print("Número do celular: ");
            mensagemErroInformacaoNaoAtualizada();
        }

    }

    public static void mensagemErroInformacaoNaoAtualizada() {

        System.out.println("Informação ainda não atualizada. Favor atualizar em nossa função 'Cadastrar Cliente'.");

    }

}
