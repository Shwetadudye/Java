
import java.util.function.Predicate;
public class Lamba {
    public static  void main(String[] args){
        Predicate<Integer>isEven = n -> n%2==0;
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(13));
          Predicate<Integer>isMarks= marks ->marks>=30;
          System.out.println(isMarks.test(30));
          System.out.println(isMarks.test(56));
          System.out.println(isMarks.test(20));

    }
}
