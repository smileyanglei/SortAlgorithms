package SortAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class SortAlgorithms {
	
	
	public static void main(String[] args){
		int arrayLength = 100000;
		int[] a = new int[arrayLength];
		long startTime,endTime;
		int pos = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i<arrayLength;i++){
			list.add((int)(Math.random()*50000));
		}
		
		
		for(int x:list) a[pos++] = x;
		pos = 0;
		startTime = System.currentTimeMillis();
		InsertionSort insertion_sort = new InsertionSort();
		insertion_sort.sort(a);
		endTime = System.currentTimeMillis();
		System.out.println("-----------------InsertionSort Algorithm---------------------");
		System.out.print("time:");
		System.out.println(endTime-startTime);
		//System.out.println(Arrays.toString(a));
		
		
		for(int x:list) a[pos++] = x;
		pos = 0;
		startTime = System.currentTimeMillis();
		BubbleSort bubble_sort = new BubbleSort();
		bubble_sort.sort(a);
		endTime = System.currentTimeMillis();
		System.out.println("-----------------BubbleSort Algorithm---------------------");
		System.out.print("time:");
		System.out.println(endTime-startTime);
		//System.out.println(Arrays.toString(a));
		
		for(int x:list) a[pos++] = x;
		pos = 0;
		startTime = System.currentTimeMillis();
		SelectionSort selection_sort = new SelectionSort();
		selection_sort.sort(a);
		endTime = System.currentTimeMillis();
		System.out.println("-----------------SelectionSort Algorithm---------------------");
		System.out.print("time:");
		System.out.println(endTime-startTime);
		//System.out.println(Arrays.toString(a));
		
		for(int x:list) a[pos++] = x;
		pos = 0;
		startTime = System.currentTimeMillis();
		HeapSort heap_sort = new HeapSort();
		heap_sort.sort(a);
		endTime = System.currentTimeMillis();
		System.out.println("-----------------HeapSort Algorithm---------------------");
		System.out.print("time:");
		System.out.println(endTime-startTime);
		//System.out.println(Arrays.toString(a));
		
		for(int x:list) a[pos++] = x;
		pos = 0;
		startTime = System.currentTimeMillis();
		QuickSort quick_sort = new QuickSort();
		quick_sort.sort(a);
		endTime = System.currentTimeMillis();
		System.out.println("-----------------QuickSort Algorithm---------------------");
		System.out.print("time:");
		System.out.println(endTime-startTime);
		//System.out.println(Arrays.toString(a));
		
		for(int x:list) a[pos++] = x;
		pos = 0;
		startTime = System.currentTimeMillis();
		MergeSort merge_sort = new MergeSort();
		merge_sort.sort(a);
		endTime = System.currentTimeMillis();
		System.out.println("-----------------MergeSort Algorithm---------------------");
		System.out.print("time:");
		System.out.println(endTime-startTime);
		//System.out.println(Arrays.toString(a));
		
		for(int x:list) a[pos++] = x;
		pos = 0;
		startTime = System.currentTimeMillis();
		ShellSort shell_sort = new ShellSort();
		shell_sort.sort(a);
		endTime = System.currentTimeMillis();
		System.out.println("-----------------ShellSort Algorithm---------------------");
		System.out.print("time:");
		System.out.println(endTime-startTime);
		//System.out.println(Arrays.toString(a));
		
		for(int x:list) a[pos++] = x;
		pos = 0;
		startTime = System.currentTimeMillis();
		CountSort count_sort = new CountSort();
		count_sort.sort(a);
		endTime = System.currentTimeMillis();
		System.out.println("-----------------CountSort Algorithm---------------------");
		System.out.print("time:");
		System.out.println(endTime-startTime);
		//System.out.println(Arrays.toString(a));
		
		for(int x:list) a[pos++] = x;
		pos = 0;
		startTime = System.currentTimeMillis();
		RadixSort radix_sort = new RadixSort();
		radix_sort.sort(a,5);
		endTime = System.currentTimeMillis();
		System.out.println("-----------------RadixSort Algorithm---------------------");
		System.out.print("time:");
		System.out.println(endTime-startTime);
		//System.out.println(Arrays.toString(a));
		

	}
}
