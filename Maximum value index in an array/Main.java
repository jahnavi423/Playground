// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Type your code here 
  int as;
  scanf("%d",&as);
  int a[as],i;
  for(i=0;i<as;i++)
  {
    scanf("%d",&a[i]);
  }
  int max=a[0];
  int ind=0;
  for(i=0;i<as;i++){
    if(max=a[i])
      ind=i;
  }
  printf("%d",ind);
  
   return 0;
}