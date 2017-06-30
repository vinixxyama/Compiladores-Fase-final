#include <stdio.h>
#include <string.h>

void main(){
   int i, counter, alist[10];

   i = 10;
   counter = 0;
   alist = null;
   while(i<= 110){
      if(alist      [      counter]== i){
         printf("i is in the list: %d ",i,"\n");
      }else{
         printf("i is not in the list: %d ",i,"\n");
      }
      i = i*3-10;
      counter = counter+1;
   }
   return;
}
