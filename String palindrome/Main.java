#include<stdio.h>
int main()
{
  //Type your code here
  char str[120];
  int i,l;
  int flag=0;
  scanf("%s",str);
  l=strlen(str);
  for(i=0;i<l;i++){
    if(str[i]!=str[l-i-1])
    {
      flag=1;
      break;
    }
  }
  if(flag)
  {
    printf("%s is not a palindrome",str);
  }
  else
  {
    printf("%s is a palindrome",str);
  }
  return 0;
}