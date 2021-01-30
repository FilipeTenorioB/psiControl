
package psicontrol;


public class Cliente {
    
    private String nome;
    private String dataDeNascimento;
    private int idade;
    private String cpf;
    private String profissao;
    private String endereço;
    private String numeroDoCelular;
    private int valorDaSessao;
    private static int quantidadeClientes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void setNumeroDoCelular(String numeroDoCelular) {
        this.numeroDoCelular = numeroDoCelular;
    }

    public String getNumeroDoCelular() {
        return numeroDoCelular;
    }

    public int getValorDaSessao() {
        return valorDaSessao;
    }

    public void setValorDaSessao(int valorDaSessao) {
        this.valorDaSessao = valorDaSessao;
    }

    public static int getQuantidadeClientes() {
        return quantidadeClientes;
    }

    public static void setQuantidadeClientes(int quantidadeClientes) {
        Cliente.quantidadeClientes = quantidadeClientes;
    }
    
    
    
}
