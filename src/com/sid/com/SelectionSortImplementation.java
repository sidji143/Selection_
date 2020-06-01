package com.sid.com;

public class SelectionSortImplementation {
		private long arr[];
		private int nElemts;
		//Creating an array
		public SelectionSortImplementation(int size) {
			arr = new long[size];
			nElemts = 0;
		
		}
		// Inserting the value in the array
		public void insert(long value) {
			arr[ nElemts] = value;
			nElemts++;
		}
		// Displaying the array
		public void display() {
			for(int i = 0; i < nElemts ;i++) {
				System.out.print(arr[i]+",");
			}
		}
		// Implementation of Selection Sort
		
		public void selectionSort() {
			int in , out ,min;
			
			for(out = 0; out < nElemts -1; out++) {
				min = out;
				for(in = out + 1; in < nElemts ; in++) 
					if(arr[in] < arr[min]) 
						min = in;
						swap(out , min);
			}
		}
		private void swap(int one, int two) {
			long temp = arr[one];
			arr[one] = arr[two];
			arr[two] = temp;
			
		}
}











