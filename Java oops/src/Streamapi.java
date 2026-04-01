import java.util.List;
import java.util.Arrays;
import java.util.stream.*;

public class Streamapi {
    public static void main(String[] args){
        List <Integer> list = Arrays.asList(23,10,30,6,12,20); //   12,20,23,30

      //   list.stream().forEach(System.out :: println );
        // filter method
      //  list.stream().filter(n->n%2==0).forEach(System.out :: println);

        // map method
//         list.stream().filter(n->n>10)
//                      .sorted()
//                      .map(n->n*n)
//                      .forEach(System.out :: println);
         // reduce method
        int sum = list.stream().reduce(0,(a,b)-> a+b);
        System.out.println("sum : " + sum);

    }
}
