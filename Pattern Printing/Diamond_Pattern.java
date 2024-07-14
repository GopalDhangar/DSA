//*
//* *
//* * *
//* * * *
//* * * * *
//* * * *
//* * *
//* *
//*

import java.util.*;
class Diamond_Pattern{

static void pattern(int n){
for(int row=1;row<2*n;row++){
       int totalColsInRow=row>n ? 2*n-row: row;
       int noOfSpaces= n-totalColsInRow;
      for(int s=1;s<=noOfSpaces;s++){
              System.out.print(" ");
             }
       for(int col=1;col<=totalColsInRow;col++){
              System.out.print("* ");
         }
         System.out.println();
      }
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in); 
System.out.println("Enter the value of N: ");
int n=sc.nextInt();
pattern(n);
}

}
