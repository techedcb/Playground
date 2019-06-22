#include<stdio.h>
#include<string.h>


int main()
{
  char a[100],b[100],c[100],res[100], i;
  fgets(a,100,stdin);
  int x;
  fgets(b,100,stdin);
  fgets(c,100,stdin);
  
  for(i=0;a[i]!='\0';i++)
  {
  if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
    a[i]='$';
    res[i]=a[i];
  }
  x=i-1;
  for(i=0;b[i]!='\0';i++)
  {
  if(b[i]!='a'&&b[i]!='e'&&b[i]!='i'&&b[i]!='o'&&b[i]!='u')
    b[i]='#';
    res[x+i]=b[i];
  }
  x+=i-1;
  for(i=0;c[i]!='\0';i++) {
    c[i]-=32;
    res[x+i] = c[i];
  }
  x+=i;
  for(i=0;i<x;i++) {
  	printf("%c", res[i]);
  }
  
  return 0;
}