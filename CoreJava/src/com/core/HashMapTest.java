package com.core;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	
	public static void main(String[] args) {
        Map <Key, String> cityMap = new HashMap<Key, String>();
        cityMap.put(1,"New York City" );
        cityMap.put(new Key(2, "ND"), "New Delhi");
        cityMap.put(new Key(3, "NW"), "Newark");
        cityMap.put(new Key(4, "NP"), "Newport");

        System.out.println("size before iteration " + cityMap.size());
        Iterator <Key> itr = cityMap.keySet().iterator();
        while (itr.hasNext()){
            System.out.println(cityMap.get(itr.next()));     
        }
        System.out.println("size after iteration " + cityMap.size());    
    }
 

}
