#include<stdio.h>
#include<math.h>
int main()
{
  int n;
  scanf("%d",&n);
  int r,s=0,i=0;
  while(n>0)
  {
    r=n%10;
    n=n/10;
    s+=r*pow(2,i);
    i++;
  }
  
  printf("%d",s);
  return 0;
}