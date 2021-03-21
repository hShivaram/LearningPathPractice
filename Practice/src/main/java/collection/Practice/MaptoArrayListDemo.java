package collection.Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MaptoArrayListDemo {

	public static void main(String[] args) {


		Map<String,Double> cmap = new HashMap<String,Double>();
		
		cmap.put("TW", 4.4);
		cmap.put("PayPal", 4.5);
		cmap.put("SAPlabs", 4.4);
		cmap.put("Accenture", 3.8);
		cmap.put("Cisco", 4.2);
		
		Iterator it = cmap.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry pairs = (Map.Entry) it.next();
			
			System.out.println(pairs.getKey()+" = "+pairs.getValue());
		}
		
		ArrayList<Object> maptoList = new ArrayList<Object>(cmap.keySet());
		
		maptoList.addAll(cmap.values());
		
		for(Object L : maptoList) {
			System.out.println(L);
		}

	}

}
