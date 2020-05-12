package tanques.naoh_etoh;

public class Reagentes{
	
	private double naoh;
	private double etoh;

	public Reagentes() {
	}
	
	public Reagentes(double naoh, double etoh) {
		this.naoh = naoh;
		this.etoh = etoh;
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
		return String.format("Reagentes{naoh=%d, etoh=%d}", getNaoh(), getEtoh());
	}
}
