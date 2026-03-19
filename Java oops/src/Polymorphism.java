//method overloading : Allows a class to have multiple methods with the same name but different parameter list .
// method overriding : Allows a subclass to provide a specific implementation of a method that is already provided by its parents

class Mathematical_Operation{

    // Method Overloading
    public int Add(int a, int b){
        return a+b;
    }
    public int Add(int a,int b, int c){
        return a+b+c;
    }
    public double Add(double a, double b){
        return a+b;
    }
}


public class Polymorphism {
    public static void main(String[] args){
     Mathematical_Operation M1 = new Mathematical_Operation();
     System.out.println("First " + M1.Add(20,30));
     System.out.println("Second" + M1.Add(20,39,90));
     System.out.println("Third " + M1.Add(7.33,999));

    }
}
