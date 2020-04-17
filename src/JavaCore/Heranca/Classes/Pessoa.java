package JavaCore.Heranca.Classes;

public class Pessoa {

    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public void imprime() {
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Cpf: "+ this.getCpf());
        System.out.println("Endereco: "+ this.endereco.getRua());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}