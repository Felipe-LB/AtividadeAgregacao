public class Pessoa {
    private String nome;
    private int idade;
    private Profissao profissao;
    private Cidade cidade; 

    public Pessoa(String nome, int idade, Profissao profissao, Cidade cidade) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
        this.cidade = cidade; 
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Pessoa: " + nome + ", Idade: " + idade + ", Profissão: " + profissao.getNome() +
                ", Salário: " + profissao.getSalario() + ", Empresa: " + profissao.getEmpresa() +
                ", Cidade: " + cidade.getNome(); 
    }
}
