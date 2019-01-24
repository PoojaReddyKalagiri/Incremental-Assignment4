import java.util.Scanner;

// ExceptionChild class extends the Exception class which in turn is inherited by three classes Exception1, Exception2 and Exception3

class ExceptionChild extends Exception{}

class Exception1 extends ExceptionChild{
    Exception1(String s){
       System.out.println(s);
    }
}
class Exception2 extends ExceptionChild{
    Exception2(String s){
       System.out.println(s);
    }

}
class Exception3 extends ExceptionChild{
    Exception3(String s){
       System.out.println(s);
    }

}

/*
class with a method checkAge() that throws all three exceptions Exception1,Exception2,Exception3 and in main( ), calls the method and uses a single catch clause that catches all three exceptions.  . 
*/

public class ExceptionHandling {

   public static void checkAge(int age) throws Exception1,Exception2,Exception3
    {
        if(age<18)
            throw new Exception1("You are too small to vote");
        else if(age>=18&&age<25)
            throw new Exception2("You can cast the vote");
        else
            throw new Exception3("You can vote as well as contest in the elections");
    }
    
   public static void main(String args[]){
    try{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your age");
      int age=sc.nextInt();
      checkAge(age);
    }
    catch(ExceptionChild e){
      System.out.println("Exception caught "+e.getMessage());
    }
    finally{
      System.out.println("finally block is executed");
    }
   }
}

