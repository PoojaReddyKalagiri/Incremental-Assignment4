class E extends Exception{}
class E1 extends E{}
class E2 extends E{}
class E3 extends E{}
class Exp{
  void func() throws E1,E2,E3{
    throw new E1();
  }
}
public class Exception1{
   public static void main(String args[]){
    Exp obj=new Exp();
    try{
      obj.func();
    }
    catch(E e){
      System.out.println("Exception caught "+e.getMessage());
    }
    catch(Exception e){}
    finally{
      System.out.println("finally block is executed");
    }
   }
}
