package JavaCore.SobrecargaConstrutores.tet;

import JavaCore.SobrecargaConstrutores.Classes.Estudante;

public class EstudanteTest {

	public static void main(String[] args) {
		
		Estudante est = new Estudante("11223344","André", new double[]{5,7,9},"12/04/20");
		est.imprime();
	}

}
