package day01;

import java.util.ArrayList;

public class CustomStack {
	
	private static Boolean isEmpty(ArrayList<Integer> list) {
        if(list.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    private static void printAllData(ArrayList<Integer>list) {
        if(isEmpty(list)) {
            System.out.println("아무런 데이터가 없습니다");
        } else {
            System.out.println("");
            for(Integer i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
            System.out.println("");
        }

    }

    private static void pushData(ArrayList<Integer> list, Integer data) {
        list.add(data);
    }

    private static Integer popData(ArrayList<Integer> list) {
        if(isEmpty(list)) {
            return null;
        }

        return list.remove(list.size() - 1);
    }

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> testDataList = new ArrayList<Integer>();
        	pushData(testDataList, 1);
        	pushData(testDataList, 3);
        	pushData(testDataList, 4);
        	pushData(testDataList, 10);

       	        printAllData(testDataList);

        	popData(testDataList);

       		printAllData(testDataList);
	}

}
