package encapsulation;

public class CatTower {

	// 닫혀있는 변수들
	private Integer supportCnt = 4;
	private Integer fixtureCnt = 4;
	
	// 열려있는 변수들
	public Integer getSupportCnt() {
		return supportCnt;
	}
	
	public void setSupportCnt(Integer supportCnt) {
		this.supportCnt = supportCnt;
	}
	
	public Integer getFixtureCnt() {
		return fixtureCnt;
	}
	
	public void setFixtureCnt(Integer fixtureCnt) {
		this.fixtureCnt = fixtureCnt;
	}
}
