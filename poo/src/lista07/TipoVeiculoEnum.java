package lista07;

public enum TipoVeiculoEnum {

	BASICO(100.45d), INTEMEDIARIO(130.10d), LUXO(156.00d);

	private Double valorLocacao;

	private TipoVeiculoEnum(Double valorLocacao) {
		this.valorLocacao = valorLocacao;

	}

	public Double getValorLocacao() {
		return valorLocacao;
	}

}
