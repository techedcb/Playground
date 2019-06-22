#include<stdio.h>
void main() {
  int a[3];
  scanf("%d", &a[0]);
  scanf("%d", &a[1]);
  scanf("%d", &a[2]);
  for(int i=0;i<2;i++) {
  	if(a[i]>a[i+1]) {
    	int temp = a[i];
      a[i] = a[i+1];
      a[i+1] = temp;
    }
  }
  printf("second greatest = %d", a[1]);
}