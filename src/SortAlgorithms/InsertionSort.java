package SortAlgorithms;

public class InsertionSort {

	public void sort(int a[]){
		if(a==null&&a.length<1) return;
		for(int i=1;i<a.length;i++){
			int temp= a[i];
			int j;
			for(j=i;j>0&&temp<a[j-1];j--)
				a[j] = a[j-1];
			a[j] = temp;
		}
	}
	public static void main(String[] args){
		int a[] = {1,2,1,9,3,1,8,4,7,5};
		InsertionSort insertionsort = new InsertionSort();
		insertionsort.sort(a);
		for(int i = 0;i<a.length;i++) System.out.print(a[i]);

	}
}
