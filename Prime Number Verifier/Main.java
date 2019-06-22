// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int n;
  scanf("%d", &n);
  int p=0;
  for(int i=2;i<=(n/2)+1;i++) {
  	if(n%i == 0) p++;
  }
  if(n==0 || n==1) printf("neither");
  else if(p==0) printf("prime");
  else printf("composite");
   return 0;
}