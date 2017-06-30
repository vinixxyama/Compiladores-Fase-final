#include <stdio.h>
#include <string.h>

void xValue(int x){

   if(x< 0){
      x = 0;
      printf("Negative changed to zero.\n");
   }else{
      if(x== 0){
         printf("Zero found. Changing its value. ");
         x = 2^10;
         printf(x,"%d \n");
      }else{
         printf("Do nothing.\n");
      }
   }
   return;
}

void main(){

   xValue(-18);
   return;
}
