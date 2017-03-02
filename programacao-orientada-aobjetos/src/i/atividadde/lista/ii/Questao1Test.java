package i.atividadde.lista.ii;

import org.junit.Assert;
import org.junit.Test;

public class Questao1Test {

	@Test
	public void maiorNumero5() {
		int[] vet = { 5, 2, 3, 1, 4 };

		Questao1 q1 = new Questao1();

		int resAtual = q1.encontrarMaiorNumero(vet);
		int resEsperado = 5;

		Assert.assertEquals(resEsperado, resAtual);
	}
}
