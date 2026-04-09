import java.io.File;
import java.io.FileWriter;
import java.util.*;
import java.lang.*;
import java.io.IOException;

public class Filehandling {
    public static void main(String[] args) throws IOException{
//        Scanner s = new Scanner(System.in);
//
//        System.out.println("Enter your name :");
//        String name = s.nextLine();
//
//        System.out.println("Enter Your age :");
//        int age = s.nextInt();
//
//        FileWriter file = new FileWriter("C:\\Users\\tejas\\IdeaProjects\\Java oops\\src\\data.txt");
//
//        file.write("name" +name + "/n");
//        file.write("age" + age );
//
//        System.out.println("name" + name );
//        System.out.println("age" + age );
//
//        System.out.println("Name and age already changes");
//
//        file.close();
//        s.close();



        File file = new File("C:\\\\Users\\\\tejas\\\\IdeaProjects\\\\Java oops\\\\src\\\\data.txt");

        if(file.createNewFile()){
            System.out.println("File created successfully");

        }
        else{
            System.out.println("File already exist");
        }
        System.out.println("File name " + file.getName());
        System.out.println("File Path " + file.getAbsolutePath());
    }

}
