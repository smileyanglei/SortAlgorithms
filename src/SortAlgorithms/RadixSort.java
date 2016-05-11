package SortAlgorithms;

import java.util.Arrays;

public class RadixSort {
	public void sort(int a[],int width){
		if(a==null&&a.length<1) return;
		int n = 1, bit=1;
		int temp[][] = new int[10][a.length];
		int bucket[] = new int[10];
		while(bit<=width){
			int k = 0;
			for(int i = 0;i < a.length;i++){
				int lsd = (a[i]/n)%10;
				temp[lsd][bucket[lsd]++] = a[i];
			}
			
			for(int i = 0;i<10;i++){
				if(bucket[i]>0){
					for(int j = 0;j < bucket[i];j++)
						a[k++] = temp[i][j];
					bucket[i] = 0;	
				}
			}
			
			n *=10;
			bit++;
		}
	}
	
	public static void main(String[] args){
		int arrayLenth = 100;
		int a[] = new int[arrayLenth];
		for(int i=0;i<arrayLenth;i++)
			a[i] = (int)(Math.random()*50);
		RadixSort radix_sort = new RadixSort();
		radix_sort.sort(a, 2);
		System.out.println("RadixSort Algorithm");
		System.out.println(Arrays.toString(a));
	}
	
}
