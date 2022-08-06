package vlc;

import java.util.*;

public class fruits {
	 public static void main(String[] args) {
	        
		    Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
	        
	        linkedHashMap.put(1, new String("APPLE"));
	        linkedHashMap.put(2, new String("BANANA"));
	        linkedHashMap.put(3, new String("ORANGE"));
	        linkedHashMap.put(4, new String("MANGO"));
	        linkedHashMap.put(5, new String("GRAPES"));
	        linkedHashMap.put(6, new String("GUAVA"));
	        linkedHashMap.put(7, new String("PEAR"));
	        linkedHashMap.put(8, new String("WATERMELON"));
	        linkedHashMap.put(9, new String("KIWI"));
	        linkedHashMap.put(10, new String("PAPAYA"));
	        
	        
	        System.out.println("Contents of LinkedHashMap : " + linkedHashMap);
	        System.out.println("\nValues of map after iterating over it : ");
	        
	        for (Integer key : linkedHashMap.keySet()) {
	            System.out.println(key + ":\t" + linkedHashMap.get(key));
	        }
	        System.out.println("\nRemove entry for key 7 : " + linkedHashMap.remove(7));
	        System.out.println("Content of LinkedHashMap after removing key 7: " + linkedHashMap);
	        System.out.println("\nRemove entry for key 3 : " + linkedHashMap.remove(3,"ORANGE"));
	        System.out.println("Content of LinkedHashMap after removing key VALUE 3: " + linkedHashMap);
	        System.out.println("LinkedHashMap contains BANANA as value? : " + linkedHashMap.containsValue("BANANA"));
	        System.out.println("LinkedHashMap contains APPLE as value? : " + linkedHashMap.containsValue("APPLE"));
	        System.out.println("\nLinkedHashMap contains 4 as key? : " + linkedHashMap.containsKey(4));
	        System.out.println(linkedHashMap.hashCode());
	        linkedHashMap.clear();
	        System.out.println("\nContent of LinkedHashMap after clearing: " + linkedHashMap);
	 }        
}
