#include <stdio.h>
#include <string.h>

int aValue(){

   return 2;
}

void main(){
   int a;
   float x;
   char c[40], d[40];

   a = aValue();
   x = 31.23456;
   strcpy(c ," !");
   strcpy(d ," OlaMundo");
   printf(" Hello,world%s ",c," \n");
   return;
}
