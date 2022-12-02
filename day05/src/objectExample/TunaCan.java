package objectExample;

public class TunaCan {

	public Boolean coverState = false; // 처음 캔뚜껑은 닫혀있을 것입니다.

	public void setCoverState(Boolean coverState) {
		this.coverState = coverState;
	}
	
	public Boolean getCoverState() {
		return coverState;
	}
}
