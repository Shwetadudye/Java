
// Inheritance : child can access parent properties using extends keyword

class Vehicle{
    void SpeedMove(){
        System.out.println("This Property common for child ");
    }

    void performance(){
        System.out.println("Performance better");
    }
}

class Car extends Vehicle{
    void Start(){
        System.out.println("Start");
    }
}
class Car2 extends Vehicle{
    void Speed(){
        System.out.println("Speed Maximum");
    }
}
public class Inheritance {
    public static void main(String[] args){
        Car c1 = new Car();
        Car2 c2 = new Car2();

        c1.SpeedMove();
        c1.performance();
        c2.SpeedMove();
        c2.performance();



    }
}
