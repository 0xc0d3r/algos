#include<stdio.h>
int setBitPos(int n) {
	int pos = 0;
	while( !(n&(1<<pos)) ) {pos++;}
	return pos;
}
int isPowerOfTwo(int n) {
	return ( !(n&(n-1)));
}
int main() {
	printf("Enter number = ");
	int num;
	scanf("%d",&num);
	(isPowerOfTwo(num) && num > 0)? printf("Position = %d\n",setBitPos(num)) : printf("Given number is not power of 2\n");
}
