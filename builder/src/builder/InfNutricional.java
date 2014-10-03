package builder;

public class InfNutricional {

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
	
	public InfNutricional(double porcao, double valorEnergetico,
			double carboidrato, double colesterol, double proteina,
			double gorduraTotal, double gorduraSaturada, double gorduraTrans,
			double sodio, double calcio, double ferro) {

		this.porcao = porcao;
		this.valorEnergetico = valorEnergetico;
		this.carboidrato = carboidrato;
		this.colesterol = colesterol;
		this.proteina = proteina;
		this.gorduraTotal = gorduraTotal;
		this.gorduraSaturada = gorduraSaturada;
		this.gorduraTrans = gorduraTrans;
		this.sodio = sodio;
		this.calcio = calcio;
		this.ferro = ferro;
	}

	public double getPorcao() {
		return porcao;
	}

	public double getValorEnergetico() {
		return valorEnergetico;
	}

	public double getCarboidrato() {
		return carboidrato;
	}

	public double getColesterol() {
		return colesterol;
	}

	public double getProteina() {
		return proteina;
	}

	public double getGorduraTotal() {
		return gorduraTotal;
	}

	public double getGorduraSaturada() {
		return gorduraSaturada;
	}

	public double getGorduraTrans() {
		return gorduraTrans;
	}

	public double getSodio() {
		return sodio;
	}

	public double getCalcio() {
		return calcio;
	}

	public double getFerro() {
		return ferro;
	}

	@Override
	public String toString() {
		return "InfNutricional [porcao=" + porcao + ", valorEnergetico="
				+ valorEnergetico + ", carboidrato=" + carboidrato
				+ ", colesterol=" + colesterol + ", proteina=" + proteina
				+ ", gorduraTotal=" + gorduraTotal + ", gorduraSaturada="
				+ gorduraSaturada + ", gorduraTrans=" + gorduraTrans
				+ ", sodio=" + sodio + ", calcio=" + calcio + ", ferro="
				+ ferro + "]";
	}


}
