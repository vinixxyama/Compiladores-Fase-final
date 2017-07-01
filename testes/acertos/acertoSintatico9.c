#include <stdio.h>
#include <string.h>

void main(){
   bool true;

   true = true || false && false;
   true = !true;
   printf(true,"\n");
   return;
}
