package forExample;

//이중 포문과 분기문
public class catMountain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String catName = "소미";
		Integer trainingCnt = 10;
		
		
		for(Integer i = 0; i < trainingCnt; i++) {
			System.out.println("");
			System.out.println("수련중 ...");
			System.out.println("");
			for(Integer j = 0; j < trainingCnt; j++) {
				if(j % 2 == 0) {
					System.out.println(catName + " : "+ j + "번째 냥냥펀치");
				}else {
					System.out.println(catName + " : " + j + "번째 냥냥발차기" );
				}
			}
		}
	}

}
