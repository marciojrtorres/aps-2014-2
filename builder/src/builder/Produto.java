package builder;

public class Produto {

	private String descricao;
	private double peso;
	private InfNutricional informacaoNutricional;

	public Produto(String descricao, double peso, InfNutricional inf) {
		this.descricao = descricao;
		this.peso = peso;
		this.informacaoNutricional = inf;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getPeso() {
		return peso;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public InfNutricional getInformacaoNutricional() {
		return informacaoNutricional;
	}

	public void setInformacaoNutricional(InfNutricional informacaoNutricional) {
		this.informacaoNutricional = informacaoNutricional;
	}

	@Override
	public String toString() {
		return "Produto [descricao=" + descricao + ", peso=" + peso
				+ ", informacaoNutricional=" + informacaoNutricional + "]";
	}
	
}
