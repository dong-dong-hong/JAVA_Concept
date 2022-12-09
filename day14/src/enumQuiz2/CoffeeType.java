package enumQuiz2;

import enumExample4.TeaType;

public enum CoffeeType {

	AMERICANO("아메리카노")
	,ESPRESSO("에스프레소")
	,LATTE("라떼")
	,MOCHA("모카")
	,CAPPUCCINO("카푸치노");



	private String coffeeTypeKorean;
	
	CoffeeType(String coffeeTypeKorean) {
		this.coffeeTypeKorean = coffeeTypeKorean;
	}
	
	public String getCoffeeTypeKorean() {
		return coffeeTypeKorean;
	}
	
	public void setCoffeeTypeKorean(String coffeeTypeKorean) {
		this.coffeeTypeKorean = coffeeTypeKorean;
	}
	
	
	public String findCoffeeName(String CoffeeNameByKorean) {
		
		for(CoffeeType coffeeType: CoffeeType.values()) {
			if(coffeeType.getCoffeeTypeKorean().equals(CoffeeNameByKorean)) {
				return coffeeType.name();
			}
		}
		return "해당하는 커피의 종류가 없습니다.";
	}
	
	
	
}