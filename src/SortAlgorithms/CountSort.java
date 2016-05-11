package SortAlgorithms;

import java.util.Arrays;

public class CountSort {
	public void sort(int a[]){
		if(a.length<=1) return;
		int temp[] = new int[a.length];
		int max = a[0], min = a[0];
		for(int x:a){
			max = max>x? max: x;
			min = min<x? min: x;
		}
		int k = max - min + 1;
		int c[] = new int[k];
		for(int x:a) c[x - min]++;
		for(int i = 1;i < c.length;i++) c[i] += c[i-1];
		for(int i = a.length-1;i>=0;i--) temp[--c[a[i]-min]] = a[i];
		for(int i = 0;i < a.length;i++) a[i] = temp[i];
	}
	
	public static void main(String[] args){
		int array_length = 100;
		int a[] = new int[array_length];
		for(int i=0;i<array_length;i++) 
			a[i] = (int)(Math.random()*50 + 5);
		CountSort count_sort = new CountSort();
		count_sort.sort(a);
		System.out.println("CountSort Algorithm");
		System.out.println(Arrays.toString(a));
		
	}
}
