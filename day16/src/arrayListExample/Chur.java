package arrayListExample;

public class Chur {
	private TubeType tubeType;
	private ColorType colorType;
	
	public Chur() {
		this.tubeType = TubeType.RECTANGLE;
		this.colorType = ColorType.GREEN;
	}
	
	public Chur(TubeType tubeType) {
		this.tubeType = tubeType;
		this.colorType = colorType.GREEN;
	}
	
	public Chur(TubeType tubeType, ColorType colorType) {
		this.tubeType = tubeType;
		this.colorType = colorType;
	}
}
