package Mod3Week1HW2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

public class Homework2 {
	
	
	//Question # 1

	public static ArrayList<Integer> copyArrayList(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {

		ArrayList<Integer> tempArray = new ArrayList<>();
		arr1.addAll(arr2);
//		tempArray.addAll(arr2);
		return arr1;
	}

	//Question #  2 
	
	public static ArrayList<Integer> extractElementArray(ArrayList<Integer> arr1, int range){
		
		ArrayList<Integer> extract = new ArrayList<>();
		
		if (range > arr1.size()) {
			
			range = arr1.size();
		}	
		for (int i=0; i<range; i++) {
				extract.add(arr1.get(i));
		}
		
//		arr1.addAll(extract;)
		return extract;

	}
	
	//Question #  3
	
	public static ArrayList<Integer>  swapElementArray(ArrayList<Integer> arr1, int pos1, int pos2){
		
		ArrayList<Integer> swap = new ArrayList<>();
		
		Collections.swap(arr1, pos1, pos2);
		
		arr1.addAll(swap);
		
		return arr1;
		
	}
	
	
	//Question #  4
	
	public static boolean emptyArray(ArrayList<Integer> arr1) {
		
		return arr1.size()>0;
	}
	
	//Question #  5
	
	public static ArrayList<Integer>  replaceElem(ArrayList<Integer> arr1, int elem){
		
		arr1.add(1, elem);
		
		return arr1;
		
	}

	//Question #  6
	
	public static ArrayList<Integer>  trimArrayList(ArrayList<Integer> arr1){
		
		arr1.trimToSize();
		 
		return arr1;
		
	}
		
	//Question #  7
	
	public static boolean emptyHash(HashSet<Integer> hashSet){
		
		return hashSet.size()>0;
		
	}
	
	//Question # 8 
	
	public static int numberElemHash(HashSet<Integer> hashSet){
		
		return hashSet.size();
		
	}
	
	//Question # 9 
	
	public static void iterateHash(HashSet<Integer> hashSet){
		
		Iterator i = hashSet.iterator();
		
		while(i.hasNext()) {
			System.out.println("Question # 9 - Iterate through all elements : "+ i.next());
		}
		
	}
	
	// Question # 10

	public static void converToArray(HashSet<Integer> hashSet) {

		Integer arr3[] = new Integer[hashSet.size()];
		hashSet.toArray(arr3);

		for (Integer n : arr3)
			System.out.println("Each element of the Array: "+ n);
	}
	
	// Question # 11
	
		public static void duplicatedElem(HashSet<Integer> hashSet,HashSet<Integer> hashSet1 ) {
			
			HashSet<Integer> duplicate = new HashSet<>();
		
			if(hashSet.equals(hashSet1)) {
				System.out.println("The sets are identical");
			}else {
				if(hashSet.size() != 0 || hashSet1.size() != 0) {
					for (Integer dup : hashSet1) {
						if(hashSet.contains(dup)) {
							duplicate.add(dup);
						}
					}
				}
			}
			
			System.out.println("Elements on both sets : " + duplicate);
		}
	
	
		
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr1 = new ArrayList<>();
		
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		
		System.out.println(arr1);
		
		ArrayList<Integer> arr2 = new ArrayList<>();
		
		arr2.add(11);
		arr2.add(21);
		arr2.add(13);
		arr2.add(41);
		
		System.out.println(arr2);
		
		HashSet<Integer> hashSetTest = new HashSet<>();
		hashSetTest.add(4);
		hashSetTest.add(6);
		hashSetTest.add(9);
		hashSetTest.add(15);
		
		HashSet<Integer> hashSetTest1 = new HashSet<>();
		hashSetTest1.add(15);
		hashSetTest1.add(6);
		hashSetTest1.add(19);
		hashSetTest1.add(15);
	
//		//Question 1 - Copy one Array list into another 
		System.out.println("Question # 1 -  "+ copyArrayList(arr1,arr2));
		
//		System.out.println(arr1);
		
		//Question 2 - Extract Items from an Array  
		System.out.println("Question # 2 -  "+ extractElementArray(arr1,5));
		
//		System.out.println(arr1);
		
		//Question 3 - Swap two elements 		
		System.out.println("Question # 3 -  "+ swapElementArray(arr1,1,2));
		
		//Question 4 - Empty or Not
		System.out.println("Question # 4 - Not Empty? "+ emptyArray(arr1));
		
		//Question 5 - Replace Elem
		System.out.println("Question # 5 -  "+ replaceElem(arr1, 56));
		
		//Question #  6 - Trim to Size
		System.out.println("Question # 6 -  "+ trimArrayList(arr1));
		
		
		System.out.println("HashSet Elements " + hashSetTest);
		
		
		//Question #  7 - HashSet Empty Or Not 
		System.out.println("Question # 7 - Not Empty? "+ emptyHash(hashSetTest));
						 
		//Question #  8 - Elements in HashSet 
		System.out.println("Question # 8 - Number of Elements : "+ numberElemHash(hashSetTest));
		
		//Question #  9 -  Iterate through Elements  
		iterateHash(hashSetTest);
		
		//Question #  10 - Convert HashSet to an Array
		converToArray(hashSetTest);
		
		System.out.println("HashSet Elements " + hashSetTest);
		System.out.println("HashSet Elements " + hashSetTest1);
		
		//Question #  11 - Compare two sets and retain elements 
		duplicatedElem(hashSetTest,hashSetTest1);
		
	}

}
