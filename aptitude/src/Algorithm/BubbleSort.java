package Algorithm;

import java.util.Scanner;

public class BubbleSort {
int n=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
int[] arr=new int[10];
System.out.println("enter the elements of array ");
for(int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}
BubbleSort bs=new BubbleSort();
bs.bubbleSort(arr);
System.out.println("sort ing array using for ");
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
System.out.println();
	System.out.println("sort ing array using while ");
	bs.bubbleSortWhile(arr);
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
}


	}
	public void bubbleSort(int[] arr) {
		for(int i=0;i<n;i++) {
			for(int j=1;j<n;j++) {
				if(arr[j-1]>arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public void bubbleSortWhile(int[] arr) {
		int i=0;
		while(i<arr.length-1) {
			int j=i+1;
			while(j<arr.length) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
			i++;
		}
	}

}
