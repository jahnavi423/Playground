#include<stdio.h>
int main()
{
	//Your Code here!!
  char str[100],c;
  int i,key;
  scanf("%[^\n]s",str);
  scanf("%d",&key);
  key=key%26;
  for(i=0;str[i]!='\0';i++)
  {
    c=str[i];
    if(c>='a'&&c<='z')
    {
      c=c-key;
      if(c<'a')
      {
        c=c+'z'-'a'+1;
      }
      str[i]=c;
    }
    else if(c>='A'&&c<='Z')
    {
      c=c-key;
      if(c<'A')
      {
        c=c+'Z'-'A'+1;
      }
      str[i]=c;
    }
  }
  printf("%s",str);

  return 0;
}