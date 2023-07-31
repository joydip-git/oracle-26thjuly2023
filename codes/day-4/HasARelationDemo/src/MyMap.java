import java.util.HashSet;
import java.util.Set;

public class MyMap<K,V> {	
	public static class Entry<K,V>{
		private K key;
		private V value;
		
		public Entry(K _key, V _value) {
			
		}

		public K getKey() {
			return key;
		}

		public V getValue() {
			return value;
		}
	}
	private Set<Entry<K,V>> entries = new HashSet<Entry<K,V>>();
	public Set<Entry<K,V>> entrySet(){
		return entries;
	}
	public void put(K k, V v) {
		entries.add(new Entry<K,V>(k,v));
	}
}
