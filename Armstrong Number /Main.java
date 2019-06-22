#include <stdio.h>
int main() {
  int n, s=0;
  scanf("%d", &n);
  int x=n;
  while(n>0) {
  	s+=(n%10)*(n%10)*(n%10);
    n/=10;
  }
  if(s==x) printf("Armstrong Number");
  else printf("Not an Armstrong Number");
  return 0;
}