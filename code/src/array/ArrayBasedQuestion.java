package array;

import java.util.Arrays;

public class ArrayBasedQuestion {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60,70,80,90};//1
		int[] b= {4,5,8,9,12,15,18,1,3};//max,min,2nd largest value print 
	/*	for(int j=0;j<3;j++) {
			System.out.print("-");
			}
		System.out.println("");
        for(int i=0;i<a.length;i++) {
        	if(i>0 && i%3==0) {
        		System.out.println();
        	}
        	
        	System.out.print(a[i]+" ");
        }*/
		Arrays.sort(b);
		System.out.println("sorted array b :");
		for(int z:b) {
			System.out.print(z+" ");
		}
		System.out.println("");
		
		//max
		System.out.println("max in b: "+b[b.length-1]);
		//min
		System.out.println("min in b: "+b[0]);
		//2nd largest
		System.out.println("2nd highest in b: "+b[b.length-2]);
		}
}
