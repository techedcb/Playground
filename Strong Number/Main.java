#include <stdio.h>
int main() {
  int n, m=0;
  scanf("%d", &n);
  int x=n;
  while(n>0){
    int f=1;
    int d = n%10;
    for(int i=1;i<=d;i++) {
  		f*=i;
  	}
    m+=f;
    n/=10;
  }
	if(x==m) printf("Yes");
  else printf("No");
  return 0;
}