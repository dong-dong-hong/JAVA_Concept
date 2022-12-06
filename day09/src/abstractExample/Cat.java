package abstractExample;

abstract class Cat {

	//추상 메서드 선언 가능하고..
	abstract void run();
	
	// 그냥 메서드 선언 가능
	public void slash() {
		System.out.println("샤샤샥");
	}
}
