import java.io.FileReader;
import  java.io.IOException;
class Solution1{
    static void readFile() throws IOException {
        FileReader file = new FileReader("C:\\Users\\tejas\\IdeaProjects\\Exception handling\\src\\notes.txt");
        System.out.println("file read successfully");
    }
}
public class Throws {
    public static void main(String[] args){
        try{
            Solution1.readFile();

        }catch (IOException e){
            System.out.println("file not found");

        }
    }
}
