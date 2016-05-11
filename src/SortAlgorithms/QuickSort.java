package SortAlgorithms;

import java.util.Arrays;

public class QuickSort {
	
	private final static int CUTOFF = 10;
	
	public void sort(int a[]){
		if(a==null&&a.length<1) return;
		MyQuickSort(a, 0, a.length-1);
	}
	private void MyQuickSort(int a[],int left,int right){
		int pivot = median3(a,left,right);
		if(left+CUTOFF<right){
			int i = left, j = right-1;
			for(;;){
				while(a[++i]<pivot);
				while(a[--j]>pivot);
				if(i<j)
					swapReferences(a, i, j);
				else
					break;
			}
			swapReferences(a, i, right-1);
			MyQuickSort(a,left,i-1);
			MyQuickSort(a, i+1, right);
		}
		else{
			InsertionSort insertion_sort = new InsertionSort();
			insertion_sort.sort(a);
		}
	}
	
	/**
	 * 在数组中交换两个数
	 * @param a 数组
	 * @param m 交换的第一个数索引
	 * @param n 交换的第二个数索引
	 */
	private void swapReferences(int a[],int m,int n){
		a[m]^=a[n];
		a[n]^=a[m];
		a[m]^=a[n];
	}
	
	private int median3(int a[], int left, int right) {
		int center = (left+right)/2;
		if(a[left]>a[center]) swapReferences(a, left, center);
		if(a[left]>a[right]) swapReferences(a, left, right);
		if(a[center]>a[right]) swapReferences(a, center, right);
		swapReferences(a, center, right-1);
		return a[right-1];
	}
	
	public static void main(String[] args){
		int arrayLenth = 100;
		int a[] = new int[arrayLenth];
		for(int i=0;i<arrayLenth;i++)
			a[i] = (int)(Math.random()*500);
		QuickSort quick_sort = new QuickSort();
		quick_sort.sort(a);
		System.out.println("QuickSort Algorithm");
		System.out.println(Arrays.toString(a));
	}
}
