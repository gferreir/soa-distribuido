package data;


public class Output {
	
	private double qtdOleo;
	private double naoh;
	private double etoh;
	
	public Output() {
	}
	
	public Output(int qtdOleo, double naoh, double etoh) {
		this.qtdOleo = qtdOleo;
		this.naoh = naoh;
		this.etoh = etoh;
	}
	
	public double getQtdOleo() {
		return qtdOleo;
	}
	
	public void setQtdOleo(double qtdOleo) {
		this.qtdOleo = qtdOleo;
	}
	
	public double getNaoh() {
		return naoh;
	}
	
	public double getEtoh() {
		return etoh;
	}
	
	public void setNaoh(double naoh) {
		this.naoh = naoh;
	}
	
	public void setEtoh(double etoh) {
		this.etoh = etoh;
	}
	
	@Override
	public String toString() {
		return String.format("Output{qtdOleo=%d, naoh=%d, etoh=%d}", getQtdOleo(), getNaoh(), getEtoh());
	}

}
