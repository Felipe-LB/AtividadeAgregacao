public class Estado {
    private String nome;
    private String sigla;
    private String populacao;

    public Estado(String nome, String sigla, String populacao) {
        this.nome = nome;
        this.sigla = sigla;
        this.populacao = populacao;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getPopulacao() {
        return populacao;
    }

    public void setPopulacao(String populacao) {
        this.populacao = populacao;
    }

    @Override
    public String toString() {
        return "Estado: " + nome + ", Sigla: " + sigla + ", População: " + populacao;
    }
}