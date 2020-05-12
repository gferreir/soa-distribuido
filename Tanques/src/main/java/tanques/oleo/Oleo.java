package tanques.oleo;

public class Oleo{

private int qtdOleo;

	public Oleo() {	
	}
	
	public Oleo(int qtdOleo) {
		this.qtdOleo  = qtdOleo;
	}
	
	public int getQtdOleo() {
		return qtdOleo;
	}
	
	public void setQtdOleo(int qtdOleo) {
		this.qtdOleo = qtdOleo;
	}
	
	@Override
	public String toString() {
		return String.format("Oleo{qtdOleo=%d}", getQtdOleo());
	}
}
