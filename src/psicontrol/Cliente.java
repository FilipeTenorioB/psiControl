package psicontrol;

public class Cliente {

    private String nome;
    private String dataDeNascimento;
    private int idade;
    private String cpf;
    private String profissao;
    private String endereco;
    private String numeroDoCelular;
    private int valorDaSessao;
    private static int quantidadeClientes;

    public String getNome() {
        if (nome == null) {
            mensagemErroInformacaoNaoAtualizada();
        }
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        if (dataDeNascimento == null) {
            mensagemErroInformacaoNaoAtualizada();
        }
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getIdade() {
        if(idade == 0){
            mensagemErroInformacaoNaoAtualizada();
        }
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        if(cpf == null){
            mensagemErroInformacaoNaoAtualizada();
        }
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        if(profissao == null){
            mensagemErroInformacaoNaoAtualizada();
        }
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEndereco() {
        if(endereco == null){
            mensagemErroInformacaoNaoAtualizada();
        }
        return endereco;
    }

    public void setEndereco(String endereço) {
        this.endereco = endereço;
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
    
    public static void mensagemErroInformacaoNaoAtualizada(){
        
            System.out.println("Informação ainda não atualizada. Favor atualizar em nossa função 'Cadastrar Cliente'.");
        
    }

}
