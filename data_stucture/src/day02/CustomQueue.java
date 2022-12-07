package day02;

import java.util.ArrayList;

public class CustomQueue {
	
	private static Boolean isEmpty(ArrayList<Integer> arrayList) {
		
		if(arrayList.isEmpty()) {
			
			return true;
		}else {
			return false;
		}
	}
	
	private static void enqueue(ArrayList<Integer> arrayList, Integer data) {
		
		arrayList.add(data);
	}
	
	private static boolean dequeue(ArrayList<Integer> arrayList) {
		
		if(isEmpty(arrayList)) {
			
			return false;
		}else {
			
			arrayList.remove(0);
			
			return true;
		}
	}
	
	private static void printAllData(ArrayList<Integer> arrayList) {
		
		System.out.println("===================");
		for(int i =0; i < arrayList.size(); i++) {
			System.out.println(i + "번째 데이터 -> " + arrayList.get(i));
		}
		System.out.println("===================");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arrayList = new ArrayList<>();
		
		enqueue(arrayList, 3);
		enqueue(arrayList, 4);
		enqueue(arrayList, 77);
		enqueue(arrayList, 100);
		
		printAllData(arrayList);
		
		dequeue(arrayList);
		
		printAllData(arrayList);
	}

}
