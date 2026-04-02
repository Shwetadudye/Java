import java.sql.ClientInfoStatus;
import java.util.Collection;
import java.util.List;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.*;

public class Streamapi {
    public static void main(String[] args){
//        List <Integer> list = Arrays.asList(23,10,30,6,12,20); //   12,20,23,30
        List <Integer> list = Arrays.asList(1,2,6,4,5);

      //   list.stream().forEach(System.out :: println );
        // filter method
      //  list.stream().filter(n->n%2==0).forEach(System.out :: println);

        // map method
//         list.stream().filter(n->n>10)
//                      .sorted()
//                      .map(n->n*n)
//                      .forEach(System.out :: println);
         // reduce method
//        int sum = list.stream().reduce(0,(a,b)-> a+b);
//        System.out.println("sum : " + sum);
//
//        list.stream().peek(n->System.out.println("before" + n))
//                     .map(n->n*2).peek(n->System.out.println("After" + n))
//                     .collect(Collectors.toList());
//
//        long count = list.stream().count();
//        System.out.println("Count" + count);
//
//        int sum = list.stream().mapToInt(n->n).sum();
//        System.out.println(sum);

        // find first
        Optional<Integer> first = list.stream().findFirst();
        System.out.println("First Element " +first.get());

        // find any
        Optional <Integer> findany = list.stream().findAny();
        System.out.println("find any element " +findany);

        // Anymatch
        boolean iseven =  list.stream().anyMatch(n->n%2==0);
        System.out.println("Is even : " +iseven);

        // All Match
        boolean isodd = list.stream().allMatch(n->n%2==1);
        System.out.println(isodd);

    }
}
