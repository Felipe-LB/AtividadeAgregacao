public class Profissao {
    private String nome;
    private double salario;
    private String empresa;

    public Profissao(String nome, double salario, String empresa) {
        this.nome = nome;
        this.salario = salario;
        this.empresa = empresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Profissão: " + nome + ", Salário: " + salario + ", Empresa: " + empresa;
    }
}