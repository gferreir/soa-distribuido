package data;

public class OutputResultado {
	
	private int resultado;
	
	public OutputResultado() {
	}
	
	public OutputResultado(int resultado) {
		this.resultado = resultado;
	}
	
	public int getResultado() {
		return resultado;
	}
	
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}	
	
	@Override
	public String toString() {
		return String.format("OutputResultado{resultado=%f}", getResultado());
	}

}
