#include<stdio.h>
#include<string.h>
int main()
{
	//Try out your code here
  char s[100],t[26];
  scanf("%[^\n]s",s);
  int in=0;
  for(int i=0;s[i]!='\0';i++)
  {
    if((s[i]=='t'||'T')&&s[i+1]=='h'&&s[i+2]=='e')
    {
      i=i+3;
    }
    else
    {
      t[in]=s[i];
      in++;
    }
  }
  t[in]='\0';
  printf("%s\n",t);
  
	return 0;
}