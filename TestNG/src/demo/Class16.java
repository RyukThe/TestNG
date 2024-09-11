package demo;

import java.util.HashMap;
import java.util.Set;

import org.testng.annotations.Test;

public class Class16
{
	@Test
	public void hashmap()
	{
		HashMap<Integer, String> mp= new HashMap<Integer, String>();
		mp.put(1, "Saurav");
		mp.put(2, "Hello");
		mp.put(4, "ok");
		mp.put(3, "Snake");
		mp.put(4, "OK Google");
		mp.get(1);
		mp.containsKey(4);
		mp.isEmpty();
		mp.size();
	
		Set<Integer> key = mp.keySet();
		for(Integer k:key)
		{
			
			System.out.println(k+":"+mp.get(k));
		}
	}

}
