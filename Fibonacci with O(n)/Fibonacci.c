#include<stdio.h>
long long Fibonacci(unsigned n){
	int result[]={0,1},i;
	if(n<2) return result[n];
	long long fibN = 0,fibNminus1 = 1,fibNminus2 = 0;
	for(i=2;i<=n;i++){
		fibN = fibNminus1 + fibNminus2;
		fibNminus2 = fibNminus1;
		fibNminus1	= fibN;
	}
	return fibN;
}
int main() {
	unsigned num;
	printf("\nEnter number> ");
	scanf("%u",&num);
	printf("\nFibonacci(%u) = %lld\n",num,Fibonacci(num));
}
