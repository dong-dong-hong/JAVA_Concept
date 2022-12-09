package enumQuiz;

public enum DessertType {

	 CAKE ("케이크")
	,TIRAMISU("티라미수") 
	,BREAD("브래드") 
	,PRETZEL("프레즐") 
	,HOTDOG ("핫도그");
	
	
	private String dessertNameToKorean;
	
	DessertType(String dessertNameToKorean){
		this.dessertNameToKorean = dessertNameToKorean;
	}
	
	public void setDessertNameToKorean(String dessertNameToKorean) {
		this.dessertNameToKorean = dessertNameToKorean;
	}
	
	
	public String getDessertNameToKorean() {
		return dessertNameToKorean;
	}
	
	public String findCoffeeName(String dessertNameByKorean) {
		
		for(DessertType dessertType: DessertType.values()) {
			if(dessertType.getDessertNameToKorean().equals(dessertNameToKorean)) {
				return dessertType.name();
			}
		}
		return "해당하는 커피의 종류가 없습니다.";
	}


}
