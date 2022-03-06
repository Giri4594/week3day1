package week3day1;

public class PrintDupInArray {

	public static void main(String[] args) {
		int[] ar = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int length= ar.length;
		System.out.println("The length of the Array is :" +length);
		System.out.println("Duplicate array elements are :");
		int count,i,j;
		for(i = 0; i<=length-1;i++) {
			count = 0;
			for(j = i+1;j<length;j++) {
				if(ar[i]==ar[j]) {
					//System.out.println(ar[j]);
					count=count+1;
				}
			}
			if(count > 0) {
				System.out.println(ar[i]);
			}
		}
	}

	}

