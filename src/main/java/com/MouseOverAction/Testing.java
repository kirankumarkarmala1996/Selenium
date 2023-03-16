package com.MouseOverAction;

public class Testing {
	public static void main(String[] args) {
		
		int []arr= {1,2,3};
		int []arr1= {1,2,4};
		int []arr2 = {2,2,4,5};
		
		
		// print the common number in this three arrays
		/*for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				for(int k=0;k<arr2.length;k++)
				if(arr[i]==arr1[j] && arr[i]==arr2[k])
					System.out.println(arr1[j]);
				
			}
		}
		*/
		
		//to find out the duplicates in two arrays
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(arr[i]==arr1[j])
					System.out.println(arr1[j]);
				
			}
		}
	}

}
