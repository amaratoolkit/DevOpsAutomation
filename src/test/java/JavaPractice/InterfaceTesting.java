package JavaPractice;

import org.testng.annotations.Test;

public class InterfaceTesting implements TestInterFace,MultipleInheritance {

    public void test1(){
        System.out.println("Testing");
    }

    public void test2(){
        System.out.println("Testing");
    }

    public void test3(){
        System.out.println("Testing");
    }

    public void test4(){
        System.out.println("Testing");
    }

    @Test
    public void testing(){
        test1();
        test2();
        test3();
        test4();
    }


}
