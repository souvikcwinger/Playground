#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  int c=0;
	for(int i=1;i<=100;i++)
    {
      
      if (c<n)
      {
      if (i%2!=0)
      {
        c++;
        printf("%d\n",i);
      }
        continue;
      }
      else
        break;
    }
	return 0;
}