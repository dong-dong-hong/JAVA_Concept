package somisJourney3;

public class BigPowerRock {

	public String rockState = "PHASE5";
	
	public Integer rockHP = 100;
	
	public void setRockState(String rockState) {
		this.rockState = rockState;
	}
	
	public String getRockState( ) {
		return rockState;
	}
	
	public void setRockHp(Integer rockHp) {
		this.rockHP = rockHp;
	}
	
	public void minusRockHp(Integer minusValue) {
		this.rockHP = this.rockHP - minusValue;
	}
	
	public Integer getRockHp() {
		return rockHP;
	}
	
	public void printRocHp(Integer rockHp) {
		System.out.println("=========================");
		System.out.println("바위의 Hp는 " + getRockHp()+ "입니다");
		System.out.println("=========================");
	}
	
	public void printRockState() {
		System.out.println("==========================");
		System.out.println("바위의 상태는 " +  getRockState()+ " 입니다");
		System.out.println("==========================");
	}
	
	public void attacked() {
		
		// 공격을 당할때 마다 체력이 1씩 깍입니다..
		minusRockHp(1);
		
		// 
		if(rockHP >= 80) {
		
			//최상
		setRockState("PHASE5");
		}else if(rockHP >= 60) {
			//상
			setRockState("PhASE4");
		}else if(rockHP >= 40) {
			//중
			setRockState("PhASE3");
		}else if(rockHP >= 20) {
			//하
			setRockState("phASE2");
		}else if(rockHP >= 0) {
			//최하
			setRockState("PHASE1");
		}
	}
}
