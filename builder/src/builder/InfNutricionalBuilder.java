package builder;

public class InfNutricionalBuilder {
	
	private double porcao;
	private double valorEnergetico;
	private double carboidrato;
	private double colesterol;
	private double proteina;
	private double gorduraTotal;
	private double gorduraSaturada;
	private double gorduraTrans;
	private double sodio;
	private double calcio;
	private double ferro;
	
	// sem construtor
	// fluent interface (interface fluente)
	
	public InfNutricionalBuilder porcao(double porcao) {
		this.porcao = porcao;
		return this; // fluent interface
	}
	
	public InfNutricionalBuilder valorEnergetico(double valorEnergetico) {
		this.valorEnergetico = valorEnergetico;
		return this;
	}
	
	public InfNutricionalBuilder carboidrato(double carboidrato) {
		this.carboidrato = carboidrato;
		return this;
	}
	
	// para todos os atributos (InfNutricional)

	
	public InfNutricional build() {
		return new InfNutricional(porcao, valorEnergetico, carboidrato, colesterol, proteina, gorduraTotal, gorduraSaturada, gorduraTrans, sodio, calcio, ferro);
	}
}
