package Heap;

import java.util.Arrays;

public class MinHeap {
	
	private Integer[] theHeap;
	private int n;
	
	MinHeap(int size){
		theHeap = new Integer[size];
		for(int i=0; i<theHeap.length; i++){
			theHeap[i] = null;
		}
		n = 1;
		
	}
	
	public void bubbleUp(int index){
		if(index > 1){
			int parent = getParent(index);
			if(theHeap[index] < theHeap[parent]){
				int temp = theHeap[parent];
				theHeap[parent] = theHeap[index];
				theHeap[index] = temp;
				bubbleUp(parent);
			}
		}
		
	}
	
	public void insert(Integer value){
		if(n >= theHeap.length){
			return;
		}
		theHeap[n] = value;
		bubbleUp(n);
		n++;
	}
	
	public int getParent(int index){
		if(index > 1){
			return (int)(index / 2);
		}
		return -1;
	}
	
	public int getChild(int index){
		return index * 2;
	}

	public static void main(String[] args) {
		int[] one = {7,4,2,1,8,0};
		MinHeap h = new MinHeap(one.length + 1);
		for(int i=0; i<one.length; i++){
			h.insert(one[i]);
		}
		System.out.println(Arrays.toString(h.theHeap));
		
		int[] two = {5,2,1,6};
		MinHeap h2 = new MinHeap(two.length + 1);
		for(int i=0; i<two.length; i++){
			h2.insert(two[i]);
		}
		System.out.println(Arrays.toString(h2.theHeap));
		
		int[] three = {4,3,2,1};
		MinHeap h3 = new MinHeap(three.length + 1);
		for(int i=0; i<three.length; i++){
			h3.insert(three[i]);
		}
		System.out.println(Arrays.toString(h3.theHeap));
		
		
		
		

	}

}
