package enumExample4;

public enum TeaType {

	WHITE("백차")
	, GREEN("녹차")
	, YELLOW("황차")
	, BLUE("우롱차")
	, BLACK("홍차")
	, DARK("보이차");


	private String teaNameByKorean;

	TeaType(String teaNameByKorean) {
	this.teaNameByKorean = teaNameByKorean;
	}

	public String getTeaNamebyKorean() {
	return teaNameByKorean;
  }
	
	public String findTeaName(String teaNameByKorean) {
		
		for(TeaType teaType: TeaType.values()) {
			if(teaType.getTeaNamebyKorean() .equals(teaNameByKorean)) {
				return teaType.name();
			}
		}
		
		return "해당하는 차의 종류가 없습니다.";
	}
}