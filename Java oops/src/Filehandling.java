import java.io.*;
import java.util.*;
import java.lang.*;

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


//
//        File file = new File("C:\\\\Users\\\\tejas\\\\IdeaProjects\\\\Java oops\\\\src\\\\data.txt");
//
//        if(file.createNewFile()){
//            System.out.println("File created successfully");
//
//        }
//        else{
//            System.out.println("File already exist");
//        }
//        System.out.println("File name " + file.getName());
//        System.out.println("File Path " + file.getAbsolutePath());
//
//        if(file.delete()){
//            System.out.println("file deleted successfully");
//        }else{
//            System.out.println("file not deleted");
//        }

          // buffer file reader
//        try{
//            BufferedReader  br= new BufferedReader(new FileReader("C:\\Users\\tejas\\IdeaProjects\\Java oops\\src\\data.txt"));
//
//            String lineString;
//            while((lineString=br.readLine())!=null){
//                System.out.println(lineString);
//
//                System.out.println("data read successfully");
//            }
//
//           // br.close();
//        }
//        catch (Exception e){
//            e.printStackTrace();

//        }

        // buffered writer
        FileWriter fw = new FileWriter("C:\\Users\\tejas\\IdeaProjects\\Java oops\\src\\data.txt");

        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Hello shweta");
        bw.newLine();

        bw.write("full stack java");

        bw.close();

    }

}
