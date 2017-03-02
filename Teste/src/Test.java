
public class Test {

	public static void main(String[] args) {
		Gestao g = new Gestao();

		g.cadastrarProfessor("endryl", "16234278934", TitulacaoEnum.DOUTOR);

		Gestao f = new Gestao();
		System.out.println();

		f.cadastrarAluno("endryl", " ", -1, "sabugueiro");
	}
}
