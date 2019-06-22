#include<stdio.h>
int main()
{
  int n;
  scanf("%d", &n);
  int a=1, b=0, c;
  for(int i=0;i<n;i++) {
  	c=a+b;
    b=a;
    a=c;
  }
  printf("%d", c);
}