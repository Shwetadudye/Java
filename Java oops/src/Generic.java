
import java.util.*;
import java.lang.*;

class Box<T> {
    T value;

    // Setter Method
    public void setValue(T value) {
        this.value = value;
    }
// Getter method

    public T getValue() {
        return value;
    }
}
public class Generic {
    public static void main(String[] args){
     // Integer value
        Box<Integer> intBox = new Box<>();
     // set The value
        intBox.setValue(100);
        System.out.println(intBox.getValue());
      // String Type
         Box<String> stringBox= new Box<>() ;
       // Set the value
        stringBox.setValue("Shweta");
        System.out.println(stringBox.getValue());


      // Setter Method

    }
}

