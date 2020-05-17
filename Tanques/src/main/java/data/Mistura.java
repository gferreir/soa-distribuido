package data;

public class Mistura {
	
	private int mistura;
	
	public Mistura() {
	}
	
	public Mistura(int mistura) {
		this.mistura = mistura;
	}
	
	public int getMistura() {
		return mistura;
	}
	
	public void setMistura(int mistura) {
		this.mistura = mistura;
	}
	
	@Override
	public String toString() {
		return String.format("Mistura{mistura=%d}", getMistura());
	}

}
