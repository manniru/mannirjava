package com.mannir.snippets;

import java.util.Map;

import com.google.common.base.Joiner;

public class Guava1 {

	public static void main(String[] args) {
		String[] fantasyGenres = {"COM101", "COM102", "COM103", "COM104"};
		String joined = Joiner.on(", ").join(fantasyGenres);
		
		String[] fantasyGenres2 = {"Space Opera", null, "Horror", "Magic realism", null, "Religion"};
		String joined2 = Joiner.on(", ").skipNulls().join(fantasyGenres2);
		
		System.out.println(joined2);
		
		Map<Integer, String> map = newHashMap();
		map.put(1, "Space Opera");
		map.put(2, "Horror");
		map.put(3, "Magic realism");
		String joined = Joiner.on(", ").withKeyValueSeparator(" -> ").join(map);




	}

}
