package psicontrol;

import java.util.Scanner;

public class PsiControl {

    public static void main(String[] args) {
        int opcao;
        Scanner entrada = new Scanner(System.in);
        do {
            
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
        } while (opcao > 0);


    }
    
    public static void cadastrarCliente(){
        
        Scanner entrada = new Scanner(System.in);
        
        Cliente cliente = new Cliente();
        
        System.out.println();
        System.out.println("Insira o nome completo do cliente: ");
        cliente.setNome(entrada.nextLine());
        
        System.out.println();
        System.out.println("O nome completo do cliente é: " + cliente.getNome());
        
        
    }

}
