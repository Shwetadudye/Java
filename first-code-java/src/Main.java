//////// Encapsulation
////////  public class basic {
////////	 private int marks;
////////		    private String name;
////////
////////		    public String getName() {
////////		        return name;
////////		    }
////////
////////		    public void setName(String name) {
////////		        this.name = name;
////////		    }
////////
////////		    public int getMarks() {
////////		        return marks;
////////		    }
////////
////////		    public void setMarks(int marks) {
////////		        if(marks >= 0 && marks <= 100) {
////////		            this.marks = marks;
////////		        }
////////		    }
////////
////////		    public static void main(String[] args) {
////////		        basic s = new basic();
////////
////////		        s.setName("Shweta");
////////		        s.setMarks(86);
////////
////////		        System.out.println("Name " + s.getName());
////////		        System.out.println("Marks " + s.getMarks());
////////		    }
////////	  }
////////
////// // Inheritance
////////class Animal{
////////    void eat(){
////////        System.out.println("Eating...");
////////    }
////////}
////////
////////class Dog extends Animal{
////////    void bark(){
////////        System.out.println("Barking");
////////    }
////////}
//////// public class Main {
////////    public static void main(){
////////        Dog d = new Dog();
////////
////////        d.bark();
////////        d.eat();
////////    }
////////}
//////
////////Polymorphism
//////// method overloading
////////  class Calculator{
////////    int add(int a, int b){
////////        return a+b;
////////    }
////////    double add(double a, double b){
////////        return a+b;
////////    }
////////}
////////  public class Main{
////////    public static void main(String[] args){
////////      Calculator cal = new Calculator();
////////
////////      int add1 = cal.add(5,10);
////////      double add2 = cal.add(8.9,7.6);
////////
////////      System.out.println(" Integer add " + add1);
////////      System.out.println(" Double add " + add2);
////////
////////    }
////////  }
//////
//////// method overriding
////////   class Animal{
////////    void sound(){
////////    System.out.println("Animal hahhaha");
////////    }
////////}
////////   class Dog extends Animal{
////////       void sound(){
////////           System.out.println("Dog Barking");
////////       }
////////   }
////////
////////   public class Main{
////////    public static void main(String[] args){
////////        Animal a = new Animal();
////////        a.sound();
////////        Dog d = new Dog();
////////        d.sound();
////////
////////    }
////////   }
//////
////// // abstraction // phone call used
////////java dont support multiple inheritance
//////// when you used implements fun than we can support
//////// abstract class Vehicle{
////////    abstract void start();
//////// }
////////
//////// class Car extends Vehicle{
////////    void start(){
////////        System.out.println("Car starts with the key");
////////    }
//////// }
////////
////////public class Main{
////////    public static void main(String[] args){
////////        Car c = new Car();
////////        c.start();
////////    }
////////}
//////// to give highest security we used interface ...
////////interface Animal{
////////    void sound();
////////}
////////
////////class Dog implements Animal{
////////    public void sound(){
////////        System.out.println("Dog Barks");
////////    }
////////}
////////
////////public class Main{
////////    public static void main(String[] args){
////////        Dog d = new Dog();
////////        d.sound();
////////    }
////////        }
//////
////// // Constructor
////// final class  Employee {
//////     private final String name;
//////     private final int id;
//////
//////     public Employee(String name, int id) {
//////         this.name = name;
//////         this.id = id;
//////     }
//////
//////     public String getName() {
//////         return name;
//////     }
//////
//////     public int getId(){
//////         return id;
//////     }
////// }
//////  public class Main{
//////    public static void main(String[] args){
//////    Employee emp = new Employee("Shweta",31);
//////
//////    System.out.println("Employee name : " + emp.getName());
//////    System.out.println("Employee Id : " + emp.getId());
//////    }
//////  }
////     // Constructor
//////
//////class Student {
//////    String name;
//////    int age;
//////
//////    Student(String name, int age) {
//////        this.name = name;
//////        this.age = age;
//////
//////    }
//////
//////    void display() {
//////        System.out.println(name + " " + age);
//////    }
//////
//////    public static void main(String[] args) {
//////        Student s1 = new Student("Shweta", 21);
//////        Student s2 = new Student("Aman", 22);
//////
//////        s1.display();
//////        s2.display();
//////    }
//////}
////// using super keyword
//////class Animal {
//////    void eat(){
//////        System.out.println("Animal eating");
//////    }
//////}
//////
//////class Dog extends Animal{
//////    void eat(){
//////        super.eat();
//////        System.out.println("Dog eating");
//////
//////    }
//////}
//////
//////public class Main{
//////    public static void main(String[] args){
//////        Dog d = new Dog();
//////        d.eat();
//////    }
//////}
//////  exception handling
////// try and catch
////class Main {
//////    public static void main(String[] args){
//////try {
//////    int a = 10;
//////    int b = 0;
//////    int c= a/b;
//////     System.out.println(c);
//////
//////        } catch(ArithmeticException e){
//////    System.out.println("Cant divide by zero");
//////            }
//////            System.out.println("Programs continues..");
//////            }
//////                    }
//////
////
////     // find a maximum number in array
////   //find a number in an array check if 10 is there aur not
////
////
//////
////
//// public class Main{
////     public static void main(String[] args){
////         String str = null;
////         System.out.println(str.length());
////     }
////}
//

import java.time.LocalDate;
import java.util.Locale;

//// Array index out of bound
/*

class Main{
    public static void main(String[] args){
        int [] arr ={10,20,30};

    }
}

 public class Main {

    public static void main(String[] args){

        Object obj = new Integer(10);

        String str = (String) obj;

        System.out.println(str);
    }
}
*/


// Reel industry example

//array // linked list //hashmap //


//class BankApp{
//    public static void main(String[] args){
//        try{
//            int arr[]= new int[3];
//            arr[5]=10;
//            int result = 10/0;
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Array index error");
//        }
//    }
//}
   //  String Builder
   // method 1 : delete()

public class Main {
    public static void main(String[] args){
////        StringBuilder sb = new StringBuilder("Hello hagagbfanfajse");
////
////        sb.delete(2,11);
////
////        System.out.println(sb);
//
////        StringBuilder sb = new StringBuilder("Hello");
////
////        sb.reverse();
////
////        System.out.println(sb);
//
//
//
//        String s= "Shweta";
//        String a = "Jerry";
//        String b = "Jerry";
//
//        System.out.println(s.length());
//        System.out.println(s.toUpperCase());
//        System.out.println(s.toLowerCase());
//        System.out.println(s.substring(3,5));
//        System.out.println(a.equals(b));

 LocalDate time = LocalDate.now();
        System.out.println(time);
    }
}




















