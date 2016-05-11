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
	 * �������н���������
	 * @param a ����
	 * @param m �����ĵ�һ��������
	 * @param n �����ĵڶ���������
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
	 * �Զѵ�����
	 * @param a  ����
	 * @param i ��ʼ���˵�λ��
	 * @param end �ѵĴ�С
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
