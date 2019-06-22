#include <stdio.h>
int main() {
  int n, i, x=0;
  scanf("%d", &n);
  for(i=1;x<n;i++) {
  	if(i%2==1) {
    	printf("%d\n", i);
      x++;
    }
  }
	return 0;
}