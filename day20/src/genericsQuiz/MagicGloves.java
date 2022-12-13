package genericsQuiz;

public class MagicGloves<T> implements CommonAttackBehavior {

	private T attribute;
	
	public void setAttribute(T attribute) {
		this.attribute = attribute;
	}
	
	public T getAttribute() {
		return attribute;
	}
	@Override
	public void invokeSkill(String characterName, String skillExplain) {
		// TODO Auto-generated method stub
		if(characterName != null & skillExplain != null) {
			System.out.println(characterName + " : " + skillExplain);
		}else {
			System.out.println("케릭터 이름이나 스킬 이름을 작성해주세요.");
		}
	}
}
