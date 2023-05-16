package com.proactice.array;

public class EqualityOfTwoArray {
	
	public static void main(String[] args) {
		int arr1[] = {12, 22, 32, 42, 52, 62};
		int arr2[] = {52, 62, 12, 42, 22 };
		int count = 0;
		for(int i = 0;i<arr1.length;i++) {
			for(int j = 0 ;j<arr2.length;j++) {
				if(arr1[i] == arr2[j]) {
					count++;
					
				}
			}
			
		}
		if (arr1.length == count) {
			System.out.println("both arrays are equal");
		}else {
			System.out.println("both arrays are not equal");
		}
	}

	
//	class GFG {
//		 
//	    // Main driver method
//	    public static void main(String[] args)
//	    {
//	 
//	        // Declaring integer arrays
//	        int arr1[] = { 1, 2, 3 };
//	        int arr2[] = { 1, 2, 3 };
//	 
//	        // Checking if above two arrays are equal
//	        // using equals() method
//	        if (Arrays.equals(arr1, arr2))
//	 
//	            // Print statement if arrays are equal
//	            System.out.println("Same");
//	        else
//	 
//	            // Print statement if arrays are equal
//	            System.out.println("Not same");
//	    }
//	}
}
