package com.citibank.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionMain {

	public static void main(String[] args) {
		System.out.println("Main Start");
		
		System.out.println("1.ArrayList");
		List<String> nameList = new ArrayList<>();
		
//		System.out.println("NameList Size ::" + nameList.size());
//		System.out.println("NameList :: " + nameList);
		
		nameList.add("Paritosh");
		nameList.add("Abhishek");
		nameList.add("Kapil");
		nameList.add("Dhannya");
		nameList.add("Kapil");
		
		System.out.println("NameList Size ::" + nameList.size());
		System.out.println("NameList :: " + nameList);
		System.out.println("Name at Index 2 :: " + nameList.get(2));
		
		nameList.remove(2);
		//OR
//		String name = new String("Kapil");
//		nameList.remove(name);
		
		System.out.println("NameList :: " + nameList);
		
		System.out.println("------------------------------");
		System.out.println("2.HashSet");
		Set<Integer> numberSet = new HashSet<Integer>();
		
		numberSet.add(101);
		numberSet.add(102);
		numberSet.add(103);
		
		System.out.println("After adding");
		System.out.println("numberSet size :: " + numberSet.size());
		System.out.println("numberSet :: " + numberSet);
		
		System.out.println("------------------------------");
		System.out.println("3.TreeSet");
		Set<String> nameTreeSet = new TreeSet<>();
		System.out.println("nameTreeSet size :: " + nameTreeSet.size());
		System.out.println("nameTreeSet :: " + nameTreeSet);
		
		nameTreeSet.add("B");
		nameTreeSet.add("A");
		nameTreeSet.add("C");
		nameTreeSet.add("Z");
		nameTreeSet.add("B");
		
		System.out.println("After Adding");
		System.out.println("nameTreeSet size :: " + nameTreeSet.size());
		System.out.println("nameTreeSet :: " + nameTreeSet);
		
		System.out.println("Main End");
	}
	

}
