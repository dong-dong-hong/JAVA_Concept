package arrayListExample4;

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
	
	public TubeType getTubeType() {
		return tubeType;
	}
	
	public void setTubeType(TubeType tubeType) {
		this.tubeType = tubeType;
	}

	public ColorType getColorType() {
		return colorType;
	}
	
	public void setColorType(ColorType colorType) {
		this.colorType = colorType;
	}
}
