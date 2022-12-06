package interfaceQuiz;

public class Bike implements BikeSkills {

	
	@Override
	public void setControlHandle(int left, int right) {
		// TODO Auto-generated method stub
		if(left == 0) {
			System.out.println("왼쪽으로 핸들이 변경되었습니다.");
		}else if(right != 0) {
			System.out.println("오른쪽으로 핸들이 변경되었습니다.");
		}else {
			System.out.println("뒤쪽으로 핸들이 변경되었씁니다.");
		}
		
	}

	@Override
	public void setStepPedal() {
		// TODO Auto-generated method stub
		System.out.println("삐걱삐걱");
	}

}
