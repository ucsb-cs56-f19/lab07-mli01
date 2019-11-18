package hello;
import java.io.Serializable;

public class EqSearch implements Serializable {
	private int distance;
	private int minmag;
	
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getDistance() {
		return distance;
	}

	public void setMinmag(int minmag) {
		this.minmag = minmag;
	}
	public int getMinmag() {
		return minmag;
	}
}
