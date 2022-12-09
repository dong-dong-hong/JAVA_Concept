package config;

public interface WeaponBehavior {

	// Generic class
	public <T> void setWeapon(T weapon);
	public void invokeWeaponSKill();
}
