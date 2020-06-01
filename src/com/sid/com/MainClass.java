package com.sid.com;

public class MainClass {

	public static void main(String[] args) {
		int maxSize = 100;
		SelectionSortImplementation s = new SelectionSortImplementation(maxSize);
		
		s.insert(87);
		s.insert(100);
		s.insert(32);
		s.insert(43);
		s.insert(54);
		s.insert(55);
		s.insert(76);
		s.insert(42);
		s.insert(90);
		
		
		
		System.out.println();
		System.out.println("Before Selection Sort");
		s.display();
		
		//Calling Selection Sort
		s.selectionSort();
		
		System.out.println();
		System.out.println("After Selection Sort");
		s.display();
		
	}

}
