package enumExample4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TeaType teaType = TeaType.GREEN;
		
		System.out.println(teaType.ordinal()); // Enum class에서 선언된 '숫자'를 리턴
		System.out.println(teaType.name()); // 선언된 값의 이름을 'String'으로 리턴
		System.out.println(teaType.values()); // 모든 원소(객체)들을 담아서 '배열'로 반환
		System.out.println(teaType.valueOf("GREEN")); // String 값을 넣어서 'Enum값'을 반환
		System.out.println(teaType.getTeaNamebyKorean());// 우리가 선언한 메서드
		
		System.out.println("");
		System.out.println("차 종류 순서대로 출력");
		
		for(int i = 0; i < teaType.values().length; i++) {
			System.out.println(teaType.values()[i]);
		}
		
		System.out.println("");
		
		System.out.println("한글로 영어 차이름 찾기");
		System.out.println(teaType.findTeaName("녹차"));
	}

}
