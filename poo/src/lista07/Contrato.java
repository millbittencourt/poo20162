package lista07;

public class Contrato {

	private Integer numeroContrato=1;
	private String nomeCliente;
	private String endereco;
	private Veiculo[] veiculos = new Veiculo[20];
	private Integer qtdVeiculos = 0;
	private Integer valorContrato;

	public Contrato(String nomeCliente, String endereco) {
		super();
		this.nomeCliente = nomeCliente;
		this.endereco = endereco;
		qtdVeiculos++;
		numeroContrato++;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public Integer getValorContrato() {
		return valorContrato;
	}

	public Boolean adicionarVeiculo(String placa, Integer anoFabricacao, TipoVeiculoEnum tipo) {
		for (int i = 0; i < veiculos.length; i++) {
			if (veiculos[i].getPlaca().equalsIgnoreCase(placa)) {
				return false;
			} else {
				Veiculo veiculo = new Veiculo(placa, anoFabricacao, tipo);
				veiculos[i] = veiculo;
			}
		}
		return true;
	}

	public Boolean excluirVeiculo(String placa) {
		for (int i = 0; i < veiculos.length; i++) {
			if (veiculos[i].getPlaca().equalsIgnoreCase(placa)) {
				veiculos[i] = null;
				qtdVeiculos--;
				return true;
			}

		}
		return false;
	}

	public Double calcularValorTotal() {
		Double valorTotal = 0d;
		for (Integer i = 0; i < veiculos.length; i++) {
			valorTotal += veiculos[i].getTipo().getValorLocacao();
		}
		return valorTotal;

	}
}