package customListQuiz;

import java.util.ArrayList;

public class CuttingBoard {
	
	private ArrayList<Salmon> salmonList; 
	
	private String translateSalmonType(String type) {
		if(type == "BIG"){
			return "큰";
		}else if(type == "MEDIUM") {
			return "중간";
		}else if(type == "SMALL") {
			return "작은";
		}else{
			retrurn "입력이 잘못되었습니다.";
		}
	}
		
		
		
		
	}
	
}
