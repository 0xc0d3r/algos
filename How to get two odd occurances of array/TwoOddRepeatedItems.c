#include<stdio.h>
void get_two_odd_repeated_items(int a[],int size){
	int item1=0,item2=0,i,xor=a[0],set_bit;
	for(i=1;i<size;i++){
		xor^=a[i];
	}
	set_bit = xor & ~(xor-1);//to find rightmost setbit 
	for(i=0;i<size;i++){
		if(a[i] & set_bit) item1 ^=a[i];
		else item2^=a[i];
	}
	printf("%d %d\n", item1,item2);
}
int main(void) {
	int size;
	printf("Enter array size = ");
	scanf("%d",&size);
	int arr[size],i;
	for(i=0;i<size;i++){
		printf("arr [%d] = ",i);
		scanf("%d",&arr[i]);
	}
	get_two_odd_repeated_items(arr,size);
	return 0;
}