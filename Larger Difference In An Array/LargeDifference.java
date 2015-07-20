class LargeDifference {
	private int max(int a,int b) {
		return (a>b) ? a : b;
	}
	public int getLargeDiff(int arr[]) {
		int max = 0,result = 0;
		for(int i=arr.length-1;i>=0;i--) {
			max = max(max,arr[i]);
			int tmpRes = max - arr[i];
			result = max(tmpRes,result);
		}
		return result;
	}
}
