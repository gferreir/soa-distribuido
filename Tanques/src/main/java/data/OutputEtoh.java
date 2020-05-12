package data;

public class OutputEtoh {
	
	private int etoh;
	
	public OutputEtoh() {
	}
	
	public OutputEtoh(int etoh) {
		this.etoh = etoh;
	}
	
	public int getEtoh() {
		return etoh;
	}
	
	public void setEtoh(int etoh) {
		this.etoh = etoh;
	}
	
	@Override
	public String toString() {
		return String.format("OutputEtoh{etoh=%f}", getEtoh());
	}

}
