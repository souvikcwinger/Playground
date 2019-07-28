#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int first = n/100;
  int last = n%10;
  printf("%d",(first+last));
  //Type your code here
  return 0;
}