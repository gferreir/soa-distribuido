package data;

public class OutputLavagem {
	
	double mistura;
	
	public OutputLavagem() {
	}
	
	public OutputLavagem(double mistura) {
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
