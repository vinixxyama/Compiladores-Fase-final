#include <stdio.h>
#include <string.h>

int vetPlay(int a[5], int b0, bool x, char[40] y, int b2){

   return a[4]+a[1]-a[2]/a[0]+b0*b2;
}

void doNothing(){

   return;
}

void main(){
   int a[5], b[3];
   int x;

   a = [1,2,3,4,5];
   b0 = 6;
   b1 = 7;
   b2 = 8;
   x = vetPlay(a,b[0],true,"string play",b[2]);
   printf(x,"%d \n");
   doNothing();
   return;
}
