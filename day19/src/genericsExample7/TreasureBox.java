package genericsExample7;

public class TreasureBox<K,V> {

	K key;
	V value;
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public K getKey() {
		return key;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
	
	public V getValue() {
		return value;
	}
	
	public void add(K key, V value) {
		this.key = key;
		this.value = value;
	}
}
