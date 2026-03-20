// to use abstract method we want to use abstract keyword .
//we can't create object of abstract method
// Abstract
//abstract class Animal{
//        abstract void example();
//        // Normal method
//    void sound (){
//        System.out.println("Sound");
//    }
//
//}
//
//class cat extends Animal{
//    void bark(){
//        System.out.println("bark");
//    }
//
//    @Override
//    void example() {
//
//    }
//}
//
//public class Abstraction {
//    public static void main(String[] args){
//      cat c = new cat();
//
//      c.bark();
//      c.sound();
//    }
//}

// interface class
//when we create child class from parent than we use implements here


interface Man{
    void talk();
}

class  boys implements Man{

    @Override
    public void talk() {
        System.out.println("Human can talk");
    }
}

public class Abstraction {
    public static void main(String[] args){
        boys b = new boys();

        b.talk();
    }
}