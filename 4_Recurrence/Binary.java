class calc{
      static void bin(int a){
         if(a>0){
              bin(a/2);
              System.out.print(a%2+" ");
}
          }
}
class Binary{
     public static void main(String ...k){
      calc.bin(25);
     }
}