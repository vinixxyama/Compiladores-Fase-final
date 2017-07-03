#include <stdio.h>
#include <string.h>

void main(){
   int a[3];
   int x;

   a = [1 || 0,1 && 0,!0];
   for(x=2;x>-1;x--){
      printf("%d \t",a[x]);
   }
   return;
}
