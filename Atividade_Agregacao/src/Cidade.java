public class Cidade {
    private String nome;
    private Estado estado;
    private String populacao;

    public Cidade(String nome, Estado estado, String populacao) {
        this.nome = nome;
        this.estado = estado;
        this.populacao = populacao;
    }

    public String getNome() {
        return nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public String getPopulacao() {
        return populacao;
    }

    public void setPopulacao(String populacao) {
        this.populacao = populacao;
    }

    @Override
    public String toString() {
        return "Cidade: " + nome + ", " + estado.toString() + ", População: " + populacao;
    }
}