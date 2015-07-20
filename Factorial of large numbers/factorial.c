#include<stdio.h>
#define MAX 512
void factorial(int n){
  int output[MAX];
  output[0]=1;
  int size =1,i;
  for(i=2;i<=n;i++){
    size = multiply(i,output,size);
  }
  printf("%d! = ",n);
  for(i=size-1;i>=0;i--){
    printf("%d",output[i]);
  }
}
int multiply(int item,int output[],int size){
  int carry=0,i;
  for(i=0;i<size;i++){
    int res = output[i]*item + carry;
    output[i] = res%10;
    carry = res/10;
  }
  while(carry){
    output[size]=carry%10;
    carry/=10;
    size++;
  }
  return size;
}
int main(void){
  int n;
  printf("Enter any positive integer : ");
  scanf("%d",&n);
  factorial(n);
  printf("\n");
  return 0;
}
