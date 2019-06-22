#include<stdio.h>
int main() {
	float p;
  scanf("%f", &p);
  p*=p;
  p=p*3.14;
  printf("%.2f", p);
  return 0;
}