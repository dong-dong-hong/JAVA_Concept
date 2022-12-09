package genericsExample3;

public class Main {
	
	public static String getSentence(String catName) {
		return catName + ": 냐아앙~";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String catName = "소미";
		System.out.println(getSentence(catName));
	}

}
