package JavaPractice;

import org.testng.annotations.Test;

public class Parent extends GrandParent{

    public void parentCar(){
        System.out.println("Parent car running");
    }


    public void addition(int a, int b){
        System.out.println("addition of two nummbers c == " + (a+b));
    }

    public static void main(String args[]){
        Parent parent = new Parent();
        parent.addition(10,10);
    }
}
