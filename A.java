class A{
   int temp = 10;
   static int acModel =  1001;
   int thisA;
   A(){
      thisA = acModel ++;
   }
   void incTemp(){
      temp++;
   }
   void decTemp(){
      temp--;
   }
   void on(){
      System.out.print("Ac is Turning on");
      temp=24;
   }
   void off(){
      System.out.println("Ac is Turning off" + thisA);
      temp = 16;
   }
}
class Test{
   public static void main(String[] args){
      A a1 = new A();
      A a2 = new A();
      a1.on();
      System.out.println(a1.temp);
      a1.incTemp();
      System.out.println(a1.temp);
      a1.decTemp();
      System.out.println(a1.temp);
      a1.off();
      System.out.println(a1.temp);
      a2.on();
      System.out.println(a2.temp);
      a2.incTemp();
      System.out.println(a2.temp);
      a2.decTemp();
      System.out.println(a2.temp);
      a2.off();
      System.out.println(a2.temp);
   }
}