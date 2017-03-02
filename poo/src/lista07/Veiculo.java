package lista07;

public class Veiculo {

	
	
	private String placa;
	private Integer anoFabricacao;
	private TipoVeiculoEnum tipo;
	
	public Veiculo(String placa, Integer anoFabricacao, TipoVeiculoEnum tipo) {
		super();
		this.placa = placa;
		this.anoFabricacao = anoFabricacao;
		this.tipo = tipo;
	}

	public TipoVeiculoEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoVeiculoEnum tipo) {
		this.tipo = tipo;
	}

	public String getPlaca() {
		return placa;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}
	
}
