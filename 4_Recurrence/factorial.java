class calc{
      static int fact(int a){
        int f=1;
         if(a>0){
               f=a*fact(a-1);
              }
          return f;
          }
}
class factorial{
     public static void main(String ...k){
      int r=calc.fact(5);
      System.out.print(r);
     }
}