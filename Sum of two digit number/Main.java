#include<stdio.h>
int main()
{
  int a;
  scanf("%d", &a);
  int s = 0;
  s+=a%10;
  a/=10;
  s+=a;
  printf("%d", s);
  return 0;
}