#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int sum=0;
  while (n>0)
  {
    int b = n%10;
    sum = sum +b;
    n/=10;
  }
  printf("%d",sum);
  //Type your code here
  return 0;
}