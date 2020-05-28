package JavaPractice;

import org.springframework.beans.NullValueInNestedPathException;
import org.testng.annotations.Test;

public class ExceptionTest {
    int j = 9;
    int c=5;
    String s= null;
   // @Test
    public void arthemeticExceptionTesting(){
        try{

            System.out.println("c value === "+ c/1);
        }catch (Exception e){
            System.out.println("catch block");
            e.printStackTrace();
       }
        finally {
            System.out.println("finally block Executed");
            System.out.println("finally block -  c value == " + c/j);
        }
    }

    @Test
    public void childExceptionTesting(){
        try{

           System.out.println("s value === "+ s.length());
        }
        catch (ArithmeticException ae){
            System.out.println("catch ArithmeticException block");
            ae.printStackTrace();
        }catch(NullPointerException ne){
            System.out.println("catch NullPointerException block");
            ne.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("catch Exception block");
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally Block Executed");
        }

    }
}
