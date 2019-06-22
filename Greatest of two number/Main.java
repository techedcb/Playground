#include<stdio.h>
int main()
{
  int a, b;
  scanf("%d%d", &a, &b);
  if(a==b)
    printf("Both number Equal");
  else 
    a>b?printf("num1 is the greatest"):printf("num2 is the greatest");
  return 0;
}