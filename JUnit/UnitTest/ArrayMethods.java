package io.datajek.springmvc.UnitTest;

import java.util.Arrays;

public class ArrayMethods {
	
	public int findIndex(int[] array, int num) {
		
		for(int i=0; i< array.length; i++) {
			if(array[i] == num)
				return i;
		}
		return -1;		
	}

	public boolean searchForNumber(int[] array, int num) {
		for(int i : array) {
			if(i == num) {
				return true;
			}
		}
		return false;
	}
	
	public int[] sotrArray(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}
	
	public boolean getTrue() {
		return true;
	}
	
	public boolean getFalse() {
		return false;
	}
	
	public String getnull() {
		return null;
	}
	
	public void printArray(int[] array, int index) {       
	    System.out.println(array[index]);
	}
}
