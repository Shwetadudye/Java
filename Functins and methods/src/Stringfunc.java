import java.util.Scanner;

public class Stringfunc {
    public static void main(String[] args){
//        String message = greet();
//        System.out.println(message);
        String notes = greet("shweta");
        System.out.println(notes);
    }
//    static  String greet(){
//        String greeting = "How are u";
//        return  greeting;
//    }

    static  String greet(String name){
        String msg = "hello" + name;
        return msg;
    }
}
