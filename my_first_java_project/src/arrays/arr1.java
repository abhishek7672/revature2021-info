package arrays;
import java.util.Arrays;

public class arr1 {
	public static void main(String [] args) {
		int arr[]= {1,2,3,4};
		 
		System.out.println(Arrays.toString(arr));
		int arr2[]=new int[8];
		arr2[0]=0;
		arr2[1]=2;
		arr2[2]=4;
		arr2[3]=5;
		arr2[4]=6;
		int pos=3;
		int n=10;
		;
		for(int x=arr2.length-2;x>pos-1;x--) {
			arr2[x]=arr2[x-1];
			
		}
		arr2[pos-1]=n;
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		for(int x=pos-1;x<arr.length-2;x++) {
			arr2[x]=arr[x+1];
			
		}
	for(int i=0;i<arr2.length;i++) {
		System.out.println(arr2[i]);
	}
		
			
		}
				
			
		
	}



