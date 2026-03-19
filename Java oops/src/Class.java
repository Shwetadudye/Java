//  class and Object
//class Customer {
//    String name;
//    int age;
//    String Email;
//    float Salary;
//
//
//    void name() {
//        System.out.println("Name " + name);
//    }
//
//    void age() {
//        System.out.println("Age " + age);
//    }
//
//    void Email() {
//        System.out.println("Email " + Email);
//    }
//
//    void Salary() {
//        System.out.println("Salary " + Salary);
//    }
//}
//
//public class Class {
//    public static void main(){
//        Customer c = new Customer();
//        c.name ="Shweta";
//        c.age= 45;
//        c.Email= "dudyeshweta@gmail.com";
//        c.Salary = 500000;
//        c.name();
//        c.age();
//        c.Salary();
//        c.Email();
//
//    }
//}


class Student {
    String name ;
    int age ;
    int contact;

    void name(){
        System.out.println("Name " + name);
    }

    void age(){
        System.out.println(" Age " + age);
    }

    void contact(){
        System.out.println( " contact " + contact);
    }
}

public class Class{
    public static void main(String[] args){
        Student s = new Student();

        s.name = "Shweta";
        s.age= 20;
        s.contact= 9898300;

        s.name();
        s.age();
        s.contact();
    }
}