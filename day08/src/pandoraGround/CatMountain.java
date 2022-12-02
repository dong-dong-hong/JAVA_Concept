package pandoraGround;

import pandoraBox.PandoraBoxMain;
import pandoraBox2.PandoraBox02Main;
import pandoraBox3.PandoraBox03Main;

public class CatMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PandoraBoxMain pandoraBoxMain = new PandoraBoxMain();
		PandoraBox02Main pandoraBox02Main = new PandoraBox02Main();
		PandoraBox03Main pandoraBox03Main = new PandoraBox03Main();
		
//		System.out.println("출력이 될까요? : " + pandoraBoxMain.getPandoraBoxMain());
		System.out.println("출력이 될까요? : " + pandoraBox02Main.getPandoraBox02Type());
		System.out.println("출력이 될까요? : " + pandoraBox03Main.getPandoraBox03Type());
		
	}

}
