package SortAlgorithms;

public class HeapSort {
	
	public void sort(int a[]){
		if(a==null&&a.length<1) return;
		buildHeap(a);
		for(int i=a.length-1;i>0;i--){
			swapReferences(a,0,i);
			percDown(a,0,i);
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
	
	private void buildHeap(int a[]){
		for(int i=a.length/2-1;i>=0;i--)
			percDown(a,i,a.length);
	}
	
	/**
	 * 对堆的下滤
	 * @param a  数组
	 * @param i 开始下滤的位置
	 * @param end 堆的大小
	 */
	private void percDown(int a[],int i,int heap_size){
		int child;
		int temp;
		for(temp=a[i];leftChild(i)<heap_size;i=child){
			child = leftChild(i);
			if(child!=heap_size-1&&a[child]<a[child+1]) child++;
			if(temp<a[child]) a[i] = a[child];
			else break;
		}
		a[i] = temp;
	}
	
	private int leftChild(int index){
		return 2*index+1;
	}
}
