package SortAlgorithms;

public class MergeSort {
	public void sort(int a[]){
		if(a==null&&a.length<1) return;
		int temp[] = new int[a.length];
		Merge_Sort(a,temp,0,a.length-1);
	}
	private void Merge_Sort(int a[],int temp[],int left,int right){
		if(left<right){
			int center = (left+right)/2;
			Merge_Sort(a,temp,left,center);
			Merge_Sort(a,temp,center+1,right);
			Merge(a,temp,left,center+1,right);
		}
	}
	private void Merge(int a[],int temp[],int leftPos,int RightPos,int RightEnd){
		int tmpPos = leftPos;
		int leftEnd = RightPos-1;
		int numberElements = RightEnd-leftPos+1;
		while(leftPos<=leftEnd&&RightPos<=RightEnd){
			if(a[leftPos]<a[RightPos]) temp[tmpPos++] = a[leftPos++];
			else temp[tmpPos++] = a[RightPos++];
		}
		while(leftPos<=leftEnd) temp[tmpPos++] = a[leftPos++];
		while(RightPos<=RightEnd) temp[tmpPos++] = a[RightPos++];
		for(int i=0;i<numberElements;i++,RightEnd--){
			a[RightEnd] = temp[RightEnd];
		}
	}
}
