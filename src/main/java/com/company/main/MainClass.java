package com.company.main;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

public class MainClass {
	public static void main(String[] args) {
		HazelcastInstance hz = Hazelcast.newHazelcastInstance();
		IMap<String, String> capitals = hz.getMap("capitals");
		if (capitals.containsKey("AU")) {
			capitals.put("NY", "NewYork");
		}
		capitals.put("GB", "London");
		capitals.put("FR", "Paris");
		capitals.put("US", "Washington DC");
		capitals.put("AU", "Canberra");

		System.out.println("Known capital cities: " + capitals.size());

	}
}
