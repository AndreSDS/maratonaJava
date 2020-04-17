package JavaCore.Heranca.Classes;

public class Funcionario extends Pessoa{

    private double salario;

    public void imprime(){
        super.imprime();
        System.out.println("Salário: "+this.salario);
    }

    public void setSalario(final double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}