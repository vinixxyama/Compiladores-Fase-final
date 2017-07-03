#include <stdio.h>
#include <string.h>

void main(){
   int true;

   true = 1 || 0 && 0;
   true = !true;
   printf("%d \n",true);
   return;
}
