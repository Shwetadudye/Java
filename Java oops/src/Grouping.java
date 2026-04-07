
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,2,4,5,7,12,23,44,56,778,865);

        // Grouping by (0-1)
        // 0 = Group even numbers
        // 1 = Group odd numbers

        Map<Integer , List<Integer>> groupMap = list.stream().collect(Collectors.groupingBy(n->n%2));
        System.out.println(groupMap);

        //partitioning by (T -F)
       Map<Boolean , List<Integer>> partitioning = list.stream().collect(Collectors.partitioningBy(n->n>23));
       System.out.println(partitioning);

       //String
        List<String> list2 = Arrays.asList("shweta" , "jerry" , "shweta" ,"Tom" ,"eeeeeeee");

        Map<Boolean ,List<String>>  part = list2.stream().collect(Collectors.partitioningBy(s->s.length()>3));
        System.out.println(part);

        // without Flatmap  print separate

        List<List<Integer>> list5 = Arrays.asList(Arrays.asList(20,30,40,40),Arrays.asList(12,34,5,67),Arrays.asList(12,24,44));
        System.out.println(list5);

        // with Flatmap // merge and print
        List<Integer> result = list5.stream().flatMap(n->n.stream()).collect(Collectors.toList());
        System.out.println(result);


    }
}
