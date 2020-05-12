package data;

public class Mistura {
	
	private int mistura;
	private int total;
	
	public Mistura() {
	}
	
	public Mistura(int mistura, int total) {
		this.mistura = mistura;
		this.total = total;
	}
	
	public int getMistura() {
		return mistura;
	}
	
	public void setMistura(int mistura) {
		this.mistura = mistura;
	}
	
	public int getTotal() {
		return total;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return String.format("Mistura{mistura=%d, total=%d}", getMistura(), getTotal());
	}

}
