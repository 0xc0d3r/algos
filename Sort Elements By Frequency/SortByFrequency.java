class SortByFrequency {
	int a[];
	public SortByFrequency(int a[]) {
		this.a = a;
	}
	public void sortByFrequency(int max) {
		int hash[] = new int[max+1];
		int length = a.length;
		int output[] = new int[length];
		for(int i=0;i<length;i++) {
			hash[a[i]]++;
		}
		sort(hash);
	}
	private int firstIndexOf(int item) {
		int i;
		for(i=0;i<a.length;i++) {
			if(a[i] == item) break;
		}
		return i;
	}
	
	private void sort(int hash[]) {
		int size=0,length = hash.length;
		for(int i=0;i<length;i++) {
			if(hash[i] != 0) size++;
		}
		int key[] = new int[size];
		int value[] = new int[size];
		for(int i=0,index=0;i<length;i++) {
			if(hash[i] != 0) {
				key[index] = i;
				value[index++] = hash[i];
			}
		}
		boolean changed = true;
		while(changed) {
			changed = false;
			for(int i=0;i<size-1;i++) {
				if(value[i] < value[i+1]) {
					value[i] ^= value[i+1]; value[i+1] ^= value[i]; value[i] ^= value[i+1];
					key[i] ^= key[i+1]; key[i+1] ^= key[i]; key[i] ^= key[i+1];
					changed = true;
				}
			}
			printArray(key,value);
			System.out.println();
		}
		printArray(key,value);
	}
	private void printArray(int a[],int b[]) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+"\t"+b[i]);
		}
	}
}
