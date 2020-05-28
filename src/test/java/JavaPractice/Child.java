package JavaPractice;

import org.testng.annotations.Test;

public class Child extends Parent {

    public void childCar(){
        System.out.println("Child car is running");
    }


    public void sum(int a, int b){
        System.out.println("output ==="+ (a+b));
    }

    public void sum(int a, int b, int c){
        System.out.println("output ==="+ (a+b+c));
    }

    public void sum(int a, float b){
        System.out.println("output ==="+ (a+b));
    }

    //@Test
    public void inheritanceTest(){
        childCar();
        parentCar();
        grandParentCar();
    }

    //@Test
    public void polymorphismTestOverLoading(){
       sum(1,1);
       sum(1, (float) 2.5);
       sum(1,2,3);
    }

   // @Test
    public void polymorphismTestOverRiding(){
        addition(4,5);
    }

    public static void main(String args[]){
        Child child = new Child();
        child.addition(20,30);
        child.addition(20,30);
        child.addition(30,30);
    }
}
