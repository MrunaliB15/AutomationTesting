package LinkedList_HashMap;

import java.util.HashMap;
import java.util.Map;

import Mock.HashMap01;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap<Integer, String> map1= new HashMap<Integer, String>();
        map1.put(1,"Mango");
        map1.put(2,"Apple");
        map1.put(3, "banana");
        map1.put(1, "grapes");
        System.out.println("map element: "+map1);
        System.out.println("iterating HashMap...");
        for(Map.Entry m: map1.entrySet()) {
        	System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("*******************************");
        
        HashMap<Integer, String> hm= new HashMap<Integer, String>();
        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");
        System.out.println("initial list of element: "+hm);
        System.out.println("After invoking put() method");
        for(Map.Entry m: hm.entrySet()) {
        	System.out.println(m.getKey()+ " "+m.getValue());
        }
        hm.putIfAbsent(103,"Gaurav");
        System.out.println("After invoking IfAbsent() method, list of element is: "+hm);
        for(Map.Entry m: hm.entrySet()) {
        	System.out.println(m.getKey()+ " "+m.getValue());
        }
        System.out.println("*****************************************");
        
        HashMap<Integer,String> map= new HashMap<Integer,String>();
        map.put(104, "Ravi");
        map.putAll(hm);
        System.out.println("after invoking putAll() method: "+map);
        for(Map.Entry m: map.entrySet()) {
        	System.out.println(m.getKey()+ " "+m.getValue());
        }
        System.out.println("initial list of element: "+map);
          // key based remove
        map.remove(100);
        System.out.println("updated list of element after remove 1: "+map);
        //key value pair based
        map.remove(102,"Rahul");
        System.out.println("updated list of element after remove 2: "+map);
        
        map.replace(104, "Gaurav");
        System.out.println("updated list After replace 1: "+map);
        for(Map.Entry m: map.entrySet()) {
        	System.out.println(m.getKey()+ " "+m.getValue());
        }
        
        map.replace(101, "Vijay","Ravi");
        System.out.println("updated list after replace 2: "+map);
        for(Map.Entry m: map.entrySet()) {
        	System.out.println(m.getKey()+ " "+m.getValue());
        }
	}
}
