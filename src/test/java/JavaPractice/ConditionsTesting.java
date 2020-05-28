package JavaPractice;

import org.testng.annotations.Test;

public class ConditionsTesting {

    int childAge = 17;
    int adultAge = 35;
   // @Test
    public void ifCondition(){
        if(childAge > 18){
            System.out.println("Allowed to Pub");
        }else if(childAge == 17){
            System.out.println("Not allowed to Pub");
        }else if(childAge < 17){
            System.out.println("Not allowed to Pub");
        }
    }

    @Test
    public void switchCaseTesting(){
        switch (childAge) {
            case 17:  System.out.println("Not allowed to Pub's"); break;
            case 18:  System.out.println("Allowed to Pub"); break;
            default: System.out.print("No age found");
        }

    }
}
