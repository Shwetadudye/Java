import java.util.*;
// we define one condition

class Solution{
    static void intAge(int age){
        if(age<18){
            throw new ArithmeticException("Not eligible to vote");
        }else{
            System.out.println("Able to vote");
        }
    }
}
public class Throw {

    public static  void main(String[] args){
      Solution.intAge(17);
    }
}
