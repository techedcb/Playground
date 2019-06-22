#include <stdio.h>
int main()
{
  int n, s=-1;
  scanf("%d", &n);
  for(int j=1;j<n;j++) {
  	int p=0;
    for(int i=2;i<=j/2;i++) {
    	if(j%i == 0){
          p++;
          break;
        }
    }
    if(p==0) s+=j;
  }
  printf("%d", s);
   return 0;
}