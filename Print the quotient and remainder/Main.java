#include<stdio.h>
int main()
{
  int n = 365/4;
  printf("Quotient: %d\n",n);
  n = 365%4;
  printf("Remainder: %d",n);
  return 0;
}