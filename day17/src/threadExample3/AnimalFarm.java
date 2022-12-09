package threadExample3;

public class AnimalFarm implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i < 10; i++) {
			System.out.println("고양이: 야옹~~");
			System.out.println("강아지: 멍멍!!");
			System.out.println("닭: 꼬끼오~!");
			System.out.println("오리: 꽥꽥");
		}
	}

	
}
