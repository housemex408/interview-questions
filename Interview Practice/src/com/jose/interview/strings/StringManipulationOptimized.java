package com.jose.interview.strings;

import java.util.ArrayList;
import java.util.HashMap;

public class StringManipulationOptimized implements StringManipulation {

	// This algorithm runs in O(N) + O(N/2) time
	public ArrayList<String> printDupes(String input) {

		ArrayList<String> results = new ArrayList<String>();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		if (input == null || input.length() < 2)
			return results;

		int current = 0;
		input = input.toLowerCase();

		// O(n)
		for (char c : input.toCharArray()) {
			if (!map.containsKey(c)) {
				map.put(c, 0);
			} else {
				current = map.get(c);
				map.put(c, ++current);
			}
		}

		// O(n/2)
		for (char key : map.keySet()) {
			if (map.get(key) > 1)
				results.add(new String(new char[] { key }));
		}

		return results;
	}

	// This algorithm runs in O(N) + O(N)
	// We avoid using a hash table here but we end up wasting space
	public ArrayList<String> returnFirstNonDupe(String input) {

		ArrayList<String> results = new ArrayList<String>();
		int[] workspace = new int[91];

		if (input == null || input.length() < 2)
			return results;

		input = input.toUpperCase();
		int current;

		// O(N)
		for (char i : input.toCharArray()) {
			current = workspace[(int) i];
			workspace[(int) i] = ++current;
		}

		// O(N)
		for (int i = 65; i < workspace.length; i++) {
			if (workspace[(int) i] == 1) {
				results.add(new String(new char[] { (char) i }));
			}
		}

		return results;
	}

}
