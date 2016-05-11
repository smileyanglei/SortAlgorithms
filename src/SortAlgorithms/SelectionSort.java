package SortAlgorithms;

public class SelectionSort {
	public void sort(int a[]){
		if(a==null&&a.length<1) return;
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++)
				if(a[j]<a[i]){
					a[j]^=a[i];
					a[i]^=a[j];
					a[j]^=a[i];
				}
		}
	}
}
