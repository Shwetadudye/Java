import java.io.*;
import java.lang.*;
import java.util.*;

//Serialization

class temp implements Serializable {
    int age;
    String name;


    public temp(int age,String name){
        this.age= age;
        this.name = name;

    }

}

//public class object_stream {
//    public static void main(String[] args){
//        try{
//            temp t =new temp(28,"shweta");
//            FileOutputStream fos = new FileOutputStream("C:\\Users\\tejas\\IdeaProjects\\Java oops\\src\\data.txt");
//            ObjectOutputStream oos= new ObjectOutputStream(fos);
//
//            oos.writeObject(t);
//            fos.close();
//            fos.close();
//
//            System.out.println("object serialized successfully");
//        }catch (Exception e) {
//              e.printStackTrace();
//        }
//    }
//}

public class object_stream {
    public static void main(String[] args) {
  try {
      FileInputStream fis = new FileInputStream("C:\\Users\\tejas\\IdeaProjects\\Java oops\\src\\data.txt");
      ObjectInputStream ois = new ObjectInputStream(fis);

      temp t = (temp) ois.readObject();
      System.out.println("Deserialized successfully");
      System.out.println("age" +t.age +"name"+ t.name);


  } catch(Exception e){
      e.printStackTrace();
  }
    }
}


