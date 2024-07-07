//*
//* *
//* * *
//* * * *
//* * * * *

import java.util.*;
class Patterns_1{

static void pattern1(int n){
for(int row=1;row<=n;row++){
       for(int col=1;col<=row;col++){
              System.out.print("* ");
         }
         System.out.println();
      }
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in); 
System.out.println("Enter the value of N: ");
int n=sc.nextInt();
pattern1(n);
}

}
