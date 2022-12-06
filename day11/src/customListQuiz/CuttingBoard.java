package customListQuiz;

import java.util.ArrayList;

public class CuttingBoard {
	
	private ArrayList<Salmon> salmonList; 
	
	private String translateSalmonType(String type) {
		switch(type){
		case "BIG":
			return "큰";
		case "MEDIUM":
			return "중간";
		case "SMALL":
			return "작은";
			default:
			return "사이즈없음";	
		}
		
		
		
		
	}
	
}
