#include<stdio.h>
void main() {
	int n, s=0;
  scanf("%d", &n);
  G:
  while(n!=0){
  	s+=n%10;
    n/=10;
  }
  if(s/10 != 0) {
  	n=s;
    s=0;
    goto G;
  }
  printf("%d", s);
}