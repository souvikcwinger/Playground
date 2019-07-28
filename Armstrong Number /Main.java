#include <stdio.h>
#include <math.h>
int main() {
	int n;
  scanf("%d",&n);
  int a=n;
  int b=n;
  int c=0;
  while(a>0)
  {
    a/=10;
    c++;
  }
  int num =0;
  while(n>0)
  {
    int b1 = n%10;
    num = num + (int)(pow(b1,c));
    n/=10;
  }
  if (num==b)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}