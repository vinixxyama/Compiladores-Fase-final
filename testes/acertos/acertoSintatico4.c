#include <stdio.h>
#include <string.h>

void xValue(int x){
   int x;

   if(x< 0){
      x = 0;
      printf(" Negativechangedtozero.\n");
   }else{
      if(x== 0){
         printf(" Zerofound.Changingitsvalue.");
         x = 2^10;
         printf(x," %d \n");
      }else{
         printf(" Donothing.\n");
      }
   }
   return;
}

void main(){

   xValue(-18);
   return;
}
