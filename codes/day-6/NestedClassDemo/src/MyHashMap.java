import java.util.HashSet;
import java.util.Set;

public class MyHashMap<K, V> {
	public static class MapEntry<K, V> {
		private K key;
		private V value;

		public MapEntry(K key, V value) {
			this.key = key;
			this.value = value;
		}

		public K getKey() {
			return this.key;
		}

		public V getValue() {
			return this.value;
		}
	}

	private Set<MapEntry<K, V>> entries;

	public MyHashMap() {
		this.entries = new HashSet<MapEntry<K, V>>();
	}

	public void push(K key, V value) {
		MapEntry<K, V> entry = new MapEntry<K, V>(key, value);
		entries.add(entry);
	}

	public Set<MapEntry<K, V>> getEntries() {
		return this.entries;
	}

}
