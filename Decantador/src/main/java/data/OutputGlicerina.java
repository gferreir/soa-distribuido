package data;

public class OutputGlicerina {
	
	private int glicerina;
	
	public OutputGlicerina() {
	}
	
	public OutputGlicerina(int glicerina) {
		this.glicerina = glicerina;
	}
	
	public int getGlicerina() {
		return glicerina;
	}
	
	public void setGliceria(int glicerina) {
		this.glicerina = glicerina;
	}
	
	@Override
	public String toString() {
		return String.format("OutputGlicerina{glicerina=$d}", getGlicerina());
	}

}
