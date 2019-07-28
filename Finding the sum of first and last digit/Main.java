#include <stdio.h>
int main() {
	int n;
  int sum=0;
    scanf("%d",&n);
  int c=0;
  int a=n;
  int last=n%10;
    while(n>0)
    {
      c++;
      n/=10;
    }
  while(c>1)
  {
    a = a/10;
    c--;
  }
  sum = a+last;
  printf("%d",sum);
	return 0;
}