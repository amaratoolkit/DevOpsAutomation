package JavaPractice;

import org.testng.annotations.Test;

public class TestAbstractClass extends AbstractTest{

   public void test2(){
    System.out.println("Testing 12344");
    }

    public void test3(){
        System.out.println("Testing 12345667889");
    }

   @Test
    public void testingAbstract(){
       test3();
       test2();
   }

}
