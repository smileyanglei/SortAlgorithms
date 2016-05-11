package SortAlgorithms;

public class ShellSort {
	public void sort(int a[]){
		
		if(a==null&&a.length<1) return;
		for(int gap = a.length/2; gap>0; gap/=2){
			for(int i=gap;i<a.length;i++){
				int j;
				int tmp = a[i];
				for(j = i;j>=gap&&a[j-gap]>tmp;j -=gap)
					a[j] = a[j-gap];
				a[j] = tmp;
			}
		}
	}
}
