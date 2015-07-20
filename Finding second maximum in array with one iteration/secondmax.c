#include<stdio.h>
int secondMax(int arr[],int size) {
	int i=0,max = arr[0],smax = arr[1];
	if(max < smax) {
		max = max + smax - (smax = max);
	}
	for(i=2;i<size;i++) {
		if(arr[i] >= max) {
			smax = max;
			max = arr[i];
		}
		else if(arr[i] < max && arr[i] > smax) smax = arr[i];
	}
	return smax;
}
int main() {
	int size;
	printf("Enter array size : ");
	scanf("%d",&size);
	int arr[size],i;
	for(i=0;i<size;i++) {
		printf("arr[%d] = ",i);
		scanf("%d",&arr[i]);
	}
	printf("second max = %d\n",secondMax(arr,size));
	
}
