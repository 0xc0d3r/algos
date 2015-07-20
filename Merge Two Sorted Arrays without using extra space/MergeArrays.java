class MergeArrays {
	public int[] mergeSortedArrays(int a[],int alen,int b[]) {
		int aSize,bSize,size,i,j;
		bSize = b.length;
		size = alen + bSize - 1;
		i = alen - 1;
		j = bSize - 1;
		while(i>=0 && j>=0) {
			if(a[i]>=b[j]) {
				a[size] = a[i--];
			}
			else {
				a[size] = b[j--];
			}
			size--;
		}
		while(i>=0) {
			a[size--] = a[i--];
		}
		while(j>=0) {
			a[size--] = b[j--];
		}
		return a;
	}
}
