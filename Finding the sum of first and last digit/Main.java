#include <stdio.h>
int main() {
  int n;
  scanf("%d", &n);
  int s=n%10;
  while(n/10!=0) {
  	n/=10;
  }
  s+=n;
  printf("%d", s);
	return 0;
}