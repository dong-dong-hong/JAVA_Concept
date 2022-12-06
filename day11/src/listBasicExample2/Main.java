package listBasicExample2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList incheonBusList = new ArrayList();
		incheonBusList.add(522);
		incheonBusList.add(523);
		incheonBusList.add(16);
		incheonBusList.add(8);
		
		System.out.println(incheonBusList);
		System.out.println();
		
		for(int i = 0 ;  i< incheonBusList.size(); i++) {
			System.out.println(incheonBusList.get(i));
		}
		
		System.out.println("");
		System.out.println("===========");
		System.out.println("");
		
		incheonBusList.remove(1);
		
		System.out.println(incheonBusList);
		System.out.println("");
		
		for(int i=0; i< incheonBusList.size()-1; i++) {
			System.out.println(incheonBusList.get(i));
		}
		
		System.out.println("");
		System.out.println("===========");
		System.out.println("");
		
		ArrayList<Integer> seoulBusList = new ArrayList();
		seoulBusList.add(604);
		seoulBusList.add(603);
		seoulBusList.add(602);
		seoulBusList.add(601);
		
		System.out.println(seoulBusList);
		System.out.println("");
		
		for(int i = 0; i < seoulBusList.size(); i++) {
			System.out.println(seoulBusList.get(i));
		}
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		seoulBusList.remove(1);
		
		System.out.println(seoulBusList);
		System.out.println("");
		
		for(int i=0 ; i < seoulBusList.size(); i++) {
			System.out.println(seoulBusList.get(i));
		}
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
	}

}
