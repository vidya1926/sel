package day1;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] arr = {1,2,4,5,6,7,8};
	        Arrays.sort(arr);
	        for (int i = 1; i < arr.length; i++) {
	        	       	
	        	
	           if(arr[i]!=i) {
	                System.out.println(i);
	                break;
	            }
	        }
	

	}}
