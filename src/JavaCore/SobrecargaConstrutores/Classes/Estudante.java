package JavaCore.SobrecargaConstrutores.Classes;

public class Estudante {
	private String matricula;
	private String dataMatricula;
	private String nome;
	private double[] notas;
	
	public Estudante() {
		System.out.println("Construtor Default");
	}
	
	public Estudante(String matricula, String nome, double[] notas) {
		this();
		this.matricula = matricula;
		this.nome = nome;
		this.notas = notas;
	}
	
	public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
		this(dataMatricula, nome, notas);
		this.dataMatricula = dataMatricula;
	}

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	
	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public void  imprime() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Matrícula: "+this.matricula);
		System.out.println("Data da matrícula: "+this.dataMatricula);
		
		for (double nota : notas) {
			System.out.println("Nota: "+ nota);
		}
	}
}
