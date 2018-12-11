package com.blogspot.javabyrajasekhar;

public class CommonElementsInTwoArrays {

	public static void main(String[] args) {

		int array1[] = new int[] {12,34,67,78,47,10,76};
		int array2[] = new int[] {54,67,69,71,43,19,76};
		
		CommonElementsInTwoArrays.commonElements(array1, array2);
		
	}

	public static void commonElements(int[] a,int [] b) {
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
