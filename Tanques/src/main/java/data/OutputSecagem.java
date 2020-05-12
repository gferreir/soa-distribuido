package data;

public class OutputSecagem {
	
	double mistura;
	
	public OutputSecagem() {
	}
	
	public OutputSecagem(double mistura) {
		this.mistura = mistura;
	}
	
	public double getMistura() {
		return mistura;
	}
	
	public void setMistura(double mistura) {
		this.mistura = mistura;
	}
	
	@Override
	public String toString() {
		return String.format("OutputLavagem{mistura=%f}", getMistura());
	}
}
