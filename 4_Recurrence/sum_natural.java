class calc{
      static int natural(int a){
        int s=0;
         if(a>0){
               s=a+natural(a-1);
              }
          return s;
          }
}
class sum_natural{
     public static void main(String ...k){
      int r=calc.natural(5);
      System.out.print(r);
     }
}