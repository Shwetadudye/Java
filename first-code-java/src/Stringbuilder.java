// String builder method/ function
   // Append , insert , delete
// Append

//public class Stringbuilder {
//    public static void main (String[] args){
//        StringBuilder sb = new StringBuilder("Shweta");
//        sb.append("Hello Shweta");
//
//        System.out.println("Append method is " + sb);
//    };
//};

 // insert

//public class Stringbuilder{
//    public static void main(String[] args){
//        StringBuilder sb = new StringBuilder("Shweta");
//
//        sb.insert( 1 ,2324);
//
//        System.out.println("hello" + sb);
//
//    }
//
//}


// delete
public class Stringbuilder{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello java");

        sb.delete(5,10);

        System.out.println(sb);

    }

}