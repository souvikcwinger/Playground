#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int a=n;
  int sum=0;
  while(a>0)
  {
    int b = a%10;
    sum = sum + fact(b);
    a/=10;
  }
  if (sum == n)
    printf("Yes");
  else
    printf("No");
	return 0;
}
int fact(int n)
{
  int f=1;
  for(int i=1;i<=n;i++)
    f = f*i;
  return f;
}