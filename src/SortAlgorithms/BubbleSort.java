package SortAlgorithms;

public class BubbleSort {
	public void sort(int a[]){
		if(a.length<=1) return;
		for(int i=0;i<a.length-1;i++){
			for(int j=a.length-1;j>i;j--)
				if(a[j]<a[j-1]){
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
		}
	}
	public void sortImprovement(int a[]){
		if(a.length<=1) return;
		for(int i=0;i<a.length-1;i++){
			boolean isFinish = true;
			for(int j=a.length-1;j>i;j--)
				if(a[j]<a[j-1]){
					isFinish = false;
					a[j]^=a[j-1];
					a[j-1]^=a[j];
					a[j]^=a[j-1];
				}
			if(isFinish) break;
		}
	}
}
