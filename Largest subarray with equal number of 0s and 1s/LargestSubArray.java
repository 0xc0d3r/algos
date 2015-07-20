class LargestSubArray {
	public void findLargestSubArray(int a[]) {
		int sum = 0,maxSize = -1,start=0,end=0;
		int length = a.length;
		for(int i=0;i<length-1;i++) {
			sum = (a[i] == 0) ? -1 : 1 ;
			for(int j=i+1;j<length;j++) {
				sum = (a[j] == 0) ? sum -1 : sum + 1;
				if(sum == 0 && maxSize < j-i+1) {
					maxSize = j-i+1;
					start = i;
					end = j;
				}
			}
		}
		System.out.printf("Largest sub array (#0s = #1s) starts from %d to %d of size %d\n",start,end,maxSize);
	}
}
