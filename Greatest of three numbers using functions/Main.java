#include <stdio.h>
int numbers(int n1, int n2);
int main() {
	int n1, n2, n3;
	scanf("%d%d%d", &n1, &n2, &n3);
	int result = numbers(n1, n2);
	printf("%d", numbers(result, n3));
	return 0;
}
int numbers(int n1, int n2){
    int min = 0;
    if(n1 > n2){
        min = n1;
    }
    else{
        min = n2;
    }
    
  	return min;
}