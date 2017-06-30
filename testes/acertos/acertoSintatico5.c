#include <stdio.h>
#include <string.h>

int babiesValue(int p, int babies){

   while(babies<= 9){
      printf("This generation has %d ",babies," babies.\n");
      p = babies;
      babies = p+babies;
      if(babies== 8){
break;      }   }
   return babies;
}

void main(){
   int babies;

   babies = babiesValue   (   [,1]);
   printf("Final %d ",babies,".\n");
   return;
}
