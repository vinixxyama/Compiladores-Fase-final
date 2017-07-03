#include <stdio.h>
#include <string.h>

void printValues(int t, int b, int d[3]){

   printf("sum =%d %d \n",t+,d[1]);
   printf("%d %d \n",d[0]*,b);
   return;
}

void main(){
   int a, b, c, d[3], t;

   a = 9;
   b = 5;
   c = 4;
   d = [1,2,3];
   t = a+b;
   t = t*c/2;
   t = t+2;
   printValues(t,b,d);
   return;
}
