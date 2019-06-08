package com.youtube.techtalk.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumerFrequenceyInAArray {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(7);
		list.add(10);
		list.add(4);
		list.add(3);

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (Integer key : list) {

			int val = map.getOrDefault(key, 0);

			map.put(key, val + 1);

		}

		map.forEach((k, v) -> System.out.println("key is : " + k + " Value is : " + v));

	}

}
